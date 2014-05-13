import javax.swing.*;
/**
 * Write a description of class ComponentDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComponentDemo extends JFrame
{
    JLabel lblBaru = new JLabel("Label seadanya");
    JButton btnBaru = new JButton("Button yang bisa diklik");
    JTextField txtBaru = new JTextField(10);
    JTextArea areaBaru = new JTextArea(5, 3);
    JComboBox cmbBaru = null;
    
    
    public ComponentDemo(){
        String negara[] = {"Indonesia", "Malaysia", "Singapura", "Brunei Darussalam"}; 
        cmbBaru = new JComboBox(negara);
        
        setTitle("Demo Component Java");
        setSize(220, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initNull();
    }
    
    
    
    private void initNull(){
        setLayout(null);
        
        lblBaru.setBounds   (10, 10, 190, 20);
        txtBaru.setBounds   (10, 40, 190, 20);
        areaBaru.setBounds  (10, 70, 190, 20);
        cmbBaru.setBounds   (10, 100, 190, 20);
        btnBaru.setBounds   (10, 130, 190, 20);
        
        getContentPane().add(lblBaru);
        getContentPane().add(txtBaru);
        getContentPane().add(areaBaru);
        getContentPane().add(cmbBaru);
        getContentPane().add(btnBaru);
        
    }
    
    public void display(){
        setVisible(true);
    }
}
