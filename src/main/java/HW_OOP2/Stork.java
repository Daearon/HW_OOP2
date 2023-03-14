package HW_OOP2;

public class Stork extends Birds implements GetHigh{
    protected Stork(int height, int weight, String eyeColor) {
        super(height, weight, eyeColor);
    }
    @Override
    public void makeSound() {
        System.out.println("Голос: аист шипит!");
    }
    @Override
    public void getHigh() {
        System.out.println("Аист: Я лечу на высоте " + abilityToFly() + " метра.");
    }
}
