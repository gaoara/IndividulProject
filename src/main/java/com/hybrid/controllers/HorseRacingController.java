package com.hybrid.controllers;

import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;
import com.hybrid.actions.MenuActions;

import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javax.inject.Inject;
import org.controlsfx.control.action.Action;
import org.controlsfx.control.action.ActionMap;
import org.controlsfx.control.action.ActionProxy;

public class HorseRacingController {

	/* 필드 */
	final static int COURSE = 635;
	final static int[] numbers = new int[30];
	final static int[] numbers2 = new int[30];
	final static int[] numbers3 = new int[30];
	final static int[] numbers4 = new int[30];
	final static int[] numbers5 = new int[30];
	final static int[] numbers6 = new int[30];
	final static int[] numbers7 = new int[30];
	final static int[] numbers8 = new int[30];
	static int x = 0;
	static int key = 0;
	static int impossible_total, impossible_total2, impossible_total3, impossible_total4, 
			   impossible_total5, impossible_total6, impossible_total7, impossible_total8 = 0;
	final static int[] GameEnd = new int[8];
	
	final ArrayList<Integer> list = new ArrayList<>();
	final Random r = new Random();
	
    /* FX 관련 */
    @FXML private ResourceBundle resources;
    @FXML private BorderPane root2;
    @FXML private Button button;
    @FXML private Button next;			// 진행버튼
    @FXML private Label RacingTitle;	// 타이틀 제목
    /* 말 8마리 */
    @FXML private ImageView o1ne;
    @FXML private ImageView t2wo;
    @FXML private ImageView t3hree;
    @FXML private ImageView f4our;
    @FXML private ImageView f5ive;
    @FXML private ImageView s6ix;
    @FXML private ImageView s7even;
    @FXML private ImageView e8ight;
    @FXML private Rectangle one_box;
    @FXML private Rectangle two_box;
    @FXML private Rectangle three_box;
    @FXML private Rectangle four_box;
    @FXML private Rectangle five_box;
    @FXML private Rectangle six_box;
    @FXML private Rectangle seven_box;
    @FXML private Rectangle eight_box;
    /* 베팅 버튼*/
    @FXML private Button one_button;
    @FXML private Button two_button;
    @FXML private Button three_button;
    @FXML private Button four_button;
    @FXML private Button five_button;
    @FXML private Button six_button;
    @FXML private Button seven_button;
    @FXML private Button eight_button;
    /* 베팅칩 */
    @FXML private ImageView whitechip;
    @FXML private Label whitechip_num;
    @FXML private ImageView redchip;
    @FXML private Label redchip_num;
    @FXML private ImageView bluechip;
    @FXML private Label bluechip_num;
    @FXML private ImageView greenchip;
    @FXML private Label greenchip_num;
    @FXML private ImageView orangechip;
    @FXML private Label orangechip_num;
    @FXML private ImageView purplechip;
    @FXML private Label purplechip_num;
    
    @FXML private ImageView whitechip2;
    @FXML private Label whitechip_num2;
    @FXML private ImageView redchip2;
    @FXML private Label redchip_num2;
    @FXML private ImageView bluechip2;
    @FXML private Label bluechip_num2;
    @FXML private ImageView greenchip2;
    @FXML private Label greenchip_num2;
    @FXML private ImageView orangechip2;
    @FXML private Label orangechip_num2;
    @FXML private ImageView purplechip2;
    @FXML private Label purplechip_num2;

    @FXML private ImageView whitechip3;
    @FXML private Label whitechip_num3;
    @FXML private ImageView redchip3;
    @FXML private Label redchip_num3;
    @FXML private ImageView bluechip3;
    @FXML private Label bluechip_num3;
    @FXML private ImageView greenchip3;
    @FXML private Label greenchip_num3;
    @FXML private ImageView orangechip3;
    @FXML private Label orangechip_num3;
    @FXML private ImageView purplechip3;
    @FXML private Label purplechip_num3;

    @FXML private ImageView whitechip4;
    @FXML private Label whitechip_num4;
    @FXML private ImageView redchip4;
    @FXML private Label redchip_num4;
    @FXML private ImageView bluechip4;
    @FXML private Label bluechip_num4;
    @FXML private ImageView greenchip4;
    @FXML private Label greenchip_num4;
    @FXML private ImageView orangechip4;
    @FXML private Label orangechip_num4;
    @FXML private ImageView purplechip4;
    @FXML private Label purplechip_num4;

    @FXML private ImageView whitechip5;
    @FXML private Label whitechip_num5;
    @FXML private ImageView redchip5;
    @FXML private Label redchip_num5;
    @FXML private ImageView bluechip5;
    @FXML private Label bluechip_num5;
    @FXML private ImageView greenchip5;
    @FXML private Label greenchip_num5;
    @FXML private ImageView orangechip5;
    @FXML private Label orangechip_num5;
    @FXML private ImageView purplechip5;
    @FXML private Label purplechip_num5;

    @FXML private ImageView whitechip6;
    @FXML private Label whitechip_num6;
    @FXML private ImageView redchip6;
    @FXML private Label redchip_num6;
    @FXML private ImageView bluechip6;
    @FXML private Label bluechip_num6;
    @FXML private ImageView greenchip6;
    @FXML private Label greenchip_num6;
    @FXML private ImageView orangechip6;
    @FXML private Label orangechip_num6;
    @FXML private ImageView purplechip6;
    @FXML private Label purplechip_num6;

