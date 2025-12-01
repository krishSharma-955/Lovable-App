package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Project.ProjectRequest;
import com.SpringBoot.Lovable_App.Dto.Project.ProjectResponse;
import com.SpringBoot.Lovable_App.Dto.Project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
