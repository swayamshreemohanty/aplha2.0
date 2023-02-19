public class ShallowDeepCopy {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 90;
        s1.marks[1] = 70;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);

        s1.marks[1] = 20;
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }

}

class Student {
    String name;
    String roll;
    int[] marks;

    // shallow copy
    // Student(Student oldDetails) {
    // marks = new int[3];
    // this.name = oldDetails.name;
    // this.roll = oldDetails.roll;
    // marks = oldDetails.marks;
    // }

    // Deep copy
    Student(Student oldDetails) {
        marks = new int[3];
        this.name = oldDetails.name;
        this.roll = oldDetails.roll;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = oldDetails.marks[i];
        }
    }

    Student() {
        marks = new int[3];
    }
}
