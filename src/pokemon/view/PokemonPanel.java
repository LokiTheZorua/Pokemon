package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;

import java.awt.Color;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokemonPanel extends JPanel
{

	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private	JLabel evolveableLabel;
	private JLabel modifierLabel;
	private	JLabel iconLabel;
	private JLabel numberLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		this.appLayout = new SpringLayout();		
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		
		numberField = new JTextField("##");
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, numberField);
		
		attackField = new JTextField("ap");
		
		healthField = new JTextField("hp");
	
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/pokeballTransparent.png")), JLabel.CENTER);
		
		nameLabel = new JLabel("name");
		
		evolveableLabel = new JLabel("evolvable");
		
		numberLabel = new JLabel("number");
	
		attackLabel = new JLabel("attack");
	
		healthLabel= new JLabel("health");
	
		modifierLabel = new JLabel("modifier");
		
		
		pokedexDropdown = new JComboBox();
		
		clearButton = new JButton("Clear");
		
		saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, saveButton);
	
		
		descriptionArea = new JTextArea(5,10);
		
		typeArea = new JTextArea(4,15);
		
		
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, firstType);
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		setupPanel();
		setupComboBox();
		setupTypePanels();
		setupLayout();
		setupListeners();
		
		
	}
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() +"");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50,50);
		secondType.setSize(50,50);
		thirdType.setSize(50,50);
		fourthType.setSize(50,50);
	}
	
	public void updateImage()
	{
		
	}

	private void setupPanel()
	{
		this.setBackground(Color.red);
		this.setLayout(appLayout);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(evolveableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		this.add(numberLabel);
		
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
		this.add(descriptionArea);
		this.add(typeArea);
		
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		if (types[0].equals("Electric"))
		{
			firstType.setBackground(Color.YELLOW);
		}
		else if (types[0].equals("Dark"))
		{
			firstType.setBackground(Color.BLACK);
		}
		else if (types[0].equals("Normal"))
		{
			firstType.setBackground(Color.WHITE);
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		
		if (types.length > 1)
		{
			if (types[1].equals("Electric"))
			{
				secondType.setBackground(Color.YELLOW);
			}
			else if (types[1].equals("Dark"))
			{
				firstType.setBackground(Color.BLACK);
			}
			else if (types[1].equals("Normal"))
			{
				firstType.setBackground(Color.WHITE);
			}
			else
			{
				firstType.setBackground(Color.WHITE);
			}
			
			if(types.length == 3)
			{
				if (types[2].equals("Electric"))
				{
					thirdType.setBackground(Color.YELLOW);
				}
				else if (types[2].equals("Dark"))
				{
					firstType.setBackground(Color.BLACK);
				}
				else if (types[3].equals("Normal"))
				{
					firstType.setBackground(Color.WHITE);
				}
				else
				{
					firstType.setBackground(Color.WHITE);
				}
			}
		}
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 6, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 6, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 117, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -26, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveableLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 17, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 5, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, modifierLabel, 0, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 0, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, -4, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 179, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveableLabel, 5, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -162, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, -5, SpringLayout.NORTH, evolveableLabel);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 126, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 0, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -6, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, 0, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, firstType);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, numberField);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent selection)
					{
						int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
						updatePokedexInfo(selectedPokemonIndex);
						updateImage();
						updateTypePanels();
						repaint();
					}
				});
	}
}












