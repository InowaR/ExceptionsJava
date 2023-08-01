package org.lessons.application.model;

public class Service {
    private final CheckData data;

    public Service() {
        data = new CheckData();
    }

    public void printPerson(){
        data.printPerson();
    }

    public void createPerson(String[] dataInput) {
        data.setDataMap(dataInput);
        printPerson();
    }

    public void savePerson() {
        data.savePerson();
    }
}
