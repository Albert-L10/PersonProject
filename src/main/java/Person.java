import java.util.Scanner;

public class Person {

    public String name;
    public  int age;
    public String gender;
    public String interest[];


    public Person(String name,int age,String gender,String[] interest)
    {

        this.name=name;
        this.age=age;
        this.gender=gender;
        this.interest=interest;

    }

    public String hello()
    {
       return "Hello,My name is "+this.name+" and I am "+this.age+" and being a "+this.gender+".My interests are "+interest[0]+ " , "+interest[1]+" & "+interest[2];
    }



    public int getAge() {
        return age;
    }

}
