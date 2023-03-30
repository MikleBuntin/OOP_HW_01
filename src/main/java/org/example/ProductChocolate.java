package org.example;

public class ProductChocolate extends Product{
    private Double weight;
    public ProductChocolate(String name, Double cost, Double weight){
        super(name, cost);
        this.weight = weight;
    }
    public Double getWeight() {
        return weight;
    }
    public String toString(){
        return " " + getName() + ", weight: " + getWeight() + ", price: " + getCost();}

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
