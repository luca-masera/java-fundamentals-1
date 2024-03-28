package org.experis.esercizio4Bonus;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        //Lista degli invitati
        String[] guests = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        Scanner scan = new Scanner(System.in);

        // Chiedere alla persona come si chiama
        System.out.println("What's your name?");

        //Salvare il risultato in una variabile
        String guestName = scan.nextLine();
        //System.out.println(guestName);

        //booleano
        boolean guestInvited = false;

        for (int i = 0; i < guests.length ; i++) {
            System.out.println("i = " + i);
            if (guests[i].equals(guestName)){
                guestInvited = true;

                break;
            }
        }

        if (guestInvited){
            System.out.println("Sei invitato, puoi entrare.");
        }else{
            System.out.println("Non sei invitato.");
        }
        scan.close();



    }
}
