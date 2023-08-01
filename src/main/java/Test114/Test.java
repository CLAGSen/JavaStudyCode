package Test114;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicles[] = new  Vehicle[3];
        vehicles[0]=new Bicycle("山地","白色");
        vehicles[1]= new ElectricVehicle("雅迪","粉色");
        vehicles[2]= new Car("比亚迪","白色","京ALK300");

        Developer developer = new Developer();
        developer.takingVehicle(vehicles[0]);
        developer.takingVehicle(vehicles[1]);
        developer.takingVehicle(vehicles[2]);
    }
}
