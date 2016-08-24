package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.Square_HowtoController;

@ParticleView(name ="howto", isDefault = false)
public class Square_HowtoView extends FXMLView {
    
    public Square_HowtoView() {
        super(Square_HowtoView.class.getResource("square_howto.fxml"));
    }
    
    @Override
    public void start() {
        ((Square_HowtoController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((Square_HowtoController) getController()).dispose();
    }
    
}