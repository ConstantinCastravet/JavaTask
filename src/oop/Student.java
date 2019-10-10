package oop;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) throws Exception {
        setAge(age);
        setName(name);
    }


    public void setDate(String name, int age) throws Exception {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0)
            throw new IllegalAccessException("Wrong age");
        this.age = age;
    }
}
