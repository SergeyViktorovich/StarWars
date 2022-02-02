package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

    Teacher teacher = new Teacher();
    Student student = new Student();

    teacher.setName("Николай Борисович");
    teacher.setThing("Математика");
    student.setName("Кеша");

    teacher.gradeStudent(student);
    }
}
