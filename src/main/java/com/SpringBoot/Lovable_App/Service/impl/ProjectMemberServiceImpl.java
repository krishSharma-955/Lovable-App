package com.SpringBoot.Lovable_App.Service.impl;

import com.SpringBoot.Lovable_App.Dto.Member.InviteMemberRequest;
import com.SpringBoot.Lovable_App.Dto.Member.MemberResponse;
import com.SpringBoot.Lovable_App.Dto.Member.UpdateMemberRoleRequest;
import com.SpringBoot.Lovable_App.Service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest role, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
