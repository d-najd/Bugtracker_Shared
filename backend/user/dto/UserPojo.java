package com.bugtracker.submodules.shared.backend.user.dto;

import com.bugtracker.submodules.shared.backend.authority.dto.AuthorityPojo;
import lombok.Data;

import java.util.List;

@Data
public class UserPojo {
    private String username;
    private String password;
    private List<AuthorityPojo> authorities;
    private boolean enabled;
}
