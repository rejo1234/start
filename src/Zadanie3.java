import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {
    public static void starter() {
        //zadaniegwiazdki();
        //zadanie1();
        //zadanie5();
        //zadanie2();
        //zadanie3();
        //zadanie2V2();
        //zadanie3V2();
        //zadanie4();
        //zadanie4V2();
        //zadanie55();
        //zadanie5V2();
        //zadanie6();
        //zadanie6V2();
        //zadanie7();
        //zadanie7V2();
        //zadanie8();
        //zadanie8V2();
        //zadanie9();
        //zadanie9V2();
        //zadanie10();
        //zadanie11VV();
    }

    public static void zadanie11VV(){
        String string = "maciek";
        //String string3 = "maciek";
        Scanner scanner = new Scanner(System.in);
        String string2 = scanner.next();
        if (string2.equals(string)){
            System.out.println("sa takie same");
        }
        else {
            System.out.println("nie sa takie same");
        }
    }
    public static void zadanie10() {
        System.out.println("podaj wiek");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();
        int counter = 0;
        if (wiek < 18) {
            System.out.println("jested dzieckiem");
        } else if (wiek >= 18 && wiek < 65) {
            System.out.println("jested dorosly");
        }
        else{
            System.out.println("jestes emerytem");
        }
    }
    public static void zadanie9V2() {
        int[] intArray = new int[]{3, 7, 8, 1, 11, 2};
        int Maxvalue = intArray[0];
        int Minvalue = intArray[0];
        int i = 0;
        while (i < intArray.length) {
            if (intArray[i] > Maxvalue) {
                Maxvalue = intArray[i];
            }
            if (intArray[i] < Minvalue) {
                Minvalue = intArray[i];
            }
            i++;
        }
        System.out.println(Maxvalue);
        System.out.println(Minvalue);
        System.out.println(Arrays.toString(intArray));
    }
    public static void zadanie9() {
        int counter = 0;
        int[] intArray = new int[]{22, -7, 8, -1, -11, 21};
        int maxValue = intArray[0];
        int minValue = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            counter = counter + 1;
            if (intArray[i] > maxValue) {
                maxValue = intArray[i];
            }
            if (intArray[i] < minValue) {
                minValue = intArray[i];
            }

        }
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println("counter = " + counter);
    }
    public static void zadanie8V2() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] liczby = new String[intArray.length];
        int i = 0;
        while (i < intArray.length) {
            liczby[i] = Integer.toString(intArray[i]);
            i++;
        }
        System.out.println(Arrays.toString(liczby));
    }
    public static void zadanie8() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] liczby = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            liczby[i] = Integer.toString(intArray[i]);
        }
        System.out.println(Arrays.toString(liczby));
    }
    public static void zadanie7V2() {
        System.out.println("podaj 10 aut");
        Scanner scanner = new Scanner(System.in);
        String[] cars = new String[10];
        int i = 0;
        while (i < cars.length) {
            cars[i] = scanner.next();
            i++;
        }
        System.out.println(Arrays.toString(cars));
    }
    public static void zadanie7() {
        System.out.println("Podaj 10 aut");
        Scanner scanner = new Scanner(System.in);
        String[] cars = new String[10];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = scanner.next();
        }
        //System.out.println(Arrays.toString(cars));
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
    public static void zadanie6V2() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] newArray = new String[cars.length];
        int i = cars.length - 1;
        while (i >= 0) {
            newArray[i] = cars[i];
            System.out.println(newArray[i]);
            i--;
        }
    }
    public static void zadanie6() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] newArray = new String[cars.length];
        for (int i = cars.length - 1; i >= 0; i--) {
            newArray[i] = cars[i];
            System.out.println(newArray[i]);
        }
    }
    public static void zadanie5V2() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] newArray = new String[cars.length];
        int i = 0;
        while (i < cars.length) {
            newArray[i] = cars[i];
            i++;
        }
        ZadaniaTablice.printArray(newArray);
    }
    public static void zadanie55() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] newArray = new String[cars.length];
        for (int i = 0; i < cars.length; i++) {
            newArray[i] = cars[i];
        }
        ZadaniaTablice.printArray(newArray);
    }
    public static void zadanie4V2() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int i = 0;
        while (i < length) {
            int space = 0;
            while (space < i) {
                System.out.print(".");
                space++;
            }
            int stars = 1;
            while (stars < length * 2 - i * 2) {
                System.out.print("*");
                stars++;
            }
            i++;
            System.out.println();
        }
    }
    public static void zadanie4() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int lentgh = scanner.nextInt();
        for (int i = 0; i < lentgh; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars < lentgh * 2 - 2 * i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie3V2() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int i = 0;
        while (i < length) {
            int space = 1;
            while (space < length - i) {
                System.out.print(" ");
                space++;
            }
            int j = 0;
            while (j < 2 * i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void zadanie2V2() {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int i = 0;
        while (i <= length) {
            System.out.println("*".repeat(i));
            i++;
        }
    }
    public static void zadanie3() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            for (int space = 1; space < length - i; space++) {
                System.out.print(".");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie2() {
        String string = "*";
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println(string + string.repeat(i));
        }
    }
    public static void zadanie5() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] newArray = new String[cars.length];
        for (int i = 0; i < cars.length; i++) {
            newArray[i] = cars[i];
        }
        ZadaniaTablice.printArray(newArray);
    }
    public static void zadaniegwiazdki() {
        System.out.println("podaj licze");
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        for (int i = 0; i < lenght; i++) {

        }
    }
    public static void zadanie1() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