    @FXML private ImageView whitechip7;
    @FXML private Label whitechip_num7;
    @FXML private ImageView redchip7;
    @FXML private Label redchip_num7;
    @FXML private ImageView bluechip7;
    @FXML private Label bluechip_num7;
    @FXML private ImageView greenchip7;
    @FXML private Label greenchip_num7;
    @FXML private ImageView orangechip7;
    @FXML private Label orangechip_num7;
    @FXML private ImageView purplechip7;
    @FXML private Label purplechip_num7;

    @FXML private ImageView whitechip8;
    @FXML private Label whitechip_num8;
    @FXML private ImageView redchip8;
    @FXML private Label redchip_num8;
    @FXML private ImageView bluechip8;
    @FXML private Label bluechip_num8;
    @FXML private ImageView greenchip8;
    @FXML private Label greenchip_num8;
    @FXML private ImageView orangechip8;
    @FXML private Label orangechip_num8;
    @FXML private ImageView purplechip8;
    @FXML private Label purplechip_num8;
    
    /* 나의 칩 */
    @FXML private ImageView mychip;
    @FXML private ImageView mychip2;
    @FXML private ImageView mychip3;
    @FXML private ImageView mychip4;
    @FXML private ImageView mychip5;
    @FXML private ImageView mychip6;
    @FXML private ImageView mychip7;
    @FXML private ImageView mychip8;
    @FXML private ImageView mychip9;
    @FXML private ImageView mychip10;
    @FXML private ImageView mychip11;
    @FXML private ImageView mychip12;
    @FXML private ImageView mychip13;
    @FXML private ImageView mychip14;
    @FXML private ImageView mychip15;
    @FXML private ImageView mychip16;
    @FXML private ImageView mychip17;
    @FXML private ImageView mychip18;
    @FXML private ImageView mychip19;
    @FXML private ImageView mychip20;
    
    public void initialize() {
    	System.out.println("initialize");
    }

	/* 랜덤수 배열저장, 사기경마 순위정하기, 베팅버튼(시작모드)*/
    public void randadd() {
    	int sum = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0, sum7 = 0, sum8 = 0;
    	boolean OnOff = false, OnOff2 = false, OnOff3 = false, OnOff4 = false, 
    			OnOff5 = false, OnOff6 = false, OnOff7 = false, OnOff8 = false;
    	
    	for(int i=0; i<30; i++) {
    		numbers[i] = r.nextInt(4);
    		sum += numbers[i];
    		if(sum >= 19 && OnOff == false){
    			list.add((int) o1ne.getId().charAt(1)-48);
    			OnOff = true;
    		}
    		numbers2[i] = r.nextInt(4);
    		sum2 += numbers2[i];
    		if(sum2 >= 19 && OnOff2 == false){
    			list.add((int) t2wo.getId().charAt(1)-48);
    			OnOff2 = true;
    		}		
    		numbers3[i] = r.nextInt(4);
    		sum3 += numbers3[i];
    		if(sum3 >= 19 && OnOff3 == false){
    			list.add((int) t3hree.getId().charAt(1)-48);
    			OnOff3 = true;
    		}	
    		numbers4[i] = r.nextInt(4);
    		sum4 += numbers4[i];
    		if(sum4 >= 19 && OnOff4 == false){
    			list.add((int) f4our.getId().charAt(1)-48);
    			OnOff4 = true;
    		}		
    		numbers5[i] = r.nextInt(4);
    		sum5 += numbers5[i];
    		if(sum5 >= 19 && OnOff5 == false){
    			list.add((int) f5ive.getId().charAt(1)-48);
    			OnOff5 = true;
    		}	
    		numbers6[i] = r.nextInt(4);
    		sum6 += numbers6[i];
    		if(sum6 >= 19 && OnOff6 == false){
    			list.add((int) s6ix.getId().charAt(1)-48);
    			OnOff6 = true;
    		}	
    		numbers7[i] = r.nextInt(4);
    		sum7 += numbers7[i];
    		if(sum7 >= 19 && OnOff7 == false){
    			list.add((int) s7even.getId().charAt(1)-48);
    			OnOff7 = true;
    		}
    		numbers8[i] = r.nextInt(4);
    		sum8 += numbers8[i];
    		if(sum8 >= 19 && OnOff8 == false){
    			list.add((int) e8ight.getId().charAt(1)-48);
    			OnOff8 = true;
    		}
    	}    	
    }    	
  
