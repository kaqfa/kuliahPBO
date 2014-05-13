import javax.swing.*;
import java.awt.GridLayout;
/**
 * Write a description of class GridDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GridDemo extends JFrame
{
    JPanel panel = new JPanel();
    //JButton buttons[] = new JButton[20];
    
    public GridDemo(){
        initUI();
    }
    
    private void initUI(){
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        
        panel.add(new JButton("Clear"));
        panel.add(new JButton("Back"));
        panel.add(new JLabel(""));
        panel.add(new JButton("Close"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("x"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        
        add(panel);
        
        setTitle("Demo Grid Layout");
        setSize(350,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);    
    }
    
    public void display(){
        setVisible(true);
    }
}
