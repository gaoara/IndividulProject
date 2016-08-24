package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class BaseballMainController {


    @FXML
    private Button btnStart;
    
    @FXML
    private ResourceBundle resources;
    
 
    
    List<String> list1 = new ArrayList<String>();
    
    public void initialize() {
        
        btnStart.setOnAction(e -> {
        	viewManager.switchView("baseball");
        });
    }
    
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
