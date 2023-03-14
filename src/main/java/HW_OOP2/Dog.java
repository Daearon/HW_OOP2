package HW_OOP2;

public class Dog extends Pets implements Training {
    public Dog(int height, int weight, String eyeColor, String name, String species, String vaccinations,
               String coatColor, String birthDate) {
        super(height, weight, eyeColor, name, species, vaccinations, coatColor, birthDate);
    }
    @Override
    public String toString() {
        boolean trainingAvailability = false;
        return "\nРост животного: " + height +
                "\nВес животного: " + weight +
                "\nЦвет глаз: " + eyeColor +
                "\nКличка: " + name +
                "\nПорода: " + species +
                "\nНаличие прививок: " + vaccinations +
                "\nЦвет шерсти: " + coatColor +
                "\nДата рождения: " + birthDate +
                "\nНаличие дрессировки: " + trainingAvailability;
    }

    // ОПРЕДЕЛИМ МЕТОДЫ ДЛЯ КЛАССА DOGS
    @Override
    public void makeSound() {
        System.out.println("Голос: собака лает");
    }

    @Override
    public void showAffection() {
        System.out.println("Собака смотрит в глаза и машет хвостом.");
    }

    @Override
    public void training() {
        System.out.println("Собака выполнила команду сидеть.");
    }
}

