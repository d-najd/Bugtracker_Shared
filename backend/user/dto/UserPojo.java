package com.bugtracker.submodules.shared.backend.user.dto;

import com.bugtracker.submodules.shared.backend.authority.dto.AuthorityPojo;
import com.bugtracker.submodules.shared.utils.MyCloneable;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPojo implements MyCloneable<UserPojo> {
    @NonNull private String username;
    @NonNull private String password;
    private List<AuthorityPojo> authorities;
    @NonNull private boolean enabled;

    @Override
    public UserPojo clone() {
        List<AuthorityPojo> clonedAuthorities = new ArrayList<>();
        if(authorities != null)
            for (AuthorityPojo authority : authorities) clonedAuthorities.add(authority.clone());

        return builder()
                .username(username)
                .password(password)
                .authorities(clonedAuthorities)
                .enabled(enabled)
                .build();
    }
}
