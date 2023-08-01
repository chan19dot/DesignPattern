package FactoryPattern;

public class Person {
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name);
        sb.append("\nid:\t").append(id);
        return sb.toString();
    }
}
