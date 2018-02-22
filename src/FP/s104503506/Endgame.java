package FP.s104503506;

import java.nio.file.Paths;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Endgame {
		static int mygrade;
		@FXML
		private Label fgrade;
		@FXML
		 Label label;

	    @FXML
	    private void initialize() {
	    	fgrade.setText(mygrade+"");
			   if(Controller.escape){
					  label.setText("逃避可恥而且沒有用!!");
				   }
	    	}
	    	
	    

	   public void setScene(Scene scene){
		

		  	Media m ;
			MediaPlayer music;
		   if(Controller.end){
	    		m = new Media(Paths.get("images/over.mp3").toUri().toString());
	    	}
	    	else{
	    		m = new Media(Paths.get("images/gg2.mp3").toUri().toString());
	    		
	    	}
		   
			music=new MediaPlayer(m);
    		music.setCycleCount(AudioClip.INDEFINITE);
    		music.setAutoPlay(true);
    		//music.play();
		   
	    }

	
}
