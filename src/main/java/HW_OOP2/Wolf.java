package HW_OOP2;

public class Wolf extends WildAnimals{
    public Wolf(int height, int weight, String eyeColor, String habitat, String locationDate, boolean packLeader) {
        super(height, weight, eyeColor, habitat, locationDate);
        this.packLeader = packLeader;
    }

    boolean packLeader;
    public boolean ispackLeader() {
        return packLeader;
    }
    @Override
    public void makeSound() {
        System.out.println("Голос: волк воет!");
    }
    public String toString() {
        return "\nРост животного: " + height +
                "\nВес животного: " + weight +
                "\nЦвет глаз: " + eyeColor +
                "\nМесто обитания: " + habitat +
                "\nДата нахождения: " + locationDate +
                "\nВожак стаи: " + packLeader;
    }
}
