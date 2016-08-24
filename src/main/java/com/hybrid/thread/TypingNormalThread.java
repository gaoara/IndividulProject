package com.hybrid.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hybrid.controllers.TypingNormalController;
import com.hybrid.controllers.TypingScoreController;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class TypingNormalThread extends Thread {
	
	public Label a1;
	public List<String> list = new ArrayList<String>();
	Random r;
	Label lblScore = new Label();
	ThreadGroup group;
	AnchorPane anchorPane;
	TypingScoreController rank;
	TypingNormalController normal;
	
	ArrayList<Label> lbl;
	
	public int sleep;
	
	public TypingNormalThread(ThreadGroup group, AnchorPane anchorPane, Label lblScore, ArrayList<Label> lbl, TypingNormalController normal){
		super(group,"NormalThread");

    	list.add("오렌지");
    	list.add("사이다");
    	list.add("우산");
    	list.add("자동차");
    	list.add("케이크");
    	list.add("컴퓨터");
    	list.add("콜라");
    	list.add("안경");
    	list.add("마우스");
    	list.add("자바");
    	list.add("HTML");
    	list.add("펜");
    	list.add("연필");
    	list.add("신발");
    	list.add("꽃");
    	list.add("책");
    	list.add("핸드폰");
    	list.add("물병");
    	list.add("만화");
    	list.add("칠판");
    	list.add("분필");
    	list.add("개구리");
    	list.add("게임");
    	list.add("타이핑");
    	list.add("치약");
    	list.add("칫솔");
    	list.add("화장품");
    	list.add("총");
    	list.add("칼");
    	list.add("스테이크");
    	list.add("언덕");
    	list.add("선풍기");
    	list.add("에어컨");
    	list.add("사막");
    	list.add("정글");
    	list.add("밀림");
    	list.add("영화");
    	list.add("가게");
    	list.add("편의점");
    	list.add("독수리");
    	list.add("비둘기");
    	list.add("평화");
    	list.add("사회");
    	list.add("신문");
    	list.add("인물");
    	list.add("사전");
    	list.add("망치");
    	list.add("망토");
    	
    	this.anchorPane = anchorPane;
    	this.lbl = lbl;
    	this.normal = normal;
    	
    	lbl = new ArrayList<>();
    	if(lbl.isEmpty()){
    		lbl.add(normal.lblheart1);
    		lbl.add(normal.lblheart2);
    		lbl.add(normal.lblheart3);
    	}
    	
    	r = new Random();
    	a1 = new Label();
    	a1.setText(list.get(r.nextInt(list.size())));
    	a1.setLayoutX(r.nextInt((int) anchorPane.getWidth()-100));
    	anchorPane.getChildren().add(a1);
    	a1.setVisible(false);
	}
	
	@Override
	public void run(){
		r = new Random();
		try {
			Thread.sleep(sleep * 5000);
			a1.setVisible(true);
			while(true) {
				Thread.sleep(1000);
				Random r = new Random();
				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						if(a1.getLayoutY() >= 600){
							a1.setVisible(false);
							a1.setLayoutY(1);
							normal.lostHeart();
							if(lbl.size() == 0){
								normal.gameStop();
								normal.gameOver();
							}
						}
						else if(a1.getLayoutY() <= a1.getLayoutY()){
							a1.setLayoutY(a1.getLayoutY() + r.nextInt(10) + 5);
						}									
					}
				});
			}
		} catch (InterruptedException e) {}
	}
	
}