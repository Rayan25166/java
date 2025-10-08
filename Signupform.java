package prg1;
import javax.swing.*;
import java.awt.*;

public class Signupform {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Sign Up Form");
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(5,2,10,10));
		
		JLabel nameLabel = new JLabel("Name");
		JTextField nameField = new JTextField();
		
		JLabel emailLabel = new JLabel("Email");
		JTextField emailField = new JTextField();
		JLabel genderLabel = new Label("Gender");
		JRadioButton male = new JRadioButton("Male");
		JRadioButton female = new JRadioButton("female");
		ButtonGroup genButtonGroup = newButtonGroup();
		 
		
		
		
		
        JPanel genderPanel = new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		
		JLabel countryLabel = new JLabel("Country");
		String[] countries = {"India","China","USA"};
		JComboBox<String> countryBox = new JComboBox<>
		
		JLabel addressLabel = new JLabel
        	
	}

}
