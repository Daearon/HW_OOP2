package HW_OOP2;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animals> animals = new LinkedList<>();
        Animals cat = new Cat(32, 4, "золотые", "Том", "Персидский",
                "Пуревакс FeLV, 01.02.2022 г.", "рыжий", "22.04.2016.", true);
        Animals dog = new Dog(56, 10, "голубые", "Хатико", "Хаски",
                "Мультикан 4, 02.10.2022 г.", "Черно-белый", "02.10.2021.", true);
        Animals tiger = new Tiger(96, 42, "желтые", "Хейлундзян", "02.02.2023.");
        Animals wolf = new Wolf(64, 42, "карие", "Тундра", "08.02.2023.", true);
        Animals chicken = new Chicken(25, 3, "темно-красные");
        Animals stork = new Stork(126, 14, "черные");
        animals.add(cat);
        animals.add(dog);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(chicken);
        animals.add(stork);

        Zoo.getData(animals);
        Zoo.actions(animals);
    }
}

