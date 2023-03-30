package org.example;

import java.util.ArrayList;

public class HotDrinkVendingMachine implements Machine {
    private ArrayList<HotDrink> list;
    public HotDrinkVendingMachine() {
        list = new ArrayList<>();
    }
    public void addProduct(HotDrink newItem){
        list.add(newItem);
    }


    public ArrayList getProduct(String searchName) {
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for (HotDrink item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public ArrayList getProduct(Double searchCost) {
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for (HotDrink item : list) {
            if (item.getCost() == searchCost) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProduct(String searchName, Double searchCost) {
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for (HotDrink item : list) {
            if(item.getName().contains(searchName) & item.getCost() == searchCost){
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProduct(String searchName, Double searchCost, Double searchVolume) {
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for (HotDrink item : list) {
            if(item.getName().contains(searchName) && item.getCost() == searchCost && item.getVolume() == searchVolume){
                result.add(item);
            }
        }
        return result;
    }
    public ArrayList getProduct(String searchName, Double searchVolume, int temp) {
        ArrayList<HotDrink> result = new ArrayList<HotDrink>();
        for (HotDrink item : list) {
            if(item.getName().contains(searchName) && item.getVolume() == searchVolume && item.getTemp() == temp){
                result.add(item);
            }
        }
        return result;
    }
}
