package me.dusgn.springbootnextlevel.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.dusgn.springbootnextlevel.domain.Article;

@Getter
@NoArgsConstructor
public class ArticleRequestDto {
    private String title;
    private String content;
    private Long authorId;

    @Builder
    public ArticleRequestDto(String title, String content, Long authorId) {
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }

    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .authorId(authorId)
                .build();
    }
}
