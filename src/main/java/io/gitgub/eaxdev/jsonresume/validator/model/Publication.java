package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

@Getter
@Setter
public class Publication {

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "publisher")
    private String publisher;

    @JsonProperty(value = "releaseDate")
    private String releaseDate;

    @URL(message = "Must be a valid URL. Example: https://site.com")
    @JsonProperty(value = "website")
    private String website;

    @JsonProperty(value = "summary")
    private String summary;

}
