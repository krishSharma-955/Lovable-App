package com.SpringBoot.Lovable_App.Mapper;

import com.SpringBoot.Lovable_App.Dto.Project.ProjectResponse;
import com.SpringBoot.Lovable_App.Dto.Project.ProjectSummaryResponse;
import com.SpringBoot.Lovable_App.Entity.Project;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> project);

}
