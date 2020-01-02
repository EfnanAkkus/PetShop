package com.example.petshop.Model;

public class Rate {

private String rates, comments;


    public Rate() {

    }

    public Rate(String rates, String comments) {
        this.rates = rates;
        this.comments = comments;
    }


    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
