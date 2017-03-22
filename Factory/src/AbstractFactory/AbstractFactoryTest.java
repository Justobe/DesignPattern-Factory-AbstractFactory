package AbstractFactory;

import Component.Car;
import Component.Seat;

/**
 * Created by YanMing on 2017/3/21.
 */
public class AbstractFactoryTest {
    public static void main(String [] args){
        ICarFactory benzFactory = new BenzFacory();
        Seat benzSeat = benzFactory.createOneSeat();
        Car iBenz = benzFactory.createOneCar();
        benzSeat.sayMaterials();
        iBenz.sayBrand();
    }
}
