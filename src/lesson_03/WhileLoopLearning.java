package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {
    public static void main(String[] args) {
//        boolean somethingIsStillTrue = true;
//        while (somethingIsStillTrue){
//            somethingIsStillTrue = false;
//            System.out.println("Some thing is still true");
//        }

        boolean isContinuing = true;
        while (isContinuing){
            System.out.println("=======menu=========");
            System.out.printf("1. Generate random number (less than 1000)");
            System.out.printf("0. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select option: ");
            int option = scanner.nextInt();
            if(option == 0) {
                isContinuing = false;
            } else if (option==1) {
                System.out.println("Your random number: " + new SecureRandom().nextInt(1000));
            }else {
                System.out.println("[Err] Input tao lao de teo");
            }
            }
        System.out.println("See you again!");
        }
    }

