// Make 2d array and print it.
// CSE-111 LAB-1 Task-8   []

import java.util.Scanner;

public class CSE_111_L_1_T_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter row : ");
        int ak_r = scan.nextInt();

        System.out.println("Enter column : ");
        int ak_c = scan.nextInt();
        
        int jk = 0;
        int kk = 0;
        int mk = 0;
        int xk = 0;

        boolean flag = true;

        int[][] ar_1 = new int[ak_r][ak_c];

        for (int i = 0; i < ar_1.length; i++) {
            for (int j = 0; j < ar_1[i].length; j++) {
                System.out.println("Enter int for : " + " row : " + i + " column : " + j + " = ");
                ar_1[i][j] = scan.nextInt();
            }
        }

        System.out.println();

        p_2d_array_pe(ar_1);
        p_1d_array_pe(ar_1);

        scan.close();
    }

    public static void p_2d_array_pe(int[][] array) {
        System.out.println("2D Array : ");
  
        for (int i = 0; i < array.length; i++) {
            for (int index = 0; index < array[i].length; index++) {
                System.out.print( array[i][index] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void p_1d_array_pe(int[][] array) {
        System.out.println("1D Array : ");
  
        for (int i = 0; i < array.length; i++) {
            for (int index = 0; index < array[i].length; index++) {
                System.out.print(array[i][index] + " ");
            }
        }
        System.out.println();
    }
}
