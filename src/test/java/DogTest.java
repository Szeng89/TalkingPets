import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void constructorNameAge() {
        Dog dog = new Dog(11, "Sky");

        Assert.assertEquals("Sky", dog.getName());
        Assert.assertEquals(11, dog.getAge());
    }

    @Test
    public void nullConstructorTest() {
        Dog dog = new Dog();

        Assert.assertNotNull(dog);
    }

    @Test
    public void constructorAgeTest() {
        int age = 11;
        Dog dog = new Dog(age);

        Assert.assertEquals(age, dog.getAge());
    }

    @Test
    public void constructorNameTest() {
        String name = "Davvid";
        Dog dog = new Dog(name);

        Assert.assertEquals(name, dog.getName());
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog(11,"ralphy");

        String expected = "Woof Woof";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}
