//package org.example;
//
//import java.util.ArrayList;
//
//public class VendingMachine implements Machine {
//    private ArrayList<Product> list;
//    public VendingMachine() {
//        list = new ArrayList<>();
//    }
//    public void addProduct(Product newItem){
//        list.add(newItem);
//    }
//
//    @Override
//    public ArrayList getProduct(String searchName, Double searchCost) {
//        ArrayList<Product> result = new ArrayList<Product>();
//        for(Product item : list){
//            if(item.getName().contains(searchName) & item.getCost() == searchCost){
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//
//    public ArrayList getProductByName(String searchName){
//        ArrayList<Product> result = new ArrayList<Product>();
//        for(Product item : list){
//            if(item.getName().contains(searchName)){
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//
//    public ArrayList getProductByCost(Double searchCost) {
//        ArrayList<Product> result = new ArrayList<Product>();
//        for (Product item : list) {
//            if (item.getCost() == searchCost) {
//                result.add(item);
//            }
//        }
//        return result;
//    }
//
//}
