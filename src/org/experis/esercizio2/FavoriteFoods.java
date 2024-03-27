package org.experis.esercizio2;

public class FavoriteFoods {
    public static void main(String[] args) {
        String[] foods = {"pizza", "pasta", "arancia", "cioccolato", "carne", "polenta"};
        System.out.println("Il numero totale degli elementi è:" + foods.length);
        System.out.println("Il mio cibo preferito è la:" + foods[0]);
        System.out.println("Il mio cibo semi-preferito è:" + foods[foods.length-1]);
        System.out.println("Il cibo di mezza classifica è:" + foods[foods.length/2]);

    }
}
