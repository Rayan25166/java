package prg1;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class module {

	public static void main(String[] args) {
		JFrame mainFrame=new JFrame();
				mainFrame.setSize(300,300);
                mainFrame.setTitle("The First Gui");
                
                JPanel panel = new JPanel();
                
                mainFrame.setVisible(true);
                panel.setLayout(new GridLayout(7,2,10,10));
                JLabel userLabel =new JLabel("User Name");
                JTextField userField = new JTextField();
                JLabel         = new JLabel("Password");
                
                		
                
                JButton loginbtn = new
                
                panel.add(userField);
                panel.add(pwdLabel);
                panel.add(pwdField);
                panel.add(new JLabel(""));
                panel.add(loginbtn);
                
                mainFrame.add(panel);
                
                
                mainFrame.setLocationRelativeTo()
                mainFrame.setVisible(true);
                

                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
	}

}
