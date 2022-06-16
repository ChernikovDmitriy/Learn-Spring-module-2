package com.baeldung.ls.Service;

import java.util.Optional;

import com.baeldung.ls.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}