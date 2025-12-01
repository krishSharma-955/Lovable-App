package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Project.FileContentResponse;
import com.SpringBoot.Lovable_App.Dto.Project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
