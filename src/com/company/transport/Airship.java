package com.company.transport;

public class Airship {
    private String id;
    private String price;

    public void drivingMethod(){
        System.out.println("drive Airship");
    }
    public Airship() {
    }

    public Airship(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
