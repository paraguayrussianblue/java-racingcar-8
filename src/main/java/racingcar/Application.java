package racingcar;

import racingcar.controller.RacingGameController;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.util.RandomNumberGenerator;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        RacingGameController controller = new RacingGameController(inputView, outputView, randomNumberGenerator);

        controller.play();
    }
}
