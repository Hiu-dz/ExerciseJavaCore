package HRManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Human {
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String grade) {
        super(firstName, lastName);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", grade='" + grade + '\'' + '}';
    }

    public List<Student> ShowStudent() {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Võ", "Hiếu", "10B"));
        studentList.add(new Student("Nguyễn", "Ngân", "11A"));
        studentList.add(new Student("Trần", "Vân", "12B"));
        studentList.add(new Student("Lê", "Sơn", "11B"));
        studentList.add(new Student("Nguyễn", "Thái", "11C"));
        studentList.add(new Student("Huyền", "Linh", "12C"));
        studentList.add(new Student("Huyền", "Linh", "10A"));
        studentList.add(new Student("Nguyễn", "My", "12A"));
        studentList.add(new Student("Nguyễn", "Quỹ", "10C"));
        studentList.add(new Student("Võ", "Huy", "11A"));

        // Sắp xếp asc cho studentList
        Collections.sort(studentList, (s1, s2) -> s1.getGrade().compareTo(s2.getGrade()));

//        for (Student s : studentList) {
//            System.out.println(s.toString());
//        }
        return studentList;
    }
}
