// New array by removing an element old old array. (Ungraded)
// CSE-111 LAB-1 Task-1 Ungraded    []

import java.util.Scanner;

public class CSE_111_L_1_T_t_1_UG_OP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        int[] ar_1 = new int[ak];
        
        boolean[] keep_t = new boolean[ak];

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + " : ");
            ar_1[i] = scan.nextInt();
        }

        int nk = 0;
        int pk = 0;
        int jk = 0;
        int count_1 = 0;
        int count_2 = 0;

        System.out.println();
        System.out.println("Give number : ");
        int kk = scan.nextInt();

        for (int i = 0; i < ar_1.length; i++) {
            pk = ar_1[i];

            if (pk == kk) {
                ar_1[i] = 0;
            }
            else{}
        }

        for (int j = 0; j < ar_1.length; j++) {
            nk = ar_1[j];

            if (nk != 0) {
                count_1 ++;
            }
            else{}
        }

        int[] ar_2 = new int[count_1];

        for (int k = 0; k < ar_1.length; k++) {
            jk = ar_1[k];

            if (jk != 0) {
                ar_2[count_2] = jk;
                count_2 ++;
            }
            else{}
        }

        System.out.println();
        System.out.println("New Array : ");
        for (int index = 0; index < ar_2.length; index++) {
            System.out.print(ar_2[index] + " ");
        }

        scan.close();
    }
}
