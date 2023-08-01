package Test114;

public class Car extends Vehicle implements IPower{
    private String carNumber;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Car() {
    }

    @Override
    public void run() {
        System.out.println("car启动了");
    }

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    @Override
    public void power() {
        System.out.println("汽油");
    }
}
