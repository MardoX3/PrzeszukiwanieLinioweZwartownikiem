import java.util.Scanner;

        public class Main {

                public static void main(String[] args) {
                    int i, x;
                    int n = 1;
                    i = 0;
                    wypelnianieTablicy();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Podaj element do wyszukania");
                    x = scanner.nextInt();
                    przeszukiwanie(wypelnianieTablicy(), x);





                }
                public static int[] wypelnianieTablicy(){
                    int sizeTab = 50;
                    int[] numberTab = new int[sizeTab];
                    for (int i=0; i<sizeTab; i++) {
                        if (i % 10 == 0) System.out.println();
                        numberTab[i] = (int) (Math.random() * 100);
                        System.out.print(numberTab[i]+ ", ");;
                    }
                    return numberTab;
                }
                
            public static void przeszukiwanie(int numberTab[], int x) {
                int[] numberSentry = new int[numberTab.length];
                for( int i = 0; i < numberTab.length; i++){
                    numberSentry[i] = numberTab[i];
                }
                numberSentry[numberTab.length-1]= x;
                int i = 0;
                while (numberSentry[i] != x) {
                    i++;
                }
                if (i == x)
                    System.out.println("Nieznaleziono " + x);
                else
                    System.out.println("Znaleziono "+x );
            }
            }










