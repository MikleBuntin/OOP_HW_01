package org.example;

public class HotDrink extends Product{
    private Double volume;
    private int temp;
    public HotDrink(String name) {
        super(name);
    }
    public HotDrink(String name, Double cost) {
        super(name, cost);
    }
    public HotDrink(String name, int temp) {
        super(name);
        this.temp = temp;
    }
    public HotDrink(String name, Double cost, int temp) {
        super(name);
        this.temp = temp;
    }
    public HotDrink(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }
    public HotDrink(String name, Double cost, Double volume, int temp) {
        super(name, cost);
        this.volume = volume;
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
    public Double getVolume() {
        return volume;
    }
    public String toString(){
        return getName() + ", vol: " + getVolume() + ", temp: " + temp + ", price: " + getCost() + "\n";}

}
