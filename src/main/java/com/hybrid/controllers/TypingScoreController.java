package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.hybrid.rank.TypingRank;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class TypingScoreController {

	  @Inject ParticleApplication app;
	    
	    @Inject private ViewManager viewManager;

	    @FXML
	    private BorderPane borderPane;
	    
	    @FXML
	    private HBox hbox;
	    
	    @FXML
	    private Button btnEasy;
	    
	    @FXML
	    private Button btnNormal;
	    
	    @FXML
	    private Button btnHard;
	    
	    @FXML
	    private ResourceBundle resources;
	    
	    @FXML
	    private TableView<TypingRank> rankView;
	    
	    @FXML
	    private TableColumn<TypingRank, String> RankName;
	    
	    @FXML
	    private TableColumn<TypingRank, String> RankScore;
	    
	    private Action actionHome;
	    
	    public ObservableList<TypingRank> easyorank;
	    public ObservableList<TypingRank> normalorank;
	    public ObservableList<TypingRank> hardorank;
	    public List<TypingRank> ranks;
		private Stage primaryStage;
		
	    public void initialize() {
    		ActionMap.register(this);
    		
    		ranks = new ArrayList<>();
    		ranks.add(new TypingRank("윤진아", "400"));
    		
			
			
    		
    		TableColumn<TypingRank, ?> RankName = rankView.getColumns().get(0);
    		TableColumn<TypingRank, ?> RankScore = rankView.getColumns().get(1);
    		
    		RankName.setCellValueFactory(new PropertyValueFactory<>("RankName"));
    		RankScore.setCellValueFactory(new PropertyValueFactory<>("RankScore"));
    		
    		btnEasy.setOnAction(e->{
    			easyorank = FXCollections.observableArrayList(TypingEasyController.list);
	    		rankView.setItems(easyorank);
    		});
    			
    		btnNormal.setOnAction(e->{
    			normalorank = FXCollections.observableArrayList(TypingNormalController.list);
    			rankView.setItems(normalorank);
    		});
    		btnHard.setOnAction(e->{
    			hardorank = FXCollections.observableArrayList(TypingHardController.list);
    			rankView.setItems(hardorank);
			});
	    }
	    
	    public void postInit() {
	        app.getParticle().getToolBarActions().add(0, actionHome);
	        
	    }
	    
	    public void dispose() {
	        app.getParticle().getToolBarActions().remove(actionHome);
	    }

		public Stage getPrimaryStage() {
			return primaryStage;
		}

		public void setPrimaryStage(Stage primaryStage) {
			this.primaryStage = primaryStage;
		}
    
}
