package SimpleFactory;

import Component.Benz;
import Component.Car;
import Component.Ford;
import Component.Toyota;

/**
 * Created by YanMing on 2017/3/21.
 */
public class CarFactory {
    public Car getCarByName(CarType carType) {
        Car car;
        switch (carType) {
            case Benz:
                car = new Benz();
                break;
            case Ford:
                car = new Ford();
                break;
            case Toyata:
                car = new Toyota();
                break;
            default:
                car = null;
                break;
        }
        return car;
    }

}
