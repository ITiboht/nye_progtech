package hu.nye.progtech.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Greetings generator!");
        System.out.println("Choose a language (first 3 letter).");
        System.out.println("Languages:\n(1) Magyar\n(2) English\n(3) Pilipinas");
        System.out.print("Your name: ");
        String name = in.next();
        String lang = in.next();
        in.close();
        switch (lang)
        {
            case "hun":
                System.out.println("A kiválasztott nyelv: Magyar\nHelló, " + name +"!");
                break;
            case "eng":
                System.out.println("The choose lanugage: English\nHello, "+ name +"!");
                break;
            case "pil":
                System.out.println("Napiling wika: Pilipinas \nKamusta, "+ name + "!");
                break;
            default:
                System.out.println("A kiválasztott nyelv: Magyar\nHelló, "+ name + "!");
                break;
        }
    }
}
