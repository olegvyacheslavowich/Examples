package kz.karpenko.OOP.students;

/**
 * Created by Олег on 26.01.2017.
 */
public class Student {

    private static int id = 0;
    private int myId;
    String surname;
    String name;
    String thirdName;
    String birthDay;
    String address;
    String tel;
    String fakultet;
    int kurs;
    String group;

    public Student(String surname,
                   String name,
                   String thirdName,
                   String birthDay,
                   String address,
                   String tel,
                   String fakultet,
                   int kurs,
                   String group) {
        this.myId = id++;
        this.surname = surname;
        this.name = name;
        this.thirdName = thirdName;
        this.birthDay = birthDay;
        this.address = address;
        this.tel = tel;
        this.fakultet = fakultet;
        this.kurs = kurs;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + myId +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", fakultet='" + fakultet + '\'' +
                ", kurs=" + kurs +
                ", group='" + group + '\'' +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public String getFakultet() {
        return fakultet;
    }

    public int getKurs() {
        return kurs;
    }

    public String getGroup() {
        return group;
    }
}
