package com.wellsfargo.counselor.entity;

public class Security {
    private long securityId;
    private String name;
    private String categories;
    private double purchasePrice;
    private double purchaseDate;
    private double quantity;

    protected Security() {
        // Default constructor for JPA
    }

    public Security(String name, String categories, double purchasePrice, double purchaseDate, double quantity) {
        this.name = name;
        this.categories = categories;       
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories= categories;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public double getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(double purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
}
