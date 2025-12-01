package com.SpringBoot.Lovable_App.Dto.Project;

import java.time.Instant;

public record FileNode(
        String path,
        Instant modifiedAt,
        Long size,
        String type
) {
}
