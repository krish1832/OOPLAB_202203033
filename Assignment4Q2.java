import java.applet.Applet;  
import java.awt.*; 
import java.util.Date;// used  

public class krish2 extends Applet{
		
Choice color;
public void init(){


color=new Choice();

color.add("WHITE");
color.add("BLUE");
color.add("RED");
color.add("YELLOW");
color.add("BLACK");
add(color);

}  

public void paint(Graphics g){  

  
      String selectedColor = color.getSelectedItem();
   switch(selectedColor) {
      case "WHITE":
         setBackground(Color.WHITE);
         break;
      case "BLUE":
         setBackground(Color.BLUE);
         break;
      case "RED":
         setBackground(Color.RED);
         break;
      case "YELLOW":
         setBackground(Color.YELLOW);
         break;
      case "BLACK":
         setBackground(Color.BLACK);
         break;
      default:
         setBackground(Color.WHITE);
         break;
   }


}  
}
