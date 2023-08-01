package BuilderPattern;
/*
* Builder Coding Exercise
You are asked to implement the Builder design pattern for rendering simple chunks of code.

Sample use of the builder you are asked to create:

CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
System.out.println(cb);
The expected output of the above code is:

public class Person
{
  public String name;
  public int age;
}
Please observe the same placement of curly braces and use two-space indentation.
*
*
*
* */

import java.util.ArrayList;
import java.util.List;

public class ClassBuilder {

    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Example");
        cb.addField("number","int");
        cb.addField("text", "String");
        System.out.println(cb.toString());
    }
}
class CodeBuilder
{
    private String className;
    private List<Field> fields = new ArrayList<>();
    public CodeBuilder(String className)
    {
        // todo
        this.className = className;
    }

    public CodeBuilder addField(String name, String type)
    {
        // todo
        fields.add(new Field(name,type));
        return this;


    }

    @Override
    public String toString()
    {
        // todo
        StringBuilder sb = new StringBuilder();
        sb.append("public class ").append(className).append("\n");
        sb.append("{\n");
        fields.forEach( field->{
            sb.append("\tpublic ").append(field.type).append(" ").append(field.name).append(";\n");
        });
        sb.append("}");
        return  sb.toString();

    }
    private static class Field{
       private String name;
       private String type;

       public Field(String name, String type){
           this.name = name;
           this.type = type;
       }
    }
}