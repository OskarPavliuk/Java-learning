package Linked_list_implementation;

public class Person_list {
    private Person firstperson;

    public Person_list(Person firstperson) {
        this.firstperson = firstperson;
    }


    public Person getLastperson() {
        Person currentPerson = firstperson;

        while (currentPerson.getNextPerson() != null) {
            currentPerson = currentPerson.getNextPerson();
        }
        return currentPerson;
    }

    public void addPerson(Person newPerson) {
        Person lastPerson = getLastperson();
        lastPerson.setNextPerson(newPerson);
    }

    public boolean search(String username) {
        int pos = 1;
        Person currentPerson = firstperson;
        while (currentPerson != null) {
            if (currentPerson.getUsername().equals(username)) {
                System.out.println(username + " gefunden " + pos);
                return true;
            } else {
                currentPerson = currentPerson.getNextPerson();
            }
            pos++;
        }
        return false;
    }


    public void print_list() {
        Person currentPerson = firstperson;
        while (currentPerson != null) {
            System.out.println(currentPerson.getUsername());
            currentPerson = currentPerson.getNextPerson();
        }
    }


    public void deletePerson(String username) {
        Person currentPerson = firstperson;
        while (currentPerson.getNextPerson() != null && !currentPerson.getUsername().equals(username)) {
            if (currentPerson.getNextPerson().getUsername().equals(username)) {
                if (currentPerson.getNextPerson().getNextPerson() != null) {
                    currentPerson.setNextPerson(currentPerson.getNextPerson().getNextPerson());
                } else {
                    currentPerson.setNextPerson(null);
                    break;
                }
            }
            currentPerson = currentPerson.getNextPerson();
        }
    }
}

