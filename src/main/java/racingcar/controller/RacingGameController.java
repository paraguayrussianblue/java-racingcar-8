package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.TryCount;
import racingcar.util.NumberGenerator;
import racingcar.util.RandomNumberGenerator;
import racingcar.view.InputView;
//import racingcar.view.OutputView;


public class RacingGameController {
    private final InputView inputView;

    public RacingGameController(InputView inputView){
        this.inputView = inputView;
    }

    public void play(){
        Cars cars = setupCars();
        TryCount tryCount = setupTryCount();


    }

    private Cars setupCars(){
        String inputNames = inputView.readCarNames();
        return new Cars(inputNames);
    }

    private TryCount setupTryCount(){
        String input = inputView.readTryCount();
        return new TryCount(input);
    }

    private void processRace(Cars cars, int tryCount){
        NumberGenerator generator = new RandomNumberGenerator();

        for(int i = 0; i < tryCount; i++){
            cars.moveAll(generator);
        }
    }
}

