package org.example;

public class StockPortfolio {
    private String stock_Name;
    private int total_No_Of_Shares;
    private double each_Share_Price;
    private double total_Value_Of_Shares;

    public String getStock_Name() {
        return stock_Name;
    }

    public void setStock_Name(String stock_Name) {
        this.stock_Name = stock_Name;
    }

    public int getTotal_No_Of_Shares() {
        return total_No_Of_Shares;
    }

    public void setTotal_No_Of_Shares(int total_No_Of_Shares) {
        this.total_No_Of_Shares = total_No_Of_Shares;
    }

    public double getEach_Share_Price() {
        return each_Share_Price;
    }

    public void setEach_Share_Price(double each_Share_Price) {
        this.each_Share_Price = each_Share_Price;
    }

    public double getTotal_Value_Of_Shares() {
        return total_Value_Of_Shares;
    }

    public void setTotal_Value_Of_Shares(double total_Value_Of_Shares) {
        this.total_Value_Of_Shares = total_Value_Of_Shares;
    }

    @Override
    public String toString() {
        return "StockPortfolio [Stock Name = " + stock_Name + ", No of Shares = " + total_No_Of_Shares + ", Share Price = "
                + each_Share_Price + ", Total Value of Shares = " + total_Value_Of_Shares + "]";
    }
}
