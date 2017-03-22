package Factory;

import Component.Benz;
import Component.Car;

/**
 * Created by YanMing on 2017/3/21.
 */
public class BenzFactory implements ICarFactory {
    @Override
    public Car createOneCar() {
        return new Benz();
    }
}
