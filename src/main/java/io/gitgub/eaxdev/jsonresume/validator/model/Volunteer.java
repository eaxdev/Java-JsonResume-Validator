package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDate;

@Getter
@Setter
public class Volunteer extends Period {

    @JsonProperty(value = "organization")
    private String organization;

    @JsonProperty(value = "position")
    private String position;

    @URL(message = "Must be a valid URL. Example: https://site.com")
    @JsonProperty(value = "website")
    private String website;

    @JsonProperty(value = "summary")
    private String summary;

    @JsonProperty(value = "highlights")
    private String[] highlights;

}
