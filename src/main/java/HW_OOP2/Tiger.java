package HW_OOP2;

public class Tiger extends WildAnimals{
    public Tiger(int height, int weight, String eyeColor, String habitat, String locationDate) {
        super(height, weight, eyeColor, habitat, locationDate);
    }
    @Override
    public void makeSound() {
        System.out.println("Голос: тигр рычит!");
    }
}
