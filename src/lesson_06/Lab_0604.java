package lesson_06;

import java.util.Scanner;

public class Lab_0604 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myUrl = "https://google.com";

        if (myUrl.startsWith("https")) {
            System.out.println(" your Url start with https is: " + true);
        }

        int indexDomain = myUrl.indexOf("//");
        String domainName = myUrl.substring(indexDomain + 2);
        System.out.println("\n Domain name of the Url is: " + domainName);

        int dotName = myUrl.lastIndexOf(".");
        System.out.println("\n Last Url is: " + myUrl.substring(dotName));
    }
}
