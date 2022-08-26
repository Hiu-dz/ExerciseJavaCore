package HRManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        Worker worker = new Worker();

        List<Student> studentList = student.ShowStudent();
        System.out.println("---- Student List ----");
        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        List<Worker> workerList = worker.ShowWorker();
        System.out.println("---- Worker List ----");
        for (Worker w : workerList) {
            System.out.println(w.toString());
        }

        List<Human> humanList = new ArrayList<Human>();
        humanList.addAll(studentList);
        humanList.addAll(workerList);

        Collections.sort(humanList, (h1, h2) -> (h1.getFirstName() + h1.getLastName()).compareTo((h2.getFirstName() + h2.getLastName())));
        System.out.println("---- Human List ----");
        for (Human m : humanList) {
            System.out.println(m.toString());
        }
    }
}
