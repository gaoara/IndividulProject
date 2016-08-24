package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.BaseballController;

@ParticleView(name = "baseball", isDefault = false)
public class BaseballView extends FXMLView {
    
    public BaseballView() {
        super(BaseballView.class.getResource("baseball.fxml"));
    }
    
    @Override
	public void init() {
    	((BaseballController) getController()).init();
    }

	@Override
    public void start() {
        ((BaseballController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((BaseballController) getController()).dispose();
    }
    
}
