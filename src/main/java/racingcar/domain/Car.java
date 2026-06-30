package racingcar.domain;

public class Car {
    private final CarName carName;
    private int position;

    public Car(String name) {
        this.carName = new CarName(name);
        this.position = 0;
    }

    public void move(int conditionValue) {
        if (conditionValue >= 4)
            position++;
    }

    public String getName() {
        return carName.getName();
    }

    public int getPosition() {
        return position;
    }
}
