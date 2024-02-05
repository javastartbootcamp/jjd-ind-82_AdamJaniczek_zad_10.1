package pl.javastart.task;

import java.util.Scanner;

public class UniqueObjectsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = 3;

        Book[] booksArray = new Book[arraySize];

        System.out.println("Podaj informację o trzech unikalnych książkach");

        int index = 0;
        while (index < arraySize) {
            System.out.println("Podaj tytuł");
            String title = scanner.nextLine();

            System.out.println("Podaj ilość stron");
            int pages = Integer.parseInt(scanner.nextLine());

            Book newBook = new Book(title, pages);

            boolean isDuplicate = false;
            for (int i = 0; i < index; i++) {
                if (newBook.equals(booksArray[i])) {
                    System.out.println("Duplikat");
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                booksArray[index] = newBook;
                index++;
            }
        }

        System.out.println("\nObiekty zapisane w tablicy:");
        for (Book book : booksArray) {
            System.out.println(book.toString());
        }
    }
}
