package com.example.paymentpages;

public class Model {

    private int image;
    private String username;
    private String total;
    private String paid;
    private String paidDate;
    private String Due;

    private String Edit;


    public Model(int image, String username, String total, String paid, String paidDate, String due, String edit) {
        this.image = image;
        this.username = username;
        this.total = total;
        this.paid = paid;
        this.paidDate = paidDate;
        Due = due;
        Edit = edit;
    }

    public int getImage() {
        return image;
    }

    public String getUsername() {
        return username;
    }

    public String getTotal() {
        return total;
    }

    public String getPaid() {
        return paid;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public String getDue() {
        return Due;
    }

    public String getEdit() {
        return Edit;
    }
}
