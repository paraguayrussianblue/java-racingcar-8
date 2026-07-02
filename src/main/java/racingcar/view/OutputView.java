package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {
    public void printRaceStart() {
        System.out.println("\n실행 결과");
    }

    public void printRoundResult(Cars cars) {
        List<Car> carList = cars.getCars();
        for (Car car : carList) {
            String carName = car.getName();
            int position = car.getPosition();
            System.out.println(carName + " : " + "-".repeat(position));
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        String joinedWinners = String.join(", ", winners);
        System.out.println("최종 우승자 : " + joinedWinners);
    }

    public void printError(String errorMessage) {
        System.out.println("[ERROR] " + errorMessage);
    }
}
