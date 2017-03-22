package AbstractFactory;

import Component.Car;
import Component.Seat;

/**
 * Created by YanMing on 2017/3/21.
 */
public interface ICarFactory {
    Car createOneCar();
    Seat createOneSeat();
}
