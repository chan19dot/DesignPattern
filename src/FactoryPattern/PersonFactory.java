package FactoryPattern;

public class PersonFactory {

    private int id =0;
    public Person createPerson(String name) {
            // todo
        return new Person(id++,name);
    }
}
