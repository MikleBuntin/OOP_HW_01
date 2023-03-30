package org.example;

import java.util.ArrayList;

public class ChocolateVendingMachine implements Machine {
    private ArrayList<ProductChocolate> list;

    public ChocolateVendingMachine() {
        list = new ArrayList<>();
    }

    public void addProduct(ProductChocolate newItem) {
        list.add(newItem);
    }


    @Override
    public ArrayList getProduct(String searchName) {
        ArrayList<ProductChocolate> result = new ArrayList<ProductChocolate>();
        for (ProductChocolate item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public ArrayList getProduct(Double searchCost) {
        ArrayList<ProductChocolate> result = new ArrayList<ProductChocolate>();
        for (ProductChocolate item : list) {
            if (item.getCost() == searchCost) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProduct(String searchName, Double searchCost) {
        ArrayList<ProductChocolate> result = new ArrayList<ProductChocolate>();
        for(ProductChocolate item : list){
            if(item.getName().contains(searchName) & item.getCost() == searchCost){
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProduct(String searchName, Double searchCost, Double searchWeight) {
        ArrayList<ProductChocolate> result = new ArrayList<ProductChocolate>();
        for(ProductChocolate item : list){
            if(item.getName().contains(searchName) && item.getCost() == searchCost && item.getWeight() == searchWeight){
                result.add(item);
            }
        }
        return result;
    }
}
