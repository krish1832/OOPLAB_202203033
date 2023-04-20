import java.applet.Applet;  
import java.awt.*; 
import java.util.*;
import java.util.Date;// used  

public class krish2 extends Applet{
TextField textField;
			
public void init(){

textField = new TextField("",20);
add(textField);
}  

public void start(){
textField.requestFocus();
}

public void paint(Graphics g){  
   g.drawString("Enter Your name",15,20);
   String inputString =textField.getText();
   g.drawString("Hello, "+inputString,20,40);
}  
}
