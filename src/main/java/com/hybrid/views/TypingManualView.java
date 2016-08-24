package com.hybrid.views;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.View;
import com.gluonhq.particle.view.ViewManager;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.net.MalformedURLException;

import javax.inject.Inject;

@ParticleView(name = "typingmanual", isDefault = false)
public class TypingManualView implements View {
//	public ManualView() {
//		super(manual.css);
//	}
    
    @Inject private ViewManager viewManager;
    
    private BorderPane root = new BorderPane();
    private final VBox controls = new VBox(15);
    WebView webView = new WebView();
    WebEngine engine = webView.getEngine();

    @Override
    public void init() {
        Button btn = new Button("Back");
        
        String css= "-fx-background-color: antiquewhite; \n" +
        		   "-fx-border-color: steelblue; \n" +
        		   "-fx-border-style: solid; \n" +
        		   "-fx-border-width: 2px; \n" +
        		   "-fx-border-radius: 10px;";
        
        btn.setStyle(css);
        
        btn.setOnAction(e -> viewManager.switchView("typingmain"));
        
        controls.getChildren().addAll(btn);
        controls.setAlignment(Pos.CENTER);
        
        root.setTop(controls);
        
        try {
			engine.load(new File("project/html/manual.html").toURL().toString());
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}

        
        root.setCenter(webView);
    }

    @Override
    public Node getContent() {
        return root;
    }
    
}
