package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.hybrid.actions.MenuActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class BaseballController {


    @FXML private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnInput, btnCancel, btnReset, btnExit;
    @FXML private Label text1, text2, text3, score;
    @FXML private TextArea label;
    @FXML private ResourceBundle resources;
       
    List<String> list = new ArrayList<String>();
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> strike = new ArrayList<>();
    List<Integer> ball = new ArrayList<>();
   
    int count = 0;
    
    public void InputUserNumber(String num) {
		
		if (text1.getText().equals("")) {
			text1.setText(num);
			list.add(num);
			return;
		}
		if (text2.getText().equals("")) {
			if(list.get(0) == num) {
				System.out.println("중복입니다.");
				Alert alert = new Alert(AlertType.INFORMATION);
		        alert.setTitle("중복");
		        alert.setHeaderText("숫자 중복은 안됩니다.");
		        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/ball.png").toExternalForm(), 48, 48, true, true)));
		        alert.setContentText("중복되지 않는 숫자로 클릭해 주세요");
		        alert.showAndWait();
				return;
			}else{
			text2.setText(num);
			list.add(num);
			}
			return;
		}
		if (text3.getText().equals("")) {
			if(list.get(0) == num || list.get(1) == num) {
				System.out.println("중복입니다.");
				Alert alert = new Alert(AlertType.INFORMATION);
		        alert.setTitle("중복");
		        alert.setHeaderText("숫자 중복은 안됩니다.");
		        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/ball.png").toExternalForm(), 48, 48, true, true)));
		        alert.setContentText("중복되지 않는 숫자로 클릭해 주세요");
		        alert.showAndWait();
				return;
			} else {
			text3.setText(num);
			list.add(num);
			}
			return;
		}
		
   	}
   	
    public void ComputerNumber() {
    	Random r = new Random();
    	for (int i=0; i<3; i++){
    		list1.add(i, r.nextInt(9));
    		if( i==1 && list1.get(0)==list1.get(i)){
    			list1.remove(1);
    			list1.add(1, r.nextInt(9));
    		} else if ( i==2 && (list1.get(0)==list1.get(i) || list1.get(1)==list1.get(i))) {
    			list1.remove(2);
    			list1.add(2, r.nextInt(9));
    		}
    	}
   	}
    
    public void initialize() {
    	
    	ComputerNumber();
    	
    	btn1.setOnAction(e -> { InputUserNumber("1"); });
    	btn2.setOnAction(e -> { InputUserNumber("2"); });
    	btn3.setOnAction(e -> { InputUserNumber("3"); });
    	btn4.setOnAction(e -> { InputUserNumber("4"); });
    	btn5.setOnAction(e -> { InputUserNumber("5"); });
    	btn6.setOnAction(e -> {	InputUserNumber("6"); });
    	btn7.setOnAction(e -> {	InputUserNumber("7"); });
    	btn8.setOnAction(e -> {	InputUserNumber("8"); });
    	btn9.setOnAction(e -> {	InputUserNumber("9"); });
    	btn0.setOnAction(e -> { InputUserNumber("0"); });
    	
    	
    	btnInput.setOnAction(e -> {
    		count++;
			score.setText(count + "회");
			
			if(Integer.parseInt(list.get(0)) == list1.get(0)){
				strike.add(1);
			}if(Integer.parseInt(list.get(1)) == list1.get(1)){
				strike.add(1);
			}if(Integer.parseInt(list.get(2)) == list1.get(2)){
				strike.add(1);
			}if(Integer.parseInt(list.get(0)) == list1.get(1)){
				ball.add(1);
			}if(Integer.parseInt(list.get(0)) == list1.get(2)){
				ball.add(1);
			}if(Integer.parseInt(list.get(1)) == list1.get(0)){
				ball.add(1);
			}if(Integer.parseInt(list.get(1)) == list1.get(2)){
				ball.add(1);
			}if(Integer.parseInt(list.get(2)) == list1.get(0)){
				ball.add(1);
			}if(Integer.parseInt(list.get(2)) == list1.get(1)){
				ball.add(1);
			}
			System.out.println(list1.get(0) + " , " + list1.get(1) + ", " + list1.get(2));
			label.appendText(list.get(0) + ", " + list.get(1) + ", " + list.get(2) +  " : " + strike.size() + "strike" + " , " + ball.size() + "ball" + "\n");
			if (strike.size() == 3) {
				System.out.println("경기에서 승리 하셨습니다.");
				Alert alert = new Alert(AlertType.INFORMATION);
		        alert.setTitle("Winner");
		        alert.setHeaderText("경기에서 승리 하셨습니다.");
		        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/ball.png").toExternalForm(), 48, 48, true, true)));
		        alert.setContentText("축하합니다. 경기에서 승리하셨습니다.");
		        alert.showAndWait();
		        text1.setText("");
				text2.setText("");
				text3.setText("");
				score.setText("");
				list.clear();
				list1.clear();
				label.clear();
				count = 0;
				ComputerNumber();
			}
			if (count == 10) {
				System.out.println("경기에서 패배 하셨습니다.");
				Alert alert = new Alert(AlertType.INFORMATION);
		        alert.setTitle("Game Over");
		        alert.setHeaderText("경기에서 패배 하셨습니다.");
		        alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/ball.png").toExternalForm(), 48, 48, true, true)));
		        alert.setContentText("9회만에 스트라이크를 잡지 못했습니다.");
		        alert.showAndWait();
		        text1.setText("");
				text2.setText("");
				text3.setText("");
				score.setText("");
				list.clear();
				list1.clear();
				label.clear();
				count = 0;
				ComputerNumber();

			} 
			text1.setText("");
			text2.setText("");
			text3.setText("");
			list.clear();
			strike.clear();
			ball.clear();
    	});
    	btnCancel.setOnAction(e -> {
			System.out.println("Cancel");
			text1.setText("");
			text2.setText("");
			text3.setText("");
    	});
    	btnReset.setOnAction(e -> {
			System.out.println("Reset");
	        text1.setText("");
			text2.setText("");
			text3.setText("");
			score.setText("");
			list.clear();
			list1.clear();
			label.clear();
			count = 0;
			ComputerNumber();
    	});
    	btnExit.setOnAction(e -> {
			viewManager.switchView("baseballmain");
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
        list.clear();
        list1.clear();
        label.clear();
        text1.setText("");
		text2.setText("");
		text3.setText("");
		count = 0;
		ComputerNumber();
    }
}
