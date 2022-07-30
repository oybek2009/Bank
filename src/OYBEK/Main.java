package OYBEK;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// JAVAda bank yaratish

        Scanner scanner = new Scanner(in);
        System.out.println("[1] 25%");
        System.out.println("[2] 35%");
        System.out.println("[3] 45%");
        System.out.print("= ");
        int n = scanner.nextInt();
        System.out.print("Yilni kiriting: ");
        int y = scanner.nextInt();

        switch (n) {
            case 1->{
                System.out.print("$= ");
                double sum = scanner.nextInt();
                double res = sum * 25 / 100;
                double nat = res + sum;
                double yil = nat * y;
                System.out.println(yil);
            }
            case 2->{
                System.out.print("$= ");
                double sum = scanner.nextInt();
                double res = sum * 35 / 100;
                double nat = res + sum;
                double yil = nat * y;
                System.out.println(yil);
            }
            case 3->{
                System.out.print("$= ");
                double sum = scanner.nextInt();
                double res = sum * 45 / 100;
                double nat = res + sum;
                double yil = nat * y;
                System.out.println(yil);
            }
        }
    }
}
