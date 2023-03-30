package org.example;

public class ProductWater extends Product{
    private Double volume;

    public ProductWater(String name) {
        super(name);
    }
    public ProductWater(String name, Double cost) {
        super(name, cost);
    }

    public ProductWater(String name, Double cost, Double volume){
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }
    public String toString(){
        return " " + getName() + ", vol: " + getVolume() + ", price: " + getCost();}


    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
