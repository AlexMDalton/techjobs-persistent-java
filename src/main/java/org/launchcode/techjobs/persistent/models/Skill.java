package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Enter a description of the skill.")
    @Size(min=3, max=500, message= "The description must be between 3 and 500 characters long.")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Skill> jobs = new ArrayList<>();

    public Skill(String description) {
        super();
        this.description = description;
    }

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Skill> getJobs() {
        return jobs;
    }
}