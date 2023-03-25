package Seminar_2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // 1 задача
        Task1 h1 = new Task1();
        h1.sortArray();

        // 2 задача
        Task2 file = new Task2();
        String str = file.readFile("journal.txt");
        file.printJournalData(str);


        // 3 задача
        Task3 palindrom = new Task3();
        boolean answer = palindrom.isPalindrom("профессор");
        System.out.println(answer + "\n");
    }
}
