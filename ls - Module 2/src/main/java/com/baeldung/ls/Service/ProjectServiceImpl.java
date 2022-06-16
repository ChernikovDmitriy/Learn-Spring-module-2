package com.baeldung.ls.Service;

import java.util.Optional;

import com.baeldung.ls.persistence.repository.IProjectRepository;
import org.springframework.stereotype.Service;

import com.baeldung.ls.persistence.model.Project;

@Service
public class ProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepository;

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

}