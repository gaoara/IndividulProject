package com.hybrid;

import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import static org.controlsfx.control.action.ActionMap.actions;

public class MainApplication extends ParticleApplication {

    public MainApplication() {
        super("MiniGames Application");
    }

    @Override
    public void postInit(Scene scene) {
    	
    	/* Icon 로고 */
    	Stage primaryStage= getPrimaryStage();
    	primaryStage.getIcons().add(new Image("/BlackApple.png"));	// 로고 이미지 바꾸기
    	
        scene.getStylesheets().add(MainApplication.class.getResource("style.css").toExternalForm());

        setTitle("MINIGAMES");

        getParticle().buildMenu("메인화면 -> [main, exit]",
				"사기경마 -> [horsemenual, horsestart]",
				"타이핑게임 -> [typingmanual, typingmain]",
				"숫자야구게임 -> [baseballmanual, baseballmain]",
				"짝맞추기게임 -> [matchingmanual, matchingmain]",
				"마방진게임 -> [howto, game]",
				"HELP -> [about]");
        
        getParticle().getToolBarActions().addAll(actions( "goHome" ,"---", "about", "exit"));
        
        setShowCloseConfirmation(false);
    }
    
    public static void main(String[] args) {
		launch(args);
	}
}