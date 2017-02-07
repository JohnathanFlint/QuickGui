package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton factButton;
	private JButton fibButton;
	private JTextArea output;
	private JTextField input;
	
	public GUIPanel(GUIController baseController)
	{
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		factButton = new JButton("Calculate the Factorial!");	
		fibButton = new JButton("Calculate Fibonacci Sequence");		
		output = new JTextArea(10, 35);		
		baseLayout.putConstraint(SpringLayout.NORTH, output, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, output, 0, SpringLayout.WEST, factButton);
		input = new JTextField(20);
		baseLayout.putConstraint(SpringLayout.WEST, input, 10, SpringLayout.WEST, this);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);;
		
		this.add(factButton);
		this.add(fibButton);
		this.add(input);
		this.add(output);
		output.setWrapStyleWord(true);
		output.setLineWrap(true);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 6, SpringLayout.SOUTH, input);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 0, SpringLayout.WEST, input);
		baseLayout.putConstraint(SpringLayout.SOUTH, input, -75, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 16, SpringLayout.EAST, factButton);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 0, SpringLayout.NORTH, fibButton);
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				output.setText(baseController.transferFactorial(input.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						
					}
				});
	}
}
