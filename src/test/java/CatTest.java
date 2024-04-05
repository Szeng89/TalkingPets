import io.zipcoder.polymorphism.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void constructorNameAge() {
        Cat cat = new Cat(11, "Sky");

        Assert.assertEquals("Sky", cat.getName());
        Assert.assertEquals(11, cat.getAge());
    }

    @Test
    public void nullConstructorTest() {
        Cat cat = new Cat();

        Assert.assertNotNull(cat);
    }

    @Test
    public void constructorAgeTest() {
        int age = 11;
        Cat cat = new Cat(age);

        Assert.assertEquals(age, cat.getAge());
    }

    @Test
    public void constructorNameTest() {
        String name = "Davvid";
        Cat cat = new Cat(name);

        Assert.assertEquals(name, cat.getName());
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat(11,"ralphy");

        String expected = "Meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}
