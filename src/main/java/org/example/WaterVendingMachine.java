package org.example;

import java.util.ArrayList;

public class WaterVendingMachine implements Machine {
    private ArrayList<ProductWater> list;
    public WaterVendingMachine() {
        list = new ArrayList<>();
    }
    public void addProduct(ProductWater newItem){
        list.add(newItem);
    }


    public ArrayList getProduct(String searchName) {
        ArrayList<ProductWater> result = new ArrayList<ProductWater>();
        for (ProductWater item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public ArrayList getProduct(Double searchCost) {
        ArrayList<ProductWater> result = new ArrayList<ProductWater>();
        for (ProductWater item : list) {
            if (item.getCost() == searchCost) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProduct(String searchName, Double searchCost) {
        ArrayList<ProductWater> result = new ArrayList<ProductWater>();
        for (ProductWater item : list) {
            if(item.getName().contains(searchName) & item.getCost() == searchCost){
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProduct(String searchName, Double searchCost, Double searchVolume) {
        ArrayList<ProductWater> result = new ArrayList<ProductWater>();
        for (ProductWater item : list) {
            if(item.getName().contains(searchName) && item.getCost() == searchCost && item.getVolume() == searchVolume){
                result.add(item);
            }
        }
        return result;
    }
}
