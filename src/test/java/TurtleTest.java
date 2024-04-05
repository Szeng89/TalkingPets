import org.junit.Assert;
import org.junit.Test;

public class TurtleTest {
    @Test
    public void constructorNameAge() {
        Turtle turtle = new Turtle(11, "Sky");

        Assert.assertEquals("Sky", turtle.getName());
        Assert.assertEquals(11, turtle.getAge());
    }

    @Test
    public void nullConstructorTest() {
        Turtle turtle = new Turtle();

        Assert.assertNotNull(turtle);
    }

    @Test
    public void constructorAgeTest() {
        int age = 11;
        Turtle turtle = new Turtle(age);

        Assert.assertEquals(age, turtle.getAge());
    }

    @Test
    public void constructorNameTest() {
        String name = "Davvid";
        Turtle turtle = new Turtle(name);

        Assert.assertEquals(name, turtle.getName());
    }

    @Test
    public void speakTest() {
        Turtle turtle = new Turtle(11,"ralphy");

        String expected = "Cowabunga!";
        String actual = turtle.speak();

        Assert.assertEquals(expected, actual);
    }
}
