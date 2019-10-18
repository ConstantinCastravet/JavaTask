package algorithms.handler;

public class Person {
    private Integer age;
    private String name;
    private Gender gender;


    public Person(String name, Integer age, Gender gender) throws Exception {
        setAge(age);
        setGender(gender);
        setName(name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws Exception {
        if (age < 0)
            throw new IllegalArgumentException("Wrong number of age");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nGender: " + getGender() +
                "\nAge:" + getAge();
    }
}
