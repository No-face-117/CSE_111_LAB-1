// Check whether the given matrix is an Identity matrix or not.
// CSE-111 LAB-1 Task-9   []

import java.util.Scanner;

public class CSE_111_L_1_T_9 {
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
        int count = 0;

        boolean flag_1 = false;
        boolean flag_2 = false;

    /*
        int [ ][ ] A = {{1,  0,  0,  1},
                        {0,  1,  0,  0},
                        {1,  0,  1,  0},
                        {0,  1,  0,  1}};
    */

        int [ ] [ ] A = {{1, 0, 0},
                         {0, 1, 0},
                         {0, 0, 1}};

        
        boolean[] tt = new boolean[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != 0) {
                    count ++;
                }
                else{}

                if (jk < A[i].length) {
                    if (A[i][jk] != 0) {
                        flag_1 = true;
                        jk++;
                    }
                    else{flag_1 = false;}
                }
                else{}
                

            }

            if (count == 1 && flag_1 == true) {
                flag_2 = true;
            }
            else if (count > 1 && flag_1 != true) {
                flag_2 = false;
            }
            else{}
            
            count = 0;
        }
        
        if (flag_2) {
            System.out.println("Identity Matrix.");
        }
        else if (!flag_2) {
            System.out.println("Not an Identity Matrix.");
        }
    }
}
