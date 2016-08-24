package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.TypingEasyController;

@ParticleView(name = "typingeasy", isDefault = false)
public class TypingEasyView extends FXMLView {
    
    public TypingEasyView() {
        super(TypingEasyView.class.getResource("typingeasy.fxml"));
    }
    
    @Override
    public void start() {
        ((TypingEasyController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((TypingEasyController) getController()).dispose();
    }
    
}