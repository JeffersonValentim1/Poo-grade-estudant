package aplication;

import entities.Estudent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudent estudent= new Estudent();

        System.out.println("Entender nome estudent: ");
        estudent.name = sc.nextLine();

        System.out.println("Entender grade to semestre: ");
        estudent.grade1 = sc.nextInt();
        estudent.grade2 = sc.nextInt();
        estudent.grade3 = sc.nextInt();

        System.out.printf("Grade final: %.2f%", estudent.finalGrade());

        if (estudent.finalGrade()<60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f, Points%n", estudent.missingPoint());
        }else {
            System.out.println("Pass");
        }

        sc.close();

    }
}
