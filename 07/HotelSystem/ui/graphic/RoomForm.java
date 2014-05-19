package ui.graphic;

import javax.swing.*;
import java.awt.event.*;

import component.Room;
import java.util.*;

/**
 * Write a description of class RoomForm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoomForm extends JFrame
{
    JLabel lblNoKamar, lblClass;
    JTextField txtNoKamar;
    JComboBox cbClass;
    JTextArea txtStatus;
    
    JButton btnSimpan, btnReset;
    
    ArrayList<Room> listRoom = new ArrayList<Room>();

    
    public RoomForm(){
        createUI();
    }
    
    public void createUI(){
        lblNoKamar = new JLabel("No Kamar");
        lblNoKamar.setBounds(10, 10, 120, 30);
        
        txtNoKamar = new JTextField();
        txtNoKamar.setBounds(130, 10, 300, 30);
		
		lblClass = new JLabel("Kelas");
		lblClass.setBounds(10, 50, 120, 30);
		
		//String pilClass [] = {"No Class", "VIP Class", "First Class", "Second Class"};
		cbClass = new JComboBox(Room.classChoice);
		cbClass.setBounds(130, 50, 300, 30);
		
		btnSimpan = new JButton("Simpan");
		btnSimpan.setBounds(30, 90, 120, 30);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(180, 90, 120, 30);
		
		txtStatus = new JTextArea();
		txtStatus.setBounds(20, 140, 400, 100);
		
		btnSimpan.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent event) {
              saveForm();
          }
       });
       
        btnReset.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent event) {
              resetForm();
          }
       });
		
		setTitle("Form Isian Kamar");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		
		getContentPane().add(lblNoKamar);
		getContentPane().add(txtNoKamar);
		getContentPane().add(lblClass);
		getContentPane().add(cbClass);
		getContentPane().add(btnSimpan);
		getContentPane().add(btnReset);
		getContentPane().add(txtStatus);
    }
    
    public void resetForm(){
        txtNoKamar.setText("");
        cbClass.setSelectedIndex(0);
    }
    
    public void saveForm(){
        String noKamar = txtNoKamar.getText();
        Room roomTemp = new Room(noKamar, cbClass.getSelectedIndex());
        listRoom.add(roomTemp);

        //System.out.println(roomTemp.description());
        txtStatus.setText(roomTemp.description());
        resetForm();
    }
    
    public void startApp(){
		setVisible(true);
	}
}
