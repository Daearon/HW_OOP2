package HW_OOP2;

public abstract class Birds extends Animals implements GetHigh{
    private final int abilityToFly = 3;
    protected Birds(int height, int weight, String eyeColor){
        super(height, weight, eyeColor);
    }
    @Override
    public String toString() {
        return "\nРост птицы: " + height +
                "\nВес птицы: " + weight +
                "\nЦвет глаз: " + eyeColor +
                "\nВысота полета: " + abilityToFly;
    }
    public int abilityToFly(){
        return abilityToFly;
    }

    // РЕАЛИЗУЕМ АБСТРАКТНЫЙ МЕТОД ВЫВОДА ДАННЫХ О ВЫСОТЕ ПОЛЕТА
    public void getHigh() {
        System.out.println("Я лечу на высоте " + abilityToFly() + " метров.");
    }
}
