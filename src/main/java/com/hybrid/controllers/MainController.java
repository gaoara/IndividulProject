
package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.hybrid.actions.MenuActions;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;

import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class MainController {

    @FXML
    private Button btnSelect;
    @FXML
    private Button btnSelect2;
    @FXML
    private Button btnSelect3;
    @FXML
    private Button btnSelect4;
    @FXML
    private Button btnSelect5;
    @FXML
    private WebView hybrid;
    @FXML
    private ResourceBundle resources;
    
    WebEngine engine;
    
    public void initialize() {
    	System.out.println("EmpController initialize()...");
       
    	engine = hybrid.getEngine();
    	engine.setOnAlert(new EventHandler<WebEvent<String>>() {
         
        @Override
        public void handle(WebEvent<String> event) {
        	System.out.println(event.getData());
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Alert");
            alert.setHeaderText("Hybrid Alert");
            alert.setContentText(event.getData());
            alert.showAndWait();
         	}
    	});
	    try {
			engine.load(new File("project/html/mainpage.html").toURL().toString());
		} catch (MalformedURLException e2) {
			e2.printStackTrace();
		}    
	    engine.getLoadWorker().stateProperty().addListener(new ChangeListener<State>() {
	    	
	    	@Override
	    	public void changed(ObservableValue<? extends State> observable, State oldValue, State newValue) {
	    		System.out.println("Worker.State" + newValue);
	    	}
	    });
       
        btnSelect.setOnAction(e -> {
           System.out.println("btnSelect Clicked...");
           viewManager.switchView("horsestart");
        });
        
        btnSelect2.setOnAction(e -> {
        	System.out.println("btnSelect2 Clicked...");
        	viewManager.switchView("typingmain");
        });
        
        btnSelect3.setOnAction(e -> {
            System.out.println("btnSelect3 Clicked...");
            viewManager.switchView("baseballmain");
         });
        
        btnSelect4.setOnAction(e -> {
        	System.out.println("btnSelect4 Clicked...");
        	Alert alert = new Alert(AlertType.INFORMATION);
 	        alert.setTitle("MINIGAMES");
 	        alert.setHeaderText("2016년 7월 16일 출시!");
 	        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
 	        alert.setContentText("[점검중]");
 	        alert.showAndWait();
        });
        
        btnSelect5.setOnAction(e -> {
            System.out.println("btnSelect5 Clicked...");
            viewManager.switchView("game");
         });
    }
    
    /*
     * Gluon Framework 관련
     */
    
    @Inject ParticleApplication app;
    @Inject private ViewManager viewManager;
    @Inject MenuBar menuBar;
    private Action actionHome; 
    private Menu menu;
    
    public void init() {
       ActionMap.register(this);
       actionHome =  ActionMap.action("goMain");
//       menu = menuBar.getMenus().remove(menuBar.getMenus().size()-1);
   }
    
    public void postInit() {
        app.getParticle().getToolBarActions().add(actionHome);//add(0, actionHome) 하면 숫자가 앞에 위치하게 만듬.
//        removeMenu();
//        menuBar.getMenus().add(menu);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionHome);
//        removeMenu();
    }
    void removeMenu(){
       for (int i = 0; i < menuBar.getMenus().size(); i++) {
          if(menuBar.getMenus().get(i).getText().equals(menu.getText())){
             menuBar.getMenus().remove(i);
             i--;
          }
       }
    }
    @ActionProxy(text = "GoMain")
    private void goHome() {
    	viewManager.switchView("main");
    }
    @ActionProxy(text = "Clear")
    private void clear() {
        System.out.println("EmpController.clear()...");
    }
    @ActionProxy(text = "Item")
    private void item() {
        System.out.println("EmpController.item2()...");
    }
}
