package com.bugtracker.submodules.shared.backend.project.dto;

import com.bugtracker.submodules.shared.backend.authority.dto.AuthorityPojo;
import com.bugtracker.submodules.shared.utils.MyCloneable;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectPojo implements MyCloneable<ProjectPojo> {

    @NonNull private String uuid;

    @NonNull private String title;

    @NonNull private String ownerUuid;

    private List<AuthorityPojo> authorities;

    @Override
    public ProjectPojo clone() {
        List<AuthorityPojo> clonedAuthorities = new ArrayList<>();
        if(authorities != null)
            for (AuthorityPojo authority : authorities) clonedAuthorities.add(authority.clone());

        return builder()
                .uuid(uuid)
                .title(title)
                .ownerUuid(ownerUuid)
                .authorities(clonedAuthorities)
                .build();
    }
}
