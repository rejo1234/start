import java.util.Scanner;

public class ZadaniaTablice {
    public static void starter() {
        //System.out.println("siema");
        //zadaniedemo();
        //zadanieas();
        //zadanie3V2();
        //zadanie1();
        //zadanie2();
        //zadanie2V2();
        //zadanie3();
        //zadanie3V();
        //zadanie4();
        //zadanie4V2();
        //zadanie5();
        //zadanie5V2();
        //zadanie6();
        //zadanie6V2();
        //zadanie7();
        //zadanie8(); // giga ważne
        //zadanie7V2();
        //zadanie1V2();
        //zadanie1V3();
    }
    public static void zadanie1V3(){
        int[] liczby = new int[10];
        int i = 0;
        while (i < liczby.length){
            liczby[i] = liczby.length - i;
            i++;
        }
        printArray(liczby);
    }
    public static void zadanie1V2(){
        int[] liczby = new int[10];
        for (int i = 0; i < liczby.length; i++){
            liczby[i] = liczby.length - i;
        }
        printArray(liczby);
    }
    public static void zadanie7V2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        int[] liczby = new int[a];
        int b = a / 2;
        int i = 0;
        while (i < a){
            if (b < i){
                liczby[i] = 2;
            }
            else {
                liczby[i] = a + i;
            }
            i++;
        }
        printArray(liczby);

    }
    public static void printArray(String[] liczby){
        for (int i = 0; i < liczby.length; i++){
            if (i == liczby.length -1){
                System.out.print(liczby[i]);
            }
            else{
                System.out.print(liczby[i]  + ", ");
            }
        }
    }
    public static void printArray(int[] liczby){
        for (int i = 0; i < liczby.length; i++){
            if (i == liczby.length -1){
                System.out.print(liczby[i]);
            }
            else{
                System.out.print(liczby[i]  + ", ");
            }
        }
    }
    public static void zadanie8(){
        int[] liczby = new int[11];
        for (int i = liczby.length -1 ; i >= 0; i--){
            liczby[i] = 10 - i;
        }
//        for (int i = 0; i < liczby.length; i++){
//            liczby[i] = 10 - i;
//        }
       printArray(liczby);
    }
    public static void zadanie7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        int[] liczby = new int[a];
        int b = a / 2;
        for (int i = 0; i < a; i++) {
            liczby[i] = a + i;
            if (i > b) {
                liczby[i] = 2;
            }
        }
        printArray(liczby);
    }
    public static void zadanie6V2() {
        int[] liczby = new int[11];
        int a = 20;
        int i = 10;
        while (i >= 0) {
            liczby[i] = a;
            i--;
            a--;
        }
        printArray(liczby);
    }
    public static void zadanie6() {
        int[] liczby = new int[11];
        int a = 20;
        for (int i = 10; i >= 0; i--) {
            liczby[i] = a;
            a -=1;
        }
        printArray(liczby);
    }
    public static void zadanie5V2() {
        int[] liczby = new int[10];
        int i = 0;
        while (i < liczby.length) {
            if (i < 5) {
                liczby[i] = 2;
            } else {
                liczby[i] = 1;
            }
            i++;
        }
        printArray(liczby);
    }
    public static void zadanie5() {
        int[] liczby = new int[10];
        int polowa = liczby.length /2;
        for (int i = polowa; i < liczby.length; i++) {
            liczby[i] = 2;
        }
        printArray(liczby);
    }
    public static void zadanie4V2() {
        int[] liczby = new int[13];
        int i = 0;
        int polowa = liczby.length / 2;
        while (i < liczby.length) {
            if (i < polowa) {
                liczby[i] = 1;
            } else {
                liczby[i] = 2;
            }
            i++;

        }
        printArray(liczby);
    }
    public static void zadanie4() {
        int[] liczby = new int[10];
        for (int i = 1; i < liczby.length; i++) {
            if (i < 5) {
                liczby[i] = 1;
            } else {
                liczby[i] = 2;
            }
        }
        printArray(liczby);
    }
    public static void zadanie3V() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        int[] liczby = new int[10];
        int i = 0;
        while (i < 10) {
            liczby[i] = a - i * 2;
            i++;
        }
        printArray(liczby);
    }
    public static void zadanie3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        int[] liczby = new int[10];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = a;
            a -= 2;
        }
        printArray(liczby);
    }
    public static void zadanie2V2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        int[] liczby = new int[10];
        int i = 0;
        while (i < 10) {
            liczby[i] = a + i;
            i++;
        }
        printArray(liczby);
    }
    public static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        int[] liczby = new int[10];
        for (int i = 0; i < 10; i++) {
            liczby[i] = a + i;
        }
        printArray(liczby);
    }
    public static void zadanie1() {
        int[] liczby = new int[10];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = i;
            System.out.println(i);

        }
        // for (int i = 0; i < liczby.length; i++){
        //   System.out.println(liczby[i]);
    }
    public static void zadanie3V2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        if (a <= 9 || a >= 91) {
            System.out.println("Podaj liczbe od 10 do 90");
        }
        System.out.println("Podaj druga liczbe");
        int b = scanner.nextInt();
        if (b <= 9 || b >= 91) {
            System.out.println("Podaj liczbe od 10 do 90");
        }
        int start = Math.max(a, b);
        int end = Math.min(a, b);
        //int diff = Math.abs(start - end);
        while (start >= end) {
            System.out.println(start);
            start--;
            // diff--;
        }
    }
    public static void zadanieas() {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void zadaniedemo() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
    }
}
