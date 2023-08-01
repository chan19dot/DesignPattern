package Proxy;
class Person implements responsiblePerson
{
    private int age;

    public Person(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String drink() { return "drinking"; }
    @Override
    public String drive() { return "driving"; }
    @Override
    public String drinkAndDrive() { return "driving while drunk"; }
}

interface responsiblePerson{
    String drink();
    String drive();
    String drinkAndDrive();
}


class ResponsiblePerson extends Person
{
    private int age;
    private Person person;

    public ResponsiblePerson(Person p)
    {
        super(p.getAge());
        this.age = p.getAge();
    }
    @Override
    public String drink(){

        if(age>18){
            return super.drink();
        }
        return "too young";
    }

    @Override
    public String drive(){
        if(age>16){
            return super.drive();
        }
        return "too young";
    }

    @Override
    public String drinkAndDrive() {
        return "dead";
    }
}
public class Exercise{
    public static void main(String[] args) {

    }
}