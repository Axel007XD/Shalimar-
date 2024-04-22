package com.axel;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App extends JFrame
{

    public static void main( String[] args )
    {
        App frame= new App();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,500);
        frame.setLocationRelativeTo(null);
        
        

        Login panelLogin= new Login();

        frame.setContentPane(panelLogin);
        

        frame.setVisible(true);
        
    }
}
