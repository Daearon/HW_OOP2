package HW_OOP2;

public class Cat extends Pets{
    public Cat(int height, int weight, String eyeColor, String name, String species, String vaccinations,
               String coatColor, String birthDate) {
        super(height, weight, eyeColor, name, species, vaccinations, coatColor, birthDate);
    }
    @Override
    public String toString() {
        boolean presenceOfWool = true;
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
    @Override
    public void makeSound() {
        System.out.println("Голос: кот издает звук 'Мяу'");
    }
    @Override
    public void showAffection() {
        System.out.println("Кот мурлыкает и трется о ногу.");
    }
}
