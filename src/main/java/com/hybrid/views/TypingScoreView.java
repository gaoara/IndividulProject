package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.TypingScoreController;

@ParticleView(name = "typingscore", isDefault = false)
public class TypingScoreView extends FXMLView {
    
    public TypingScoreView() {
        super(TypingScoreView.class.getResource("typingscore.fxml"));
    }
    
    @Override
    public void start() {
        ((TypingScoreController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((TypingScoreController) getController()).dispose();
    }
    
}