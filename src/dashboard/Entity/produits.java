/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard.Entity;

/**
 *
 * @author tarek
 */
public class produits {
    
    int id;
    int image_id;
    int tva_id;
    int categorie_id;
    String nom;
    String description;
    double prix;
    boolean disponible;

    public produits(int id, int image_id, int tva_id, int categorie_id, String nom, String description, double prix, boolean disponible) {
        this.id = id;
        this.image_id = image_id;
        this.tva_id = tva_id;
        this.categorie_id = categorie_id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.disponible = disponible;
    }

    public produits(int image_id, int tva_id, int categorie_id, String nom, String description, double prix, boolean disponible) {
        this.image_id = image_id;
        this.tva_id = tva_id;
        this.categorie_id = categorie_id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public int getTva_id() {
        return tva_id;
    }

    public void setTva_id(int tva_id) {
        this.tva_id = tva_id;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
}
