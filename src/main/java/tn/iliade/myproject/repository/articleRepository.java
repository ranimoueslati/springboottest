package tn.iliade.myproject.repository;

import tn.iliade.myproject.entity.article;

public interface articleRepository {
    article findById(Integer idArticle);
}
