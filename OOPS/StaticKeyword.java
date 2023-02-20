/**
 * Student
 */
class Student {
    String name;
    String roll;
    static String school;

    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Swayam";
        s1.school = "SSVM";

        System.out.println(s1.returnPercentage(10, 20, 15));

        Student s2 = new Student();

        System.out.println(s2.returnPercentage(35, 28, 28));

    }
}
