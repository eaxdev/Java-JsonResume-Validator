package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skill {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "level")
    private String level;

    @JsonProperty(value = "keywords")
    private String[] keywords;

}
