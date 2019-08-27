package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.junit.internal.runners.model.EachTestNotifier;

public class OwingPrinter {
    public void printOwing(String name, Orders orders) {
        double totalAmount = orders.getTotalAmount();;

        // print banner
        System.out.println ("*****************************\r\n" + 
          "****** Customer totals ******\r\n" + 
          "*****************************");
        
        // print details
        System.out.println("name: " + name + "\r\n" + "amount: " + totalAmount);
    }
}

class Orders {
    private final double[] amounts;

    public Orders(double[] amounts) {
        this.amounts = amounts;
    }

    public double[] getAmount() {
        return amounts;
    }
    public double getTotalAmount() {
     double totalAmount = 0;
     for (int i = 0 ;i < amounts.length; i++) {
      totalAmount += amounts[i];
     }
     return totalAmount;
    }
}