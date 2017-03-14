package pl.akademiakodu;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Osoba {

     private String name;
     private String surname;
     private int age;
     // 0 - nie wiadomo, 1 - kobieta, 2 - mężczyzna
     private int gender;

    public Osoba(String name, String surname, int age, int gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
