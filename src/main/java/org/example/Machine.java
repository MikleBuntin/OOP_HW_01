package org.example;

import java.util.ArrayList;

public interface Machine {
    ArrayList getProduct(String name);
    ArrayList getProduct(Double cost);
    ArrayList getProduct(String name, Double cost);
    ArrayList getProduct(String name, Double cost, Double volume);
//    ArrayList getProduct(String name, Double cost, Double volume, Double temp);


//    ArrayList getProduct(String searchName, Double searchCost, Double volume);
//
//    public ArrayList getProductByName(String searchName);
//    public ArrayList getProductByCost(Double searchCost);
//    public void addProduct(Product newItem);


}
