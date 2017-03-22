package SimpleFactory;

import Component.Car;

/**
 * Created by YanMing on 2017/3/21.
 */
public class SimpleFactoryTest {
    public static void main(String [] args){
        CarFactory carFactory = new CarFactory();
        Car iBenz = carFactory.getCarByName(CarType.Benz);
        Car iFord = carFactory.getCarByName(CarType.Ford);
        Car iToyota = carFactory.getCarByName(CarType.Toyata);
        iBenz.sayBrand();
        iFord.sayBrand();
        iToyota.sayBrand();
    }

}
