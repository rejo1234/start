import java.util.Arrays;
import java.util.Scanner;

public class Podsumowanie {
    public static void starter(){
        //zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        //zadanie6();
        //zadanie7();
        //zadanie1V();
        //zadanie3V();
        //zadanie4V();
        //zadanie5V();
        //zadanie1C();
        //zadanie2C();
        //zadanie3C();
        //zadanie4C();
        //zadanie5C();
        //zadanie6C();
        //zadanie7C();
        //zadanje8C();
        //zadanie9C();
        //zadanie1D();
        //zadanie2D();
        //zadanie3D();
        //zadanie4D();
        //zadanie5D();
        //zadanie6D();
        //zadanie1E();
        //zadanie2E();
        //zadanie3E();
        //zadanie4E();
        //zadanie5E();
        //zadanie6E();
        //zadanie7E();
        //zadanie8E();
        //zadanie9E();
        //zadanie1F();
        //zadanie1FF();
        //zadanie2F();
        //zadanie3F();
        //zadanie4F();
        //zadanie5F();
        //zadanie4While();
        //zadanie3While();
        //zadanie6While();
        //zadanie5While();
        //zadanie9While();
        //zadanie1While();
        //zadanie44While();
        //zadanie11While();
        //zadanie8While();
    }
    public static void zadanie8While(){
        String[] stringArray = {"1", "2", "3", "4"};
        int[] newArray = new int[stringArray.length];
        int i = 0;
        while (i < stringArray.length){
            newArray[i] = Integer.parseInt(stringArray[i]);
            i++;
        }
        while (i <= stringArray.length){
            System.out.println(Arrays.toString(newArray));
            i++;
        }
    }
    public static void zadanie11While(){
        System.out.println("podaj wysokość choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int i = wysokosc-1;
        while (i >= 0 ){
            int space = 0;
            while (space < wysokosc -i -1){
                System.out.print(" ");
                space++;
            }
            int stars = 0;
            while (stars < 2 * i + 1){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i--;
        }
    }
    public static void zadanie44While(){
        System.out.println("podaj wysokosc pola");
        System.out.println("podaj szerokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int szerokosc = scanner.nextInt();
        int i = 0;
        while (i < wysokosc){
            int j = 0;
            while (j < szerokosc){
              if (i == 0 || i == wysokosc -1 || j == 0 || j == szerokosc -1){
                  System.out.print("#");
              }else {
                  System.out.print(" ");
              }
              j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void zadanie1While(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int first = 1;
        int second = 1;
        int third = 1;
        int i = 1;
        while (i < liczba){
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
            i++;
        }
        System.out.println(first);
    }
    public static void zadanie9While(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int i = 1;
        int silnia = 1;
        while (i <= liczba){
             silnia = silnia * i;
            i++;
            System.out.println(silnia);
        }
    }
    public static void zadanie5While(){
        System.out.println("podaj ile razy potegowac 2");
        Scanner scanner = new Scanner(System.in);
        int ilosc = scanner.nextInt();
        int i = 0;
        while (i < ilosc){
            i++;
        }System.out.println(Math.pow(2 , i));
    }
    public static void zadanie6While(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int i = cars.length;
        String[] newArray = new String[cars.length];
        while (i > 0){
           newArray[i -1] = cars[cars.length-i];
           i--;
        }for (int j = 0; j < newArray.length; j++){
            System.out.println(newArray[j]);
        }
    }
    public static void zadanie3While(){
        int i = 10;
        while (i <= 30){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void zadanie4While(){
        int[] intArray = new int[10];
        int i = 0;
        while (i < intArray.length){
            if (i < 5){
                System.out.println("1");
            }else {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void zadanie5F(){
        System.out.println("podaj wysokosc trojkata rownoramienego");
        System.out.println("podaj szerokosc trojkata");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int szerokosc = scanner.nextInt();
        for (int i = 0; i <= wysokosc; i++){
            for (int j = 0; j <= szerokosc * 2; j++){
                if (j== wysokosc -i || j == wysokosc + i || i == wysokosc ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie4F(){
        System.out.println("podaj wysokosc pola");
        System.out.println("podaj szerokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc;i++){
            for (int j = 0; j < szerokosc; j++){
                if (i == 0 || j == 0 || i == wysokosc -1 || j == szerokosc -1 || i == j || i + j == szerokosc -1 ){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie3F(){
        System.out.println("do jakiej liczby szukac liczb pierwszych");
        Scanner scanner = new Scanner(System.in);
        int zakres = scanner.nextInt();
        int[] liczby = new int[zakres + 1];
        for (int i = 0; i <= zakres; i++){
            liczby[i] = i;

        }
        for (int i = 2; i * i <= zakres; i++){
        if (liczby[i] != 0){
            for (int j = i * 2; j <= zakres; j+=i){
                liczby[j] = 0;
            }
        }
        }
        for (int i = 2; i <= zakres; i++){
            if (liczby[i] != 0){
                System.out.println(i);
            }
        }
    }
    public static void zadanie2F(){
        for (int i = 0; i <= 100; i++){
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
    public static void zadanie1FF(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int first = 1;
        int second = 1;
        int third = 1;
        int liczba = scanner.nextInt();
        for (int i = 1; i < liczba; i++){
            int next = first + second + third;
            first = second;
            second = third;
            third = next;
        }
        System.out.println(first);
    }
    public static void zadanie1F(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int first = 1;
        int second = 1;
        int liczba = scanner.nextInt();
        for (int i = 1; i < liczba; i++){
           int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(first);
    }
    public static void zadanie9E(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int silnia = 1;
        int liczba = scanner.nextInt();
        for (int i = 1; i <= liczba; i++){
            silnia = silnia * i;
        }
        System.out.println(silnia);
    }
    public static void zadanie8E(){
        String[] stringArray = {"1", "2", "3", "4"};
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println(Arrays.toString(intArray));
    }
    public static void zadanie7E(){
        System.out.println("podaj wysokosc pola");
        System.out.println("podaj szerokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++){
            for (int j = 0; j < szerokosc; j++){
                if (i == 0 || i == wysokosc - 1 || j == 0 || j == szerokosc - 1 || i == j || i + j == szerokosc - 1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie6E(){
        System.out.println("podaj wysokosc pola");
        System.out.println("podaj szerokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc;i++){
            for (int j = 0; j < szerokosc;j++){
                if (i == 0 || i == wysokosc -1 || j == 0 || j == szerokosc -1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie5E(){
        System.out.println("podaj wysokosc pola");
        System.out.println("podaj szerokosc pola");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        int szerokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc;i++){
            for (int j = 0; j < szerokosc;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void zadanie4E(){
        System.out.println("podaj rodziaj drogi zabudowany/niezabudowany/autostrada");
        System.out.println("podaj predkosc z jaka jechales");
        Scanner scanner = new Scanner(System.in);
        String droga = scanner.nextLine();
        int predkosc = scanner.nextInt();
        switch (droga){
            case "zabudowany":
                if (predkosc <= 50) {
                    System.out.println("jechales przepisowo");
                } else if (predkosc <= 70) {
                    System.out.println("przeproczyles predkosc mandat 100");
                } else if (predkosc <= 90) {
                    System.out.println("przekroczyles predkosc mandat 200");
                } else if (predkosc <= 110) {
                    System.out.println(" przekroczyles predkosc mandat 300");
                } else {
                    System.out.println("Tracisz prawo jazdy i mandat 300");
                }
                break;
            case "niezabudowany":
                if (predkosc <= 70) {
                    System.out.println("jechales przepisowo");
                } else if (predkosc <= 90) {
                    System.out.println("przekroczyles predkosc mandat 100");
                } else if (predkosc <= 110) {
                    System.out.println("przekroczyles predkosc mandat 200");
                } else if (predkosc <= 130) {
                    System.out.println("przekroczyles predkosc mandat 300");
                } else {
                    System.out.println("przekroczyles predkosc, zabrane prawo jazdy mandat 300");
                }
                break;
            case "autostrada":
                if (predkosc <= 140) {
                    System.out.println("jechales przepisowo");
                } else if (predkosc <= 160) {
                    System.out.println("przekroczyles predkosc mandat 100");
                } else if (predkosc <= 180) {
                    System.out.println("przekroczyles predkosc mandat 200");
                } else if (predkosc <= 200) {
                    System.out.println("przekroczyles predkosc mandat 300");
                } else {
                    System.out.println("przekroczyles predkosc, zabrane prawo jazdy mandat 300");
                }
        }
    }
    public static void zadanie3E(){
        String[] cars = new String[100];
        System.out.println("podaj auta");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cars.length;i++){
            String podane = scanner.nextLine();
            if ("exit".equals(podane)){
                break;
            }
            cars[i] = podane;
        }
        for (int i = 0; i < cars.length;i++){
            String podane = cars[i];
            if (podane != null){
                System.out.println(podane);
            }else   {
                break;
            }
        }
    }
    public static void zadanie2E(){
        System.out.println("podaj wysokosc choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc; i++){
            for (int space = 0; space < wysokosc -i; space++){
                System.out.print(" ");
            }
            for (int stars = 0; stars <  i * 2 + 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie1E(){
        System.out.println("podaj wysokosc choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        for (int i = wysokosc -1; i >= 0; i--){
            for (int space = 0; space < wysokosc -i; space++){
                System.out.print(".");
            }
            for (int stars = 0; stars < 2 * i + 1 ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie6D(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        while (liczba < 10){
            System.out.println("podaj liczbe wieksza niz 9");
            liczba = scanner.nextInt();
        }
        for (int i = 0; i < liczba;i++){
            System.out.println(liczba + Math.pow(2,i));
        }
    }
    public static void zadanie5D(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        for (int i = 0; i < liczba; i++){
            System.out.println(Math.pow(2,i));
        }
    }
    public static void zadanie4D(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
       while (liczba < 10){
            System.out.println(" podaj liczbe wieksza niz 9");
            liczba = scanner.nextInt();
        }
        for (; liczba <= 90; liczba++){
            if (liczba % 3 == 0){
                System.out.println(liczba);
            }
        }
    }
    public static void zadanie3D(){
        System.out.println(" podaj dwie liczby");
        Scanner scanner = new Scanner(System.in);
        int wieksza = scanner.nextInt();
        int mniejsza = scanner.nextInt();
        int start;
        int koniec;
        if (wieksza > mniejsza){
            start = wieksza;
            koniec = mniejsza;
        }else {
            start = mniejsza;
            koniec = wieksza;
        }
        for (int i = start; i > koniec; i--){
            System.out.println(i);
        }
    }
    public static void zadanie2D(){
        System.out.println("podaj liczbe od 10 do 90");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int i = 0;
        while ( liczba + i <= 90){
            if ((liczba + i) % 3 == 0 && (liczba + i) % 2 == 0){
                System.out.println(liczba + i);
            }
            i++;
        }
    }
    public static void zadanie1D(){
        System.out.println("podaj boki trojkatow");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b < c || a + c < b || b + c < a){
            System.out.println("trojkat nieprawidlowy");
        }else {
            System.out.println("trojkat prawidlowy");
        }
    }
    public static void zadanie9C(){
        int[] intArray = new int[]{ 3,7,8,1,11,2 };
        int maxValue = 0;
        int minValue = 5;
        for (int i = 0; i < intArray.length; i++){
            if ( intArray[i] > maxValue){
                maxValue = intArray[i];
            }
            if (intArray[i] < minValue){
                minValue = intArray[i];
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);
    }
    public static void zadanje8C(){
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10};
        String[] newArray = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++){
            newArray[i] = Integer.toString(intArray[i]);
        }
        System.out.println(Arrays.toString(newArray));
    }
    public static void zadanie7C(){
        String[] cars = new String[10];
        System.out.println("podaj auta");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cars.length;i++){
            cars[i] = scanner.nextLine();
        }
        for (int i = 0; i < cars.length; i++) {
            String car = cars[i];
            System.out.println(car);
        }
    }
    public static void zadanie6C(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] newArray = new String[cars.length];
        for (int i = cars.length -1; i >= 0; i--){
            newArray[i] = cars[i];
            System.out.println(newArray[i]);
        }
    }
    public static void zadanie5C(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] newArray = new String[cars.length];
        for (int i = 0; i < cars.length; i++){
        newArray[i] = cars[i];
            System.out.println(newArray[i]);
        }
    }
    public static void zadanie4C(){
        System.out.println("podaj wysokosc choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        for (int i = wysokosc; i > 0;i--){
            for (int space = 0; space < wysokosc -i;space++){
                System.out.print(" ");
            }
            for (int stars = 0; stars < i * 2 -1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie3C(){
        System.out.println("podaj wysokosc choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        for (int i = 0; i < wysokosc;i++){
            for (int space = 0; space < wysokosc -i -1; space++){
                System.out.print(" ");
                }
            for (int stars = 0; stars < i * 2 + 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zadanie2C(){
        System.out.println("podaj wysokosc");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        String string = "*";
        for (int i = 0; i <=wysokosc;i++){
            System.out.println(string.repeat(i));
        }
    }
    public static void zadanie1C(){
        System.out.println("podaj wysokosc choinki");
        Scanner scanner = new Scanner(System.in);
        int wysokosc = scanner.nextInt();
        for (int i = 0; i <= wysokosc; i++){
            for (int j = 0; j < i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void zadanie5V(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        for (int i = liczba; liczba > 0; liczba -= 5){
            if (liczba % 15 == 0){
                System.out.println(" :) ");
            }else {
                System.out.println(liczba);
            }
        }
    }
    public static void zadanie4V(){
        for (int i = 0; i < 30; i++){
            if (i % 10 == 4 || i % 10 == 8){
                System.out.println(Math.pow(i , 2));
            }
        }
    }
    public static void zadanie3V(){
        for (int i = 10; i <= 30; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void zadanie1V(){
        System.out.println("podaj liczbe trzycyfrowa");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int suma = 0;
        while (liczba > 0){
            suma += liczba % 10;
            liczba /= 10;
        }
        System.out.println(suma);

    }
    public static void zadanie7(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int [] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = i;
        }
        for (int i = 0; i < intArray.length;i++){
            intArray[9] = liczba;
            System.out.println(intArray[i]);
        }
    }
    public static void zadanie6(){
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++){
            intArray[9 - i] = 20 - i;
        }for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void zadanie5(){
        int [] intArray = new int[10];
        for (int i = 0; i < intArray.length;i++){
            intArray[i] = i;
        }
        for (int i = 0; i < intArray.length;i++){
            if (intArray[i] < 5){
                System.out.println(intArray[i]);
            }if (intArray[i] > 5){
                System.out.println("1");
            }
        }
    }
    public static void zadanie4(){
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = i;
        }
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] < 5){
                System.out.println("1");
            }if (intArray[i] > 5){
                System.out.println(intArray[i]);
            }
        }
    }
    public static void zadanie3(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int licza = scanner.nextInt();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length;i++){
            intArray[i] = i * 2;
        }
        for (int i = 0; i < intArray.length; i++){
            System.out.println(licza - intArray[i]);
        }
    }

    public static void zadanie1() {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < intArray.length;i++){
            intArray[i] = 10 -i;
        }for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void zadanie2(){
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length;i++){
            intArray[i] = i;
        }for (int i = 0; i < intArray.length;i++){
            System.out.println(liczba + intArray[i]);
        }
    }
}

