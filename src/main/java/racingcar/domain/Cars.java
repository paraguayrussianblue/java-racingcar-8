package racingcar.domain;

import racingcar.util.NumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(String inputNames){
        String[] carNames = inputNames.split(",");
        carList = new ArrayList<>();
        for(String name: carNames){
            Car car = new Car(name);
            carList.add(car);
        }
    }

    public void moveAll(NumberGenerator numberGenerator){
        for(Car car: carList){
            int number = numberGenerator.generate();
            car.move(number);
        }
    }

    public List<Car> getCars(){
        return carList;
    }
}
