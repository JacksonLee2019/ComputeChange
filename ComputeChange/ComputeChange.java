//Programmer:Jackson Lee
//Program:ComputeChange
//Purpose:give change in dollars, quarters, dimes, nickels, and pennies
import javax.swing.*;
import java.io.*;
public class ComputeChange
{
  public static void main(String[]args){
    String money;  
    double m;
    int dollars, quarters, dimes, nickels, pennies;
    
    money = JOptionPane.showInputDialog("Enter the amount you would like changed");
    m = Double.parseDouble(money);
    
    dollars = (int)m;
    pennies = (int) Math.ceil(((m - dollars) * 100)); 
    quarters = pennies / 25; 
    pennies = pennies - (quarters * 25); 
    dimes = pennies / 10; 
    pennies = pennies - (dimes * 10); 
    nickels = pennies / 5; 
    pennies = pennies - (nickels * 5);
    
    JOptionPane.showMessageDialog(null,"Your change is:\n"+dollars+" dollars\n"+quarters+" quarters\n"+dimes+" dimes\n"+nickels+" nickels\n"+pennies+" pennies");
    
    
    
    
    }
}
