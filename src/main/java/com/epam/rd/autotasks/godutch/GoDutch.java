package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        var billTotal = scanner.nextInt();
        var friendsAmountTotal = scanner.nextInt();
        if (billTotal < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (friendsAmountTotal <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else if (billTotal < friendsAmountTotal &&billTotal!=0) {
            System.out.println(1);
        } else {
            int amountPerPerson = billTotal / friendsAmountTotal;
            int includingFees = (int) (amountPerPerson + (amountPerPerson * 0.1));
            System.out.println(includingFees);
        }
    }
}
