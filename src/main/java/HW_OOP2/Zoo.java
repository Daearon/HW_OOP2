package HW_OOP2;
import java.util.LinkedList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
    }
    public static void getData(LinkedList<Animals> animals) {
        System.out.print("""
                Приветствуем в меню управления базой данных "Зоопарк",пожалуйста, выберите одно из указанных действий:
                Добавить животное в зоопарк - введите 1
                Убрать животное с номером i из зоопарка - введите 2
                Посмотреть информацию о животном с номером i - введите 3
                Послушать звук, издаваемый животным - введите 4
                Посмотреть информацию о животных, которые есть на данный момент в зоопарке - введите 5
                Послушать звуки всех животных в зоопарке - введите 6
                Ввод:
                """);
        Scanner aScanner = new Scanner(System.in);
        int numberOfUserDecision = aScanner.nextInt();
        switch (numberOfUserDecision) {
            case 1 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, КОТОРОЕ ХОТИТЕ ДОБАВИТЬ В ЗООПАРК: ");
                System.out.print("""
                        Кот - введите 1
                        Собака - введите 2
                        Тигр - введите 3
                        Волк - введите 4
                        Курица - введите 5
                        Аист - введите 6
                        Ввод:""");
                Scanner fScanner = new Scanner(System.in);
                int addNumber = fScanner.nextInt();
                if (addNumber > 0 & addNumber < 7){
                    if (addNumber == 1){
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String eyeColor = iScanner.next();
                        System.out.print("Кличка: ");
                        Scanner jScanner = new Scanner(System.in);
                        String name = jScanner.next();
                        System.out.print("Порода: ");
                        Scanner kScanner = new Scanner(System.in);
                        String species = kScanner.next();
                        System.out.print("Вакцинации: ");
                        Scanner lScanner = new Scanner(System.in);
                        String vaccination = lScanner.next();
                        System.out.print("Окрас шерсти: ");
                        Scanner mScanner = new Scanner(System.in);
                        String coatColor = mScanner.next();
                        System.out.print("Дата рождения: ");
                        Scanner nScanner = new Scanner(System.in);
                        String birthDate = nScanner.next();
                        System.out.print("Наличие шерсти: ");
                        Scanner pScanner = new Scanner(System.in);
                        Boolean presenceOfWool = pScanner.nextBoolean();
                        Animals newCat = new Cat(height, weight, eyeColor, name, species, vaccination, coatColor, birthDate, presenceOfWool);
                        System.out.printf("\nВы добавили кота со следующими характеристиками: %s", newCat);
                    }
                    if (addNumber == 2){
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String eyeColor = iScanner.next();
                        System.out.print("Кличка: ");
                        Scanner jScanner = new Scanner(System.in);
                        String name = jScanner.next();
                        System.out.print("Порода: ");
                        Scanner kScanner = new Scanner(System.in);
                        String species = kScanner.next();
                        System.out.print("Вакцинации: ");
                        Scanner lScanner = new Scanner(System.in);
                        String vaccination = lScanner.next();
                        System.out.print("Окрас шерсти: ");
                        Scanner mScanner = new Scanner(System.in);
                        String coatColor = mScanner.next();
                        System.out.print("Дата рождения: ");
                        Scanner nScanner = new Scanner(System.in);
                        String birthDate = nScanner.next();
                        System.out.print("Дрессирован: ");
                        Scanner dScanner = new Scanner(System.in);
                        Boolean trainingAvailability = dScanner.nextBoolean();
                        Animals newDog = new Dog(height, weight, eyeColor, name, species, vaccination, coatColor, birthDate, trainingAvailability);
                        System.out.printf("\nВы добавили собаку со следующими характеристиками: %s", newDog);
                    }
                    if (addNumber == 3){
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String eyeColor = iScanner.next();
                        System.out.print("Место обитания: ");
                        Scanner jScanner = new Scanner(System.in);
                        String habitat = jScanner.next();
                        System.out.print("Дата нахождения: ");
                        Scanner kScanner = new Scanner(System.in);
                        String locationDate = kScanner.next();
                        Animals newTiger = new Tiger(height, weight, eyeColor, habitat, locationDate);
                        System.out.printf("\nВы добавили тигра со следующими характеристиками: %s", newTiger);
                    }
                    if (addNumber == 4) {
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String eyeColor = iScanner.next();
                        System.out.print("Место обитания: ");
                        Scanner jScanner = new Scanner(System.in);
                        String habitat = jScanner.next();
                        System.out.print("Дата нахождения: ");
                        Scanner kScanner = new Scanner(System.in);
                        String locationDate = kScanner.next();
                        System.out.print("Вожак стаи: ");
                        Scanner dScanner = new Scanner(System.in);
                        Boolean packLeader = dScanner.nextBoolean();
                        Animals newWolf = new Wolf(height, weight, eyeColor, habitat, locationDate, packLeader);
                        System.out.printf("\nВы добавили волка со следующими характеристиками: %s", newWolf);
                    }

                    if (addNumber == 5){
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String eyeColor = iScanner.next();
                        Animals newChicken = new Chicken(height, weight, eyeColor);
                        System.out.printf("\nВы добавили курицу со следующими характеристиками: %s", newChicken);
                    }
                    if (addNumber == 6){
                        System.out.print("\nРост: ");
                        Scanner gScanner = new Scanner(System.in);
                        int height = gScanner.nextInt();
                        System.out.print("Вес: ");
                        Scanner hScanner = new Scanner(System.in);
                        int weight = hScanner.nextInt();
                        System.out.print("Цвет глаз: ");
                        Scanner iScanner = new Scanner(System.in);
                        String eyeColor = iScanner.next();
                        Animals newStork = new Stork(height, weight, eyeColor);
                        System.out.printf("\nВы добавили аиста со следующими характеристиками: %s", newStork);
                    }
                }
                else System.out.println("Введены некорректные данные");
            }
            case 2 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, КОТОРОЕ ХОТИТЕ УДАЛИТЬ ИЗ ЗООПАРКА: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                Scanner bScanner = new Scanner(System.in);
                int delIndex = bScanner.nextInt();
                if (delIndex - 1 < animals.size()) {
                    System.out.printf("\nУдален: %s", animals.get(delIndex - 1).getClass().getSimpleName());
                    animals.remove(delIndex - 1);
                    System.out.println("\nВ зоопарке остались следующие животные: ");
                    for (int i = 0; i < animals.size(); i++) {
                        System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                    }
                } else System.out.println("Введены некорректные данные");
            }
            case 3 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, О КОТОРОМ ХОТИТЕ ПОЛУЧИТЬ ДАННЫЕ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                Scanner cScanner = new Scanner(System.in);
                int showIndex = cScanner.nextInt();
                if (showIndex - 1 <= animals.size()) {
                    System.out.printf("\nДанные по Вашему запросу:  %s %s",
                            animals.get(showIndex - 1).getClass().getSimpleName(), animals.get(showIndex - 1));
                } else System.out.println("Введены некорректные данные");
            }
            case 4 -> {
                System.out.println("\nУКАЖИТЕ № ЖИВОТНОГО, ЧЕЙ ГОЛОС ВЫ ХОТИТЕ УСЛЫШАТЬ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
                }
                System.out.print("\nВаше решение:  ");
                Scanner dScanner = new Scanner(System.in);
                int soundIndex = dScanner.nextInt();
                if (soundIndex - 1 <= animals.size()) {
                    animals.get(soundIndex - 1).makeSound();
                } else System.out.println("Введены некорректные данные");
            }
            case 5 -> {
                System.out.println("\nНА ДАННЫЙ МОМЕНТ В ЗООПАРКЕ ИМЕЮТСЯ СЛЕДУЮЩИЕ ЖИВОТНЫЕ: ");
                for (int i = 0; i < animals.size(); i++) {
                    System.out.printf("\n№ %s\n %s\n", i + 1 + " = " + animals.get(i).getClass().getSimpleName(), animals.get(i));
                }
            }
            case 6 -> {
                System.out.println("\nВСЕ ЖИВОТНЫЕ ЗООПАРКА ИЗДАЮТ ЗВУКИ: ");
                for (Animals animal : animals) {
                    ((MakeSound) animal).makeSound();
                }
            }
            default -> System.out.println("Введены некорректные данные");
        }
    }
    public static void actions(LinkedList<Animals> animals){
        System.out.println();
        System.out.print("""
                \nЖИВОТНЫЕ МОГУТ ПРОДЕМОНСТРИРОВАТЬ НЕКОТОРЫЕ ДЕЙСТВИЯ
                Выбирете активность, которую бы хотели увидеть:
                Летать - введите 1
                Проявлять ласку - введите 2
                Заниматься дрессировкой - введите 3
                Ввод:""");
        Scanner aScanner = new Scanner(System.in);
        int userWishes = aScanner.nextInt();
        switch (userWishes) {
            case 1 -> {
                System.out.println("\nПТИЦЫ МОГУТ ЛЕТАТЬ\n");
                for (Animals animal : animals) {
                    if (animal instanceof GetHigh) {
                        ((GetHigh) animal).getHigh();
                    }
                }
            }
            case 2 -> {
                System.out.println("\nДОМАШНИЕ ЖИВОТНЫЕ ПРОЯВЛЯЮТ ЛАСКУ\n");
                for (Animals animal : animals) {
                    if (animal instanceof ShowAffection) {
                        ((ShowAffection) animal).showAffection();
                    }
                }
            }
            case 3 -> {
                System.out.println("\nСОБАКИ ПОДДАЮТСЯ ДРЕССИРОВКЕ\n");
                for (Animals animal : animals){
                    if (animal instanceof Training){
                        ((Training) animal).training();
                    }
                }
            }
        }
    }
}
