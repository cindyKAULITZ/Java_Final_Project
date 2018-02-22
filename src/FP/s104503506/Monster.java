package FP.s104503506;

import java.io.IOException;
import java.nio.file.Paths;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Monster {

	@FXML
	private ImageView bg;
	@FXML
	private ImageView role;
	@FXML
	private ImageView mons;
	@FXML
	private ImageView runcatch;
	@FXML
	private ImageView bloodname;
	@FXML
	private Label text;
	@FXML
	private Label text1;
	@FXML
	private Label leftblood;
	@FXML
	private Label blood;
	@FXML
	private Label monsleftblood;
	boolean back=false;
	float monsblood=100;
	float yourblood=100;
	double monsterplus;
	String monsname;
	int monsgrade;
	String monstalk1;
	String monstalk2;
	int monsternum;
	boolean run=false;
	boolean bat=false;
	public static boolean ballminus=false;
	Media m = new Media(Paths.get("images/battle.wav").toUri().toString());
	MediaPlayer play=new MediaPlayer(m);
    private AnimationTimer rectangleAnimation;
    private double rectangleSpeedX = 500 ;
    private long lastUpdateTime = 0;
	@FXML
    private void initialize() {
		ballminus=false;
		play.
    	setCycleCount(AudioClip.INDEFINITE);
    	play.play();
    	//bg.setImage ( new Image ("file:images/battleBackground.png") );
    	role.setImage ( new Image ("file:images/battleRole.png") );
    	role.setTranslateX(-500);
    	mons.setTranslateX(800);
    	if(monsternum==1){
    		mons.setImage ( new Image ("file:images/mons1.png") );
    		monsterplus = 6.8;
    		monsgrade=3;
    		monsname="亡镓鑋";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有3學分!!");
    		
    	}else if(monsternum==2){

    		mons.setImage ( new Image ("file:images/mons2.png") );
    		monsterplus = 6.3;
    		monsgrade=3;
    		monsname="甦猼臍";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有3學分!!");
    		}
		else if(monsternum==3){

			mons.setImage ( new Image ("file:images/mons3.png") );
			monsterplus = 5.6;
			monsgrade=2;
    		monsname="鰤漍嗔";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有2學分!!");
			}
		else if(monsternum==4){

			mons.setImage ( new Image ("file:images/mons4.png") );
			monsterplus = 6.1;
			monsgrade=2;
    		monsname="鄣匱縜";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有2學分!!");
			}
		else if(monsternum==5){

			mons.setImage ( new Image ("file:images/mons5.png") );
			monsterplus = 6.7;
			monsgrade=3;
    		monsname="糧得蠑";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有3學分!!");
			}
		else if(monsternum==6){
			monsterplus = 6.2;
			mons.setImage ( new Image ("file:images/mons6.png") );
			monsgrade=3;
    		monsname="嫜镓彚";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有3學分!!");
			}
		else if(monsternum==7){

			mons.setImage ( new Image ("file:images/mons7.png") );
			monsterplus = 6.4;
			monsgrade=2;
    		monsname="蚟餵韌";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有2學分!!");
			}
		else if(monsternum==8){

			mons.setImage ( new Image ("file:images/mons8.png") );
			monsterplus = 6.5;
			monsgrade=1;
    		monsname="猻慜得";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有1學分!!");
			}
		else if(monsternum==9){

			mons.setImage ( new Image ("file:images/mons9.png") );
			monsterplus = 6.3;
			monsgrade=2;
    		monsname="塵罄汗";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有2學分!!");
			}
		else if(monsternum==10){

			mons.setImage ( new Image ("file:images/mons10.png") );
			monsterplus = 6.1;
			monsgrade=1;
    		monsname="辰厭聞";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有1學分!!");
			}
		else if(monsternum==11){

			mons.setImage ( new Image ("file:images/mons11.png") );
			monsterplus = 5.0;
			monsgrade=2;
    		monsname="症酗湧";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有2學分!!");
			}
		else if(monsternum==12){

			mons.setImage ( new Image ("file:images/mons12.png") );
			monsterplus = 6.6;
			monsgrade=3;
    		monsname="症擁鑌";
    		monstalk1="啊!是";
    		monstalk1=monstalk1.concat(monsname).concat("，打倒他有3學分!!");
			}

    	

    	text.setText(monstalk1);
    	  rectangleAnimation = new AnimationTimer() {
              @Override
              public void handle(long timestamp) {
                  if (lastUpdateTime > 0) {
                	  if(role.getTranslateX()<=70){
                      final double elapsedSeconds = (timestamp - lastUpdateTime) / 1_000_000_000.0 ;
                      final double deltaX = elapsedSeconds * rectangleSpeedX;
                      final double oldX = role.getTranslateX();
                      final double newX =oldX + deltaX;
                      role.setTranslateX(newX);
                	  }
                	  if(mons.getTranslateX()>=90){
                          final double elapsedSeconds = (timestamp - lastUpdateTime) / 1_000_000_000.0 ;
                          final double deltaX = elapsedSeconds * (- rectangleSpeedX);
                          final double oldX = mons.getTranslateX();
                          final double newX =oldX + deltaX;
                          mons.setTranslateX(newX);
                    	  }
                	

                  }
                  lastUpdateTime = timestamp;
              }
          };
          rectangleAnimation.start ();
    	//mons.setImage ( new Image ("file:images/monster5.png") );
    	
    	//runcatch.setImage ( new Image ("file:image/catchOption.png") );
    	//System.out.println(k);

    	
    }
    
    
    public void setScene(Scene scene){
    	scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	  if(back){
            		  play.stop();
						Stage s;
						s=(Stage) bg.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("mapping.fxml"));
						Controller controller= new Controller();
						Loader.setController(controller);
				        Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
					        Scene scene = new Scene ( root, 1200,700 );
					        controller.setScene ( scene );
							s.setScene(scene);
					        s.show();		
					       
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
            	  }
            	
            	 if(event.getCode() == KeyCode.X) {
            		 if(!run){
            			 runcatch.setImage(new Image ("file:images/runOption.png"));
            		
            		 }
            		 else{
            			 runcatch.setImage(new Image ("file:images/catchOption.png"));
            		 }
            		 run=!run;
                 }
            	 if(event.getCode() == KeyCode.Z && (bat==true)){
            		 try {
						Thread.sleep(250L);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            		 if(yourblood>0&&monsblood>0){
            		 new java.util.Random();
            		 yourblood-=(monsterplus)*Math.random();
            		 leftblood.setText(yourblood+"");
            		 monsblood-=(7.1-((monsterplus-6)*0.4))*Math.random();
            		 monsleftblood.setText(monsblood+"");
            		 }
            		 if(yourblood<=0&&monsblood>0){
            			 leftblood.setText(0+"");
            			 text.setText("輸了...沒學分了Q_Q，去找下個叫獸!");
            			 text1.setText("[任意鍵返回~]");
            			 back=true;
            		 }
            		 else if(monsblood<=0&&yourblood>0){
            			 monsleftblood.setText(0+"");
            			 text.setText("贏了!!!謝謝叫獸!!學分get!");
            			 text1.setText("[任意鍵返回~]");
            			 if(!back){
            			 Controller.yourgrade+=monsgrade;
            			 }
            			 back=true;
            		 }
            		 else if(monsblood<0&&yourblood<0&&yourblood>=monsblood){
            			 monsleftblood.setText(0+"");
            			 leftblood.setText(Math.random()+"");
            			 text.setText("低空飛過啊!!!幸好幸好!學分get!");
            			 text1.setText("[任意鍵返回~]");
            			 if(!back){
            			 Controller.yourgrade+=monsgrade;
            			 }
            			 back=true;
            		 }
            		 else if(monsblood<0&&yourblood<0&&yourblood<monsblood){
            			 monsleftblood.setText(Math.random()+"");
            			 leftblood.setText(0+"");
            			 text.setText("WTF!!59分被當Q_Q...，去找下個叫獸!");
            			 text1.setText("[任意鍵返回~]");
            			 back=true;
            		 }
            		 
            	 }
            	 if(event.getCode() == KeyCode.ENTER) {
            		 
            		 if(!run){
            				 ballminus=true;
            				 bat=true;
            		 }
            		 if(run){
            			 play.stop();
 						Stage s;
 						s=(Stage) bg.getScene().getWindow();
 						FXMLLoader Loader = new FXMLLoader(getClass().getResource("mapping.fxml"));
 						Controller controller= new Controller();
 						Loader.setController(controller);
 				        Parent root;
 						try {
 							root = Loader.load();
 							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
 					        Scene scene = new Scene ( root, 1200,700 );
 					        controller.setScene ( scene );
 							s.setScene(scene);
 					        s.show();		
 					       
 						} catch (IOException e) {
 							// TODO Auto-generated catch block
 							e.printStackTrace();
 						}
				        
            		 }
            		
            		 }
                 }
                	        
                 
                
            
        });

    	
    }
	
	
}