    /* 경마이동 */
    public void move(ActionEvent e) {
    	Circle c = new Circle();
    		c.setRadius(10);
    		c.setCenterX(150);
		
        new Thread(new Runnable() {
			@Override
			public void run() {				
				try {
					for(int i=0; i<numbers[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && o1ne.getLayoutX() < 556) {
								o1ne.setLayoutX(o1ne.getLayoutX() + 25.5);
								one_box.setLayoutX(one_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					for(int i=0; i<numbers2[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && t2wo.getLayoutX() < 556) {
								t2wo.setLayoutX(t2wo.getLayoutX() + 25.5);
								two_box.setLayoutX(two_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					for(int i=0; i<numbers3[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && t3hree.getLayoutX() < 556) {
								t3hree.setLayoutX(t3hree.getLayoutX() + 25.5);
								three_box.setLayoutX(three_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					for(int i=0; i<numbers4[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && f4our.getLayoutX() < 556) {
								f4our.setLayoutX(f4our.getLayoutX() + 25.5);
								four_box.setLayoutX(four_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					for(int i=0; i<numbers5[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && f5ive.getLayoutX() < 556) {
								f5ive.setLayoutX(f5ive.getLayoutX() + 25.5);
								five_box.setLayoutX(five_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					for(int i=0; i<numbers6[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && s6ix.getLayoutX() < 556) {
								s6ix.setLayoutX(s6ix.getLayoutX() + 25.5);
								six_box.setLayoutX(six_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					for(int i=0; i<numbers7[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && s7even.getLayoutX() < 556) {
								s7even.setLayoutX(s7even.getLayoutX() + 25.5);
								seven_box.setLayoutX(seven_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					for(int i=0; i<numbers8[x]; i++) {
						Thread.sleep(100);
						if(c.getCenterX() <= COURSE - c.getRadius() && e8ight.getLayoutX() < 556) {
								e8ight.setLayoutX(e8ight.getLayoutX() + 25.5);
								eight_box.setLayoutX(eight_box.getLayoutX() + 25.5);
								c.setCenterX(c.getCenterX() + 25.5);
						}
					}
					++x;
				} catch (InterruptedException e) {}
			}
		}).start();
	}
    
    /* 베팅 불가능 지역*/
    public void impossible() {
    	impossible_total += numbers[x];
    	impossible_total2 += numbers2[x];
    	impossible_total3 += numbers3[x];
    	impossible_total4 += numbers4[x];
    	impossible_total5 += numbers5[x];
    	impossible_total6 += numbers6[x];
    	impossible_total7 += numbers7[x];
    	impossible_total8 += numbers8[x];
		if(impossible_total >= 17) {
			one_button.setDisable(true);
			one_button.setText("[베팅종료]");
			one_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
		if(impossible_total2 >= 17) {
			two_button.setDisable(true);
			two_button.setText("[베팅종료]");
			two_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
		if(impossible_total3 >= 17) {
			three_button.setDisable(true);
			three_button.setText("[베팅종료]");
			three_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
		if(impossible_total4 >= 17) {
			four_button.setDisable(true);
			four_button.setText("[베팅종료]");
			four_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
		if(impossible_total5 >= 17) {
			five_button.setDisable(true);
			five_button.setText("[베팅종료]");
			five_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
		if(impossible_total6 >= 17) {
			six_button.setDisable(true);
			six_button.setText("[베팅종료]");
			six_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
		if(impossible_total7 >= 17) {
			seven_button.setDisable(true);
			seven_button.setText("[베팅종료]");
			seven_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
		if(impossible_total8 >= 17) {
			eight_button.setDisable(true);
			eight_button.setText("[베팅종료]");
			eight_button.setStyle("-fx-opacity: 1;-fx-background-color: #ffa41f;");
		}
    }
    
    /* 1등, 2등 말 결승지점 도달 시 게임종료 */
    int EndCount;
    boolean[] EndOnOff = new boolean[8];
    private void gameEnd() {
    	if(EndCount < 2){
    		GameEnd[0]=impossible_total; GameEnd[1]=impossible_total2; GameEnd[2]=impossible_total3; GameEnd[3]=impossible_total4;
    		GameEnd[4]=impossible_total5; GameEnd[5]=impossible_total6; GameEnd[6]=impossible_total7; GameEnd[7]=impossible_total8;			
    		for(int i=0; i<8; i++){
    			if(GameEnd[i] >= 19 && EndOnOff[i] == false) {
    				EndOnOff[i] = true;
    				EndCount++;
    				reckoning();
    			}			
    		}			
    	}
    	if(EndCount>=2) {
    		Alert alert = new Alert(AlertType.INFORMATION);    	
    		alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
    		alert.setTitle("MAINMATCH : 사기경마");
    		alert.setHeaderText("나의 점수 : " + Math.round((Me[0]+Me[1]+Me[2]+Me[3]+Me[4]+Me[5]+Me[6]+Me[7]))+ "칩" + "\n" +
    							"RedPlayer: " + Math.round((player[0]+player[1]+player[2]+player[3]+player[4]+player[5]+player[6]+player[7]))+ "칩" +  "\n" +
    							"BluePlayer: " + Math.round((player2[0]+player2[1]+player2[2]+player2[3]+player2[4]+player2[5]+player2[6]+player2[7]))+ "칩" +  "\n" +
    							"GreenPlayer: " + Math.round((player3[0]+player3[1]+player3[2]+player3[3]+player3[4]+player3[5]+player3[6]+player3[7]))+ "칩" +  "\n" +
    							"OrangePlayer: " + Math.round((player4[0]+player4[1]+player4[2]+player4[3]+player4[4]+player4[5]+player4[6]+player4[7]))+ "칩" +  "\n" +
    							"PurplePlayer: " + Math.round((player5[0]+player5[1]+player5[2]+player5[3]+player5[4]+player5[5]+player5[6]+player5[7]))+ "칩");
    		alert.setContentText("1등말번호 : "+ list.get(0)+ "번말" + "\n2등말번호 : "+ list.get(1) + "번말");
    		alert.showAndWait();
    		dispose();
    		viewManager.switchView("horsestart");
    	}
    }
    
    /* 순위 단서 제공 */
    public void hint() {
    	key++;
    	Alert alert = new Alert(AlertType.INFORMATION);    	
    	alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
    	alert.setTitle(key + "라운드 순위단서");
    	
    	switch (key) {
		case 1:
			alert.setHeaderText(list.get(6) + "번말은 " + list.get(7) + "번말보다 빠르지만 " + list.get(4) + "번말보다는 느리다.");
			break;
		case 2:
			alert.setHeaderText(list.get(2) + "번말은 3등 안에 든다.");
			break;
		case 3:
			alert.setHeaderText(list.get(4) + "번말 다음으로 " + list.get(5) + "번말이 들어온다.");
			break;
		case 4:
			alert.setHeaderText(list.get(0) + "번말은 " + list.get(7) + "번말과 이기거나 비긴다.");
			break;
		case 5: 
			alert.setHeaderText(list.get(3) + "번말은 " + list.get(1) + "번말보다 느리다.");
			break;
		case 6:
			alert.setHeaderText(list.get(6) + "번말은 7등이다.");
			break;
		case 7: 
			alert.setHeaderText(list.get(2) + "번말은 " + list.get(3) + "번말 직전에 들어온다.");
			break;
		case 8:
			alert.setHeaderText("1등말번호 + 2등말번호 + 3등말번호 = " + (list.get(0) + list.get(1) + list.get(2)));
			break;
		case 9:
			alert.setHeaderText(list.get(5) + "번말은 6등이다.");
			break;
		case 10:
			alert.setHeaderText(list.get(1) + "번말은 " + list.get(0) + "번말보다 느리지만 " + list.get(4) + "보다는 빠르다.");
			break;
		default:
			alert.setHeaderText("모든 단서가 제공되었습니다.");
			break;
		}
    	alert.setContentText("[1등말과 2등말을 찾아 베팅하세요]");
    	alert.showAndWait();
    }
    /* 베팅 버튼 */
    int[] chipcount = new int[8];
    ImageView[] whitechip_arr = new ImageView[8];
    Label[] whitechip_num_arr = new Label[8];
    int Max = 0;
    int chipcount_arr = 0;
    int chipcount_arr2 = 1;
    int chipcount_arr3 = 2;
    int chipcount_arr4 = 3;
    int chipcount_arr5 = 4;
    int chipcount_arr6 = 5;
    int chipcount_arr7 = 6;
    int chipcount_arr8 = 7;
    public void buttonclick() {
    	whitechip_arr[0]=whitechip; whitechip_arr[1]=whitechip2; whitechip_arr[2]=whitechip3; whitechip_arr[3]=whitechip4;
    	whitechip_arr[4]=whitechip5; whitechip_arr[5]=whitechip6; whitechip_arr[6]=whitechip7; whitechip_arr[7]=whitechip8;
    	whitechip_num_arr[0]=whitechip_num; whitechip_num_arr[1]=whitechip_num2; whitechip_num_arr[2]=whitechip_num3; whitechip_num_arr[3]=whitechip_num4;
    	whitechip_num_arr[4]=whitechip_num5; whitechip_num_arr[5]=whitechip_num6; whitechip_num_arr[6]=whitechip_num7; whitechip_num_arr[7]=whitechip_num8;
    	one_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr);
    	});
    	two_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr2);
    	});
    	three_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr3);
    	});
    	four_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr4);
    	});
    	five_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr5);
    	});
    	six_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr6);
    	});
    	seven_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr7);
    	});
    	eight_button.setOnAction(e -> {
    		clickEvent();
    		whitechip(chipcount_arr8);
    	});
    }
    public void clickEvent() {
		if(key==0) {
			Alert alert = new Alert(AlertType.INFORMATION);    	
	    	alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
	    	alert.setTitle("MAINMATCH : 사기경마");
	    	alert.setHeaderText("진행버튼을 눌러주세요");
	    	alert.setContentText("[문의사항은 정병욱에게 문의하세요]");
	    	alert.showAndWait();
		}else if(Max>=3){
			Alert alert = new Alert(AlertType.INFORMATION);    	
	    	alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
	    	alert.setTitle("MAINMATCH : 사기경마");
	    	alert.setHeaderText("한 라운드 쓸 수 있는 칩을 모두 소모하였습니다");
	    	alert.setContentText("[문의사항은 정병욱에게 문의하세요]");
	    	alert.showAndWait();
		}else{
			chip();
		}
    }
    public void whitechip(int e) {
    	if(key!=0 && Max<3 && mychip_count!=0) {
    		chipcount[e]++;
    		whitechip_arr[e].setStyle("-fx-opacity: 1;");
    		whitechip_num_arr[e].setStyle("-fx-opacity: 1;");
    		whitechip_num_arr[e].setText(chipcount[e]+"");
    		Max++;
    		--mychip_count;
    	}
    }
    /* 배당률 계산 */
    double one_horse; double two_horse; double three_horse; double four_horse;
    double five_horse; double six_horse; double seven_horse; double eight_horse;
    double[] Me = new double[8]; double[] player = new double[8]; double[] player2 = new double[8]; 
    double[] player3 = new double[8]; double[] player4 = new double[8]; double[] player5 = new double[8]; 
    public void reckoning() {
    	one_horse = Math.round((120.0/(double)(chipcount[chipcount_arr]+ComPlayCount[0]+ComPlayCount2[4]+ComPlayCount3[6]+ComPlayCount4[7]+ComPlayCount5[5])/2.0)*100)/100.0;
    	two_horse = Math.round((120.0/(double)(chipcount[chipcount_arr2]+ComPlayCount[1]+ComPlayCount2[5]+ComPlayCount3[7]+ComPlayCount4[0]+ComPlayCount5[6])/2.0)*100)/100.0;
    	three_horse = Math.round((120.0/(double)(chipcount[chipcount_arr3]+ComPlayCount[2]+ComPlayCount2[6]+ComPlayCount3[0]+ComPlayCount4[1]+ComPlayCount5[7])/2.0)*100)/100.0;
    	four_horse = Math.round((120.0/(double)(chipcount[chipcount_arr4]+ComPlayCount[3]+ComPlayCount2[7]+ComPlayCount3[1]+ComPlayCount4[2]+ComPlayCount5[0])/2.0)*100)/100.0;
    	five_horse = Math.round((120.0/(double)(chipcount[chipcount_arr5]+ComPlayCount[4]+ComPlayCount2[0]+ComPlayCount3[2]+ComPlayCount4[3]+ComPlayCount5[1])/2.0)*100)/100.0;
    	six_horse = Math.round((120.0/(double)(chipcount[chipcount_arr6]+ComPlayCount[5]+ComPlayCount2[1]+ComPlayCount3[3]+ComPlayCount4[4]+ComPlayCount5[2])/2.0)*100)/100.0;
    	seven_horse = Math.round((120.0/(double)(chipcount[chipcount_arr7]+ComPlayCount[6]+ComPlayCount2[2]+ComPlayCount3[4]+ComPlayCount4[5]+ComPlayCount5[3])/2.0)*100)/100.0;
    	eight_horse = Math.round((120.0/(double)(chipcount[chipcount_arr8]+ComPlayCount[7]+ComPlayCount2[3]+ComPlayCount3[5]+ComPlayCount4[6]+ComPlayCount5[4])/2.0)*100)/100.0;
    	
    	for(int i=0; i<2; i++){    		
    		switch (list.get(i)) {
    		case 1:
    			Me[0] = Math.round(one_horse * (double)chipcount[chipcount_arr]*100)/100.0;
    			player[0] = Math.round(one_horse * (double)ComPlayCount[0]*100)/100.0;
    			player2[0] = Math.round(one_horse * (double)ComPlayCount2[4]*100)/100.0;
    			player3[0] = Math.round(one_horse * (double)ComPlayCount3[6]*100)/100.0;
    			player4[0] = Math.round(one_horse * (double)ComPlayCount4[7]*100)/100.0;
    			player5[0] = Math.round(one_horse * (double)ComPlayCount5[5]*100)/100.0;
    			break;
    		case 2:
    			Me[1] = Math.round(two_horse * (double)chipcount[chipcount_arr2]*100)/100.0;
    			player[1] = Math.round(two_horse * (double)ComPlayCount[1]*100)/100.0;
    			player2[1] = Math.round(two_horse * (double)ComPlayCount2[5]*100)/100.0;
    			player3[1] = Math.round(two_horse * (double)ComPlayCount3[7]*100)/100.0;
    			player4[1] = Math.round(two_horse * (double)ComPlayCount4[0]*100)/100.0;
    			player5[1] = Math.round(two_horse * (double)ComPlayCount5[6]*100)/100.0;
    			break;
    		case 3:
    			Me[2] = Math.round(three_horse * (double)chipcount[chipcount_arr3]*100)/100.0;
    			player[2] = Math.round(three_horse * (double)ComPlayCount[2]*100)/100.0;
    			player2[2] = Math.round(three_horse * (double)ComPlayCount2[6]*100)/100.0;
    			player3[2] = Math.round(three_horse * (double)ComPlayCount3[0]*100)/100.0;
    			player4[2] = Math.round(three_horse * (double)ComPlayCount4[1]*100)/100.0;
    			player5[2] = Math.round(three_horse * (double)ComPlayCount5[7]*100)/100.0;
    			break;
    		case 4:
    			Me[3] = Math.round(four_horse * (double)chipcount[chipcount_arr4]*100)/100.0;
    			player[3] = Math.round(four_horse * (double)ComPlayCount[3]*100)/100.0;
    			player2[3] = Math.round(four_horse * (double)ComPlayCount2[7]*100)/100.0;
    			player3[3] = Math.round(four_horse * (double)ComPlayCount3[1]*100)/100.0;
    			player4[3] = Math.round(four_horse * (double)ComPlayCount4[2]*100)/100.0;
    			player5[3] = Math.round(four_horse * (double)ComPlayCount5[0]*100)/100.0;
    			break;
    		case 5:
    			Me[4] = Math.round(five_horse * (double)chipcount[chipcount_arr5]*100)/100.0;
    			player[4] = Math.round(five_horse * (double)ComPlayCount[4]*100)/100.0;
    			player2[4] = Math.round(five_horse * (double)ComPlayCount2[0]*100)/100.0;
    			player3[4] = Math.round(five_horse * (double)ComPlayCount3[2]*100)/100.0;
    			player4[4] = Math.round(five_horse * (double)ComPlayCount4[3]*100)/100.0;
    			player5[4] = Math.round(five_horse * (double)ComPlayCount5[1]*100)/100.0;
    			break;
    		case 6:
    			Me[5] = Math.round(six_horse * (double)chipcount[chipcount_arr6]*100)/100.0;
    			player[5] = Math.round(six_horse * (double)ComPlayCount[5]*100)/100.0;
    			player2[5] = Math.round(six_horse * (double)ComPlayCount2[1]*100)/100.0;
    			player3[5] = Math.round(six_horse * (double)ComPlayCount3[3]*100)/100.0;
    			player4[5] = Math.round(six_horse * (double)ComPlayCount4[4]*100)/100.0;
    			player5[5] = Math.round(six_horse * (double)ComPlayCount5[2]*100)/100.0;
    			break;
    		case 7:
    			Me[6] = Math.round(seven_horse * (double)chipcount[chipcount_arr7]*100)/100.0;
    			player[6] = Math.round(seven_horse * (double)ComPlayCount[6]*100)/100.0;
    			player2[6] = Math.round(seven_horse * (double)ComPlayCount2[2]*100)/100.0;
    			player3[6] = Math.round(seven_horse * (double)ComPlayCount3[4]*100)/100.0;
    			player4[6] = Math.round(seven_horse * (double)ComPlayCount4[5]*100)/100.0;
    			player5[6] = Math.round(seven_horse * (double)ComPlayCount5[3]*100)/100.0;
    			break;
    		case 8:
    			Me[7] = Math.round(eight_horse * (double)chipcount[chipcount_arr8]*100)/100.0;
    			player[7] = Math.round(eight_horse * (double)ComPlayCount[7]*100)/100.0;
    			player2[7] = Math.round(eight_horse * (double)ComPlayCount2[3]*100)/100.0;
    			player3[7] = Math.round(eight_horse * (double)ComPlayCount3[5]*100)/100.0;
    			player4[7] = Math.round(eight_horse * (double)ComPlayCount4[6]*100)/100.0;
    			player5[7] = Math.round(eight_horse * (double)ComPlayCount5[4]*100)/100.0;
    			break;
    		default:
    			break;
    		}
    	}
    }
    /* 나의 칩 소모 */
    ImageView[] mychip_arr = new ImageView[20];
    int mychip_count = 20;
    private void chip() {
    	if(mychip_count != 0) {
    		mychip_arr[0]=mychip; mychip_arr[1]=mychip2; mychip_arr[2]=mychip3; mychip_arr[3]=mychip4; mychip_arr[4]=mychip5;
    		mychip_arr[5]=mychip6; mychip_arr[6]=mychip7; mychip_arr[7]=mychip8; mychip_arr[8]=mychip9; mychip_arr[9]=mychip10;
    		mychip_arr[10]=mychip11; mychip_arr[11]=mychip12; mychip_arr[12]=mychip13; mychip_arr[13]=mychip14; mychip_arr[14]=mychip15;
    		mychip_arr[15]=mychip16; mychip_arr[16]=mychip17; mychip_arr[17]=mychip18; mychip_arr[18]=mychip19; mychip_arr[19]=mychip20;
    		
    		mychip_arr[mychip_count-1].setStyle("-fx-opacity: 0;");		
    	} else {			
			Alert alert = new Alert(AlertType.INFORMATION);    	
			alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
			alert.setTitle("MAINMATCH : 사기경마");
			alert.setHeaderText("칩을 모두 소모하였습니다");
			alert.setContentText("[문의사항은 정병욱에게 문의하세요]");
			alert.showAndWait();
		}
    }
    
    /* 컴퓨터 베팅 (컴퓨터는 베팅 무한) */
    int[] ComPlayCount = new int[8];
    int[] ComPlayCount2 = new int[8];
    int[] ComPlayCount3 = new int[8];
    int[] ComPlayCount4 = new int[8];
    int[] ComPlayCount5 = new int[8];
    ImageView[] red_chip = new ImageView[8];
    ImageView[] blue_chip = new ImageView[8]; 
    ImageView[] green_chip = new ImageView[8];
    ImageView[] orange_chip = new ImageView[8]; 
    ImageView[] purple_chip = new ImageView[8];
    Label[] red_chip_num = new Label[8];
    Label[] blue_chip_num = new Label[8];
    Label[] green_chip_num = new Label[8];
    Label[] orange_chip_num = new Label[8];
    Label[] purple_chip_num = new Label[8];							// randombetting값을 배열에 저장시켜서  
    public void randbetting() {	
    	int computerRound = r.nextInt(3)+1;
    	if(key!=0){
    		for(int i=0; i<computerRound; i++){
    			int randombetting = r.nextInt(8)+1;
    			switch (randombetting) {
    			case 1:
    				twoMethed(randombetting);
    				break;
    			case 2:
    				twoMethed(randombetting);
    				break;
    			case 3:
    				twoMethed(randombetting);
    				break;
    			case 4:
    				twoMethed(randombetting);
    				break;
    			case 5:
    				twoMethed(randombetting);
    				break;
    			case 6:
    				twoMethed(randombetting);
    				break;
    			case 7:
    				twoMethed(randombetting);
    				break;
    			case 8:
    				twoMethed(randombetting);
    				break;
    			default:
    				break;
    			}
    		}
		}
    }
    public void twoMethed(int e){
    	FXMLfield();
		randbetting_backup(e);
    }
    public void FXMLfield() {
    	red_chip[0] = redchip; red_chip[1] = redchip2; red_chip[2] = redchip3; red_chip[3] = redchip4; 
    	red_chip[4] = redchip5; red_chip[5] = redchip6; red_chip[6] = redchip7; red_chip[7] = redchip8;
    	blue_chip[0] = bluechip5; blue_chip[1] = bluechip6; blue_chip[2] = bluechip7; blue_chip[3] = bluechip8; 
    	blue_chip[4] = bluechip; blue_chip[5] = bluechip2; blue_chip[6] = bluechip3; blue_chip[7] = bluechip4;
    	green_chip[0] = greenchip3; green_chip[1] = greenchip4; green_chip[2] = greenchip5; green_chip[3] = greenchip6; 
    	green_chip[4] = greenchip7; green_chip[5] = greenchip8; green_chip[6] = greenchip; green_chip[7] = greenchip2;
    	orange_chip[0] = orangechip2; orange_chip[1] = orangechip3; orange_chip[2] = orangechip4; orange_chip[3] = orangechip5; 
    	orange_chip[4] = orangechip6; orange_chip[5] = orangechip7; orange_chip[6] = orangechip8; orange_chip[7] = orangechip;
    	purple_chip[0] = purplechip4; purple_chip[1] = purplechip5; purple_chip[2] = purplechip6; purple_chip[3] = purplechip7; 
    	purple_chip[4] = purplechip8; purple_chip[5] = purplechip; purple_chip[6] = purplechip2; purple_chip[7] = purplechip3;
    	red_chip_num[0] = redchip_num; red_chip_num[1] = redchip_num2; red_chip_num[2] = redchip_num3; red_chip_num[3] = redchip_num4; 
    	red_chip_num[4] = redchip_num5; red_chip_num[5] = redchip_num6; red_chip_num[6] = redchip_num7; red_chip_num[7] = redchip_num8;
    	blue_chip_num[0] = bluechip_num5; blue_chip_num[1] = bluechip_num6; blue_chip_num[2] = bluechip_num7; blue_chip_num[3] = bluechip_num8; 
    	blue_chip_num[4] = bluechip_num; blue_chip_num[5] = bluechip_num2; blue_chip_num[6] = bluechip_num3; blue_chip_num[7] = bluechip_num4;
    	green_chip_num[0] = greenchip_num3; green_chip_num[1] = greenchip_num4; green_chip_num[2] = greenchip_num5; green_chip_num[3] = greenchip_num6; 
    	green_chip_num[4] = greenchip_num7; green_chip_num[5] = greenchip_num8; green_chip_num[6] = greenchip_num; green_chip_num[7] = greenchip_num2;
    	orange_chip_num[0] = orangechip_num2; orange_chip_num[1] = orangechip_num3; orange_chip_num[2] = orangechip_num4; orange_chip_num[3] = orangechip_num5; 
    	orange_chip_num[4] = orangechip_num6; orange_chip_num[5] = orangechip_num7; orange_chip_num[6] = orangechip_num8; orange_chip_num[7] = orangechip_num;
    	purple_chip_num[0] = purplechip_num4; purple_chip_num[1] = purplechip_num5; purple_chip_num[2] = purplechip_num6; purple_chip_num[3] = purplechip_num7; 
    	purple_chip_num[4] = purplechip_num8; purple_chip_num[5] = purplechip_num; purple_chip_num[6] = purplechip_num2; purple_chip_num[7] = purplechip_num3;	
    }
    public void randbetting_backup(int e) {
		ComPlayCount[e-1]++;
		red_chip[e-1].setStyle("-fx-opacity: 1;");
		red_chip_num[e-1].setStyle("-fx-opacity: 1;");
		red_chip_num[e-1].setText(ComPlayCount[e-1]+"");
		ComPlayCount2[e-1]++;
		blue_chip[e-1].setStyle("-fx-opacity: 1;");
		blue_chip_num[e-1].setStyle("-fx-opacity: 1;");
		blue_chip_num[e-1].setText(ComPlayCount2[e-1]+"");
		ComPlayCount3[e-1]++;
		green_chip[e-1].setStyle("-fx-opacity: 1;");
		green_chip_num[e-1].setStyle("-fx-opacity: 1;");
		green_chip_num[e-1].setText(ComPlayCount3[e-1]+"");
		ComPlayCount4[e-1]++;
		orange_chip[e-1].setStyle("-fx-opacity: 1;");
		orange_chip_num[e-1].setStyle("-fx-opacity: 1;");
		orange_chip_num[e-1].setText(ComPlayCount4[e-1]+"");
		ComPlayCount5[e-1]++;
		purple_chip[e-1].setStyle("-fx-opacity: 1;");
		purple_chip_num[e-1].setStyle("-fx-opacity: 1;");
		purple_chip_num[e-1].setText(ComPlayCount5[e-1]+""); 				
    }
    /* ---------------------------------------------------------------------------------------------------------------------- */
    public static void clearScreen() {
		System.out.print("\033[2J"); // 클리어명령어로 인식 
		System.out.flush();
	}

	/* Gluon 관련 */
    @Inject ParticleApplication app;
    @Inject private ViewManager viewManager;
    
    private Action actionHome;
    
    public void init() {
    	System.out.println("init");
    	ActionMap.register(this);
    }
    
    public void postInit() {
    	System.out.println("postInit");
    	randadd();       	
    	buttonclick();
    	button.setOnAction(e -> viewManager.switchView("main")); 
        next.setOnAction(e -> {
        	randbetting();
        	Max = 0;
        	RacingTitle.setText(key+1+"라운드를 진행하십시오");
        	hint();
        	move(e);
        	impossible();
        	gameEnd();
        });
        app.getParticle().getToolBarActions().add(actionHome);
    }
    /* 게임 벗어날 시, 초기화 */
    public void dispose() {
    	System.out.println("종료");
    	o1ne.setLayoutX(72);	one_box.setLayoutX(83);
    	t2wo.setLayoutX(72);	two_box.setLayoutX(83);
    	t3hree.setLayoutX(72);	three_box.setLayoutX(83);
    	f4our.setLayoutX(72);	four_box.setLayoutX(83);
    	f5ive.setLayoutX(72);	five_box.setLayoutX(83);
    	s6ix.setLayoutX(72);	six_box.setLayoutX(83);
    	s7even.setLayoutX(72);	seven_box.setLayoutX(83);
    	e8ight.setLayoutX(72);	eight_box.setLayoutX(83);
    	list.clear();
    	impossible_total = 0;	impossible_total2 = 0;	impossible_total3 = 0;	impossible_total4 = 0;
    	impossible_total5 = 0;	impossible_total6 = 0;	impossible_total7 = 0;	impossible_total8 = 0;
    	EndCount = 0;
    	EndOnOff = new boolean[8];
    	key = 0;
    	chipcount = new int[8];
    	Max = 0;
    	one_horse = 0.0; 	two_horse = 0.0; 	three_horse = 0.0; 	four_horse = 0.0;
    	five_horse = 0.0;	six_horse = 0.0; 	seven_horse = 0.0; 	eight_horse = 0.0;
        Me = new double[8]; 	player = new double[8]; 	player2 = new double[8]; 
        player3 = new double[8]; 	player4 = new double[8]; 	player5 = new double[8]; 
        mychip_count = 20;
        ComPlayCount = new int[8];
        ComPlayCount2 = new int[8];
        ComPlayCount3 = new int[8];
        ComPlayCount4 = new int[8];
        ComPlayCount5 = new int[8];	
        RacingTitle.setText("MAINMATCH : 사기경마");
        one_button.setDisable(false);
		one_button.setText("1번마베팅");
		one_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		two_button.setDisable(false);
		two_button.setText("2번마베팅");
		two_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		three_button.setDisable(false);
		three_button.setText("3번마베팅");
		three_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		four_button.setDisable(false);
		four_button.setText("4번마베팅");
		four_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		five_button.setDisable(false);
		five_button.setText("5번마베팅");
		five_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		six_button.setDisable(false);
		six_button.setText("6번마베팅");
		six_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		seven_button.setDisable(false);
		seven_button.setText("7번마베팅");
		seven_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		eight_button.setDisable(false);
		eight_button.setText("8번마베팅");
		eight_button.setStyle("/*-fx-background-color: #ffa41f;*/");
		for(int i=0; i<20; i++){
			if(mychip_arr[i] != null) {
				mychip_arr[i].setStyle("-fx-opacity: 1;");
			}
		}
		for(int i=0; i<8; i++){
			whitechip_arr[i].setStyle("-fx-opacity: 0;");
			whitechip_num_arr[i].setStyle("-fx-opacity: 0;");
			if(red_chip[i] != null) {
				red_chip[i].setStyle("-fx-opacity: 0;");
				red_chip_num[i].setStyle("-fx-opacity: 0;");				
			}
			if(blue_chip[i] != null) {
				blue_chip[i].setStyle("-fx-opacity: 0;");
				blue_chip_num[i].setStyle("-fx-opacity: 0;");
			}
			if(green_chip[i] != null) {
				green_chip[i].setStyle("-fx-opacity: 0;");
				green_chip_num[i].setStyle("-fx-opacity: 0;");
			}
			if(orange_chip[i] != null) {
				orange_chip[i].setStyle("-fx-opacity: 0;");
				orange_chip_num[i].setStyle("-fx-opacity: 0;");
			}
			if(purple_chip[i] != null) {
				purple_chip[i].setStyle("-fx-opacity: 0;");
				purple_chip_num[i].setStyle("-fx-opacity: 0;");
			}
		}
		clearScreen();
        app.getParticle().getToolBarActions().remove(actionHome);
    }
}