package com.example.gstocks.Models;

public class Produit {

    private String nameProduct;
    private Categorie category;
    private int priceProduct;
    private int quantity;

    public Produit(String nameProduct, Categorie category, int priceProduct, int quantity) {
        this.nameProduct = nameProduct;
        this.category = category;
        this.priceProduct = priceProduct;
        this.quantity = quantity;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Categorie getCategory() {
        return category;
    }

    public void setCategory(Categorie category) {
        this.category = category;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
