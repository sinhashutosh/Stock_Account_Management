package org.example;

import java.util.*;
import java.util.Scanner;

public class StockFunction {
    long your_account_balance = 0;
    Scanner sc = new Scanner(System.in);
    List<StockPortfolio> list = new ArrayList<StockPortfolio>();

    void addStock() {
        System.out.println("Enter Number of Stock...");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            StockPortfolio stock = new StockPortfolio();
            System.out.printf("Enter the  %d Stock Name ", i + 1);
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

    void credit() {
        System.out.println("How much Amount of moeny you Want to deposit");
        int amount = sc.nextInt();
        your_account_balance += amount;
        System.out.println(amount + " has been credited on your account");
        System.out.println("Your Aailable Balance = " + your_account_balance);
    }

    void debit() {
        System.out.println("how much money You want to Withdraw ");
        long debit_Amount = sc.nextLong();
        if (debit_Amount > your_account_balance) {
            System.out.println("Debit amount exceeded your account balance");
        } else {
            long remaing_balence = your_account_balance - debit_Amount;
            System.out.println("Remaining Balance = " + remaing_balence);
        }
    }
}
