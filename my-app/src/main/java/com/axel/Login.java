package com.axel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Login extends JPanel {

   
    JLabel labelUser, labelPass,labelSaludo;
    JTextField textFieldUser;
    JPasswordField textFieldPass;
    JButton enviar;
    
    public Login(){
       
        setLayout(null);
        setBackground(new Color(51,211,255));

        labelSaludo= new JLabel("LOGIN");
        labelSaludo.setFont(new Font("Arial",Font.CENTER_BASELINE,40));
        labelSaludo.setBounds(100, 15, 200, 70);
        add(labelSaludo);

        labelUser= new JLabel("Usuario:");
        labelUser.setFont(new Font("Arial",Font.BOLD,12));
        labelUser.setBounds(30, 90, 100, 40);
        add(labelUser);

        textFieldUser= new JTextField("");
        textFieldUser.setBounds(30, 120, 150, 40);
        add(textFieldUser);

        labelPass= new JLabel("Contraseña:");
        labelPass.setBounds(30,170,120,40);
        labelPass.setFont(new Font("Arial",Font.BOLD,12));
        add(labelPass);
        
        textFieldPass= new JPasswordField("");
        textFieldPass.setBounds(30, 200, 150, 40);
        add(textFieldPass);
       

        enviar= new JButton("Enviar");
        enviar.setBounds(120, 280, 90, 40);
        add(enviar);
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                String userName=textFieldUser.getText();
                char[] passChars=textFieldPass.getPassword();
                String password =new String(passChars);

                if(!userName.equals("Admin")&& !password.equals("1234")){
                    JOptionPane.showInputDialog(null,"La contraseña o el correo no son validos","Invalido",JOptionPane.ERROR_MESSAGE);
                    textFieldUser.setText("");
                    textFieldPass.setText("");
                }
            }
        });
        
        
    
    }

}
