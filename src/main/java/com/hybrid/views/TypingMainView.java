package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.TypingMainController;

@ParticleView(name = "typingmain", isDefault = false)
public class TypingMainView extends FXMLView {
    
    public TypingMainView() {
        super(TypingMainView.class.getResource("typingmain.fxml"));
    }
    
    @Override
    public void start() {
        ((TypingMainController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((TypingMainController) getController()).dispose();
    }
    
}
