package org.example;

import java.util.ArrayList;

public class ChocolateVendingMachine implements Machine{
    private ArrayList<ProductChocolate> list;
    public ChocolateVendingMachine() {
        list = new ArrayList<>();
    }
    public void addProduct(ProductChocolate newItem){
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
}
