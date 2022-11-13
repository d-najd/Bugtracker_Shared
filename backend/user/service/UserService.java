package com.bugtracker.submodules.shared.backend.user.service;

import com.bugtracker.db.user.domain.User;
import com.bugtracker.db.user.dto.MyUserDetails;
import com.bugtracker.submodules.shared.backend.user.dto.UserPojo;

import java.util.List;

public interface UserService {

    public User findByUsername(String username);

    public List<UserPojo> getAll();

    public UserPojo getSelf(MyUserDetails userDetails);

    public UserPojo getByUsername(String username);

    public UserPojo create(UserPojo userPojo);

    public UserPojo update(MyUserDetails userDetails, UserPojo userPojo);

    public void remove(MyUserDetails userDetails);

    /**
     * For testing purposes
     */
    public void removeByUsername(String username);

}
