package Factory;

import Component.Car;
import Component.Ford;

/**
 * Created by YanMing on 2017/3/21.
 */
public class FordFactory implements ICarFactory {
    @Override
    public Car createOneCar() {
        return new Ford();
    }
}
