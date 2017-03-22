package AbstractFactory;

import Component.Car;
import Component.Ford;
import Component.Seat;
import Component.WoolSeat;

/**
 * Created by YanMing on 2017/3/21.
 */
public class FordFactory implements ICarFactory {

    @Override
    public Car createOneCar() {
        return new Ford();
    }

    @Override
    public Seat createOneSeat() {
        return new WoolSeat();
    }
}
