// Takes 1 String and prints the previous in the series.
// CSE-111 LAB-1 Task-4   []

import java.util.Scanner;

public class CSE_111_L_1_T_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your string-1: ");
        String so_1 = scan.nextLine();
        
        String so_2 = "";
        char shar = ' ';
        char shahar = ' ';
        int ak = 0;
        int pk = 0;

        for (int i = 0; i < so_1.length(); i++) {
            shar = so_1.charAt(i);

            if (shar >= 'a' && shar <= 'z' || shar >= 'A' && shar <= 'Z') {
                ak = (int) shar;
                pk = ak - 1;
            }
            else{}
            
            
            
            if (pk < 97 || pk < 65) {
                pk += 26;
            }
            else{}

            shahar = (char) pk;

            so_2 += shahar;
        }

        System.out.println(so_2);

        scan.close(); 
    }
}
