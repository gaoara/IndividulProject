package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.TypingHardController;

@ParticleView(name = "typinghard", isDefault = false)
public class TypingHardView extends FXMLView {
    
    public TypingHardView() {
        super(TypingHardView.class.getResource("typinghard.fxml"));
    }
    
    @Override
    public void start() {
        ((TypingHardController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((TypingHardController) getController()).dispose();
    }
    
}