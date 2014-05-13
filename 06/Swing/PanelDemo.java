import javax.swing.*;


public class PanelDemo extends JFrame
{
    JLabel lblBaru = new JLabel("Label seadanya");
    JButton btnBaru = new JButton("Button yang bisa diklik");
    JTextField txtBaru = new JTextField(10);
    JTextArea areaBaru = new JTextArea(5, 3);
    JComboBox cmbBaru = null;
    
    JPanel panel = new JPanel();
    
    public PanelDemo(){
        String negara[] = {"Indonesia", "Malaysia", "Singapura", "Brunei Darussalam"}; 
        cmbBaru = new JComboBox(negara);
        
        setTitle("Demo Component Java");
        setSize(220, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        initFlow();
    }
    
    private void initFlow(){
        
        panel.add(lblBaru);
        panel.add(txtBaru);
        panel.add(areaBaru);
        panel.add(cmbBaru);
        panel.add(btnBaru);
        
        add(panel);
        pack();
        
    }
    
    public void display(){
        setVisible(true);
    }
}
