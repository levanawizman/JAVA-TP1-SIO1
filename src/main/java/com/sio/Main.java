package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Exit");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Quelle est la valeur du côté ?");
                    double cote = scanner.nextDouble();
                    double aire = cote * cote;
                    System.out.println("L'aire du carré est de : " + aire +"cm²");
                    break;

                case 2:
                    System.out.println("Entrer le nombre limite : ");
                    int limit = scanner.nextInt();
                    int sum = 0;
                            for (int i = 0; i < limit; i++) {
                                sum = sum + i;
                            }
                    System.out.print("La somme des "+ limit + " premiers nombres est " + sum);

                    break;

                case 3:
                    System.out.println("Quel est votre indice ? ");
                    int indice = scanner.nextInt();
                    double brut = indice * 2.3;
                    double retenues = brut * 0.2;
                    double net = brut - retenues;
                    System.out.println("Salaire brut : " + brut + "€");
                    System.out.println("Montant des retenues : " + retenues + "€");
                    System.out.println("Salaire net " + net + "€");

                    break;

                case 4:
                    DecimalFormat df = new DecimalFormat("00.000");
                    System.out.println("Quelle est la valeur de rayon ?");
                    double rayon = scanner.nextDouble();
                    float pi = 3.141592f;
                    double perimetre = 2 * pi * rayon;
                    System.out.println("Le périmetre du cercle est" + df.format(perimetre) + "cm");
                    break;

                case 0:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Vous n'avez pas le choix !");
                    break;
            }
        }
    }
}