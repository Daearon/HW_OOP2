package HW_OOP2;

public class Chicken extends Birds implements GetHigh{
    protected Chicken(int height, int weight, String eyeColor) {
        super(height, weight, eyeColor);
    }
    @Override
    public void makeSound() {
        System.out.println("Голос: курица кудахчет!");

    }
    @Override
    public void getHigh() {
        System.out.println("Курица: Я могу полететь, спрыгнув с высоты " + abilityToFly() + " метров.");
    }
}
