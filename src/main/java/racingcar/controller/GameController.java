package racingcar.controller;

import java.util.stream.IntStream;
import racingcar.model.RacingCars;
import racingcar.view.OutputView;

public class GameController {
    private int rounds;
    private RacingCars racingCars;

    public GameController() {
        initialize();
        initiateGame();
        displayWinners();
    }

    public void initialize(){
        racingCars = InputController.getCarNames();
        rounds = InputController.getRoundCount();
    }

    public void initiateGame() {
        OutputView.printPlayMessage();
        IntStream.range(0, rounds).forEach(i -> {
            racingCars.play();
            OutputView.printNewLine();
        });
    }
    public void displayWinners() {
        racingCars.showWinners();
    }
}
