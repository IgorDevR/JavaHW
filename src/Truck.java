public class Truck extends Car {

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку Truck");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель Truck");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп Truck");
    }



}
