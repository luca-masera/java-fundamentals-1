package org.experis.esercizio1;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Chiedere al passeggero il numero di km che vuole percorrere
        System.out.println("How many kilometers do you want to travel?");
        int kilometers = scan.nextInt();

        //Chiedere al passeggero l'età
        System.out.println("How old are you?");
        int age = scan.nextInt();

        //Prezzo del biglietto
        float price = 0.21F;
        float ticketPrice = price * kilometers;

        //Sconti in base all'etè
        System.out.println("Base price ticket is:" + ticketPrice + "$");
        if (age < 18){
            float discount20 = ticketPrice * 20 / 100;
            float ticket20 =ticketPrice - discount20;
            System.out.println("Yours ticket discount of 20% =" + ticket20 + "$" );
        } else if (age > 65) {
            float discount40 = ticketPrice * 40 / 100;
            float ticket40 =ticketPrice - discount40;
            System.out.println("Yours ticket price discount of 40% =" + ticket40 + "$" );
        }




        scan.close();

    }
}
