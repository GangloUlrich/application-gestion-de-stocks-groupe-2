package com.example.gstocks.Models;

public class Categorie {

    private String nameCategorie;
    private String desccategorie;

    public Categorie(String nameCategorie, String desccategorie) {
        this.nameCategorie = nameCategorie;
        this.desccategorie = desccategorie;
    }

    public String getNameCategorie() {
        return nameCategorie;
    }

    public void setNameCategorie(String nameCategorie) {
        this.nameCategorie = nameCategorie;
    }

    public String getDesccategorie() {
        return desccategorie;
    }

    public void setDesccategorie(String desccategorie) {
        this.desccategorie = desccategorie;
    }
}
