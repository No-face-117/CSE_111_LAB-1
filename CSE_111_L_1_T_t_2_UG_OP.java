//  Prints the smallest and largest number and their location in the array. (Ungraded)
// CSE-111 LAB-1 Task-2 Ungraded    []

import java.util.Scanner;

public class CSE_111_L_1_T_t_2_UG_OP {
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

        check_big(ar_1);
        check_small(ar_1);

        scan.close();
    }

    public static void check_big(int[] akc){
        int big = 0;
        int big_a = 0;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < akc.length; i++) {
            temp = akc[i];
            if (temp > 0 && temp % 2 != 0){
                if (temp > big){
                    big = temp;
                    index = i;
                }
                else if (big < temp) {
                }
                else {}
            }
            else{};
        }
        System.out.println("Big int : " + big);
        System.out.println("Found at : " + index);
        System.out.println();
    }

    public static void check_small(int[] akc){
        int small = 99999999;
        int small_a = 0;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < akc.length; i++) {
            temp = akc[i];
            if (temp > 0 && temp % 2 != 0){
                if (temp > small){
                }
                else if (small > temp) {
                    small = temp;
                    index = i;
                }
                else {}
            }
            else{}
        }
        System.out.println("Small int : " + small);
        System.out.println("Found at : " + index);
        System.out.println();
    }
}
