package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.MatchingController;

@ParticleView(name = "matchmain", isDefault = false)
public class MatchingMainView extends FXMLView {
    
    public MatchingMainView() {
        super(MatchingMainView.class.getResource("matching.fxml"));
    }
    
    @Override
    public void init() {
        ((MatchingController) getController()).init();
    }
    
    @Override
    public void start() {
        ((MatchingController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((MatchingController) getController()).dispose();
    }
    
}
