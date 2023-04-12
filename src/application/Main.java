package application;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Main extends Application {

  TextField txtOutput = new TextField();
  TextField txtFace = new TextField();
  
  private float inputValue = 0.0f;

  private Calculator calculator = new Calculator();
  private Face face = new Face();

  public static void main(String[] args) {
    launch(args);
    
  }
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  display();
    // Create a scene by calling the getPane() method and place it in the stage
    Scene scene = new Scene(getPane(calculator, txtOutput, txtFace), 200, 250);
    primaryStage.setTitle("Fun Calculator"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public void setInputValue(int newValue) {
	  inputValue = newValue;
  }
  
  


  /**
   * getPane() returns a pane to be used with the scene of this calculator.
   * In this method, you will need to generate the GUI of this calculator. Use different kinds of panes for alignment
   * This method will also implement the event handlers for each button press. You may elect to divide the load among multiple methods if you prefer.
   */
 protected BorderPane getPane(Calculator calculator, TextField txtOutput, TextField txtFace) {
	// GUI
	BorderPane mainPane = new BorderPane();
	mainPane.setPadding(new Insets(30, 30, 20, 20));
	
	
	
	
	
	HBox topRow = new HBox();
	
	// Add calculation and reaction to the top row
	topRow.getChildren().addAll(txtOutput, txtFace);
	
	// Input Calculator GUI
	// Create Grid
	GridPane grid = new GridPane();
	grid.setHgap(5);
	grid.setVgap(5);
	grid.setAlignment(Pos.CENTER);

	Button seven = new Button("7");
	GridPane.setConstraints(seven, 0, 0);
	Button eight = new Button("8");
	GridPane.setConstraints(eight, 1, 0);
	Button nine = new Button("9");
	GridPane.setConstraints(nine, 2, 0);
	Button divide = new Button("/");
	GridPane.setConstraints(divide, 3, 0);
	grid.getChildren().addAll(seven, eight, nine, divide);
	
	
	// Third Row
	
	Button four = new Button("4");
	GridPane.setConstraints(four, 0, 1);
	Button five = new Button("5");
	GridPane.setConstraints(five, 1, 1);
	Button six = new Button("6");
	GridPane.setConstraints(six, 2, 1);
	Button multiply = new Button("*");
	GridPane.setConstraints(multiply, 3, 1);
	grid.getChildren().addAll(four, five, six, multiply);
	
	//Fourth Row
	
	Button one = new Button("1");
	GridPane.setConstraints(one, 0, 2);
	Button two = new Button("2");
	GridPane.setConstraints(two, 1, 2);
	Button three = new Button("3");
	GridPane.setConstraints(three, 2, 2);
	Button minus = new Button("-");
	GridPane.setConstraints(minus, 3, 2);
	grid.getChildren().addAll(one, two, three, minus);
	
	//Fifth Row
	
	Button zero = new Button("0");
	GridPane.setConstraints(zero, 1, 3);
	Button clear = new Button("C");
	GridPane.setConstraints(clear, 2, 3);
	Button plus = new Button("+");
	GridPane.setConstraints(plus, 3, 3);
	grid.getChildren().addAll(zero,clear,plus);
	
	
	mainPane.setTop(topRow);
	mainPane.setCenter(grid);
	
	
	
	// Handlers
	
	
	
	//Numbers
	one.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 1;
			txtOutput.setText("1.0");
			
		}
		
	});
	two.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 2;
			txtOutput.setText("2.0");
			
		}
		
	});
	three.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 3;
			txtOutput.setText("3.0");
			
		}
		
	});
	four.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 4;
			txtOutput.setText("4.0");
			
		}
		
	});
	five.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 5;
			txtOutput.setText("5.0");
		}
		
	});
	six.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 6;
			txtOutput.setText("6.0");
		}
		
	});
	seven.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 7;
			txtOutput.setText("7.0");
		}
		
	});
	eight.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 8;
			txtOutput.setText("8.0");
			
		}
		
	});
	nine.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 9;
			txtOutput.setText("9.0");
		}
		
	});
	zero.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			inputValue = 0;
			txtOutput.setText("0.0");
		}
		
	});
	
	
	//Operations
	plus.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			calculator.add(inputValue);
			display();
		}
		
	});
	minus.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			calculator.subtract(inputValue);
			display();
		}
		
	});
	multiply.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			calculator.multiply(inputValue);
			display();
		}
		
	});
	divide.setOnAction(new EventHandler<ActionEvent>() {

		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			calculator.divide(inputValue);
			display();
		}
		
	});
	
	// Clear
	clear.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			calculator.clearAccum();
			inputValue = 0.0f;
			txtOutput.setText("0.0");
		}
	});
	  
    return mainPane;
  }
 //----------------------------------------------------------
 /**
  * This method checks the accumulator value and by calling getAccumValue(). based on this value it either calls the 
  * face.makeHappy() or  face.makeSad() and sets the face to happy/sad in txtFace
  * Will be called whenever one of the operation buttons is pressed
  */
 public void display(){

	//Your code goes here .....
	 
	 float currentVal = calculator.getAccumValue();
	 
	 if(currentVal >= 0) {
		 txtFace.setText(":-)");
	 }else {
		 txtFace.setText(":-(");
	 }
	 txtOutput.setText("" + calculator.getAccumValue());
	 System.out.println(calculator.getAccumValue());
	 
	}
}
//*********************************************************
class Calculator
{
  private float currentAccumValue;
  public Calculator (){
		currentAccumValue = 0.0f;
  }

  public void add(float inputValue){
      currentAccumValue+= inputValue;
  }

  public void subtract(float inputValue){
      currentAccumValue-= inputValue;
  }

  public void multiply(float inputValue){
      currentAccumValue*= inputValue;
  }

  public void divide(float inputValue){
	  if(inputValue == 0) {
          JOptionPane.showMessageDialog(null, "Error: You cannot divide by 0!", "Error",
                  JOptionPane.INFORMATION_MESSAGE);
	  } else {
      	  currentAccumValue /= inputValue;
	  }
  }

  public void clearAccum(){
      currentAccumValue = 0;
  }
  public float getAccumValue(){
      return currentAccumValue;
  }
}
//*********************************************************

class Face
{
  private boolean faceState;

  public Face(){
	makeHappy();
  }

  public void makeHappy(){
      faceState = true;
  }

  public void makeSad(){
      faceState = false;
  }

  public boolean getFaceState(){
      return faceState;

  }
}




