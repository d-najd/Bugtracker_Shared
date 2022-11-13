package com.bugtracker.submodules.shared.backend.project.dto;

import com.bugtracker.submodules.shared.backend.authority.dto.AuthorityPojo;
import com.bugtracker.submodules.shared.utils.MyCloneable;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProjectPojo implements MyCloneable<ProjectPojo> {

    private String uuid;

    private String title;

    private String ownerUuid;

    private List<AuthorityPojo> authorities;

    @Override
    public ProjectPojo clone() {
        try {
            ProjectPojo clone = (ProjectPojo) super.clone();

            List<AuthorityPojo> clonedAuthorities = new ArrayList<>(authorities.size());
            for (AuthorityPojo authority : authorities) clonedAuthorities.add(authority.clone());
            clone.authorities = clonedAuthorities;

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
