import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void petConstructorNameAgeTest() {
        int age = 11;
        String name = "Chowder";
        Pet pet = new Pet(age, name);

        Assert.assertEquals(name, pet.getName());
        Assert.assertEquals(age, pet.getAge());
    }

    @Test
    public void nullConstructorTest() {
        Pet pet = new Pet();

        Assert.assertNotNull(pet);
    }

    @Test
    public void constructorAgeTest() {
        int age = 11;
        Pet pet = new Pet(age);

        Assert.assertEquals(age, pet.getAge());
    }

    @Test
    public void constructorNameTest() {
        String name = "Davvid";
        Pet pet = new Pet(name);

        Assert.assertEquals(name, pet.getName());
    }

    @Test
    public void speakTest() {
        Pet pet = new Pet(11,"ralphy");

        String expected = "Speaking";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

}
