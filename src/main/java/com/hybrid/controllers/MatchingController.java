package com.hybrid.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;

import javax.inject.Inject;

import org.controlsfx.control.action.ActionMap;

import com.gluonhq.particle.view.ViewManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MatchingController {

    @Inject private ViewManager viewManager;
    
    private boolean first = true;
    
    @FXML private ResourceBundle resources;   
    @FXML private BorderPane bp;
    @FXML private HBox topbox;
    @FXML private HBox bottombox;
    @FXML private VBox leftbox;
    @FXML private VBox rightbox;
    @FXML private GridPane gp;
    @FXML private Label main;
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button manual;
    @FXML private ImageView imgv1;
    @FXML private ImageView imgv2;
    @FXML private ImageView imgv3;
    @FXML private ImageView imgv4;
    @FXML private ImageView imgv5;
    @FXML private ImageView imgv6;
    @FXML private ImageView imgv7;
    @FXML private ImageView imgv8;
    @FXML private ImageView imgv9;
    @FXML private ImageView imgv10;
    @FXML private ImageView imgv11;
    @FXML private ImageView imgv12;
    @FXML private ImageView imgv13;
    @FXML private ImageView imgv14;
    @FXML private ImageView imgv15;
    @FXML private ImageView imgv16;
    @FXML private ImageView imgv17;
    @FXML private ImageView imgv18;
    @FXML private ImageView imgv19;
    @FXML private ImageView imgv20;
    @FXML private ImageView imgv21;
    @FXML private ImageView imgv22;
    @FXML private ImageView imgv23;
    @FXML private ImageView imgv24;
    @FXML private ImageView imgv25;
    @FXML private ImageView imgv26;
    @FXML private ImageView imgv27;
    @FXML private ImageView imgv28;
    @FXML private ImageView imgv29;
    @FXML private ImageView imgv30;
    @FXML private ImageView imgv31;
    @FXML private ImageView imgv32;
    @FXML private ImageView imgv33;
    @FXML private ImageView imgv34;
    @FXML private ImageView imgv35;
    @FXML private ImageView imgv36;
    
    Image img1;
    Image img2;
    Image img3;
    Image img4;
    Image img5;
    Image img6;
    Image img7;
    Image img8;
    Image img9;
    Image img10;
    Image img11;
    Image img12;
    Image img13;
    Image img14;
    Image img15;
    Image img16;
    Image img17;
    Image img18;
    Image img19;
    Image img20;
    Image img21;
    Image img22;
    Image img23;
    Image img24;
    Image img25;
    Image img26;
    Image img27;
    Image img28;
    Image img29;
    Image img30;
    Image img31;
    Image img32;
    Image img33;
    Image img34;
    Image img35;
    Image img36;

    Random r = new Random();
    Image[] question_img = new Image[36];
    Image[] kakao_img = new Image[36];
    ArrayList<ImageView> matching_img = new ArrayList<>();
    
    Map<Integer, ImageView> map = new HashMap<Integer, ImageView>();
    
	//x36
	Image card;
	static int test_count = 0;
	
	public void initialize() {
	
		manual.setOnAction(e -> viewManager.switchView("matchmanual"));
		
		map.put(1, imgv1);
		map.put(1, imgv2);
		map.put(2, imgv3);
		map.put(2, imgv4);
		map.put(3, imgv5);
		map.put(3, imgv6);
		map.put(4, imgv7);
		map.put(4, imgv8);
		map.put(5, imgv9);
		map.put(5, imgv10);
		map.put(6, imgv11);
		map.put(6, imgv12);
		map.put(7, imgv13);
		map.put(7, imgv14);
		map.put(8, imgv15);
		map.put(8, imgv16);
		map.put(9, imgv17);
		map.put(9, imgv18);
		map.put(10, imgv19);
		map.put(10, imgv20);
		map.put(11, imgv21);
		map.put(11, imgv22);
		map.put(12, imgv23);
		map.put(12, imgv24);
		map.put(13, imgv25);
		map.put(13, imgv26);
		map.put(14, imgv27);
		map.put(14, imgv28);
		map.put(15, imgv29);
		map.put(15, imgv30);
		map.put(16, imgv31);
		map.put(16, imgv32);
		map.put(17, imgv33);
		map.put(17, imgv34);
		map.put(18, imgv35);
		map.put(18, imgv36);		
		
		System.out.println("map.get : " + map.get(1).getId());
        	
        for(int i=0; i<36; i++) {
        	question_img[i] = new Image("card.png");        	
        }
        imgv1.setImage(question_img[0]);
        imgv2.setImage(question_img[1]);
        imgv3.setImage(question_img[2]);
        imgv4.setImage(question_img[3]);
        imgv5.setImage(question_img[4]);
        imgv6.setImage(question_img[5]);
        imgv7.setImage(question_img[6]);
        imgv8.setImage(question_img[7]);
        imgv9.setImage(question_img[8]);
        imgv10.setImage(question_img[9]);
        imgv11.setImage(question_img[10]);
        imgv12.setImage(question_img[11]);
        imgv13.setImage(question_img[12]);
        imgv14.setImage(question_img[13]);
        imgv15.setImage(question_img[14]);
        imgv16.setImage(question_img[15]);
        imgv17.setImage(question_img[16]);
        imgv18.setImage(question_img[17]);
        imgv19.setImage(question_img[18]);
        imgv20.setImage(question_img[19]);
        imgv21.setImage(question_img[20]);
        imgv22.setImage(question_img[21]);
        imgv23.setImage(question_img[22]);
        imgv24.setImage(question_img[23]);
        imgv25.setImage(question_img[24]);
        imgv26.setImage(question_img[25]);
        imgv27.setImage(question_img[26]);
        imgv28.setImage(question_img[27]);
        imgv29.setImage(question_img[28]);
        imgv30.setImage(question_img[29]);
        imgv31.setImage(question_img[30]);
        imgv32.setImage(question_img[31]);
        imgv33.setImage(question_img[32]);
        imgv34.setImage(question_img[33]);
        imgv35.setImage(question_img[34]);
        imgv36.setImage(question_img[35]);
        
        imgv1.setOnMouseClicked(e -> {
        	kakao_img[0] = new Image("img1.png");
        	imgv1.setImage(kakao_img[0]);	
	    	
//        	handleImage1();
        	
        	test_count++;
        	if(test_count > 1){
        
    			try {
    				Thread.sleep(500);
					imgv1.setImage(question_img[0]);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
    			test_count = 0;
        		
        	}        	
        	System.out.println("1번");
        });
        imgv2.setOnMouseClicked(e -> {
        	kakao_img[0] = new Image("img1.png");
	    	imgv2.setImage(kakao_img[0]);
//            handleImage2();
	    	test_count++;
        	if(test_count > 1){
        		if(imgv1.getId().charAt(1) == imgv2.getId().charAt(1)){
        			System.out.println("성공");
        		}else{
        			imgv2.setImage(question_img[0]);
        		}
        	}
            System.out.println("2번");
        });
        imgv3.setOnMouseClicked(e -> {
            handleImage3();
            System.out.println(imgv3.getId().charAt(1));
            test_count++;
        	if(test_count > 1){
        		if(imgv3.getId().charAt(1) == imgv4.getId().charAt(1)){
        			System.out.println("성공");
        		}else{
        			imgv3.setImage(question_img[0]);
        		}
        	}
            System.out.println("3번");
        });
        imgv4.setOnMouseClicked(e -> {
            handleImage4();
            System.out.println("4번");
        });
        imgv5.setOnMouseClicked(e -> {
        	handleImage5();
        	System.out.println("5번");
        });
        imgv6.setOnMouseClicked(e -> {
            handleImage6();
            System.out.println("6번");
        });
        imgv7.setOnMouseClicked(e -> {
            handleImage7();
            System.out.println("7번");
        });
        imgv8.setOnMouseClicked(e -> {
            handleImage8();
            System.out.println("8번");
        });
        imgv9.setOnMouseClicked(e -> {
        	handleImage9();
        	System.out.println("9번");
        });
        imgv10.setOnMouseClicked(e -> {
            handleImage10();
            System.out.println("10번");
        });
        imgv11.setOnMouseClicked(e -> {
            handleImage11();
            System.out.println("11번");
        });
        imgv12.setOnMouseClicked(e -> {
            handleImage12();
            System.out.println("12번");
        });
        imgv13.setOnMouseClicked(e -> {
        	handleImage13();
        	System.out.println("13번");
        });
        imgv14.setOnMouseClicked(e -> {
            handleImage14();
            System.out.println("14번");
        });
        imgv15.setOnMouseClicked(e -> {
            handleImage15();
            System.out.println("15번");
        });
        imgv16.setOnMouseClicked(e -> {
            handleImage16();
            System.out.println("16번");
        });
        imgv17.setOnMouseClicked(e -> {
            handleImage17();
            System.out.println("17번");
        });
        imgv18.setOnMouseClicked(e -> {
            handleImage18();
            System.out.println("18번");
        });
        imgv19.setOnMouseClicked(e -> {
            handleImage19();
            System.out.println("19번");
        });
        imgv20.setOnMouseClicked(e -> {
        	handleImage20();
        	System.out.println("20번");
        });
        imgv21.setOnMouseClicked(e -> {
            handleImage21();
            System.out.println("21번");
        });
        imgv22.setOnMouseClicked(e -> {
            handleImage22();
            System.out.println("22번");
        });
        imgv23.setOnMouseClicked(e -> {
            handleImage23();
            System.out.println("23번");
        });
        imgv24.setOnMouseClicked(e -> {
            handleImage24();
            System.out.println("24번");
        });
        imgv25.setOnMouseClicked(e -> {
            handleImage25();
            System.out.println("25번");
        });
        imgv26.setOnMouseClicked(e -> {
            handleImage26();
            System.out.println("26번");
        });
        imgv27.setOnMouseClicked(e -> {
            handleImage27();
            System.out.println("27번");
        });
        imgv28.setOnMouseClicked(e -> {
            handleImage28();
            System.out.println("28번");
        });
        imgv29.setOnMouseClicked(e -> {
            handleImage29();
            System.out.println("29번");
        });
        imgv30.setOnMouseClicked(e -> {
        	handleImage30();
        	System.out.println("30번");
        });
        imgv31.setOnMouseClicked(e -> {
            handleImage31();
            System.out.println("31번");
        });
        imgv32.setOnMouseClicked(e -> {
            handleImage32();
            System.out.println("32번");
        });
        imgv33.setOnMouseClicked(e -> {
            handleImage33();
            System.out.println("33번");
        });
        imgv34.setOnMouseClicked(e -> {
            handleImage34();
            System.out.println("34번");
        });
        imgv35.setOnMouseClicked(e -> {
            handleImage35();
            System.out.println("35번");
        });
        imgv36.setOnMouseClicked(e -> {
            handleImage36();
            System.out.println("36번");
        });		
        btn2.setOnAction(e -> {
        	initialize();
        });
        btn1.setOnAction(e -> {				
					try {
						handleImage1();
						handleImage2();
						handleImage3();
						handleImage4();
						handleImage5();
						handleImage6();
						handleImage7();
						handleImage8();
						handleImage9();
						handleImage10();
						handleImage11();
						handleImage12();
						handleImage13();
						handleImage14();
						handleImage15();
						handleImage16();
						handleImage17();
						handleImage18();
						handleImage19();
						handleImage20();
						handleImage21();
						handleImage22();
						handleImage23();
						handleImage24();
						handleImage25();
						handleImage26();
						handleImage27();
						handleImage28();
						handleImage29();
						handleImage30();
						handleImage31();
						handleImage32();
						handleImage33();
						handleImage34();
						handleImage35();
						handleImage36();
						Thread.sleep(2000);
						cardImage();
						
					} catch (Exception e1) {
						e1.printStackTrace();
					}
			});	
	}
	
	private void cardImage() {
		card = new Image("card.png");
	}
	private void handleImage1(){
		img1 = new Image("img1.png");
    	imgv1.setImage(img1);	
	}
	private void handleImage2(){
		img2 = new Image("img1.png");
    	imgv2.setImage(img2);
	}
	private void handleImage3(){
		img3 = new Image("img2.png");
    	imgv3.setImage(img3);
	}
	private void handleImage4(){
		img4 = new Image("img2.png");
    	imgv4.setImage(img4);
	}
	private void handleImage5(){
		img5 = new Image("img3.png");
    	imgv5.setImage(img5);
	}
	private void handleImage6(){
		img6 = new Image("img3.png");
    	imgv6.setImage(img6);
	}
	private void handleImage7(){
		img7 = new Image("img4.png");
    	imgv7.setImage(img7);
	}
	private void handleImage8(){
		img8 = new Image("img4.png");
    	imgv8.setImage(img8);
	}
	private void handleImage9(){
		img9 = new Image("img5.png");
    	imgv9.setImage(img9);
	}
	private void handleImage10(){
		img10 = new Image("img5.png");
    	imgv10.setImage(img10);
	}
	private void handleImage11(){
		img11 = new Image("img6.png");
    	imgv11.setImage(img11);
	}
	private void handleImage12(){
		img12 = new Image("img6.png");
    	imgv12.setImage(img12);
	}
	private void handleImage13(){
		img13 = new Image("img7.png");
    	imgv13.setImage(img13);
	}
	private void handleImage14(){
		img14 = new Image("img7.png");
    	imgv14.setImage(img14);
	}
	private void handleImage15(){
		img15 = new Image("img8.png");
    	imgv15.setImage(img15);
	}
	private void handleImage16(){
		img16 = new Image("img8.png");
    	imgv16.setImage(img16);
	}
	private void handleImage17(){
		img17 = new Image("img9.png");
    	imgv17.setImage(img17);
	}
	private void handleImage18(){
		img18 = new Image("img9.png");
    	imgv18.setImage(img18);
	}
	private void handleImage19(){
		img19 = new Image("img10.png");
    	imgv19.setImage(img19);
	}
	private void handleImage20(){
		img20 = new Image("img10.png");
    	imgv20.setImage(img20);
	}
	private void handleImage21(){
		img21 = new Image("img11.png");
    	imgv21.setImage(img21);
	}
	private void handleImage22(){
		img22 = new Image("img11.png");
    	imgv22.setImage(img22);
	}
	private void handleImage23(){
		img23 = new Image("img12.png");
    	imgv23.setImage(img23);
	}
	private void handleImage24(){
		img24 = new Image("img12.png");
    	imgv24.setImage(img24);
	}
	private void handleImage25(){
		img25 = new Image("img13.png");
    	imgv25.setImage(img25);
	}
	private void handleImage26(){
		img26 = new Image("img13.png");
    	imgv26.setImage(img26);
	}
	private void handleImage27(){
		img27 = new Image("img14.png");
    	imgv27.setImage(img27);
	}
	private void handleImage28(){
		img28 = new Image("img14.png");
    	imgv28.setImage(img28);
	}
	private void handleImage29(){
		img29 = new Image("img15.png");
    	imgv29.setImage(img29);
	}
	private void handleImage30(){
		img30 = new Image("img15.png");
    	imgv30.setImage(img30);
	}
	private void handleImage31(){
		img31 = new Image("img16.png");
    	imgv31.setImage(img31);
	}
	private void handleImage32(){
		img32 = new Image("img16.png");
    	imgv32.setImage(img32);
	}
	private void handleImage33(){
		img33 = new Image("img17.png");
    	imgv33.setImage(img33);
	}
	private void handleImage34(){
		img34 = new Image("img17.png");
    	imgv34.setImage(img34);
	}
	private void handleImage35(){
		img35 = new Image("img18.png");
    	imgv35.setImage(img35);
	}
	private void handleImage36(){
		img36 = new Image("img18.png");
    	imgv36.setImage(img36);
	}
	public void init() {
		ActionMap.register(this);
	}
	
	public void postInit() {
        if (first) {
            first = false;
        }
    }
	
    public void dispose() {	 
    }
    
    public void addUser(String userName) {
    }
}