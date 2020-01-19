package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Award {

    @JsonProperty(value = "title")
    private String title;

    @JsonProperty(value = "date")
    private String date;

    @JsonProperty(value = "awarder")
    private String awarder;

    @JsonProperty(value = "summary")
    private String summary;

}
