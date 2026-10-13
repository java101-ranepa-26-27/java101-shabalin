package ru.ranepa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи имя:");
        String name = scanner.next();

        List<Integer> marks = new ArrayList<>();
        System.out.println("Вводи оценки (2-5). Для завершения введи 0:");

       /* while (true) {
            int mark = scanner.nextInt();
            if (mark == 0) {
                break;
            }
            if (mark >= 2 && mark <= 5) {
                marks.add(mark);
            } else {
                System.out.println("Оценка должна быть от 2 до 5. Попробуй снова:");
            }
        }*/
        for(int i = 0; i <= 9; i++)
        {
            int mark = scanner.nextInt();
            marks.add(mark);
        }

        Student student = new Student(name, marks);
        student.printReport();
    }
}