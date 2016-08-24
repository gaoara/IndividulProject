package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.TypingNormalController;

@ParticleView(name = "typingnormal", isDefault = false)
public class TypingNormalView extends FXMLView {
    
    public TypingNormalView() {
        super(TypingNormalView.class.getResource("typingnormal.fxml"));
    }
    
    @Override
    public void start() {
        ((TypingNormalController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((TypingNormalController) getController()).dispose();
    }
    
}