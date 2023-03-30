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

}
