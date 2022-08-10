package tn.iliade.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import tn.iliade.myproject.entity.article;
import tn.iliade.myproject.entity.categorie;
import tn.iliade.myproject.repository.articleRepository;
import tn.iliade.myproject.repository.categorieRepository;

public class categorieServiceImplement implements  categorieService {
@Autowired
categorieRepository catRep;
@Autowired
articleRepository articleRep;

    @Override
    public void affecteArticleACategorie(Integer idArticle, Integer idCategorie) {
        categorie categorieEntity = catRep.findById(idCategorie).get();
        article  articleEntity = articleRep.findById(idArticle).get();

    }
}
