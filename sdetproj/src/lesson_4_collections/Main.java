package lesson_4_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        students.add(new Student("Сергей", "ПИбд", 2, List.of(4, 5, 3, 4)));
        students.add(new Student("Иван", "ИСЭбд", 3, List.of(2, 3, 2, 1)));
        students.add(new Student("Рамиль", "ИСТ", 1, List.of(5, 5, 5, 4)));
        students.add(new Student("Раиль", "ПМбд", 2, List.of(3, 3, 3, 3)));

        students = transferToNextCourse(students);
        System.out.println(students);

        printStudents(students, 3);
    }

    public static List<Student> transferToNextCourse(List<Student> list) {
        return list.stream()
                .filter(x -> x.getAverageGrade() >= 3)
                .peek(x -> x.course += 1)
                .collect(Collectors.toList());
    }

    public static void printStudents(List<Student> list, int course) {
        list.stream()
                .filter(x -> x.course == course)
                .map(x -> x.name)
                .forEach(System.out::println);
    }
}
