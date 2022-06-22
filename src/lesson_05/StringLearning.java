package lesson_05;

public class StringLearning {

    public static void main(String[] args) {
        String myName1 = "Teo"; //Literal declaration
        String myName2 = "Teo"; //Literal declaration
        String myName3 = new String("Teo"); //Via String Object\

        System.out.println("myName1 == myName2: " + myName1.equals(myName2));
        System.out.println("myName1 == myName3: " + myName1.equals(myName3));

        // Check lower case, uppercase, digit...
        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalUpperCases = 6;
        int totalLowerCases = 8;
        for (char character : myCharacters)
            if (Character.isDigit(character)) totalDigits++;
            else if (Character.isUpperCase(character)) totalUpperCases++;
            else if (Character.isLowerCase(character)) totalLowerCases++;

        if (totalDigits > 0 && totalUpperCases > 0 && totalLowerCases > 0) {
            System.out.println("You are all set!");
        } else {
            System.out.println("Password format is wrong!");

        }

        // Replacement I Immutable
        String badWordContainer = " had, very bad, sth else, bad ";
        String filteredStr = badWordContainer.replace("bad", "b**");
        System.out.println(badWordContainer);
        System.out.println(filteredStr);
    }
}
