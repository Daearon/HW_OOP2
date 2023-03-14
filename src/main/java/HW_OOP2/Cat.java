package HW_OOP2;

public class Cat extends Pets{

    public Cat(int height, int weight, String eyeColor, String name, String species, String vaccinations,
               String coatColor, String birthDate, boolean presenceOfWool) {
        super(height, weight, eyeColor, name, species, vaccinations, coatColor, birthDate);
        this.presenceOfWool = presenceOfWool;
    }
    private boolean presenceOfWool;
    public boolean isPresenceOfWool() {
        return presenceOfWool;
    }

    @Override
    public void makeSound() {
        System.out.println("Голос: кот издает звук 'Мяу'");
    }
    @Override
    public void showAffection() {
        System.out.println("Кот мурлыкает и трется о ногу.");
    }

    @Override
    public String toString() {
        return "\nРост животного: " + height +
                "\nВес животного: " + weight +
                "\nЦвет глаз: " + eyeColor +
                "\nКличка:    " + name +
                "\nПорода:    " + species +
                "\nНаличие прививок: " + vaccinations +
                "\nЦвет шерсти: " + coatColor +
                "\nДата рождения: " + birthDate +
                "\nНаличие шерсти: " + presenceOfWool;
    }
}