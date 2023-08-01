package Test114;

public class ElectricVehicle extends Vehicle implements IPower{

    public ElectricVehicle() {

    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车启动");
    }

    @Override
    public void power() {
        System.out.println("电能源");
    }
}
