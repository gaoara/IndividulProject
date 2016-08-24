package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.FXMLView;
import com.hybrid.controllers.Square_UserRegistrationController;

@ParticleView(name = "userRegistration", isDefault = false)
public class Square_UserRegistrationView extends FXMLView {
    
    public Square_UserRegistrationView() {
        super(Square_UserRegistrationView.class.getResource("userRegistration.fxml"));
    }
    
    @Override
    public void start() {
        ((Square_UserRegistrationController) getController()).postInit();
    }
    
    @Override
    public void stop() {
        ((Square_UserRegistrationController) getController()).dispose();
    }
    
}