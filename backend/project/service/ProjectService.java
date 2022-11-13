package com.bugtracker.submodules.shared.backend.project.service;

import com.bugtracker.db.project.domain.Project;
import com.bugtracker.submodules.shared.backend.project.dto.ProjectPojo;
import com.bugtracker.db.user.dto.MyUserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

    public Project findByUuid(String uuid);

    public List<ProjectPojo> getAll();

    public List<ProjectPojo> getAllByUser(MyUserDetails userDetails);

    public ProjectPojo getByUuid(String uuid);

    public ProjectPojo create(MyUserDetails userDetails, ProjectPojo projectPojo);

    public ProjectPojo edit(MyUserDetails userDetails, ProjectPojo projectPojo, String uuid);

    public void remove(MyUserDetails userDetails, String uuid);

    //public SItem findByTableUuidAndUuid(String uuid, String tUuid);

    //public SItem findByUuid(String uuid);

}
