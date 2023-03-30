package org.example;

import java.util.ArrayList;

public interface Machine {
    ArrayList getProduct(String name);
    ArrayList getProduct(Double cost);
    ArrayList getProduct(String name, Double cost);
    ArrayList getProduct(String name, Double cost, Double volume);

}
