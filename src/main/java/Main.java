import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
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
    public static String[] numberArray = {"one", "two", "three", "four"
            , "five", "six", "seven", "eight", "nine",};

    public static void main(String[] args) {

        //get Number as a String
        System.out.println(getNumberString(6));

        //printnumber 1 to 1000
        printNumbersOneToThousand();

        //fill Array
        String [] test = fillTheArray();
        printArray(test);;
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

    public static void printNumbersOneToThousand() {

        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println("#" + "$" + i);
            } else if (i % 3 == 0) {
                System.out.println("#" + i);
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
            } else System.out.println(i);
        }
    }

    public static String[] fillTheArray() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean stop = false;
        int elementCounter = 0;

        System.out.println("Write words to fill the Array.. U can stop by writing exit");
        while (!stop) {

            String word = sc.nextLine();
            if (word.equals("exit")) {
                stop = true;
            }

            else {
                elementCounter++;
                list.add(word);
                printArrayList(list);
                }
            }

        String[] stringArray = new String[elementCounter];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = list.get(i);
        }
        return stringArray;
    }

    public static void printArrayList(ArrayList<String> list){
        for (String string : list) {

            System.out.print(string.equals(list.get(0)) ? string : (", " + string));

        }

        System.out.println();
    }
    public static void printArray(String[] StringArray){
        for(String elem : StringArray){

            System.out.println(elem);

        }
    }

}