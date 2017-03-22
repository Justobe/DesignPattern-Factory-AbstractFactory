package AbstractFactory;

import Component.Car;
import Component.NylonSeat;
import Component.Seat;
import Component.Toyota;

/**
 * Created by YanMing on 2017/3/21.
 */
public class ToyotaFactory implements ICarFactory {
    @Override
    public Car createOneCar() {
        return new Toyota();
    }

    @Override
    public Seat createOneSeat() {
        return new NylonSeat();
    }
}
