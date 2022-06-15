package lesson_06;

public class Lab_0601 {
    public static void main(String[] args) {
        String inputString = "2hrs and 5 minutes";
        int indexHour = inputString.indexOf("hrs");
        int indexMinutes = inputString.indexOf("minutes");
        String hourNumber = String.valueOf(inputString.trim().charAt(indexHour-1));
        String minuteNumber = String.valueOf(inputString.trim().charAt(indexMinutes - 2));
        int intHour = Integer.valueOf(hourNumber) * 60;
        int intMinute = Integer.valueOf(minuteNumber);
        System.out.printf("Total minutes is: %d (Minutes)", (intHour + intMinute));
    }
}
