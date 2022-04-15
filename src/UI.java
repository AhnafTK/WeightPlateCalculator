import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class UI extends Plates implements ActionListener{
	
	private JFrame core = new JFrame();
	private JButton calculate = new JButton();
	
	private Plates plate = new Plates();
	
	private JTextField weightInputField = new JTextField();
	private JTextField barInputField = new JTextField();
	
	private JTextField fortyFivesNumber = new JTextField();
	private JTextField thirtyfivesNumber = new JTextField();
	private JTextField twentyfivesNumber = new JTextField();
	private JTextField tensNumber = new JTextField();
	private JTextField fivesNumber = new JTextField();
	private JTextField twohalffivesNumber = new JTextField();
	
	private Border blackLine = BorderFactory.createLineBorder(Color.black);
	
	protected void startCore() {
		
		JPanel platesNeededPanel = makeDisplayPlatesPanel();
		JPanel inputPanel = makeInputPanel();
		
	
		core.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		core.setTitle("Ahnaf's weight plate calculator");
		core.setSize(700, 400);
		core.setVisible(true);
		core.setResizable(false);
		core.setLayout(null);

		core.add(inputPanel);
		core.add(platesNeededPanel);
		
		
	
	}
	
	
	/**
	 * Makes the input panel, gets added to the core and displayed.
	 * @return
	 */
	protected JPanel makeInputPanel() {
		
		JLabel weightInputText = new JLabel("Total Weight:");
		JLabel barInputText = new JLabel("Barbell Weight:");
		JPanel inputPanel = new JPanel();
		
		weightInputField.setBounds(160, 115, 100, 25);
		barInputField.setBounds(160, 145, 100, 25);
		
		calculate.setBounds(85, 225, 120, 35);
		calculate.setText("Calculate");
		calculate.addActionListener(this);
		
		weightInputText.setBounds(30,100,150,50);
		barInputText.setBounds(30,130,150,50);
		
		weightInputText.setFont(new Font("Georgia", Font.BOLD, 12));
		barInputText.setFont(new Font("Georgia", Font.BOLD, 12));
		

		inputPanel.add(calculate);
		inputPanel.add(weightInputField);
		inputPanel.add(barInputField);
		inputPanel.add(barInputText);
		inputPanel.add(weightInputText);
		inputPanel.setBorder(blackLine);
		inputPanel.setBounds(25,25,300,300);
		inputPanel.setVisible(true);
		inputPanel.setLayout(null);
		
		
		return inputPanel;
	}
	
	protected JPanel makeDisplayPlatesPanel() {
		
		JPanel platesNeededPanel = new JPanel();
		JLabel platesNeededText = new JLabel("Plates needed (each side)");
		JLabel fortyfives = new JLabel("45's  needed: ");
		JLabel thirtyfives = new JLabel("35's  needed: ");
		JLabel twentyfives = new JLabel("25's  needed: ");
		JLabel tens = new JLabel("10's  needed: ");
		JLabel fives = new JLabel("5's    needed: ");
		JLabel twohalffives = new JLabel("2.5's needed: ");
		
		platesNeededText.setFont(new Font("Georgia", Font.BOLD, 15));
		platesNeededText.setBounds(60,30,200,50);
		
		fortyfives.setBounds(85,0,200,200);
		thirtyfives.setBounds(85,30,200,200);
		twentyfives.setBounds(85,60,200,200);
		tens.setBounds(85,90,200,200);
		fives.setBounds(85,120,200,200);
		twohalffives.setBounds(85,150,200,200);
		
		
		fortyFivesNumber.setBounds(175, 85, 50, 30);
		thirtyfivesNumber.setBounds(175, 115, 50, 30);
		twentyfivesNumber.setBounds(175, 145, 50, 30);
		tensNumber.setBounds(175, 175, 50, 30);
		fivesNumber.setBounds(175, 205, 50, 30);
		twohalffivesNumber.setBounds(175, 235, 50, 30);
		
		fortyFivesNumber.setEditable(false);
		thirtyfivesNumber.setEditable(false);
		twentyfivesNumber.setEditable(false);
		tensNumber.setEditable(false);
		fivesNumber.setEditable(false);
		twohalffivesNumber.setEditable(false);
		
		//fortyFivesNumber.setText("E");
		
		platesNeededPanel.add(platesNeededText);
		platesNeededPanel.add(fortyfives);
		platesNeededPanel.add(thirtyfives);
		platesNeededPanel.add(twentyfives);
		platesNeededPanel.add(tens);
		platesNeededPanel.add(fives);
		platesNeededPanel.add(twohalffives);
		platesNeededPanel.add(fortyFivesNumber);
		platesNeededPanel.add(thirtyfivesNumber);
		platesNeededPanel.add(twentyfivesNumber);
		platesNeededPanel.add(tensNumber);
		platesNeededPanel.add(fivesNumber);
		platesNeededPanel.add(twohalffivesNumber);
		
		
		platesNeededPanel.setBorder(blackLine);
		platesNeededPanel.setBounds(360,25,300,300);
		platesNeededPanel.setVisible(true);
		platesNeededPanel.setLayout(null);
		return platesNeededPanel;

		
	}
	
	protected void calculate() {
		
		boolean valid = false;
		 
		// if the inputs are empty.
		if (weightInputField.getText().isBlank() || barInputField.getText().isBlank()){
			valid = false;
		}
		else {
			
			// if the inputs aren't empty, but they are not yet valid.
			
			//if (tempInputWeight.contains(tempBarWeight))
			
			try {
				plate.inputWeight = Double.parseDouble(weightInputField.getText());
				plate.barWeight = Double.parseDouble(barInputField.getText());
				plate.calculateWeight(plate.barWeight, plate.inputWeight);
				
				fortyFivesNumber.setText(Integer.toString(plate.fortyfneeded));
				thirtyfivesNumber.setText(Integer.toString(plate.thirtyfneeded));
				twentyfivesNumber.setText(Integer.toString(plate.twentyfneeded));
				tensNumber.setText(Integer.toString(plate.tenneeded));
				fivesNumber.setText(Integer.toString(plate.fiveneeded));
				twohalffivesNumber.setText(Integer.toString(plate.twohalfneeded));
				
				valid = true;
			}
			catch(NumberFormatException e) {
				plate.inputWeight = 0;
				plate.barWeight = 0;
				valid = false;
			}
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==calculate) {
			
			calculate();
			plate.resetVariables();
	
			
			
		}
	}
	
	
}
