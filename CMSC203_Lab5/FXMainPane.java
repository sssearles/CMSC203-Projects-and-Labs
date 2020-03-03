


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button	b1, b2, b3, bonusButton, b4, b5;
	Label	label;
	TextField	info;
	//  declare two HBoxes
	HBox	box1, box2;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager	dataMGR;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	public  FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
	    b1 = new Button("Hello");
		b2 = new Button("Howdy");
		b3 = new Button("Chinese");
		bonusButton = new Button("Spanish");
		b4 = new Button("Clear");
		b5 = new Button("Exit");
		label = new Label("Feedback");
		info = new TextField();
		
		//  instantiate the HBoxes
		box1 = new HBox();
		box2 = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		dataMGR = new DataManager();
		//  set margins and set alignment of the components
		box2.setMargin(b1, new Insets(10));
		box2.setMargin(b2, new Insets(10));
		box2.setMargin(b3, new Insets(10));
		box2.setMargin(bonusButton,  new Insets(10));
		box2.setMargin(b4, new Insets(10));
		box2.setMargin(b5, new Insets(10));
		box1.setAlignment(Pos.CENTER);
		box1.setAlignment(Pos.CENTER);		
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		box1.getChildren().addAll(label, info);
		//  add the buttons to the other HBox
		box2.getChildren().addAll(b1, b2, b3, bonusButton, b4, b5);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(box1, box2);
		
		b1.setOnAction(new ButtonHandler());
		b2.setOnAction(new ButtonHandler());
		b3.setOnAction(new ButtonHandler());
		b4.setOnAction(new ButtonHandler());
		b5.setOnAction(new ButtonHandler());
		bonusButton.setOnAction(new ButtonHandler());
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			if (event.getTarget()==b1) {
				info.setText(dataMGR.getHello());
			}
			else if (event.getTarget()==b2) {
				info.setText(dataMGR.getHowdy());
			}
			else if (event.getTarget()==b3) {
				info.setText(dataMGR.getChinese());
			}
			else if (event.getTarget()==bonusButton) {
				info.setText(dataMGR.getSpanish());
			}
			else if (event.getTarget()==b4) {
				info.setText("");
			}
			else if (event.getTarget()==b5) {
				Platform.exit();
				System.exit(0);
			}
		}
	}
}
	