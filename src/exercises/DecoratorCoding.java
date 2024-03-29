package exercises;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

public class DecoratorCoding {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setAge(6);
        StringBuilder sb = new StringBuilder();
        sb.append(dragon.crawl());
        sb.append(System.lineSeparator());
        sb.append(dragon.fly());
        System.out.println(sb);
    }
}
class Bird
{
    public int age;

    public String fly()
    {
        return age < 10 ? "flying" : "too old";
    }
}

class Lizard
{
    public int age;

    public String crawl()
    {
        return (age > 1) ? "crawling" : "too young";
    }
}

class Dragon
{
    private int age;
    private Lizard lizard = new Lizard();
    private Bird bird = new Bird();
    public void setAge(int age)
    {
        // todo
        this.age = age;
        bird.age = age;
        lizard.age = age;
    }
    public String fly()
    {
        // todo

        return bird.fly();
    }
    public String crawl()
    {
        // todo

        return lizard.crawl();
    }
}