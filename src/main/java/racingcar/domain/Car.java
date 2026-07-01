package racingcar.domain;

public class Car {
    private final CarName carName;
    private int position;
    private static final int FORWARD_CONDITION = 4;

    public Car(String name) {
        this.carName = new CarName(name);
        this.position = 0;
    }

    public void move(int conditionValue) {
        if (conditionValue >= FORWARD_CONDITION)
            position++;
    }

    public String getName() {
        return carName.getName();
    }

    public int getPosition() {
        return position;
    }
}
