package HW_OOP2;

public abstract class Pets extends Animals implements ShowAffection{
    String name;
    String species;
    String vaccinations;
    String coatColor;
    String birthDate;
    public Pets(int height, int weight, String eyeColor, String name, String species, String vaccinations,
                String coatColor, String birthDate) {
        super(height, weight, eyeColor);
        this.name = name;
        this.species = species;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.birthDate = birthDate;
    }

    public abstract void showAffection();
    @Override
    public String toString() {
        return "\nРост животного: " + height +
                "\nВес животного: " + weight +
                "\nЦвет глаз:  " + eyeColor +
                "\nКличка: " + name +
                "\nПорода: " + species +
                "\nНаличие прививок: " + vaccinations +
                "\nЦвет шерсти: " + coatColor +
                "\nДата рождения: " + birthDate;
}
}