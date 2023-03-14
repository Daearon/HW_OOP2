package HW_OOP2;

public abstract class WildAnimals extends Animals{
    String habitat;
    String locationDate;
    public WildAnimals(int height, int weight, String colourEyes, String habitat, String locationDate) {
        super(height, weight, colourEyes);
        this.habitat = habitat;
        this.locationDate = locationDate;
    }
    public String toString() {
        return "\nРост животного: " + height +
                "\nВес животного: " + weight +
                "\nЦвет глаз: " + eyeColor +
                "\nМесто обитания: " + habitat +
                "\nДата нахождения: " + locationDate;
    }
}
