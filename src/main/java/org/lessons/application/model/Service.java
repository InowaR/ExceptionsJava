package org.lessons.application.model;

import org.lessons.application.model.exceptions.InvalidDataLengthException;
import org.lessons.application.model.exceptions.NotEnoughDataException;

public class Service {
    private CheckData data;

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
