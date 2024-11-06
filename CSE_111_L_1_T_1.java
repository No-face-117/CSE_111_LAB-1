//  Sum, Average, Minimum and Maximum of Only the positive odd numbers.
// CSE-111 LAB-1 Task-1   []

import java.util.Scanner;

public class CSE_111_L_1_T_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ak_arr_1 = new int[10];
        boolean flag = false;

        for (int i = 0; i < ak_arr_1.length; i++) {
            System.out.println("Enter number : ");
            int ak_i_1 = scan.nextInt();

            ak_arr_1[i] = ak_i_1;
        }

        boolean maby_c = check_p_o(ak_arr_1);

        if (maby_c == true) {
            check_sum(ak_arr_1);
            check_small(ak_arr_1);
            check_big(ak_arr_1);
            check_avg(ak_arr_1);

        }
        else {System.out.println("No odd positive numbers found !");}



    }

    public  static boolean check_p_o(int[] akc){
        int temp = 0;
        boolean maby = false;

        for (int i = 0; i < akc.length; i++) {
            temp = akc[i];

            if (temp > 0 && temp % 2 != 0){
                maby = true;
            }
            else if (temp >=0 && temp % 2 == 0){

            }
            else {}
        }

        return maby;
    }

    public static void check_big(int[] akc){
        int big = 0;
        int big_a = 0;
        int temp = 0;

        for (int i = 0; i < akc.length; i++) {
            temp = akc[i];

            if (temp > 0 && temp % 2 != 0){
                if (temp > big){
                    big = temp;
                }
                else if (big < temp) {

                }
                else {}
            }
            else{};
        }
        System.out.println("Big int : " + big);
    }

    public static void check_small(int[] akc){
        int small = 99999999;
        int small_a = 0;
        int temp = 0;

        for (int i = 0; i < akc.length; i++) {
            temp = akc[i];

            if (temp > 0 && temp % 2 != 0){
                if (temp > small){

                }
                else if (small > temp) {
                    small = temp;
                }
                else {}
            }
            else{}
        }
        System.out.println("Small int : " + small);
    }

    public static void check_sum(int[] akc){
        int temp = 0;
        int sum = 0;

        for (int i = 0; i < akc.length; i++) {
            temp = akc[i];

            if (temp > 0 && temp % 2 != 0){
                sum += temp;
            }
            else{}

        }
        System.out.println("Sum : " + sum);
    }

    public static void check_avg(int[] akc){
        int temp = 0;
        int count = 0;
        double sum = 0;
        double avg = 0.0;

        for (int i = 0; i < akc.length; i++) {
            temp = akc[i];

            if (temp > 0 && temp % 2 != 0){
                sum += temp;
                count ++;

            }
            else{}
        }

        avg = sum / count;

        System.out.println("avarage : " + avg);
    }
}
