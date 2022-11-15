package com.bugtracker.submodules.shared.backend.authority.dto;

import com.bugtracker.submodules.shared.utils.MyCloneable;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorityPojo implements MyCloneable<AuthorityPojo> {
    @NonNull private String authority;
    @NonNull private String username;
    /**
     * @implNote lower case is used because without the getter and setter generated automatically by lombok would not
     * work in some cases (the get mapping would have to look something like getProject_uuid for some reason)
     */
    @NonNull private String projectuuid;
    
    @Override
    public AuthorityPojo clone() {

        return builder()
                .authority(authority)
                .username(username)
                .projectuuid(projectuuid)
                .build();
    }
}
