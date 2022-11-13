package com.bugtracker.submodules.shared.backend.user.dto;

import com.bugtracker.submodules.shared.backend.authority.dto.AuthorityPojo;
import com.bugtracker.submodules.shared.utils.MyCloneable;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserPojo implements MyCloneable<UserPojo> {
    private String username;
    private String password;
    private List<AuthorityPojo> authorities;
    private boolean enabled;

    @Override
    public UserPojo clone() {
        try{
            UserPojo clone = (UserPojo) super.clone();

            List<AuthorityPojo> clonedAuthorities = new ArrayList<>(authorities.size());
            for (AuthorityPojo authority : authorities) clonedAuthorities.add(authority.clone());
            clone.authorities = clonedAuthorities;

            return clone;
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
