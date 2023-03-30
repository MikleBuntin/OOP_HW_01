package org.example;

public abstract class Product {
    protected String name;
    protected Double cost;

    public Product(String name) {
        this.name = name;
        this.cost = 0.0;
    }
    public Product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public String toString(){
        return " " + name + ", price: " + cost;
    }
}
