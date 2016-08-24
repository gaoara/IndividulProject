package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.hybrid.rank.TypingRank;
import com.hybrid.thread.TypingEasyThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.inject.Inject;

import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class TypingEasyController extends Thread {

    @Inject ParticleApplication app;
    
    @Inject private ViewManager viewManager;

    @FXML
    private BorderPane borderPane;

    @FXML
    private Button btnMain;
    
    @FXML
    private Button button1;
    
    @FXML
    private TextArea textArea;
    
    @FXML
    private HBox hbox;
    
    @FXML
    private Button btnStart;
    
    @FXML
    private Button btnStop;
    
    @FXML
    private TextArea txtArea;
    
    @FXML
	public Label lblScore;
    
    @FXML
	public Label lblheart1;
    
    @FXML
    public Label lblheart2;

    @FXML
    public Label lblheart3;
    
    @FXML
    private ResourceBundle resources;
    
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private TextField txtField;
    
    TypingScoreController score;
    TypingEasyThread easy;
    ThreadGroup group;
    public HashMap<String, TypingEasyThread> map = new HashMap<>();
    private Action actionHome;

    Random r = new Random();
    public ArrayList<Label> lbl;

	Stage primaryStage;
	
	public static List<TypingRank> list;
	
	public void handleLogin(ActionEvent event){
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(primaryStage);
		stage.setTitle("Login");

		Parent pane = null;
		
		try {
		pane = FXMLLoader.load(getClass().getResource("../views/typingform.fxml"));
		
		Button btnAdd2 = (Button) pane.lookup("#btnAdd2");
		Button btnCancel = (Button) pane.lookup("#btnCancel");
		TextField txtName = (TextField) pane.lookup("#txtName");
		
		btnAdd2.setOnAction(event1 ->{
			TypingRank s = new TypingRank(txtName.getText(), lblScore.getText());
			
			list.add(s);
			stage.close();
		});
		
		btnCancel.setOnAction(event2 ->{
			stage.close();
		});
		
	} catch (Exception e1) {
		e1.printStackTrace();
	}
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}
	
	public void gameOver(){
		Stage stage = new Stage(StageStyle.UTILITY);
		stage.initModality(Modality.WINDOW_MODAL);
		stage.initOwner(primaryStage);
		stage.setTitle("GameOver");

		Parent pane = null;
		
		try {
		pane = FXMLLoader.load(getClass().getResource("../views/typingover.fxml"));
		
		Button btnOk = (Button) pane.lookup("#btnOk");
		
		btnOk.setOnAction(event1 ->{
			stage.close();
			handleLogin(event1);
		});
		
	} catch (Exception e1) {
		e1.printStackTrace();
	}
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}
	
    public void initialize() {
    	
    	list = new ArrayList<>();
    	
    	ActionMap.register(this);
    	actionHome =  ActionMap.action("goHome");
    	btnStop.setDisable(true);
    	txtField.setDisable(true);
    	
        btnMain.setOnAction(e -> {
    		viewManager.switchView("typingmain");
    			group.interrupt();
	    		easy.a1.setVisible(false);
	    		anchorPane.getChildren().clear();
	    		btnStart.setDisable(false);
	    		btnStop.setDisable(true);
	    		map.clear();
	    		lbl.clear();
		});
        
		btnStart.setOnAction(e->{
			txtField.setDisable(false);
			btnStart.setDisable(true);
	    	btnStop.setDisable(false);
			lblScore.setText("0");
			
			lbl = new ArrayList<>();
	    	lbl.add(lblheart1);
	    	lbl.add(lblheart2);
	    	lbl.add(lblheart3);
	    	lblheart1.setVisible(true);
	    	lblheart2.setVisible(true);
	    	lblheart3.setVisible(true);
	    	
			group = new ThreadGroup("group");
			for(int i=0; i<10; i++){
				final int ii = i;
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						System.out.println(map.size());
						System.out.println(map);
						easy = new TypingEasyThread(group, anchorPane, lblScore, lbl, TypingEasyController.this); //EasyThread new
						if(map.containsKey(easy.a1.getText())){
							easy = new TypingEasyThread(group, anchorPane, lblScore, lbl, TypingEasyController.this);
							map.put(easy.a1.getText(), easy);//map에 키와 값 추가
							easy.sleep = ii;
						}
						else{
							map.put(easy.a1.getText(), easy);//map에 키와 값 추가
							easy.sleep = ii;
						}
						easy.setDaemon(true);
						easy.start();
					}
				});
			}
		});
		
		txtField.setOnAction(e1->{
			String s = txtField.getText();
				if(map.containsKey(s)){
					TypingEasyThread value = map.get(s);
					txtField.setText("");
					lblScore.setText(String.valueOf(Integer.parseInt(lblScore.getText()) + 10));
					map.remove(s);
					value.interrupt();
					value.a1.setVisible(false);

					easy = new TypingEasyThread(group, anchorPane, lblScore, lbl, TypingEasyController.this);
					if(map.containsKey(easy.a1.getText())){
						easy = new TypingEasyThread(group, anchorPane, lblScore, lbl, TypingEasyController.this);
						map.put(easy.a1.getText(), easy);//map에 키와 값 추가
					}
					else{
						map.put(easy.a1.getText(), easy);
					}
					easy.start();
					
				}
				else{
					txtField.setText("");
					if(!map.containsKey(txtField.getText())){
							lostHeart();
						if(lbl.size() == 0){
							gameStop();
							gameOver();
						}
					}
				}
		});
		
        btnStop.setOnAction(e -> {
        	gameStop();
        	handleLogin(e);
        });
    }

    public void lostHeart(){
		lbl.get(0).setVisible(false);
		lbl.remove(0);
    }
    
    public void gameStop(){
    	group.interrupt();
		map.clear();
		anchorPane.getChildren().clear();
		btnStart.setDisable(false);
		btnStop.setDisable(true);
		txtField.setDisable(true);
    }
    
    public void postInit() {
        app.getParticle().getToolBarActions().add(0, actionHome);
    }
    
    public void dispose() {
    	gameStop();
        app.getParticle().getToolBarActions().remove(actionHome);
    }
}
