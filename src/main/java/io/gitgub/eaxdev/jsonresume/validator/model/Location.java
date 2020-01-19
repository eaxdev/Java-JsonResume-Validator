package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.gitgub.eaxdev.jsonresume.validator.validator.CountryCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    @JsonProperty(value = "address")
    private String address;

    @JsonProperty(value = "postalCode")
    private String postalCode;

    @JsonProperty(value = "city")
    private String city;

    @CountryCode
    @JsonProperty(value = "countryCode")
    private String countryCode;

    @JsonProperty(value = "region")
    private String region;

}
