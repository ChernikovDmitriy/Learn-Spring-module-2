package com.baeldung.ls.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.persistence.repository.IProjectRepository;

public class ProjectServiceImplSetterInjection implements IProjectService {

    private IProjectRepository projectRepository;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Autowired
    @Qualifier("projectRepositoryImpl2")
    public void setprojectRepository(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

}
