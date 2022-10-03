import java.util.stream.IntStream;
/*
Fülle ein String-Array mit den Zahlenwörtern "Eins" bis "Zehn"
Schreibe eine Methode die zu einer einstelligen Zahl das entsprechende Zahlenwort ausgibt.
Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
Vor Zahlen die durch 5 teilbar sind soll ein $ stehen
Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner) und diese in einem Array speichert.
Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.
 */
public class Main {
    public static int[] valueArray = IntStream.range(1, 9).toArray();
    public static String[] numberArray = {"one", "two", "three", "four"
            , "five", "six", "seven", "eight", "nine",  };

    public static void main(String[] args) {
        System.out.println(getNumberString(10));

    }

    public static String getNumberString(int value) {


        int indexNumber = 1;
        for (String numberString : numberArray) {

            if (indexNumber == value) {
                return numberString;
            } else
                indexNumber++;
        }

       return "error";
}
                }