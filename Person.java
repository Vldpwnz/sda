package Sunday.task1;
/*
* @vlad
* version 1;
* */

public class Person {
    /*
     * First name of person
     * Private be cause of Encapsulation rule
     * */
    private String firstName;
    /*
     *Last name of person
     * Private be cause of Encapsulation rule
     * */
    private String lastName;
    /*
     * Age of person
     * Private be cause of Encapsulation rule
     * */
    private int age;

    /**
     * Person parameters.
     *
     * @param firstName
     * @param lastName
     * @param age
     */

    public Person(String firstName,
                  String lastName,
                  int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


