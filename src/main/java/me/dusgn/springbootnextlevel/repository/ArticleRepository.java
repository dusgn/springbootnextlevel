package me.dusgn.springbootnextlevel.repository;

import me.dusgn.springbootnextlevel.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article, Long>{
    Article findAllById(Long id);
}
