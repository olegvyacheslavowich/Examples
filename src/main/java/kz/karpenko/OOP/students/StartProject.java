package kz.karpenko.OOP.students;

/**
 * Created by Олег on 26.01.2017.
 */
public class StartProject {
    public static void main(String[] args) {
        Student student[] = {
                new Student("Karpenko", "Oleg", "Vacheslavovich", "15.01.96", "Karagandy", "7475224224", "FIT", 4, "VT-13-3"),
                new Student("Burganova", "Natali", "Sergeevna", "29.07.95", "Karagandy", "7089477580", "FIT", 4, "VT-13-3"),
                new Student("Shafeev", "Daniil", "don't know", "don't know", "Karagandy", "7087777777", "FET", 4, "VT-13-3")
        };

        WorkWithStudent wws = new WorkWithStudent(student);
        wws.getByDepartment("FIT");
        wws.getByDepAndCourse("FET",4);
        wws.getByGroup("VT-13-3");

    }



}
