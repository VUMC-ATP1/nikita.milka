package classroom;

import java.util.ArrayList;
import java.util.List;

public class LoopsPractice {
    public static void main(String[] args) {
        // do
        // Exercise: print 0 - 4;

        System.out.println("START");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("END");

        i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        // Print all numbers using while loop
        int[] arr = {2, 4, 6, 10, 15};

        int num = 0;
        while (num < arr.length) {
            System.out.println(arr[num]);
            num++;
        }

        // Print out even numbers from 0 to 10 using while loop
        num = 0;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.print(num + ", ");
            }
            num++;
        }

        num = 0;
        do {
            System.out.printf(num + ", ");
            num++;
        } while (num < 10);
        System.out.println();

        // Print out odd numbers from 0 to 10 using do while
        num = 0;
        do {
            if (num % 2 != 0) {
                System.out.println("This is odd number: " + num);
            }
            num++;
        } while (num < 10);


        String[] countries = new String[]{"LV", "USA", "UK", "CZ", "PL", "RO", "ES", "LV", "UK", "PL", "RO"};
        // If country = lv, print - Latvia
        // If country = cz, print - Czech
        // All other countries just print
        // do while

        num = 0;
        do {
            if (countries[num].equals("LV")) {
                System.out.println("Latvia");
            } else if (countries[num].equals("CZ")) {
                System.out.println("Czech");
            } else {
                System.out.println(countries[num]);
            }
            num++;
        } while (num < countries.length);

        for (int j = 0; j < countries.length; j++) {
            if(j == countries.length - 1) {
                System.out.println(countries[j]);
            } else {
                System.out.print(countries[j] + ", ");
            }
        }
        System.out.println();

        // Create int[] with from 0 to 100
        // Print only even numbers

        for(String country : countries) {
            if(country.equals("LV")) {
                System.out.println("Latvia");
            } else {
                System.out.println(country);
            }
        }

        // Create int[] with from 0 to 100
        // Print all numbers with for each


//        Šobrīd ciematā ir iespēja iegādāties mājas ar mājas numuriem no 1 līdz 50.
//        Pircējs  vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurs dalās ar 3 vai 5.
//        Cik māju numuri atbilst prasībām?

        List<Integer> houses = new ArrayList<>();
        for(int k = 1; k <= 50; k++) {
            if(k % 3 == 0 || k % 5 == 0) {
                System.out.println("Numuri neder: " + k);
            } else {
                System.out.println("Numuri der:" + k);
                houses.add(k);
            }
        }
        System.out.println("Numuru skaits atbilst prasibam: " + houses.size());
        System.out.println("Numuri kuri der:");
        for(int houseNumber : houses) {
            System.out.print(houseNumber + ", ");
        }

        // *
        String sentence = "Hello, my name is Nikita";
        // count how many i are in the sentence
        // sentence.charAt(2)
        System.out.println();

        int count = 0;
        for (int c = 0; c < sentence.length(); c++) {
            if(sentence.charAt(c) == 'i') {
                count = count + 1;
            }
        }
        System.out.println("i skaits: " + count);

        //{"LV", "USA", "UK", "CZ", "PL", "RO", "ES", "LV", "UK", "PL", "RO"};
        for(String country : countries) {
            System.out.println(country);
            if(country.equals("RO")) {
                System.out.println("I found RO! Will stop this loop now!");
                break;
            }
        }

        // For loop 1 - 10;
        // If value of i is between 4 un 9 continue;

        for (int j = 1; j <= 10; j++) {
            if(j > 4 && j < 9) {
                continue;
            }
            System.out.print(j + ", ");
        }
    }


}
