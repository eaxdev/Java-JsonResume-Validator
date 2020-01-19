package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reference {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "reference")
    private String reference;

}
