package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Education extends Period {

    @JsonProperty(value = "institution")
    private String institution;

    @JsonProperty(value = "area")
    private String area;

    @JsonProperty(value = "studyType")
    private String studyType;

    @JsonProperty(value = "gpa")
    private String gpa;

    @JsonProperty(value = "courses")
    private String[] courses;

}
