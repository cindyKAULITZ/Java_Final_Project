package FP.s104503506;


import java.io.IOException;
import java.nio.file.Paths;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;






public class Controller {
	static String k=new String();
	static boolean musicny=true;
	static boolean first=true;
	static boolean end;
	static boolean escape;
	static boolean monster1=true;
	static boolean monster2=true;
	static boolean monster3=true;
	static boolean monster4=true;
	static boolean monster5=true;
	static boolean monster6=true;
	static boolean monster7=true;
	static boolean monster8=true;
	static boolean monster9=true;
	static boolean monster10=true;
	static boolean monster11=true;
	static boolean monster12=true;
	public static double lastx;
	public static double lasty;
	
	static int lastball=10;
	static int yourgrade=0;
	
	@FXML
	private ImageView player;
	
	@FXML
	private Label name;
	@FXML
	Label ballnum;
	@FXML
	private Button sound;
	@FXML
	private Label gradename;
	@FXML
	Label grade;
	
	Media m = new Media(Paths.get("images/index.wav").toUri().toString());
	MediaPlayer play=new MediaPlayer(m);
	//@FXML
	//private ImageView sad;

	
	
	private AnimationTimer rectangleAnimation;
    private long lastUpdateTime = 0;
    

    @FXML
     private void initialize() {
    	
    	grade.setText(yourgrade+"");
    	
    	if(Monster.ballminus){
    		lastball--;
    		
    	}
    	play.
    	setCycleCount(AudioClip.INDEFINITE);
    	play.play();
         	
    	
    	player.setImage ( new Image ("file:images/right.gif") );
    	//sad.setImage ( new Image ("file:images/sad.png") );
    	name.setText(k);
    	ballnum.setText(lastball+"");
    	player.setTranslateX(lastx);
	    player.setTranslateY(lasty);
	    

	    
        rectangleAnimation = new AnimationTimer() {
            @Override
            public void handle(long timestamp) {
            	
            	System.out.println("***********************"+lastball);
                if (lastUpdateTime > 0) {
                  // final double elapsedSeconds = (timestamp - lastUpdateTime) / 1_000_000_0 ;
                   
                    System.out.println("\nplayer.getScaleX()  "+player.getTranslateX());
                    System.out.println("player.getScaleY()  "+player.getTranslateY());
                   //set edge
                    if(player.getTranslateX()>1140||player.getTranslateX()<-40||player.getTranslateY()>520||player.getTranslateY()<-40){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>40&&player.getTranslateX()<160&&player.getTranslateY()>-60&&player.getTranslateY()<40){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=-40&&player.getTranslateX()<=40&&player.getTranslateY()>=200&&player.getTranslateY()<=220){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=0&&player.getTranslateX()<=100&&player.getTranslateY()>=100&&player.getTranslateY()<=140){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=100&&player.getTranslateX()<=140&&player.getTranslateY()>=40&&player.getTranslateY()<=280){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=140&&player.getTranslateX()<=180&&player.getTranslateY()>=140&&player.getTranslateY()<=280){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=180&&player.getTranslateX()<=240&&player.getTranslateY()>=200&&player.getTranslateY()<=220){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=-40&&player.getTranslateX()<=0&&player.getTranslateY()>=290&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=100&&player.getTranslateX()<=180&&player.getTranslateY()>=400&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=100&&player.getTranslateX()<=380&&player.getTranslateY()>=480&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=240&&player.getTranslateX()<=400&&player.getTranslateY()>=440&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=300&&player.getTranslateX()<=440&&player.getTranslateY()>=360&&player.getTranslateY()<=420){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=240&&player.getTranslateX()<=440&&player.getTranslateY()>=300&&player.getTranslateY()<=360){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=340&&player.getTranslateX()<=440&&player.getTranslateY()>=100&&player.getTranslateY()<=420){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=240&&player.getTranslateX()<=480&&player.getTranslateY()>=100&&player.getTranslateY()<=120){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=300&&player.getTranslateX()<=480&&player.getTranslateY()>=120&&player.getTranslateY()<=180){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=500&&player.getTranslateX()<=640&&player.getTranslateY()>=440&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=440&&player.getTranslateX()<=480&&player.getTranslateY()>=100&&player.getTranslateY()<=220){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=400&&player.getTranslateX()<=500&&player.getTranslateY()>=480&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=440&&player.getTranslateX()<=700&&player.getTranslateY()>=-40&&player.getTranslateY()<=-20){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=480&&player.getTranslateX()<=700&&player.getTranslateY()>=-20&&player.getTranslateY()<=20){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=540&&player.getTranslateX()<=700&&player.getTranslateY()>=20&&player.getTranslateY()<=140){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=600&&player.getTranslateX()<=700&&player.getTranslateY()>=140&&player.getTranslateY()<=240){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=540&&player.getTranslateX()<=740&&player.getTranslateY()>=240&&player.getTranslateY()<=320){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=500&&player.getTranslateX()<=540&&player.getTranslateY()>=300&&player.getTranslateY()<=320){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=540&&player.getTranslateX()<=640&&player.getTranslateY()>=320&&player.getTranslateY()<=380){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=1040&&player.getTranslateX()<=1140&&player.getTranslateY()>=-60&&player.getTranslateY()<=80){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=1080&&player.getTranslateX()<=1140&&player.getTranslateY()>=80&&player.getTranslateY()<=220){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=700&&player.getTranslateX()<=740&&player.getTranslateY()>=440&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=800&&player.getTranslateX()<=840&&player.getTranslateY()>=380&&player.getTranslateY()<=460){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=880&&player.getTranslateX()<=920&&player.getTranslateY()>=440&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=980&&player.getTranslateX()<=1040&&player.getTranslateY()>=380&&player.getTranslateY()<=460){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=1080&&player.getTranslateX()<=1140&&player.getTranslateY()>=440&&player.getTranslateY()<=520){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=740&&player.getTranslateX()<=940&&player.getTranslateY()>=185&&player.getTranslateY()<=200){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=740&&player.getTranslateX()<760&&player.getTranslateY()>=-60&&player.getTranslateY()<200){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=740&&player.getTranslateX()<=940&&player.getTranslateY()>=-60&&player.getTranslateY()<=-20){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>920&&player.getTranslateX()<=940&&player.getTranslateY()>=-60&&player.getTranslateY()<=40){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>920&&player.getTranslateX()<=940&&player.getTranslateY()>=140&&player.getTranslateY()<=190){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=740&&player.getTranslateX()<=840&&player.getTranslateY()>=40&&player.getTranslateY()<=80){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    if(player.getTranslateX()>=800&&player.getTranslateX()<=880&&player.getTranslateY()>=140&&player.getTranslateY()<=180){
                    	player.setTranslateX(lastx);
                    	player.setTranslateY(lasty);
                    }
                    

                    
                    // monster location
                    if(player.getTranslateX()>=80&&player.getTranslateX()<=100&&player.getTranslateY()>=440&&player.getTranslateY()<=460&& (monster1==true)){
                    	
                    	monster1=false;
                    	play.stop();
                    	Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=1;
						Loader.setController(monster);
				        Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
  
                    }
                    
                    if(player.getTranslateX()>=270&&player.getTranslateX()<=280&&player.getTranslateY()>=400&&player.getTranslateY()<=430&& (monster2==true)){
                    	
                    	monster2=false;
                    	play.stop();
                    	Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=2;
						Loader.setController(monster);
				        Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				       
					    
                    }

                    if(player.getTranslateX()>=270&&player.getTranslateX()<=280&&player.getTranslateY()>=240&&player.getTranslateY()<=270&& (monster3==true)){
	
						monster3=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=3;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }					

                    if(player.getTranslateX()>=230&&player.getTranslateX()<=270&&player.getTranslateY()>=140&&player.getTranslateY()<=180&& (monster4==true)){
                    	
						monster4=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=4;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                   
                    if(player.getTranslateX()>=160&&player.getTranslateX()<=220&&player.getTranslateY()>=-20&&player.getTranslateY()<=10&& (monster5==true)){
                    	
						monster5=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=5;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    
                    if(player.getTranslateX()>=500&&player.getTranslateX()<=560&&player.getTranslateY()>=200&&player.getTranslateY()<=220&& (monster6==true)){
                    	
						monster6=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=6;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    
                    if(player.getTranslateX()>=360&&player.getTranslateX()<=500&&player.getTranslateY()>=380&&player.getTranslateY()<=420&& (monster7==true)){
                    	
						monster7=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=7;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    if(player.getTranslateX()>=410&&player.getTranslateX()<=460&&player.getTranslateY()>=440&&player.getTranslateY()<=460&& (monster8==true)){
                    	
						monster8=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=8;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    if(player.getTranslateX()>=820&&player.getTranslateX()<=860&&player.getTranslateY()>=500&&player.getTranslateY()<=520&& (monster9==true)){
                    	
						monster9=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=9;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    
                    if(player.getTranslateX()>=1060&&player.getTranslateX()<=1080&&player.getTranslateY()>=460&&player.getTranslateY()<=480&& (monster10==true)){
                    	
						monster10=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=10;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    if((player.getTranslateX()==980||player.getTranslateX()==460)&&player.getTranslateY()>=-20&&player.getTranslateY()<=0&& (monster11==true)){
                    	
						monster11=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=11;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    if(player.getTranslateX()>=820&&player.getTranslateX()<=860&&player.getTranslateY()>=0&&player.getTranslateY()<=20&& (monster12==true)){
                    	
						monster12=false;
						play.stop();
						Stage s;
						s=(Stage) player.getScene().getWindow();
						FXMLLoader Loader = new FXMLLoader(getClass().getResource("monsterpage.fxml"));
						Monster monster= new Monster();
						monster.monsternum=12;
						Loader.setController(monster);
					    Parent root;
						try {
							root = Loader.load();
							s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
						     Scene scene = new Scene ( root, 1200,700 );
						     monster.setScene ( scene );
						     s.setScene(scene);
						     s.show();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		   
		    
                    }
                    
                   /* else{
                    	
                     //   System.out.println("EEE");
                    }
                    if(player.getTranslateX()>=-50&&player.getTranslateX()<=500&&player.getTranslateY()>200&&player.getTranslateY()<=350){
                    	player.setTranslateX(0);
                        player.setTranslateY(0);
                    }
                    if(player.getTranslateX()>350&&player.getTranslateX()<800&&player.getTranslateY()>-100&&player.getTranslateY()<100){
                    	player.setTranslateX(0);
                        player.setTranslateY(0);
                    }
                    if(player.getTranslateX()>650&&player.getTranslateX()<850&&player.getTranslateY()>100&&player.getTranslateY()<400){
                    	player.setTranslateX(0);
                        player.setTranslateY(0);
                    }
                    if(player.getTranslateX()>800&&player.getTranslateX()<1000&&player.getTranslateY()>200&&player.getTranslateY()<400){
                    	player.setTranslateX(0);
                        player.setTranslateY(0);
                    }*/
                    
                }
                lastUpdateTime = timestamp;
            }
        };
        rectangleAnimation.start ();
    	
    	
    	
    	
    }
    
    
    public void setScene(Scene scene){
    	
    	
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	
            	 if(event.getCode() == KeyCode.UP) {
            		 lastx=player.getTranslateX();
                     lasty=player.getTranslateY();
                     player.setImage(new Image ("file:images/up.gif"));
                     player.setTranslateY ( player.getTranslateY () - 20);
                 }
                 if(event.getCode() == KeyCode.DOWN) {
                	 lastx=player.getTranslateX();
                     lasty=player.getTranslateY();
                     player.setImage(new Image ("file:images/down.gif"));
                	 player.setTranslateY ( player.getTranslateY () + 20 );
                 }
                 if(event.getCode() == KeyCode.RIGHT) {
                	 lastx=player.getTranslateX();
                     lasty=player.getTranslateY();
                     player.setImage(new Image ("file:images/right.gif"));
                	 player.setTranslateX ( player.getTranslateX () + 20 );
                 }
                 if(event.getCode() == KeyCode.LEFT) {
                	 lastx=player.getTranslateX();
                     lasty=player.getTranslateY();
                     player.setImage(new Image ("file:images/left.gif"));
                	 player.setTranslateX ( player.getTranslateX () - 20 );
                 }
                 
                 //過關 &不過關
                 if((lastball==0)&&(yourgrade>=16)||
                		 ((yourgrade>=16)&&(!monster1)&&(!monster2)&&(!monster3)&&(!monster4)&&(!monster5)&&(!monster6)&&(!monster7)&&
                				 (!monster8)&&(!monster9)&&(!monster10)&&(!monster11)&&(!monster12))){
                
              	   Endgame.mygrade=yourgrade;
              	   try {
         				Thread.sleep(250L);
         				play.stop();
         				end=true;
         				Stage s;
         				s=(Stage) player.getScene().getWindow();
         				FXMLLoader Loader = new FXMLLoader(getClass().getResource("clearpage.fxml"));
         				Endgame endgame = new Endgame ();
         				Loader.setController(endgame);
         		        Parent root;
         				try {
         					root = Loader.load();
         					s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
         				     Scene scene = new Scene ( root, 1200,700 );
         				     endgame.setScene ( scene );
         				     s.setScene(scene);
         				     s.show();
         				} catch (IOException e) {
         					// TODO Auto-generated catch block
         					e.printStackTrace();
         				}
              	   } catch (InterruptedException e1) {
         				// TODO Auto-generated catch block
         				e1.printStackTrace();
              	   }
              	   
                 }
                 else if((lastball==0)&&(yourgrade<16)||
                		 ((yourgrade<16)&&(!monster1)&&(!monster2)&&(!monster3)&&(!monster4)&&(!monster5)&&(!monster6)&&(!monster7)&&
                				 (!monster8)&&(!monster9)&&(!monster10)&&(!monster11)&&(!monster12))){
                /*	   if((Controller.yourgrade<16)&&(!Controller.monster1)&&(!monster2)&&(!monster3)&&(!monster4)&&(!monster5)&&(!monster6)&&(!monster7)&&
              				 (!monster8)&&(!monster9)&&(!monster10)&&(!monster11)&&(!monster12))
                  	 {
              		 escape=true;
                  	 }*/
              	   Endgame.mygrade=yourgrade;
              	   try {
                  	 
         				Thread.sleep(250L);
         				play.stop();
         				end=false;
         				Stage s;
         				s=(Stage) player.getScene().getWindow();
         				FXMLLoader Loader = new FXMLLoader(getClass().getResource("ggpage.fxml"));
         				Endgame endgame = new Endgame ();
              		Loader.setController(endgame);
         		        Parent root;
         				try {
         					root = Loader.load();
         					s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
         				     Scene scene = new Scene ( root, 1200,700 );
         				     endgame.setScene ( scene );
         				     s.setScene(scene);
         				     s.show();
         				} catch (IOException e) {
         					// TODO Auto-generated catch block
         					e.printStackTrace();
         				}
         				} catch (InterruptedException e1) {
         				// TODO Auto-generated catch block
         				e1.printStackTrace();
         				}
              	   
              	   
                 }
                 
           /*else if ((lastball==10)&&(yourgrade<16)&&(!monster1)&&(!monster2)&&(!monster3)&&(!monster4)&&(!monster5)&&(!monster6)&&(!monster7)&&
        		(!monster8)&&(!monster9)&&(!monster10)&&(!monster11)&&(!monster12)){
                	
          	   try {
              	 
     				Thread.sleep(250L);
     				play.stop();
                    escape=true;
               	   Endgame.mygrade=yourgrade;
     				end=false;
     				Stage s;
     				s=(Stage) player.getScene().getWindow();
     				FXMLLoader Loader = new FXMLLoader(getClass().getResource("ggpage.fxml"));
     				Endgame endgame = new Endgame ();
          		Loader.setController(endgame);
     		        Parent root;
     				try {
     					root = Loader.load();
     					s.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
     				     Scene scene = new Scene ( root, 1200,700 );
     				     endgame.setScene ( scene );
     				     s.setScene(scene);
     				     s.show();
     				} catch (IOException e) {
     					// TODO Auto-generated catch block
     					e.printStackTrace();
     				}
     				} catch (InterruptedException e1) {
     				// TODO Auto-generated catch block
     				e1.printStackTrace();
     				}
          	    
                 }*/
                 
            }
        });
        

        sound.setOnAction ( new EventHandler<ActionEvent> () {
            
			@Override
            public void handle ( ActionEvent event ){
					
           musicny=!musicny;
           if(musicny){
            	play.play();
            	}
            	else{
            	play.pause();
            	}
           
			}
        } );
        
        
        
    }


}


