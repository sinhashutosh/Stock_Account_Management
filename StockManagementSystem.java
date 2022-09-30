package org.example;
import java.util.Scanner;

public class StockManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome To Stock Management System");
        Scanner sc = new Scanner(System.in);
        StockFunction stockFunction = new StockFunction();
        System.out.println("Add Stock");
        stockFunction.addStock();
        System.out.println("*********************************");
        System.out.println("Stock Report are : ");
        stockFunction.stockReport();
        System.out.println("*********************************");
        stockFunction.credit();
        stockFunction.debit();
    }
}
