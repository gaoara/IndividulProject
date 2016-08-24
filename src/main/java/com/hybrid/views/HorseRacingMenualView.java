//package com.hybrid.views;
//
//import com.gluonhq.particle.annotation.ParticleView;
//import com.gluonhq.particle.view.View;
//
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.scene.Node;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.web.WebEngine;
//import javafx.scene.web.WebView;
//
//@ParticleView(name = "horsemenual", isDefault = false)
//public class HorseRacingMenualView implements View{
//
//	private AnchorPane root = new AnchorPane();
//	
//	WebView webView = new WebView();
//    WebEngine engine = webView.getEngine();
//    
//    @Override
//    public void init() {
//    	engine.getLoadWorker().progressProperty().addListener(new ChangeListener<Number>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
////				progress.setProgress(newValue.doubleValue());
//				System.out.println("loading..." + newValue.doubleValue());
//			}
//        });
//        
//        engine.load("file:///D:/03_Src/html/MyBrowser/project/html/horseRacing_menual.html");
//        
//        root.getChildren().add(webView);
//    }
//	
//	@Override
//	public Node getContent() {
//		return root;
//	}
//	
//}

package com.hybrid.views;
import java.io.File;

import com.gluonhq.particle.annotation.ParticleView;
import com.gluonhq.particle.view.View;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

@ParticleView(name = "horsemenual", isDefault = false)
public class HorseRacingMenualView implements View {  
    
    private BorderPane root = new BorderPane();
    private final VBox controls = new VBox(15);
    WebView webView = new WebView();
    WebEngine engine = webView.getEngine();

    @Override
    public void init() {
  
        controls.setAlignment(Pos.CENTER);
        
        root.setTop(controls);
        
        engine.load(new File("project/html/horseRacing_menual.html").toURI().toString());
        
        root.setCenter(webView);
    }

    @Override
    public Node getContent() {
        return root;
    }
}