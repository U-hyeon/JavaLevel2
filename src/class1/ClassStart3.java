package class1;

import java.util.ArrayList;
import java.util.List;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student("학생1", 15, 90);
        Student student2 = new Student("학생2", 16, 80);

        student1.print();
        student2.print();

        System.out.println("\n배열");
        Student[] students = {student1, student2};
        students[0].print();
        students[1].print();
        System.out.println("\n배열. 루프");
        for(Student student : students){
            student.print();
        }

        System.out.println("\nList");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.get(0).print();
        studentList.get(1).print();
        /**
         * student1에는 인스턴의 주소가 저장되어있다.
         * studentList.get(0) 에는 student1에 저장된 값(주소)을 저장하였다.
         * 따라서 둘은 같은 인스턴스 주소를 바라본다
         * 한쪽에서 인스턴스 값을 수정하면, 이후 다른쪽에서 해당 인스턴스에 접근하였을 때 변경된것을 확인할 수 있다.
        */
        student1.setAge(20);
        studentList.get(0).print();

        System.out.println("\nList. forEach");
        studentList.forEach(student -> student.print());
    }
}
