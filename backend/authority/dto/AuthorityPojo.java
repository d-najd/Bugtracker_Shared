package com.bugtracker.submodules.shared.backend.authority.dto;

import lombok.Data;

@Data
public class AuthorityPojo {
    //private AuthorityIdentityPojo id;
    private String authority;
    private String username;
    //Setting the name to "projectUuid" causes inconsistencies for some reason so I am keeping it this way
    private String projectuuid;
}
