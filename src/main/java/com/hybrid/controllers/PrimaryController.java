package com.hybrid.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import javax.inject.Inject;

import com.gluonhq.particle.view.ViewManager;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PrimaryController {

    
    @Inject private ViewManager viewManager;

    @FXML
    private ResourceBundle resources;   
    @FXML
    private Button manual;
    @FXML
    private BorderPane bp;
    @FXML
    private Label main;
    @FXML
    private GridPane gp;
    @FXML
    private HBox topbox;
    @FXML
    private HBox bottombox;
    @FXML
    private VBox leftbox;
    @FXML
    private VBox rightbox;
    @FXML
    private ImageView imgv1;
    @FXML
    private ImageView imgv2;
    @FXML
    private ImageView imgv3;
    @FXML
    private ImageView imgv4;
    @FXML
    private ImageView imgv5;
    @FXML
    private ImageView imgv6;
    @FXML
    private ImageView imgv7;
    @FXML
    private ImageView imgv8;
    @FXML
    private ImageView imgv9;
    @FXML
    private ImageView imgv10;
    @FXML
    private ImageView imgv11;
    @FXML
    private ImageView imgv12;
    @FXML
    private ImageView imgv13;
    @FXML
    private ImageView imgv14;
    @FXML
    private ImageView imgv15;
    @FXML
    private ImageView imgv16;

    @FXML
    private Button btnCancel2;
    @FXML
    private Label lbl;
    
    Stage primaryStage ;

    Image[] img = new Image[17];
    ImageView[] imgv = new ImageView[17];
    
	Image card;
	
	HashMap<Integer,String> map = new HashMap<>();
	
	ArrayList<String> arr = new ArrayList<>();

	public void initialize() {
		
		
		
		
		map.put(1, "1.png");
		map.put(2, "2.png");
		map.put(3, "3.png");
		map.put(4, "4.png");
		map.put(5, "5.png");
		map.put(6, "6.png");
		map.put(7, "7.png");
		map.put(8, "8.png");
		map.put(9, "1.png");
		map.put(10, "2.png");
		map.put(11, "3.png");
		map.put(12, "4.png");
		map.put(13, "5.png");
		map.put(14, "6.png");
		map.put(15, "7.png");
		map.put(16, "8.png");
		
		manual.setOnAction(e -> viewManager.switchView("manual"));
        
		for(int i=2; i<=16; i++){
			img[i]= new Image("card.png");
		}
        imgv1.setImage(new Image("1.png"));
        imgv2.setImage(img[2]);
        imgv3.setImage(img[3]);
        imgv4.setImage(img[4]);
        imgv5.setImage(img[5]);
        imgv6.setImage(img[6]);
        imgv7.setImage(img[7]);
        imgv8.setImage(img[8]);
        imgv9.setImage(img[9]);
        imgv10.setImage(img[10]);
        imgv11.setImage(img[11]);
        imgv12.setImage(img[12]);
        imgv13.setImage(img[13]);
        imgv14.setImage(img[14]);
        imgv15.setImage(img[15]);
        imgv16.setImage(img[16]);
          
		imgv[1]= new ImageView("1.png");
		imgv[2]= new ImageView("2.png");
		imgv[3]= new ImageView("3.png");
		imgv[4]= new ImageView("4.png");
		imgv[5]= new ImageView("5.png");
		imgv[6]= new ImageView("6.png");
		imgv[7]= new ImageView("7.png");
		imgv[8]= new ImageView("8.png");
		imgv[9]= new ImageView("1.png");
		imgv[10]= new ImageView("2.png");
		imgv[11]= new ImageView("3.png");
		imgv[12]= new ImageView("4.png");
		imgv[13]= new ImageView("5.png");
		imgv[14]= new ImageView("6.png");
		imgv[15]= new ImageView("7.png");
		imgv[16]= new ImageView("8.png");
		
        imgv1.setOnMouseClicked(e -> {
        	handleImage1();  
        		arr.add(map.get(1));
        		if(arr.size() >= 2) {
        			if(!arr.get(0).equals(arr.get(1))) {
        					img[1] = new Image("card.png");
        					handleImage1();
        					imgv1.setImage(img[1]);
        					img[2] = new Image("card.png");
        					imgv2.setImage(img[2]);
        					img[3] = new Image("card.png");
        					imgv3.setImage(img[3]);
        					img[4] = new Image("card.png");
        					imgv4.setImage(img[4]);
        					img[5] = new Image("card.png");
        					imgv5.setImage(img[5]);
        					img[6] = new Image("card.png");
        					imgv6.setImage(img[6]);
        					img[7] = new Image("card.png");
        					imgv7.setImage(img[7]);
        					img[8] = new Image("card.png");
        					imgv8.setImage(img[8]);
        					img[9] = new Image("card.png");
        					imgv9.setImage(img[9]);
        					img[10] = new Image("card.png");
        					imgv10.setImage(img[10]);
        					img[11] = new Image("card.png");
        					imgv11.setImage(img[11]);
        					img[12] = new Image("card.png");
        					imgv12.setImage(img[12]);
        					img[13] = new Image("card.png");
        					imgv13.setImage(img[13]);
        					img[14] = new Image("card.png");
        					imgv14.setImage(img[14]);
        					img[15] = new Image("card.png");
        					imgv15.setImage(img[15]);
        					img[16] = new Image("card.png");
        					imgv16.setImage(img[16]);
        				arr.clear();
				}
        			arr.clear();
			} System.out.println(arr.size());
        });
        imgv2.setOnMouseClicked(e -> {
            handleImage2();
        	arr.add(map.get(2));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[2] = new Image("card.png");
					imgv2.setImage(img[2]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr.size());
        });
        imgv3.setOnMouseClicked(e -> {
            handleImage3();
            arr.add(map.get(3));
            if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[3] = new Image("card.png");
					imgv3.setImage(img[3]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv4.setOnMouseClicked(e -> {
            handleImage4();
        	arr.add(map.get(4));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[4] = new Image("card.png");
					imgv4.setImage(img[4]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv5.setOnMouseClicked(e -> {
        	handleImage5();
        	arr.add(map.get(5));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[5] = new Image("card.png");
					imgv5.setImage(img[5]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv6.setOnMouseClicked(e -> {
            handleImage6();
        	arr.add(map.get(6));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[6] = new Image("card.png");
					imgv6.setImage(img[6]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv7.setOnMouseClicked(e -> {
            handleImage7();
        	arr.add(map.get(7));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[7] = new Image("card.png");
					imgv7.setImage(img[7]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv8.setOnMouseClicked(e -> {
            handleImage8();
        	arr.add(map.get(8));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[8] = new Image("card.png");
					imgv8.setImage(img[8]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv9.setOnMouseClicked(e -> {
        	handleImage9();
        	arr.add(map.get(9));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[9] = new Image("card.png");
					imgv9.setImage(img[9]);
    				arr.clear();
    			}
    			alret();
    			arr.clear();
			} System.out.println(arr);
        });
        imgv10.setOnMouseClicked(e -> {
            handleImage10();
        	arr.add(map.get(10));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[10] = new Image("card.png");
					imgv10.setImage(img[10]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv11.setOnMouseClicked(e -> {
            handleImage11();
        	arr.add(map.get(11));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[11] = new Image("card.png");
					imgv11.setImage(img[11]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv12.setOnMouseClicked(e -> {
            handleImage12();
        	arr.add(map.get(12));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[12] = new Image("card.png");
					imgv12.setImage(img[12]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv13.setOnMouseClicked(e -> {
        	handleImage13();
        	arr.add(map.get(13));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[13] = new Image("card.png");
					imgv13.setImage(img[13]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv14.setOnMouseClicked(e -> {
            handleImage14();
        	arr.add(map.get(14));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[14] = new Image("card.png");
					imgv14.setImage(img[14]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
        imgv15.setOnMouseClicked(e -> {
            handleImage15();
        	arr.add(map.get(15));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[15] = new Image("card.png");
					imgv15.setImage(img[15]);
    				arr.clear();
    			}
    			arr.clear();
        	}
        	System.out.println(arr);
        });
        imgv16.setOnMouseClicked(e -> {
            handleImage16();
        	arr.add(map.get(16));
        	if(arr.size()>=2) {
    			if(!arr.get(0).equals(arr.get(1))) {
    				img[16] = new Image("card.png");
					imgv16.setImage(img[16]);
    				arr.clear();
    			}
    			arr.clear();
			} System.out.println(arr);
        });
	}
	
	private void alret() {
		Stage stage = new Stage(StageStyle.UTILITY);
	      stage.initModality(Modality.WINDOW_MODAL);
	      stage.initOwner(primaryStage);

	      Parent pane = null;
	      
	      try {
	      pane = FXMLLoader.load(getClass().getResource("../views/secondary.fxml"));
	      
	      Button btnCancel = (Button) pane.lookup("#btnCancel");
	    
	      
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
       
	private void handleImage1(){
		img[1] = new Image("1.png");
    	imgv1.setImage(img[1]);	
	}
	private void handleImage2(){
		img[2] = new Image("2.png");
    	imgv2.setImage(img[2]);
	}
	private void handleImage3(){
		img[3] = new Image("3.png");
    	imgv3.setImage(img[3]);
	}
	private void handleImage4(){
		img[4] = new Image("4.png");
    	imgv4.setImage(img[4]);
	}
	private void handleImage5(){
		img[5] = new Image("5.png");
    	imgv5.setImage(img[5]);
	}
	private void handleImage6(){
		img[6] = new Image("6.png");
    	imgv6.setImage(img[6]);
	}
	private void handleImage7(){
		img[7] = new Image("7.png");
    	imgv7.setImage(img[7]);
	}
	private void handleImage8(){
		img[8] = new Image("8.png");
    	imgv8.setImage(img[8]);
	}
	private void handleImage9(){
		img[9] = new Image("1.png");
    	imgv9.setImage(img[9]);
	}
	private void handleImage10(){
		img[10] = new Image("2.png");
    	imgv10.setImage(img[10]);
	}
	private void handleImage11(){
		img[11] = new Image("3.png");
    	imgv11.setImage(img[11]);
	}
	private void handleImage12(){
		img[12] = new Image("4.png");
    	imgv12.setImage(img[12]);
	}
	private void handleImage13(){
		img[13] = new Image("5.png");
    	imgv13.setImage(img[13]);
	}
	private void handleImage14(){
		img[14] = new Image("6.png");
    	imgv14.setImage(img[14]);
	}
	private void handleImage15(){
		img[15] = new Image("7.png");
    	imgv15.setImage(img[15]);
	}
	private void handleImage16(){
		img[16] = new Image("8.png");
    	imgv16.setImage(img[16]);
	}
	private void handleCard1(){
		for(int i=1; i<17; i++){
			img[1] = new Image("card.png");
			imgv[1].setImage(img[1]);
		}
	}
	public void postInit() {
    }
    public void dispose() {	 
       }
    public void addUser(String userName) {
    }
}