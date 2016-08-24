package com.hybrid.controllers;

import java.util.ResourceBundle;

import javax.inject.Inject;

import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Square_UserRegistrationController {

    @Inject ParticleApplication app;
    @Inject private ViewManager viewManager;
    @FXML private Button button;
    @FXML private TextField username;
    @FXML private ResourceBundle resources;
    
    private Action actionHome;
    
    public void initialize() {
    	
    	
    		
        ActionMap.register(this);
        
        button.setText(resources.getString("button.text"));
        button.setOnAction(e -> viewManager.switchView("howto"));
    }
    
    public void postInit() {
        app.getParticle().getToolBarActions().add(0, actionHome);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionHome);
    }
    
    @ActionProxy(text = "Back")
    private void goHome() {
        viewManager.switchView("test");
    }
    
}
