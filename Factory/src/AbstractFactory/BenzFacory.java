package AbstractFactory;

import Component.Benz;
import Component.Car;
import Component.LeatherSeat;
import Component.Seat;
import Factory.*;

/**
 * Created by YanMing on 2017/3/21.
 */
public class BenzFacory implements ICarFactory {

    @Override
    public Car createOneCar() {
        return new Benz();
    }

    @Override
    public Seat createOneSeat() {
        return new LeatherSeat();
    }
}
