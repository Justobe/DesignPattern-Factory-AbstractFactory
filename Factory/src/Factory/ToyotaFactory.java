package Factory;

import Component.Car;
import Component.Toyota;

/**
 * Created by YanMing on 2017/3/21.
 */
public class ToyotaFactory implements ICarFactory {
    @Override
    public Car createOneCar() {
        return new Toyota();
    }
}
