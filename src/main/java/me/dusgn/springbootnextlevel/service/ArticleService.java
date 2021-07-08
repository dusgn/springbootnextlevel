package me.dusgn.springbootnextlevel.service;

import lombok.RequiredArgsConstructor;
import me.dusgn.springbootnextlevel.domain.Article;
import me.dusgn.springbootnextlevel.dto.ArticleRequestDto;
import me.dusgn.springbootnextlevel.dto.ArticleUpdateRequestDto;
import me.dusgn.springbootnextlevel.repository.ArticleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    // 신규 게시글 등록
    @Transactional
    public Long createArticle(ArticleRequestDto requestDto) {
        return articleRepository.save(requestDto.toEntity()).getId();
    }

    // 게시글 전체 조회
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }

    // 게시글 업데이트
    @Transactional
    public Long updateArticle(Long id, ArticleUpdateRequestDto requestDto) {
        Article article = articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));
        article.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }
    // 게시글 상세페이지 조회
    public Article getArticleDetail(Long id) {
        Article article = articleRepository.findAllById(id);
        return article;
    }


}
