package com.SpringBoot.Lovable_App.Service;

import com.SpringBoot.Lovable_App.Dto.Member.InviteMemberRequest;
import com.SpringBoot.Lovable_App.Dto.Member.MemberResponse;
import com.SpringBoot.Lovable_App.Dto.Member.UpdateMemberRoleRequest;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest role, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
