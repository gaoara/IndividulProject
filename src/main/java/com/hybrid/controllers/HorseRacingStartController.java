package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class HorseRacingStartController {

    /* FX 관련 */
    @FXML
    private Button button;
    @FXML
    private ResourceBundle resources;
    
    public void initialize() {
        button.setOnAction(e -> {
        	viewManager.switchView("horseracing");
        });
    }
    
    /* Gluon 관련 */
    @Inject ParticleApplication app;
    @Inject private ViewManager viewManager;
    
    private Action actionHome;
    
    public void init() {
    	ActionMap.register(this);
    }
    
    public void postInit() {
        app.getParticle().getToolBarActions().add(actionHome);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionHome);
    }
}
