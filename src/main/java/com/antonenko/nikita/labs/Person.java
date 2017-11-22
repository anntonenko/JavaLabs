package com.antonenko.nikita.labs;

public class Person {
    // Classes -------
    public enum Sex{
        MALE, FEMALE
    }
    // ---------------

    // Properties -------
    private String name;
    private int age;
    public Sex sex;
    // ------------------

    // Get ----------------------------------
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Sex getSex() { return sex; }
    // --------------------------------------

    // Initializers -------------------------
    Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    // --------------------------------------

    // Functions ----------------------------
    void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
    }
    // --------------------------------------

    // Equals -------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person author = (Person) o;

        if (age != author.age) return false;
        if (!name.equals(author.name)) return false;
        return sex == author.sex;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + sex.hashCode();
        return result;
    }
    // --------------------------------------

}
