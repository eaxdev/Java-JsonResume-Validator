package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Language {

    @JsonProperty(value = "language")
    private String language;

    @JsonProperty(value = "fluency")
    private String fluency;

}
