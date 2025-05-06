package com.wellsfargo.counselor.entity;

public class Portfolio {
    private long portfolioId;
    

    protected Portfolio() {
        // Default constructor for JPA
    }

    

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

}