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
        String msg=" ";
        String pan=" ";
        for(int i=0;i<interest.length;i++)
        {
            if (i>0 && i<interest.length-1)
            {
                pan +=", ";
            }
            if(i==interest.length-1)
            {
                pan+=" and ";
            }
            pan+=interest[i];
        }

       msg="Hello,My name is "+this.name+" and I am "+this.age+" years of age, I am a "+this.gender+" person"+" .My interests are ";
        return msg+pan+".";
    }



    public int getAge() {
        return age;
    }

}
