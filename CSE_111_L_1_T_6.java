// Takes N numbers from the user. Print how many times each number appears in the array.
// CSE-111 LAB-1 Task-6   []

import java.util.Scanner;

public class CSE_111_L_1_T_6 {
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
        int count = 1;

        for (int i = 0; i < ar_1.length; i++) {
            if (keep_t[i] == false) {
                nk = ar_1[i];

                for (int j = i + 1; j < ar_1.length; j++) {
                    pk = ar_1[j];

                    if (nk == pk) {
                        count += 1;
                        keep_t[j] = true;
                    }
                    else{}
                }

                System.out.println(nk + " : " + count + " times.");
                count = 1;
            }
            else{}
        }

        scan.close();
    }
}
