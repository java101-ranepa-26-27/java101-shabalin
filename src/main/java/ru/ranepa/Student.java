package ru.ranepa;
import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public Student() {
        this.name = "Неизвестно";
        this.marks = new ArrayList<>();
    }

    public double averageMarks() {
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }
    public String status() {
        double avg = averageMarks();
        if (avg >= 4.5) {
            return "Отличник";
        } else if (avg >= 3.5) {
            return "Хорошист";
        } else if (avg >= 2.5) {
            return "Троечник";
        } else {
            return "Двоечник";
        }
    }

    public void printReport() {
        System.out.println("Имя: " + name);
        System.out.println("Оценки: " + marks);
        System.out.println("Средний балл:" + averageMarks());
        System.out.println("Статус: " + status());
    }
}