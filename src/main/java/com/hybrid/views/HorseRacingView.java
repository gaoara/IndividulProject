package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.HorseRacingController;

@ParticleView(name = "horseracing", isDefault = false)
public class HorseRacingView extends FXMLView {
    
    public HorseRacingView() {
        super(HorseRacingView.class.getResource("horseracing.fxml"));
    }
    
    @Override
    public void init() {
        ((HorseRacingController) getController()).init();
    }
    
    @Override
    public void start() {
        ((HorseRacingController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((HorseRacingController) getController()).dispose();
    }
    
}