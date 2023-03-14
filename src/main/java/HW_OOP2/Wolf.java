package HW_OOP2;

public class Wolf extends WildAnimals{
    public Wolf(int height, int weight, String eyeColor, String habitat, String locationDate) {
        super(height, weight, eyeColor, habitat, locationDate);
    }
    public String toString() {
        boolean packLeader = true;
        return "\nРост животного: " + height +
                "\nВес животного: " + weight +
                "\nЦвет глаз: " + eyeColor +
                "\nМесто обитания: " + habitat +
                "\nДата нахождения: " + locationDate +
                "\nВожак стаи: " + packLeader;
    }
    @Override
    public void makeSound() {
        System.out.println("Голос: волк воет!");
    }
}
