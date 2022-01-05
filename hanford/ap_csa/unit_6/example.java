class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void Print() {
        System.out.println("My name is " + this.name + " and I am in the " + this.grade + "th grade.");
    }
}

class Startpoint {
    public static void main(String[] args) {

        // Padding to make things readable
        System.out.println("");

        for (int count = 0; count < 10; count++) {
            System.out.println(count);
        }

        // RunStudentExample();

        // Padding to make things readable
         System.out.println("");
    }

    private static void RunStudentExample() {
        Student[] students = {
            new Student("Angela", 12),
            new Student("Beto", 9),
            new Student("Hanji", 10)
        };

        for (int count = 0; count < students.length; count++) {
            Student currentStudent = students[count];
            currentStudent.Print();
        }
    }
}