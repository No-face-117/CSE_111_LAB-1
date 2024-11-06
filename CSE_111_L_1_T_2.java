// Takes 2 integer numbers as input and calculates how many prime numbers exist between them.
// CSE-111 LAB-1 Task-2   []

import java.util.Scanner;

public class CSE_111_L_1_T_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer N-1 : ");
        int N_a = scan.nextInt();

        System.out.print("Enter an integer N-2 : ");
        int N_b = scan.nextInt();

        int N_1 = 0;
        int N_2 = 0;

        if (N_a > N_b) {
            N_1 = N_b;
            N_2 = N_a;
        }
        else if (N_b > N_a) {
            N_1 = N_a;
            N_2 = N_b;
        }
        else{}

        int count = 0;
    
        for (int j = N_1; j < N_2; j++) {
            int divs = 0;

            for (int i = 2; i * i <= j; i++) {
                if (j % i == 0) {
                    divs++;
                    break;
                }
            }

            if (divs == 0) {
                count++;
            }
 
        }

        System.out.println("There are " + count + " prime numbers between " + N_1 + " and " + N_2 + ".");

        scan.close();
    }
}
