import org.junit.Assert;
import org.junit.Test;


public class PersonTestM {

    @Test
    public void hello() {

        Person person=new Person("Tebza",21,"male",
                new String[]{"music","space","code"});



        String test=person.hello();

        Assert.assertEquals(test, "Hello,My name is Tebza and I am 21 years of age, I am a male person .My interests are  music, space and code.");

    }
}