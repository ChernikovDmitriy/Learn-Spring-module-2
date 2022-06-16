package com.baeldung.ls.Service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.persistence.repository.IProjectRepository;

import javax.inject.Inject;
import javax.inject.Named;


@Service
public class ProjectServiceInjectImpl implements IProjectService {
    private static final Logger LOG = LoggerFactory.getLogger(ProjectServiceInjectImpl.class);
    private IProjectRepository projectRepository;

    @Inject
    @Named("projectRepositoryImpl")
    public ProjectServiceInjectImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
        LOG.info("wired projectRepository instance: {}", projectRepository);
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