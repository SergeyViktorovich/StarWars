package day6;

public class Teacher {
    private String thing;
    private String name;

    public String getThing() {
        return thing;
    }
    public void setThing(String thing) {
        this.thing = thing;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    int a = 2; // Начальное значение диапазона - "от"
    int b = 5; // Конечное значение диапазона - "до"

    String grade;

    public void gradeStudent(Student student){
        int random_number = a + (int) (Math.random() * b);

            if (random_number <= 2) {
                grade = "плохо";
            } else if (random_number == 3) {
                grade = "удовлетворительно";
            } else if (random_number >= 4) {
                grade = "хорошо";
            }

        System.out.println("Преподаватель " + this.name + " оценил студента " + student.getName() + " на оценку " +
               grade + " по предмету " + this.thing);
    }
}
