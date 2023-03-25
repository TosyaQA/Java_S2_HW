package Seminar_2;

import java.io.*;
// 2. Дана строка (получение через обычный текстовый файл!!!)
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

public class Task2 {
    
    public String readFile(String fileName) throws IOException {
    
        File file = new File(fileName);
        FileReader reader = new FileReader(file);

        char[] arrChar = new char[(int) file.length()];
        reader.read(arrChar);
        reader.close();

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < arrChar.length; i++) {
            text.append(arrChar[i]);
        }
        
        return text.toString();
    }

    public void printJournalData (String str){
        String lines[] = str.split(System.lineSeparator());
        
        for (String line :lines) {
            String splittedLine[] = line.split(",");
            String lastName = splittedLine[0].split(":")[1];
            String grade = splittedLine[1].split(":")[1];
            String lesson = splittedLine[2].split(":")[1];
            System.out.println("Студент " + lastName + " получил " + grade + " по предмету " + lesson + ".");
        }
    }

}
