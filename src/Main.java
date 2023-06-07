import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Quanti libri vuoi inserire?");

        int nLibri = Integer.parseInt(s1.nextLine());

        Book[] arrLibri = new Book[nLibri];

        for (int i = 0; i < nLibri; i++) {

            System.out.println("Inserisci il titolo");

            String titolo = s1.nextLine();

            System.out.println("Inserisci in numeri di pagine");

            int nPagine = Integer.parseInt(s1.nextLine());

            System.out.println("Inserisci l`autore");

            String autore = s1.nextLine();

            System.out.println("Inserisci l`editore");

            String editore = s1.nextLine();

            Book newLibro = new Book(titolo,nPagine,autore,editore);

            arrLibri[i] = newLibro;

        }

        System.out.println(Arrays.toString(arrLibri));
    }
}
