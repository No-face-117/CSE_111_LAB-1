// Reverses the original array without creating any new array and print it.
// CSE-111 LAB-1 Task-5   []

import java.util.Scanner;

public class CSE_111_L_1_T_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        int[] ar_1 = new int[ak];

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + " : ");
            ar_1[i] = scan.nextInt();
        }

        System.out.println();

        for (int i = 0; i < ak / 2; i++) {
            int temp = ar_1[i]; 

            ar_1[i] = ar_1[ak - i - 1];  
            
            ar_1[ak - i - 1] = temp; 
        }

        System.out.println("Reversed array : ");
        
        for (int l = 0; l < ak; l++) {
            System.out.print(ar_1[l] + " ");
        }

        scan.close();
    }
}
