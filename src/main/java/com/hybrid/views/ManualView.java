package com.hybrid.views;

import javax.inject.Inject;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.View;
import com.gluonhq.particle.view.ViewManager;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


@ParticleView(name = "manual", isDefault = false)
public class ManualView implements View {
//   public ManualView() {
//      super(manual.css);
//   }
    
  @Inject private ViewManager viewManager;
    
    private BorderPane root = new BorderPane();
    private final VBox controls = new VBox(15);
    WebView webView = new WebView();
    WebEngine engine = webView.getEngine();

    @Override
    public void init() {
    	
    	
    	
    	Button btn = new Button("����ȭ��");
    	
    	
    	String css = "-fx-background-color: white" ;    	
    	btn.setOnAction(e -> viewManager.switchView("primary"));
    	
    	btn.setStyle(css);
    	
    	controls.getChildren().addAll(btn);
      
        
        root.setTop(controls);
        
        engine.load("http://hyejin12.dothome.co.kr/minigame/manual.html");
        
        root.setCenter(webView);
    }

    @Override
    public Node getContent() {
        return root;
    }
    
}