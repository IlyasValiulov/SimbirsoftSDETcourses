package lesson_4_collections;

import java.util.List;

public class Student {
    public String name;
    public String group;
    public int course;
    public List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public Double getAverageGrade() {
        return grades.stream().mapToDouble(x -> x).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}
