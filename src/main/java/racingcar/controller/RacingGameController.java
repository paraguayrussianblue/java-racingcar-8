package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.TryCount;
import racingcar.util.NumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import java.util.List;


public class RacingGameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final NumberGenerator numberGenerator;

    public RacingGameController(InputView inputView, OutputView outputView, NumberGenerator numberGenerator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.numberGenerator = numberGenerator;
    }

    public void play() {
        try {
            Cars cars = setupCars();
            TryCount tryCount = setupTryCount();
            processRace(cars, tryCount);
            showRaceResult(cars);
        } catch (IllegalArgumentException e){
            outputView.printError(e.getMessage());
            throw e;
        }
    }

    private Cars setupCars() {
        String inputNames = inputView.readCarNames();
        return new Cars(inputNames);
    }

    private TryCount setupTryCount() {
        String input = inputView.readTryCount();
        return new TryCount(input);
    }

    private void processRace(Cars cars, TryCount tryCount) {
        outputView.printRaceStart();

        for (int i = 0; i < tryCount.getCount(); i++) {
            cars.moveAll(numberGenerator);
            outputView.printRoundResult(cars);
        }
    }

    private void showRaceResult(Cars cars){
        List<String> winners = cars.findWinners();
        outputView.printWinners(winners);
    }
}

