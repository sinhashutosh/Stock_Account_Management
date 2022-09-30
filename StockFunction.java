package org.example;

import java.util.*;
import java.util.Scanner;

public class StockFunction {
    Scanner sc = new Scanner(System.in);
    List<StockPortfolio> list = new ArrayList<StockPortfolio>();

    void addStock() {
        System.out.println("Enter Number of Stock...");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            StockPortfolio stock = new StockPortfolio();
            System.out.printf("Enter the  %d Stock Name ", i+1);
            stock.setStock_Name(sc.next());
            System.out.println("Enter the Total Share");
            stock.setTotal_No_Of_Shares(sc.nextInt());
            System.out.println("Enter price of each Share");
            stock.setEach_Share_Price(sc.nextInt());
            double total_value = stock.getTotal_No_Of_Shares() * stock.getEach_Share_Price();
            stock.setTotal_Value_Of_Shares(total_value);
            list.add(stock);
        }
    }

    void stockReport() {
        for (StockPortfolio i : list) {
            System.out.println(i);
        }
    }
}
