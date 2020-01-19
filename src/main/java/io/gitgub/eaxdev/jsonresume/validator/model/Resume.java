package io.gitgub.eaxdev.jsonresume.validator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Resume {

    @JsonProperty(value = "basics")
    private BasicInfo basicInfo;

    @JsonProperty(value = "work")
    private List<Work> works;

    @JsonProperty(value = "volunteer")
    private List<Volunteer> volunteers;

    @JsonProperty(value = "education")
    private List<Education> educations;

    @JsonProperty(value = "awards")
    private List<Award> awards;

    @JsonProperty(value = "publications")
    private List<Publication> publications;

    @JsonProperty(value = "skills")
    private List<Skill> skills;

    @JsonProperty(value = "languages")
    private List<Language> languages;

    @JsonProperty(value = "interests")
    private List<Interest> interests;

    @JsonProperty(value = "references")
    private List<Reference> references;

}
