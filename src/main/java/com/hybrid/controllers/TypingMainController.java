package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.state.StateManager;
import com.gluonhq.particle.view.ViewManager;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class TypingMainController {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;

    @Inject private StateManager stateManager;
    
    private boolean first = true;
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;
    
    @FXML
    private Button button1;
    
    @FXML
    private Button button2;
    
    @FXML
    private Label lblManual;
    
    @FXML
    private Label lblRank;
    
    @FXML
    private ResourceBundle resources;
    
    private Action actionSignin;
    
    public void initialize() {
        ActionMap.register(this);
        actionSignin =  ActionMap.action("signin");
        
        button.setOnAction(e -> viewManager.switchView("typingeasy")); //이지모드 게임 시작
        button1.setOnAction(e -> viewManager.switchView("typingnormal")); //노멀모드 게임 시작
        button2.setOnAction(e -> viewManager.switchView("typinghard")); //하드모드 게임 시작
        lblManual.setOnMouseClicked(e-> viewManager.switchView("typingmanual")); //게임설명
        lblRank.setOnMouseClicked(e-> viewManager.switchView("typingscore")); //점수보기
    }
    
    public void postInit() {
        if (first) {
            stateManager.setPersistenceMode(StateManager.PersistenceMode.USER);
            addUser(stateManager.getProperty("UserName").orElse("").toString());
            first = false;
        }
        app.getParticle().getToolBarActions().add(0, actionSignin);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionSignin);
    }
    
    public void addUser(String userName) {
        label.setText(resources.getString("label.text") + (userName.isEmpty() ? label.getText() : userName + ", " + label.getText()));
        stateManager.setProperty("UserName", userName);
    }
}