package kz.karpenko.OOP.students;

/**
 * Created by Олег on 26.01.2017.
 */
public class WorkWithStudent {

    //students
    private Student[] students;

    public WorkWithStudent(Student[] students) {
        this.students = students;
    }

    public void getByDepartment(String department) {

        System.out.println("Students in " + department + " department: ");
        for (int i = 0; i < students.length; i++) {
            if (department == students[i].getFakultet()) {
                System.out.println(students[i].toString());
            }
        }
    }

    public void getByDepAndCourse(String department, int course) {

        System.out.println("Students in " + department + " department (" + course + " course)");
        for (int i = 0; i < students.length; i++) {
            if (department == students[i].getFakultet() && course == students[i].getKurs()) {
                System.out.println(students[i].toString());
            }
        }
    }

    public void getByGroup(String group) {

        System.out.println("Students in " + group + " department: ");
        for (int i = 0; i < students.length; i++) {
            if (group == students[i].getGroup()) {
                System.out.println(students[i].toString());
            }
        }
    }
}