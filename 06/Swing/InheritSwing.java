import javax.swing.*;
import java.awt.event.*;


public class InheritSwing extends JFrame
{
    public InheritSwing(){
        initUI();
    }
    
    private void initUI(){
        JButton btnExit = new JButton("Keluar");
        btnExit.setBounds(50, 60, 80, 30);
        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evnt){
                System.exit(0);
            }
        });
        
        setLayout(null);
        getContentPane().add(btnExit);
        
        setTitle("Sample JFrame with Inherit");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
