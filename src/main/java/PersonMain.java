import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args)
    {
        String fName;
        int fage=0;
        String fGender;

        Scanner keyName=new Scanner(System.in);

        System.out.println("Hello,Please enter your name: ");
        fName=keyName.next();

        Scanner keyGen=new Scanner(System.in);
        System.out.println("Please enter your gender preference: ");
        fGender=keyGen.next();

        Scanner keyAge=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        fage=keyGen.nextInt();


        Person person_info=new Person(fName,fage,fGender,
                new String[]{"listening to music","Watching movies","learning new things"});

        System.out.println(person_info.hello());
    }
}
