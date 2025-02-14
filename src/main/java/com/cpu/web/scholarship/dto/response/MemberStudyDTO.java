package com.cpu.web.scholarship.dto.response;

import com.cpu.web.scholarship.entity.MemberStudy;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class MemberStudyDTO {
    private Long memberStudyId;
    private Boolean isLeader;
    private Timestamp joinDate;
    private Long memberId;
    private String nickName;
    private String email;

    public MemberStudyDTO(MemberStudy memberStudy) {
        this.memberStudyId = memberStudy.getMemberStudyId();
        this.isLeader = memberStudy.getIsLeader();
        this.joinDate = memberStudy.getJoinDate();
        this.memberId = memberStudy.getMember().getMemberId();
        this.nickName = memberStudy.getMember().getNickName();
        this.email = memberStudy.getMember().getEmail();
    }
}
