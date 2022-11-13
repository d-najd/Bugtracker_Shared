package com.bugtracker.submodules.shared.backend.authority.service;

import com.bugtracker.db.authoritity.domain.Authority;
import com.bugtracker.submodules.shared.backend.authority.dto.AuthorityPojo;
import com.bugtracker.db.user.dto.MyUserDetails;

import java.util.List;

public interface AuthorityService {

    public Authority findByUsernameAndProject(String username, String project);

    public List<AuthorityPojo> getAll();

    public List<AuthorityPojo> getSelfAll(MyUserDetails userDetails);

    public AuthorityPojo getSelf(MyUserDetails userDetails, String project);

    public AuthorityPojo create(MyUserDetails userDetails, AuthorityPojo pojo);

    public AuthorityPojo update(MyUserDetails userDetails, AuthorityPojo pojo);

    public void remove(MyUserDetails userDetails, AuthorityPojo pojo);

    public void removeByUsername();

}
