// Treasure Hunt.
// CSE-111 LAB-1 Task-10   []

import java.util.Scanner;

public class CSE_111_L_1_T_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jk = 0;
        int kk = 0;
        int mk = 0;
        int xk = 0;
        int count = 4;

        int row = 5;
        int colum = 6;
        String move_2 = "";

        String player_a =  "  7  "; 
        String player_d =  "  #  ";
        String player_r =  "  @  ";
        String op_s =    "  0  ";
        String treasure = " 10  ";
        String mine =    " -1  ";
        String wall_s =  "  |  ";
        String wall_u =  " --- ";
        String wall_c =  "  +  ";

        boolean flag_1 = false;
        boolean flag_2 = false;

        String[][] stage = {{wall_c, wall_u, wall_u, wall_u, wall_u, wall_u, wall_c},
                            {wall_s, op_s, op_s,   mine, op_s, op_s, wall_s},
                            {wall_s, mine, mine, op_s, mine, op_s, wall_s},
                            {wall_s, op_s, op_s, mine, mine, treasure, wall_s},
                            {wall_s, mine, op_s, treasure, op_s, op_s, wall_s},
                            {wall_s, mine, op_s, mine, op_s, mine, wall_s},
                            {wall_s, op_s, mine, op_s, op_s, player_a, wall_s},
                            {wall_c, wall_u, wall_u, wall_u, wall_u, wall_u, wall_c}};

        print_info();
        p_2d_array_p(stage);
        print_controls();

        for (int i = 0; i <= count; i++) {
            System.out.println("Enter your move : ");
            move_2 = scan.nextLine();

            if (move_2.equals("up") || move_2.equals("UP")) {
                if (stage[colum - 1][row] != mine && stage[colum - 1][row] != wall_u){
                    if(stage[colum - 1][row] != treasure){
                        stage[colum][row] = op_s;
                        colum --;
                        stage[colum][row] = player_a;
                        p_2d_array_p(stage);
                    }
                    else{
                        stage[colum][row] = op_s;
                        stage[colum - 1][row] = player_r;
                        p_2d_array_p(stage);
                        System.out.println("!!! ARRRR ME PLUNDER !!!");
                        break;
                    }
                }
                else if (stage[colum - 1][row] == mine) {
                    stage[colum][row] = op_s;
                    stage[colum - 1][row] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! YOU HAVE HIT A MINE !!!");
                    break;
                }else if (stage[colum - 1][row] == wall_u) {
                    stage[colum][row] = op_s;
                    stage[colum - 1][row] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME DEAD !!!");
                    break;
                }else if (stage[colum - 1][row] == treasure) {
                    stage[colum][row] = op_s;
                    stage[colum - 1][row] = player_r;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME PLUNDER !!!");
                    break;
                }else{System.out.println("Failed to find the treasure.");}
            }
            else if (move_2.equals("down") || move_2.equals("DOWN")) {
                if (stage[colum + 1][row] != mine && stage[colum + 1][row] != wall_u){
                    if(stage[colum + 1][row] != treasure){
                        stage[colum][row] = op_s;
                        colum ++;
                        stage[colum][row] = player_a;
                        p_2d_array_p(stage);
                    }
                    else{
                        stage[colum][row] = op_s;
                        stage[colum + 1][row] = player_r;
                        p_2d_array_p(stage);
                        System.out.println("!!! ARRRR ME PLUNDER !!!");
                        break;
                    }
                }
                else if (stage[colum + 1][row] == mine) {
                    stage[colum][row] = op_s;
                    stage[colum + 1][row] = player_r;
                    p_2d_array_p(stage);
                    System.out.println("!!! YOU HAVE HIT A MINE !!!");
                    break;
                }else if (stage[colum + 1][row] == wall_u) {
                    stage[colum][row] = op_s;
                    stage[colum + 1][row] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME DEAD !!!");
                    break;
                }
                else if (stage[colum + 1][row] == treasure) {
                    stage[colum][row] = op_s;
                    stage[colum + 1][row] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME PLUNDER !!!");
                    break;
                }else{System.out.println("Failed to find the treasure.");}   
            }
            else if (move_2.equals("right") || move_2.equals("RIGHT")) {
                if (stage[colum][row + 1] != mine && stage[colum][row + 1] != wall_s){
                    if(stage[colum][row + 1] != treasure){
                        stage[colum][row] = op_s;
                        row ++;
                        stage[colum][row] = player_a;
                        p_2d_array_p(stage);
                    }
                    else{
                        stage[colum][row] = op_s;
                        stage[colum][row + 1] = player_r;
                        p_2d_array_p(stage);
                        System.out.println("!!! ARRRR ME PLUNDER !!!");
                        break;
                    }
                }
                else if (stage[colum][row + 1] == mine) {
                    stage[colum][row] = op_s;
                    stage[colum][row + 1] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! YOU HAVE HIT A MINE !!!");
                    break;
                }else if (stage[colum][row + 1] == wall_s) {
                    stage[colum][row] = op_s;
                    stage[colum][row + 1] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME DEAD !!!");
                    break;
                }
                else if (stage[colum][row + 1] == treasure) {
                    stage[colum][row] = op_s;
                    stage[colum][row + 1] = player_r;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME PLUNDER !!!");
                    break;
                }else{System.out.println("Failed to find the treasure.");}   
            }
            else if (move_2.equals("left") || move_2.equals("LEFT")) {
                if (stage[colum][row - 1] != mine && stage[colum][row - 1] != wall_s){
                    if(stage[colum][row - 1] != treasure){
                        stage[colum][row] = op_s;
                        row --;
                        stage[colum][row] = player_a;
                        p_2d_array_p(stage);
                    }
                    else{
                        stage[colum][row] = op_s;
                        stage[colum][row - 1] = player_r;
                        p_2d_array_p(stage);
                        System.out.println("!!! ARRRR ME PLUNDER !!!");
                        break;
                    }
                }
                else if (stage[colum][row - 1] == mine) {
                    stage[colum][row] = op_s;
                    stage[colum][row - 1] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! YOU HAVE HIT A MINE !!!");
                    break;
                }else if (stage[colum][row - 1] == wall_s) {
                    stage[colum][row] = op_s;
                    stage[colum][row - 1] = player_d;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME DEAD !!!");
                    break;
                }else if (stage[colum][row - 1] == treasure) {
                    stage[colum][row] = op_s;
                    stage[colum][row - 1] = player_r;
                    p_2d_array_p(stage);
                    System.out.println("!!! ARRRR ME PLUNDER !!!");
                    break;
                }else{System.out.println("Failed to find the treasure.");}     
            }
            else{System.out.println("!!! INVALID MOVE !!!");}

            System.out.println();
            System.out.println(count - i + " : Moves remaining.!!!");
            System.out.println();
            
        }
        scan.close();
    }

    public static void print_controls(){
        System.out.println("YOU ARE : 7 ");
        System.out.println();
        System.out.println("       UP");
        System.out.println();
        System.out.println("LEFT    +    RIGHT");
        System.out.println();
        System.out.println("      DOWN");
        System.out.println();
    }

    public static void print_info(){
        System.out.println();
        System.out.println("!!! FIND THE TREASURE !!!");
        System.out.println(" PLAYER : 7 ");
        System.out.println(" DEAD PLAYER : # ");
        System.out.println(" RICH AND FAT PLAYER : @ ");
        System.out.println(" TREASURE : 10 ");
        System.out.println(" OPEN SPACES : 0 ");
        System.out.println(" MINE : -1 ");
        System.out.println(" WALL : |  &  ---");
        System.out.println(" CORNER : + ");
        System.out.println("!!! CROSS THE WALL BAND DIE !!!");
        System.out.println("!!! STEP ON MINE AND DIE !!!");
        System.out.println();

    }

    public static void p_2d_array_p(String[][] array) {
        System.out.println("Current state : "); 

        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j< array[i].length) {
                System.out.print(array[i][j] +  " " );
                j++;
            }
            System.out.println();
        }
        System.out.println( );
    }
}

/* 
    +    ---   ---   ---   ---   ---    +   
    |     0     0    -1     0    10     |   
    |    -1    -1     0    -1     0     |   
    |     0     0    -1    -1     0     |   
    |     0     0    10     0     0     |   
    |    10     0     0     0     0     |   
    |     0    10     0     0     7     |   
    +    ---   ---   ---   ---   ---    +   
*/