package me.dusgn.springbootnextlevel.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.dusgn.springbootnextlevel.domain.Article;
import me.dusgn.springbootnextlevel.dto.ArticleRequestDto;
import me.dusgn.springbootnextlevel.dto.ArticleUpdateRequestDto;
import me.dusgn.springbootnextlevel.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleApiController {

    private final ArticleService articleService;

    // 게시글 생성
    @PostMapping("/api/articles")
    public Long createArticle(@RequestBody ArticleRequestDto requestDto) {
        return articleService.createArticle(requestDto);
    }

    // 게시글 전체 조회
    @GetMapping("/api/articles")
    public List<Article> getArticles() {
        return articleService.getArticles();
    }

    // 게시글 수정
    @PutMapping("api/articles/{id}")
    public Long updateArticle(@PathVariable Long id, @RequestBody ArticleUpdateRequestDto requestDto) {
        return articleService.updateArticle(id, requestDto);
    }

    // 게시글 상세페이지 조회
    @GetMapping("/api/articles/{id}")
    public Article getArticleDetail(@PathVariable Long id) {
        Article article =  articleService.getArticleDetail(id);
        return article;
    }


}
