package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.Square_GameController;

@ParticleView(name ="game", isDefault = false)
public class Square_GameView extends FXMLView {
    
    public Square_GameView() {
        super(Square_GameView.class.getResource("square_game.fxml"));
    }
    
    @Override
    public void start() {
        ((Square_GameController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((Square_GameController) getController()).dispose();
    }
    
}