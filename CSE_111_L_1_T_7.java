// Then print the number of elements removed from the original array. 
// CSE-111 LAB-1 Task-7   []

import java.util.Scanner;

public class CSE_111_L_1_T_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N : ");
        int ak = scan.nextInt();

        double[] ar_1 = new double[ak];
        

        double pk = 0;
        double nk = 0;
        
        int jk = 0;
        int kk = 0;
        int mk = 0;
        int xk = 0;

        boolean flag = true;

        for (int i = 0; i < ak; i++) {
            System.out.println("Enter index " + i + " : ");
            ar_1[i] = scan.nextDouble();
        }

        System.out.println();

        for (int i = 0; i < ar_1.length; i++) {
            pk = ar_1[i];
            
            if (i + 1 < ar_1.length) {
               for (int j = i + 1; j < ar_1.length; j++) {
                    nk = ar_1[j];

                    if (pk == nk) {
                        flag = true;
                    }
                    else if (pk != nk) {
                        flag = false;
                    }
                    else{}

                    if (flag == true) {
                        ar_1[j] = 0;
                    }
                    else if (flag == false) {
                        break;
                    }
                    else{}
               }           
            }


        }

        for (int k = 0; k < ar_1.length; k++) {
            if (ar_1[k] != 0) {
                kk ++;
            }
            else if (ar_1[k] == 0) {
                xk ++;
            }
        }

        double[] ar_2 = new double[kk];

        for (int l = 0; l < ar_1.length; l++) {
            if (ar_1[l] != 0) {
                ar_2[mk] = ar_1[l];
                mk ++;
            }
            else{}
        }

        for (int a = 0; a < ar_2.length; a++) {
            System.out.print(ar_2[a] + " ");
        }

        System.out.println();
        System.out.println("Removed elements : " + xk);

        scan.close();
    }
}
