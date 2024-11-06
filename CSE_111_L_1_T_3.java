// Takes 2 Concatenate two strings with a single space in between them. Generate a number which is the sum of all the letters in that concatenated string.
// CSE-111 LAB-1 Task-3   []

import java.util.Scanner;

public class CSE_111_L_1_T_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string-1: ");
        String so_1 = scan.nextLine(); 

        System.out.println("Enter your string-2: ");
        String so_2 = scan.nextLine(); 

        String comb = so_1 + " " + so_2;  
        char shar = ' ';
        int sum = 0;

        for (int i = 0; i < comb.length(); i++) {
            shar = comb.charAt(i);

            if (shar >= 'a' && shar <= 'z' || shar >= 'A' && shar <= 'Z') {
                sum += (int)shar;
            }
        }

       System.out.println(comb);
       System.out.println(sum);
        

        scan.close(); 
    }
}
