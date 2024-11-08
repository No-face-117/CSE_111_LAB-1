// Median value and Array sorter (Ungraded)
// CSE-111 LAB-1 Task-3 Ungraded    []

import java.util.Scanner;

public class CSE_111_L_1_T_t_3_UG_OP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        int[] ar_1 = new int[ak];
        int[] ar_2 = new int[ar_1.length];

        boolean[] keep_t = new boolean[9];

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + " : ");
            ar_1[i] = scan.nextInt();
        }

        int nk = 0;
        int nk_a = 0;
        int pk = 0;
        int pk_a = 0;
        double jk = 0;
        int count_1 = 0;
        int count_2 = 0;

        System.out.println();

        int big = check_big(ar_1);
        int small = check_small(ar_1);

        ar_2 = array_sorter(ar_1, big , small);


        print_array(ar_2);

        if (ar_2.length % 2 != 0) {
            System.out.println("Median value : " + ar_2[ar_2.length/2]);
        }
        else if (ar_2.length % 2 == 0) {
            nk = ar_2.length / 2;
            pk = (ar_2.length / 2) + 1;

            nk_a = ar_2[nk];
            pk_a = ar_2[pk];

            jk = (nk_a + pk_a) / 2;

            System.out.println("Median value : " + jk);
        }
        
        

        scan.close();
    }

    public static void print_array(int[] aerr){
        for (int i = 0; i < aerr.length; i++) {
            System.out.print(aerr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static int[] array_fixer(int[] arr){
        int count_1 = 0;
        int count_2 = 0;
        int ak = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count_1 ++;
            }
            else{}
        }

        int[] arrg = new int[count_1];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arrg[ak] = arr[j];
            }
            else{}
        }

        return arrg;
    }

    public static int check_big(int[] akc){
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

        return big;
    }

    public static int check_small(int[] akc){
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

        return small;
    }

    public static int[] array_sorter(int[] arc , int big , int small){
        int[] aerr = new int[arc.length];

        int ak = 0;
        int temp_1 = 0;
        int temp_2 = 0;
        int index = big - small;

        for (int i = small; i < big + 1; i++) {
            ak = i;

            for (int j = 0; j < arc.length; j++) {
                temp_1 = arc[j];

                if (temp_1 == ak) {
                    aerr[temp_2] = i;

                    temp_2 ++;
                }
                else{}
            }
        }
        return aerr;
    }
}
