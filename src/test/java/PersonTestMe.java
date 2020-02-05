import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class PersonTestMe {

    @Test
    public void hello() {

        Person person = new Person("Allie", 32, "male",
                new String[]{"sex",
                "beer", "phoyisa"});

        String test = person.hello();

        Assert.assertEquals(test, "Hello,My name is Allie and I am 32 and being a male.My interests are sex , beer & phoyisa");

    }
}