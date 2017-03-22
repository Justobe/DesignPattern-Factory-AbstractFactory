package Factory;

import Component.Car;

/**
 * Created by YanMing on 2017/3/21.
 */
public class FactoryTest {
    public static void main(String args[]){
        ICarFactory benzFactory = new BenzFactory();
        Car iBenz = benzFactory.createOneCar();
        iBenz.sayBrand();
    }
}
