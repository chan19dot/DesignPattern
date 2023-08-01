package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        PersonFactory p = new PersonFactory();
        Person one =p.createPerson("abc");
        Person two = p.createPerson("def");
        System.out.println(one.toString());
        System.out.println(two.toString());

    }
}
