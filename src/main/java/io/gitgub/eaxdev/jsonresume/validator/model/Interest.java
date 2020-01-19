package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Interest {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "keywords")
    private String[] keywords;

}
