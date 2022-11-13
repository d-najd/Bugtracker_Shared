package com.bugtracker.submodules.shared.backend.authority.dto;

import com.bugtracker.submodules.shared.utils.MyCloneable;

import lombok.Data;

@Data
public class AuthorityPojo implements MyCloneable<AuthorityPojo> {
    private String authority;
    private String username;
    private String projectuuid;
    
    @Override
    public AuthorityPojo clone() {
        try {
            return (AuthorityPojo) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
