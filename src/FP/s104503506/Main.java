package FP.s104503506;



import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

class input {

	@FXML
	private ImageView inputbg;

	@FXML 
	TextField inputbox;
	@FXML
	public Button btn;
	@FXML
	public Button rulebtn;

    @FXML
    private void initialize() {
    	inputbg.setImage ( new Image ("file:images/inputbg.jpg") );
    }
    
   public void setScene(Scene scene){		
    }

}


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("startpage.fxml"));
        input i = new input ();
        fxmlLoader.setController(i);
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("<3<3<3~ ~ poketto kyouzyu ~ ~<3<3<3");
        Scene scene = new Scene ( root, 1200,700 );
        i.setScene ( scene );
        primaryStage.setScene(scene);
        primaryStage.show();
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
            	
            	 if(event.getCode() == KeyCode.ENTER) {
            		 
            		 FXMLLoader Loader = new FXMLLoader(getClass().getResource("mapping.fxml"));
             		Controller controller = new Controller ();
             		Loader.setController(controller);
             		Controller.k=i.inputbox.getText();
             		if(i.inputbox.getText().trim().isEmpty()){
             			Controller.k="PLAYER1";
             		}
                     Parent root;
 					try {
 						root = Loader.load();
 						//primaryStage.setTitle("my pokemon<3<3<3");
 	                    Scene scene2 = new Scene ( root, 1200,700 );
 	                    controller.setScene ( scene2 );
 	                    primaryStage.setScene(scene2);
 	                    primaryStage.show();
 					} catch (IOException e) {
 						// TODO Auto-generated catch block
 						e.printStackTrace();
 					}
                     
                 }
            }
        });
        
        i.btn.setOnAction ( new EventHandler<ActionEvent> () {
            
			@Override
            public void handle ( ActionEvent event ){

            		FXMLLoader Loader = new FXMLLoader(getClass().getResource("mapping.fxml"));
            		Controller controller = new Controller ();
            		Loader.setController(controller);
            		Controller.k=i.inputbox.getText();
            		
            		if(i.inputbox.getText().trim().isEmpty()){
             			Controller.k="PLAYER1";
             		}
                    Parent root;
					try {
						root = Loader.load();
						//primaryStage.setTitle("my pokemon<3<3<3");
	                    Scene scene2 = new Scene ( root, 1200,700 );
	                    controller.setScene ( scene2 );
	                    primaryStage.setScene(scene2);
	                    primaryStage.show();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    
              
            	
            }
        } );
        
        i.rulebtn.setOnAction ( new EventHandler<ActionEvent> () {
            
			@Override
            public void handle ( ActionEvent event ){
				FXMLLoader Loader = new FXMLLoader(getClass().getResource("rule.fxml"));
				Stage s= new Stage();
				Parent root;
				try {
					root = Loader.load();
					//primaryStage.setTitle("my pokemon<3<3<3");
                    Scene scene2 = new Scene ( root, 1200,700 );
                    s.setScene(scene2);
                    s.setTitle("HOW TO PLAY");
                    s.setX(100);
                    s.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
            }
        } );
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
