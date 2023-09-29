import java.util.Scanner;

public class Main {
    public static final int ArraySize = 50;

    public static void main(String[] args) {
        System.out.println("Przeszukiwanie z wartownikiem");
        System.out.print("Podaj szukaną liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int szukanaliczba = scanner.nextInt();

        int[] arr = createArray();
        printArray(arr);

        if (findNumber(arr, szukanaliczba) != null) {
            System.out.println("Liczba " + szukanaliczba + " znajduje się w tablicy pod indeksem " + findNumber(arr, szukanaliczba)+".");
        }else{
            System.out.println("Szukanej liczby nie ma w tablicy.");
        }
    }

    public static int[] createArray() {
        int[] arr = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) System.out.println("");
            System.out.print(array[i] + ", ");
        }
    }

    public static Integer findNumber(int[] arr, int searchedNum) {
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = searchedNum;

        Integer searchedIndex = null;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == searchedNum) {
                if (i < arr2.length - 1) {
                    searchedIndex = i;
                }
            }
        }
        return searchedIndex;
    }
}










