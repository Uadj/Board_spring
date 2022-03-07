package com.example.demo5.web.dto;

import com.example.demo5.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    @NotBlank(message = "제목은 필수 입력값입니다.")
    private String title;
    @NotBlank(message = "내용은 필수 입력값입니다.")
    private String content;
    @NotBlank(message = "작성자는 필수 입력값입니다.")
    private String author;
    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;

    }
    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
