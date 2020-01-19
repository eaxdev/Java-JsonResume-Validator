package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
public class Profiles {

    @JsonProperty(value = "network")
    private String network;

    @JsonProperty(value = "username")
    private String username;

    @URL(message = "Must be a valid URL. Example: https://site.com")
    @JsonProperty(value = "url")
    private String url;
}
