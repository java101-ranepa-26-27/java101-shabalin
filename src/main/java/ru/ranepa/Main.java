package ru.ranepa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи имя:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        List<Integer> marks = new ArrayList<>();
        System.out.println("Вводи оценки (2-5). Для завершения введи 0:");

        while (true) {
            int mark = input.nextInt();
            if (mark == 0) {
                break;
            }
            if (mark >= 2 && mark <= 5) {
                marks.add(mark);
            } else {
                System.out.println("Оценка должна быть от 2 до 5. Для завершения введи 0:");
            }
        }

        Student student = new Student(name, marks);
        student.printReport();
    }
}