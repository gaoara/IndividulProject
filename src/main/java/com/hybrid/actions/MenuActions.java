package com.hybrid.actions;

import com.gluonhq.particle.annotation.ParticleActions;
import com.gluonhq.particle.application.ParticleApplication;
import com.gluonhq.particle.view.ViewManager;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.inject.Inject;
import org.controlsfx.control.action.ActionProxy;

@ParticleActions
public class MenuActions {

    @Inject ParticleApplication app;
    @Inject ViewManager viewManager;
    
    @ActionProxy(text="메인으로")
    private void main() {
    	System.out.println("메인으로 ...");
    	viewManager.switchView("main");
    }

    @ActionProxy(text="Exit", accelerator="alt+F4")
    private void exit() {
        app.exit();
    }
//    사기경마
    @ActionProxy(text="게임설명", accelerator="ctrl+k")
    private void horsemenual() {
    	System.out.println("사기경마 게임설명...");
    	viewManager.switchView("horsemenual");	// Main 으로 이동
    }
    
   @ActionProxy(text="게임시작", accelerator="ctrl+b")
   private void horsestart() {
   	System.out.println("사기경마 게임시작...");
   	viewManager.switchView("horsestart");	// Main 으로 이동
   }
   
// 타이핑게임
   @ActionProxy(text="게임설명", accelerator="ctrl+c")
   private void typingmanual() {
      viewManager.switchView("typingmanual");   // Manual 로 이동
   }
   
  @ActionProxy(text="게임시작", accelerator="ctrl+d")
  private void typingmain() {
     viewManager.switchView("typingmain");   // Main 으로 이동
  }

//   숫자야구게임
   @ActionProxy(text="게임설명", accelerator="ctrl+e")
   private void baseballmanual() {
	   viewManager.switchView("baseballmanual");
   }
   @ActionProxy(text="게임시작", accelerator="ctrl+f")
   private void baseballmain() {
      viewManager.switchView("baseballmain");
   }
   
// 짝 맞추기
   @ActionProxy(text="게임설명", accelerator="ctrl+g")
   private void matchingmanual() {
	   if(false){
		   Alert alert = new Alert(AlertType.INFORMATION);
	       alert.setTitle("MINIGAMES");
	       alert.setHeaderText("2016년 7월 16일 출시!");
	       alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
	       alert.setContentText("[점검중]");
	       alert.showAndWait();
	   }else{
		   viewManager.switchView("manual");		   
	   }
   }
   @ActionProxy(text="게임시작", accelerator="ctrl+h")
   private void matchingmain() {
	   if(false) {
		   Alert alert = new Alert(AlertType.INFORMATION);
	       alert.setTitle("MINIGAMES");
	       alert.setHeaderText("2016년 7월 16일 출시!");
	       alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
	       alert.setContentText("[점검중]");
	       alert.showAndWait();
	   } else {
		   viewManager.switchView("primary");		   
	   }
   }
   
// 마방진게임
   @ActionProxy(text="게임설명", accelerator="ctrl+i")
   private void howto() {
      System.out.println("howto");
      viewManager.switchView("howto");
   }
   
   @ActionProxy(text="게임시작", accelerator="ctrl+j")
   private void game() {
      System.out.println("game");
      viewManager.switchView("game");
   }
   /*---------------------------------------------------------------------*/
   @ActionProxy(text = "Home")
   private void goHome() {
       viewManager.switchView("main");
   }
   
   @ActionProxy(text="About")
   private void about() {
       Alert alert = new Alert(AlertType.INFORMATION);
       alert.setTitle("MINIGAMES");
       alert.setHeaderText("MINIGAMES 오신걸 환영합니다.");
       alert.setGraphic(new ImageView(new Image(MenuActions.class.getResource("/BlackApple.png").toExternalForm(), 48, 48, true, true)));
       alert.setContentText("문의사항은 정병욱 학우를 찾아주세요.");
       alert.showAndWait();
   }   
}