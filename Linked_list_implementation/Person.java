package Linked_list_implementation;

public class Person {
    private String username;

    private Person nextPerson;

    public Person(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public Person getNextPerson() {
        return nextPerson;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNextPerson(Person nextPerson) {
        this.nextPerson = nextPerson;
    }
}
