import javax.swing.*;
import java.awt.event.*;

public class InstantSwing
{
    JFrame window = new JFrame("Swing tanpa inherit");
    
    public InstantSwing(){
        initUI();
    }
    
    private void initUI(){
        window.setSize(300,300);
        window.setLayout(null);
        
        JButton btnExit = new JButton("Keluar");
        btnExit.setBounds(50,60,80,30);
        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        
        window.getContentPane().add(btnExit);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void show(){
        window.setVisible(true);
    }
}
