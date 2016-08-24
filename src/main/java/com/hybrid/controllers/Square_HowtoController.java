package com.hybrid.controllers;

import java.util.ResourceBundle;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Square_HowtoController {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;

    @FXML
    private Button howtoGame;    
    
    @FXML
    private Button goGame;  
    
    @FXML
    private Button rank;  
    
    @FXML
    private ResourceBundle resources;
    
    private Action actionHome;
    
    public void initialize() {
        ActionMap.register(this);
        
        /*goGame.setText(resources.getString("button.text"));*/
        
        howtoGame.setOnAction(e -> viewManager.switchView("howtogame"));
        
        goGame.setOnAction(e -> viewManager.switchView("game"));
    }
    
    public void postInit() {
        app.getParticle().getToolBarActions().add(0, actionHome);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionHome);
    }
    

    
}
