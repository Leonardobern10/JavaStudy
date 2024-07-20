public class ConcreteBuilder implements Builder {
    Car car = null;

    public ConcreteBuilder () {
        car = new Car();
    }

    public void buildHead() {
        car.setHead("Car head construction completed");
    }

    public void buildBody () {
        car.setBody("Car body construction completed");
    }

    public void buildWheel () {
        car.setWheel("Car wheel construction completed");
    }

    public Car buildPart() {
        return car;
    }
}
