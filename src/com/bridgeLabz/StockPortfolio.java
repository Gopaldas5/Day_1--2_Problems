package com.bridgeLabz;

import java.util.Scanner;
class StockPortfolio {
    public static final int PORTFOLIO_SIZE = 2;
    public static Stock[] stocks;

    public StockPortfolio() {
        stocks = new Stock[PORTFOLIO_SIZE];
    }

    public static void StockPortfolio() {
        for (int i = 0; i < PORTFOLIO_SIZE; i++) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter the Stock's name :- ");
            String stockName = console.next();
            System.out.println("Enter the Stock price :- ");
            int stockPrice = console.nextInt();
            System.out.println("Enter the number of stock :- ");
            int numberOfStock = console.nextInt();
            stocks[i] = new Stock(stockName, stockPrice, numberOfStock);
        }
    }

    public static void main(String[] args) {
        StockPortfolio();
    }
}