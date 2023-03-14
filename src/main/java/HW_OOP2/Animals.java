package HW_OOP2;

public abstract class Animals extends MakeSound {
    int height;
    int weight;
    String eyeColor;
    public Animals(int height, int weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }
    @Override
    public String toString() {
        return "\nРост животного: " + height +
                "\nВес животного: " + weight +
                "\nЦвет глаз: " + eyeColor;
    }
    public abstract void makeSound();
}