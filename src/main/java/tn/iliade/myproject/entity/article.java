package tn.iliade.myproject.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ARTICLE")
public class article implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "ID_ARTICLE"
    )
    private Integer idArticle;
    @Column(
            name = "ARTICLE_NAME"
    )
    private String nameArticle;

    @Column(
            name = "ARTICLE_QTT"
    )
    private Integer qttArticle;

    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public Integer getQttArticle() {
        return qttArticle;
    }

    public void setQttArticle(Integer qttArticle) {
        this.qttArticle = qttArticle;
    }

    public article() {
    }

    public article(Integer idArticle , String nameArticle , Integer qttArticle) {
        this.idArticle = idArticle;
        this.nameArticle=nameArticle;
        this.qttArticle = qttArticle;
    }

    @Override
    public String toString() {
        return "article{" +
                "idArticle=" + idArticle +
                ", nameArticle='" + nameArticle + '\'' +
                ", qttArticle=" + qttArticle +
                '}';
    }
    @ManyToOne
    private categorie categorie;



}
