package io.gitgub.eaxdev.jsonresume.validator;

import io.gitgub.eaxdev.jsonresume.validator.exeption.JsonResumeParseException;
import io.gitgub.eaxdev.jsonresume.validator.model.Resume;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {

    @Test
    void basicUsage() throws IOException, JsonResumeParseException {
        InputStream validResume = getClass().getClassLoader().getResourceAsStream("ValidResume.json");
        assertNotNull(validResume);
        String json = IOUtils.toString(validResume, StandardCharsets.UTF_8);
        JsonResume jsonResume = new JsonResume(json);
        Resume deserialize = jsonResume.deserialize();

        assertAll(() -> {
            assertNotNull(jsonResume);
            assertTrue(jsonResume.isValid());
            assertNotNull(deserialize);
        });
    }

    @Test
    void badUrlAndEmail() throws IOException {
        InputStream validResume = getClass().getClassLoader().getResourceAsStream("InvalidUrlAndEmail.json");
        assertNotNull(validResume);
        String json = IOUtils.toString(validResume, StandardCharsets.UTF_8);
        JsonResume jsonResume = new JsonResume(json);
        JsonResumeParseException jsonResumeParseException = assertThrows(JsonResumeParseException.class, jsonResume::deserialize);
        String actual = jsonResumeParseException.getMessage();
        String expected1 = "Value `badEmail` is not correct. Must be a valid e-mail address. Example: admin@mycomp.org";
        String expected2 = "Value `badUrl` is not correct. Must be a valid URL. Example: https://site.com";
        assertTrue(actual.contains(expected1));
        assertTrue(actual.contains(expected2));
    }

    @Test
    void badCountryCode() throws IOException {
        InputStream validResume = getClass().getClassLoader().getResourceAsStream("BadCountryCode.json");
        assertNotNull(validResume);
        String json = IOUtils.toString(validResume, StandardCharsets.UTF_8);
        JsonResume jsonResume = new JsonResume(json);
        JsonResumeParseException jsonResumeParseException = assertThrows(JsonResumeParseException.class, jsonResume::deserialize);
        String actual = jsonResumeParseException.getMessage();
        String expected = "Value `badCode` is not correct. Country code must be correct of ISO 3166-1 standard";
        assertTrue(actual.contains(expected));
    }

}
