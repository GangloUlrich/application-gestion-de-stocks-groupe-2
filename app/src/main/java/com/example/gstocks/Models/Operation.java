package com.example.gstocks.Models;

public class Operation {

    private int quantityOperation;
    private Produit product;

    public Operation(int quantityOperation, Produit product) {
        this.quantityOperation = quantityOperation;
        this.product = product;
    }

    public int getQuantityOperation() {
        return quantityOperation;
    }

    public void setQuantityOperation(int quantityOperation) {
        this.quantityOperation = quantityOperation;
    }

    public Produit getProduct() {
        return product;
    }

    public void setProduct(Produit product) {
        this.product = product;
    }
}
