package tn.iliade.myproject.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "CATEGORIE")
public class categorie implements Serializable {
    private static final long serialVersionUID = 1L;
    public categorie get;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "ID_CATEGORIE"
    )
    private Integer idCatregorie;
    @Column(
            name = "CATEGORIE_LIB"
    )
    private String libCategorie;

    public Integer getIdCatregorie() {
        return idCatregorie;
    }

    public void setIdCatregorie(Integer idCatregorie) {
        this.idCatregorie = idCatregorie;
    }

    public String getLibCategorie() {
        return libCategorie;
    }

    public void setLibCategorie(String libCategorie) {
        this.libCategorie = libCategorie;
    }

    public categorie() {
    }
    public categorie(Integer idCategorie, String libCategorie) {
        this.idCatregorie = idCategorie;
        this.libCategorie=libCategorie ;
    }

    @Override
    public String toString() {
        return "categorie{" +
                "idCatregorie=" + idCatregorie +
                ", libCategorie='" + libCategorie + '\'' +
                ", articles=" + articles +
                '}';
    }

    @OneToMany(mappedBy = "categorie")
    public List<article> articles;

    public categorie get() {
    }
}
