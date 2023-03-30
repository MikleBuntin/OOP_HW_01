package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.lang.reflect.Array;
import java.util.ArrayList;

//Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
// сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа
// ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтома
public class Main {
    public static void main(String[] args) {
        WaterVendingMachine waterMachine = new WaterVendingMachine();
        waterMachine.addProduct(new ProductWater("water 1", 65.00));
        waterMachine.addProduct(new ProductWater("water 2", 95.00, 1.0));

        ChocolateVendingMachine chocoMachine = new ChocolateVendingMachine();
        chocoMachine.addProduct(new ProductChocolate("Snickers", 100.00, 160.0));
        chocoMachine.addProduct(new ProductChocolate("Snickers Super", 160.00, 220.0));
        chocoMachine.addProduct(new ProductChocolate("Snickers Double", 200.00, 250.0));
        chocoMachine.addProduct(new ProductChocolate("Mars", 75.00, 120.0));
        chocoMachine.addProduct(new ProductChocolate("Mars MAX", 145.00, 180.0));

        ArrayList list1 = waterMachine.getProduct("water");
        System.out.println(list1);

        ArrayList list2 = chocoMachine.getProduct("Snickers");
        System.out.println(list2);

    }

}