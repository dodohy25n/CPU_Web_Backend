package com.cpu.web.board.dto.request;

import com.cpu.web.board.entity.Post;
import com.cpu.web.member.entity.Member;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "게시글 작성 요청 데이터")
public class PostRequestDTO {

    @Schema(description = "공지 여부", example = "true")
    private Boolean isNotice;

    @Schema(description = "게시글 제목", example = "박관소 개최 안내", required = true)
    @NotEmpty(message = "제목은 필수입니다.")
    @Size(min = 1, max = 100, message = "제목은 최대 100자까지 가능합니다.")
    private String  title;

    @Schema(description = "게시글 내용", example = "2025년 상반기 박관소가 개최 예정입니다.", required = true)
    @NotEmpty(message = "내용은 필수입니다.")
    @Size(min = 1, max = 10000, message = "내용은 최대 10000자까지 가능합니다.")
    private String content;

    public PostRequestDTO(){}

    // dto => entity
    public Post toPostEntity(Member member){
        Post post = new Post();
        post.setIsNotice(isNotice);
        post.setTitle(title);
        post.setContent(content);
        post.setMember(member);
        return post;
    }
}