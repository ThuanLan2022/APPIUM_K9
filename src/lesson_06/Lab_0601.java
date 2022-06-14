package lesson_06;

public class Lab_0601 {
    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";
        String hourNumber = String.valueOf(inputString.trim().charAt(0));
        System.out.println(hourNumber);
        String minuteNumber = String.valueOf(inputString.trim().charAt(9));
        System.out.println(minuteNumber);
        int intHour = Integer.valueOf(hourNumber) * 60;
        int intMinute = Integer.valueOf(minuteNumber);
        int total = intHour + intMinute;
        System.out.printf("Total minutes is: %d (Minutes)", total);
    }
}
