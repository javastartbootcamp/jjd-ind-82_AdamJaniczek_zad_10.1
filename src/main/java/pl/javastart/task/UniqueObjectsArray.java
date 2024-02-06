package pl.javastart.task;

import java.util.Scanner;

public class UniqueObjectsArray {
    static void printArray(Book[] booksArray) {
        System.out.println("\nObiekty zapisane w tablicy:");
        for (Book book : booksArray) {
            System.out.println(book.toString());
        }
    }

    static Book loadBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tytuł");
        String title = scanner.nextLine();
        System.out.println("Podaj ilość stron");
        int pages = Integer.parseInt(scanner.nextLine());
        return new Book(title, pages);
    }

    static boolean isDuplicate(int index, Book newBook, Book[] booksArray) {
        boolean isDuplicate = false;
        for (int i = 0; i < index; i++) {
            if (newBook.equals(booksArray[i])) {
                System.out.println("Duplikat");
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }
    
    public static void main(String[] args) {
        int arraySize = 3;

        Book[] booksArray = new Book[arraySize];

        System.out.println("Podaj informację o trzech unikalnych książkach");

        int index = 0;
        while (index < arraySize) {
            Book newBook = loadBook();
            boolean isDuplicate = isDuplicate(index, newBook, booksArray);
            if (!isDuplicate) {
                booksArray[index] = newBook;
                index++;
            }
        }
        printArray(booksArray);
    }
}
