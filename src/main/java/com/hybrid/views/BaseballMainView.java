package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.BaseballMainController;

@ParticleView(name = "baseballmain", isDefault = false)
public class BaseballMainView extends FXMLView {
    
    public BaseballMainView() {
        super(BaseballMainView.class.getResource("baseballmain.fxml"));
    }
    
    @Override
	public void init() {
    	 ((BaseballMainController) getController()).init();
	}

	@Override
    public void start() {
        ((BaseballMainController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((BaseballMainController) getController()).dispose();
    }
    
}