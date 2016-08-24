package com.hybrid.views;

import java.io.File;
import java.net.MalformedURLException;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.View;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

@ParticleView(name = "baseballmanual", isDefault = false)
public class BaseballmanualView implements View {
    
    
    private BorderPane root = new BorderPane();
    private final VBox controls = new VBox(15);
    WebView webView = new WebView();
    WebEngine engine = webView.getEngine();

    @Override
    public void init() {
       
        controls.setAlignment(Pos.CENTER);
        
        root.setTop(controls);
        
        try {
			engine.load(new File("project/html/baseballmanual.html").toURL().toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
        
        root.setCenter(webView);
    }

    @Override
    public Node getContent() {
        return root;
    }
    
}