package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.HorseRacingStartController;

@ParticleView(name = "horsestart", isDefault = false)
public class HorseRacingStartView extends FXMLView {
    
    public HorseRacingStartView() {
        super(HorseRacingStartView.class.getResource("horsestart.fxml"));
    }
    
    @Override
    public void init() {
        ((HorseRacingStartController) getController()).init();
    }
    
    @Override
    public void start() {
        ((HorseRacingStartController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((HorseRacingStartController) getController()).dispose();
    }
    
}