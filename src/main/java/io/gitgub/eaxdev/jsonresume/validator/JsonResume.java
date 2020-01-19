package io.gitgub.eaxdev.jsonresume.validator;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.gitgub.eaxdev.jsonresume.validator.exeption.JsonResumeParseException;
import io.gitgub.eaxdev.jsonresume.validator.model.Resume;
import io.gitgub.eaxdev.jsonresume.validator.validator.JsonResumeValidationModule;

public class JsonResume {

    private final ObjectMapper mapper;

    private final String json;

    public JsonResume(final String json) {
        this.mapper = new ObjectMapper();
        this.mapper.registerModule(new JsonResumeValidationModule());
        this.json = json;
    }

    public Resume deserialize() throws JsonResumeParseException {
        try {
            return mapper.readValue(json, Resume.class);
        } catch (Exception e) {
            throw new JsonResumeParseException(e);
        }
    }

    public boolean isValid() {
        try {
            mapper.readValue(json, Resume.class);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
