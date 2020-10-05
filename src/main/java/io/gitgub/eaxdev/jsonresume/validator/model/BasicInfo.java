package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.List;

@Getter
@Setter
public class BasicInfo {

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty(value = "label", required = true)
    private String label;

    @JsonProperty(value = "picture")
    private String picture;

    @Email(message = "Must be a valid e-mail address. Example: admin@mycomp.org")
    @JsonProperty(value = "email", required = true)
    private String email;

    @JsonProperty(value = "phone")
    private String phone;

    @URL(message = "Must be a valid URL. Example: https://site.com")
    @JsonProperty(value = "website")
    private String website;

    @JsonProperty(value = "summary", required = true)
    private String summary;

    @Valid
    @JsonProperty(value = "location")
    private Location location;

    @Valid
    @JsonProperty(value = "profiles")
    @JsonUnwrapped
    private List<Profiles> profiles;

}
