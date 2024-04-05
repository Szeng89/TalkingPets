public class Dog extends Pet{
    public Dog(int age, String name) {
        super(age, name);
    }

    public Dog() {
        super();
    }

    public Dog(int age) {
        super(age);
    }

    public Dog(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Woof Woof";
    }
}
