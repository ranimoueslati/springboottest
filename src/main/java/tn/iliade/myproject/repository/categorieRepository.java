package tn.iliade.myproject.repository;

import tn.iliade.myproject.entity.categorie;

public interface categorieRepository {
    categorie findById(Integer idCategorie);
}
