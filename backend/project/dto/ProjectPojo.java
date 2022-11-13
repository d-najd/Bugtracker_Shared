package com.bugtracker.submodules.shared.backend.project.dto;

import com.bugtracker.db.authoritity.domain.Authority;
import lombok.Data;

import java.util.List;

@Data
public class ProjectPojo {

    private String uuid;

    private String title;

    private String ownerUuid;

    private List<Authority> authorities;

}
