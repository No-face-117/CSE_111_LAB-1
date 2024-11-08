// scalar multiplication A = k*A , with array maker (Ungraded)
// CSE-111 LAB-1 Task-4 Ungraded    []

import java.util.Scanner;

public class CSE_111_L_1_T_t_4_UG_OP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nk = 0;
        int nk_a = 0;
        int pk = 0;
        int pk_a = 0;
        double jk = 0;
        int count_1 = 0;
        int count_2 = 0;

        System.out.println("Enter colum : ");
        int ak_c = scan.nextInt();

        System.out.println("Enter row : ");
        int ak_r = scan.nextInt();

        System.out.println("Enter int k : ");
        int kk = scan.nextInt();

        boolean[] keep_t = new boolean[9];

        int[][] ar_1 =  array_maker(ak_c,ak_r);

        int[][] arr_2 = array_multiplication(ar_1, kk);

        print_array(arr_2);

        

        scan.close();
    }

    public static int[][] array_maker(int colum, int row){
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[colum][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter int at coloum : " + i + " & row : " + j + " = ");
                arr[i][j] = scan.nextInt();
            }
        }

        scan.close();
        return arr;
    }

    public static int[][] array_multiplication(int[][] arr_1, int ak){

        for (int i = 0; i < arr_1.length; i++) {
            for (int j = 0; j < arr_1.length; j++) {
                arr_1[i][j] = arr_1[i][j] * ak;
            }
        }

        return arr_1;
    }

    public static void print_array(int[][] aerr){
        System.out.println();
        for (int i = 0; i < aerr.length; i++) {
            for (int j = 0; j < aerr.length; j++) {
                System.out.print(aerr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
}
