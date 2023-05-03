package edu.duke.ece651.risk_game.client;

import edu.duke.ece651.risk_game.shared.ActionStatus;
import javafx.fxml.FXML;

public class UpgradeCloakController extends GameController{

        public void initialize() {
            super.initialize();
        }

        @FXML
        public void handleYesButton() {
            ActionStatus status = gameContext.httpClient.sendUpgradeCloak(gameContext.currentRoomID);
            if (!status.isSuccess()) {
                gameContext.showErrorAlert("Error", "You don't have enough tech level to upgrade cloak.");
            }
            sceneManager.switchTo("GameMain.fxml");
        }

        @FXML
        public void handleNoButton() {
            sceneManager.switchTo("GameMain.fxml");
        }
}
