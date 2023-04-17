package edu.duke.ece651.risk_game.client;

//import javafx.application.Application;
//import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class is used to start the game.
 * It is used by the RISCFront class.
 */
public class RISCFront {
    private final InputController controller;
    public RISCFront() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        this.controller = new InputController(input, System.out);
    }

    public static void main(String[] args) throws IOException {
        RISCFront front = new RISCFront();
        front.controller.startGame();
        //Application.launch();
    }

}

