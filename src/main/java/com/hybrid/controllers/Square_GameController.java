package com.hybrid.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.hybrid.student.Square_Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Square_GameController {

@Inject ParticleApplication app;
    @Inject private ViewManager viewManager;
    @FXML private Pane gamePane;
    @FXML private Button btn1;    
    @FXML private Button btn2; 
    @FXML private Button chart;
    @FXML private Button rank;
    @FXML private Button btnBack;  
    @FXML private Button button; 
    @FXML private TextField textField;
    @FXML private Label scoreLabel;  
    @FXML private Label nameLabel;  
    @FXML private TextField tf00;
    @FXML private TextField tf10;
    @FXML private TextField tf20;
    @FXML private TextField tf01;
    @FXML private TextField tf11;
    @FXML private TextField tf21;
    @FXML private TextField tf02;
    @FXML private TextField tf12;
    @FXML private TextField tf22;
    @FXML TableView<Square_Student> tbView;
    
    Stage primaryStage;
    
    @FXML private ResourceBundle resources;
    private Action actionHome;
    
    int correct;
    int incorrect;
    double score;
    double maptoscore;
    int maptocorrect;
    int maptoincorrect;
    String myName;
    
	List<Square_Student> students = new ArrayList<>();
	ObservableList<Square_Student> stu = FXCollections.observableArrayList(students);
	@SuppressWarnings("unchecked")
	
	public void start(){
	Stage stage = new Stage(StageStyle.UTILITY);
	stage.initModality(Modality.WINDOW_MODAL);
	stage.initOwner(primaryStage);
	stage.setTitle("This is stage");
	
	Parent pane = null;
	
	
	try {
		
		pane = FXMLLoader.load(getClass().getResource("/com/hybrid/views/square_userRegistration.fxml"));
		
		TextField txtname = (TextField) pane.lookup("#textField");
		Button button = (Button) pane.lookup("#button");
		
		
		
		button.setOnAction(event1 ->{
			System.out.println("이름 :"+ txtname.getText());
			myName = txtname.getText();
			nameLabel.setText("Hi, "+myName+" :)");
			stage.close();
		});
		
		
	} catch (Exception e1) {
		e1.printStackTrace();
	}
	Scene scene = new Scene(pane);
	stage.setScene(scene);
	stage.show();
	}
	
	
	public void initialize() {
		
		start();

    	correct = 0;
    	incorrect = 0;
    	score = 0;
    	
    	int random; 
    	int squareSize = 3;
    	
    	Integer[] arr = new Integer[squareSize];
    	Random r = new Random();
        
        int[][] ar = new int[squareSize][squareSize];
        
        int row = 0 , column = ar.length/2 ;
		
		for(int number=1; number<=squareSize*squareSize; number++){
			
			ar[row][column] = number;
			
			int mng = number-(number/squareSize)*squareSize;
			
			if(mng==0){
				row = row + 1;
			}else{
				row = row -1;
				column = column +1;
				
				if(row<0) {
					row = squareSize-1;
				}
				
				if(column>squareSize-1){
					column = 0;
				}
				
			}
			}
    	
    	tf00.setText(ar[0][0]+"");
    	tf01.setText(ar[0][1]+"");
    	tf02.setText(ar[0][2]+"");
    	tf10.setText(ar[1][0]+"");
    	tf11.setText(ar[1][1]+"");
    	tf12.setText(ar[1][2]+"");
    	tf20.setText(ar[2][0]+"");
    	tf21.setText(ar[2][1]+"");
    	tf22.setText(ar[2][2]+"");
    	
    	
    	for (int i = 0; i < arr.length; i++) {
			random = r.nextInt(squareSize*squareSize); // 0 ~ 8 
			arr[i]= random;
			
			while(( i>0 && arr[i].equals(arr[i-1]) ) || (i>1 && arr[i].equals(arr[i-2]))){
		    	random = r.nextInt(9);
		    	arr[i] = random;
		    	System.out.println("중복처리");
			}
			
 		}

    	for (int j = 0; j < arr.length; j++) {
			
    		switch (arr[j]) {
	    		case 0: tf00.setText(""); break;
	    		case 1: tf10.setText(""); break;
	    		case 2: tf20.setText(""); break;
	    		case 3: tf01.setText(""); break;
	    		case 4: tf11.setText(""); break;
	    		case 5: tf21.setText(""); break;
	    		case 6: tf02.setText(""); break;
	    		case 7: tf12.setText(""); break;
	    		case 8: tf22.setText(""); break;
	    		default:
	    			break;
	    		}
		}
    	
    	scoreLabel.setText("Submit");
    	
        ActionMap.register(this);
        
        btn1.setOnAction(e ->{
        	initialize();
        });
        
        btn2.setOnAction(e -> { // Submit 제출하기 버튼 눌렀을 떄
      	
        	correct = 0;
        	incorrect = 0;
        	score = 0;
        	
        	if (tf00.getText().equals(ar[0][0]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	if (tf10.getText().equals(ar[1][0]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	if (tf20.getText().equals(ar[2][0]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	if (tf01.getText().equals(ar[0][1]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	if (tf11.getText().equals(ar[1][1]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	if (tf21.getText().equals(ar[2][1]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	if (tf02.getText().equals(ar[0][2]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	if (tf12.getText().equals(ar[1][2]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			} 
        	
        	if (tf22.getText().equals(ar[2][2]+"")) {
        		correct=correct+1;
        		System.out.println("O");
			}else {
        		incorrect=incorrect+1;
        		System.out.println("X");
			}
        	
        	
        	score = Math.round(((correct*1.0)/(correct+incorrect))*100);
        	nameLabel.setText(myName+"'s score : "+score);
        	
        	System.out.println(correct);
        	System.out.println(incorrect);
        	System.out.println(score);
        	
        	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        	Date d = new Date();
        	String date = format.format(d);
        	
        	Square_Student s = new Square_Student(date, score, correct, incorrect);//***********************************배열들어가는 부분
			stu.add(s);
			
		
			maptoscore = stu.stream()
					.mapToDouble(Square_Student::getScore)
					.average()
					.getAsDouble();
			
			System.out.println("avg score:"+maptoscore);
			
			maptocorrect = stu.stream()
					.mapToInt(Square_Student::getCorrect)
					.sum();
					
			
			System.out.println("sum correct:"+maptocorrect);
			
			maptoincorrect = stu.stream()
					.mapToInt(Square_Student::getIncorrect)
					.sum();
					
			
			System.out.println("sum correct:"+maptoincorrect);

        });
        
        chart.setOnAction(event ->{ 				// 차트 버튼 눌렀을 때
        	
			Stage stage1 = new Stage(StageStyle.UTILITY);
			stage1.initModality(Modality.WINDOW_MODAL);
			stage1.initOwner(primaryStage);
			stage1.setTitle("chart");

			Parent pane1 = null;
			
			try {
				pane1 = FXMLLoader.load(getClass().getResource("/com/hybrid/views/square_chart.fxml"));
				PieChart pieChart = (PieChart) pane1.lookup("#pieChart");
				Button btnBack = (Button) pane1.lookup("#btnBack");
				
				btnBack.setOnAction(event1 ->{ 
					stage1.close();
				});
				
				
				PieChart.Data data = new PieChart.Data("정답", maptocorrect);
				PieChart.Data data1 = new PieChart.Data("오답", maptoincorrect);
				
				
				ObservableList<Data> value = FXCollections.observableArrayList(data,data1);
				pieChart.setData(value);
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Scene scene1 = new Scene(pane1);
			stage1.setScene(scene1);
			stage1.show();
        });
        
        rank.setOnAction(event ->{ 
        	Stage stage2 = new Stage(StageStyle.UTILITY);
			stage2.initModality(Modality.WINDOW_MODAL);
			stage2.initOwner(primaryStage);
			stage2.setTitle("chart");
			
			Parent pane2 = null;
			try {
				pane2 = FXMLLoader.load(getClass().getResource("/com/hybrid/views/square_rank.fxml"));
				Button btnBack = (Button) pane2.lookup("#btnBack2");
				
				TableView<Square_Student> tbView = (TableView<Square_Student>) pane2.lookup("#tbView");
				
				tbView.setItems(stu);
				
				for (Square_Student s : stu)
					System.out.println(s);
				
				TableColumn<Square_Student, String> name = (TableColumn<Square_Student, String>) tbView.getColumns().get(0);
				TableColumn<Square_Student, Double> score = (TableColumn<Square_Student, Double>) tbView.getColumns().get(1);
				TableColumn<Square_Student, Integer> correct = (TableColumn<Square_Student, Integer>) tbView.getColumns().get(2);
				TableColumn<Square_Student, Integer> incorrect = (TableColumn<Square_Student, Integer>) tbView.getColumns().get(3);
				
				name.setCellValueFactory(new PropertyValueFactory<Square_Student, String>("name"));
				score.setCellValueFactory(new PropertyValueFactory<Square_Student, Double>("score"));
				correct.setCellValueFactory(new PropertyValueFactory<Square_Student, Integer>("correct"));
				incorrect.setCellValueFactory(new PropertyValueFactory<Square_Student, Integer>("incorrect"));
				
				btnBack.setOnAction(event1 ->{ 
					stage2.close();
				});
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Scene scene2 = new Scene(pane2);
			stage2.setScene(scene2);
			stage2.show();
			
        });
        
    }
    


	public void postInit() {
        app.getParticle().getToolBarActions().add(0, actionHome);
    }
    
    public void dispose() {
        app.getParticle().getToolBarActions().remove(actionHome);
    }
    

    
}