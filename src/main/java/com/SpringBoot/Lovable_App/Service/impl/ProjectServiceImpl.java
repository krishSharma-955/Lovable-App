package com.SpringBoot.Lovable_App.Service.impl;

import com.SpringBoot.Lovable_App.Dto.Project.ProjectRequest;
import com.SpringBoot.Lovable_App.Dto.Project.ProjectResponse;
import com.SpringBoot.Lovable_App.Dto.Project.ProjectSummaryResponse;
import com.SpringBoot.Lovable_App.Entity.Project;
import com.SpringBoot.Lovable_App.Entity.User;
import com.SpringBoot.Lovable_App.Mapper.ProjectMapper;
import com.SpringBoot.Lovable_App.Repository.ProjectRepository;
import com.SpringBoot.Lovable_App.Repository.UserRepository;
import com.SpringBoot.Lovable_App.Service.ProjectService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;

    UserRepository userRepository;

    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

        return projectMapper.toListOfProjectSummaryResponse(projectRepository.findAllAccessibleByUser(userId));

        //Using Streams
//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
