import javax.sound.midi.*;

public class Demo {

    public static void main(String[]args) {

        LessonClass[] array = new LessonClass [3];
        DateClass date = new DateClass(1382, 7, 22);

        array [0] = new LessonClass ("java",3,true,20.0,1);
        array [1] = new LessonClass ("math",3,true,20.0,2);
        array [2] = new LessonClass("art", 2, false, 3);


        System.out.println(array[0]);
        array[2].scoreRegistration(12.0);
        System.out.println(array[0]);


        StudentClass hadi = new StudentClass("hadi", 40113119820L, date , array );
        StudentClass saleh = new StudentClass();
        System.out.println(hadi.equals(saleh));
        System.out.println(hadi.equals(hadi));
        System.out.println(hadi.toString());
    }
}
