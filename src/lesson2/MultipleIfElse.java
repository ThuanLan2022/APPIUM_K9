package lesson2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        /*
         * < 18 không bán rượu bia
         * 18-55 : ok
         * >55: Bán 2 chai bia
         * */
        /* <18.........|19...............55|56........*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age: ");
        int userAge = scanner.nextInt();
        if(userAge<18){
            System.out.println("Do not sell alcohol!");
        }else if (userAge<18){
            System.out.println("OK!");}
        else
        {
            System.out.println("Only two bottles can be sold!");
        }
    }
}
