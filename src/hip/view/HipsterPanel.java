package hip.view;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import hip.controller.HipsterController;
import hip.model.*;

public class HipsterPanel extends JPanel
{
	private HipsterController baseController;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;
	
	public HipsterPanel(HipsterController baseContoller)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The author");
		bookPriceLabel = new JLabel("The price");
		bookSubjectLabel = new JLabel("The subject");
		bookTitleLabel = new JLabel("The title");
		changeBookButton = new JButton("Change books");
		phraseComboBox = new JComboBox<String>();
		maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String[] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
		this.add(bookAuthorLabel);
		this.add(bookPageCountLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(bookSubjectLabel);
		this.add(changeBookButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 80, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 182, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, bookSubjectLabel, 4, SpringLayout.NORTH, phraseComboBox);
		baseLayout.putConstraint(SpringLayout.SOUTH, bookPageCountLabel, -25, SpringLayout.NORTH, phraseComboBox);
		baseLayout.putConstraint(SpringLayout.EAST, bookPageCountLabel, 0, SpringLayout.EAST, phraseComboBox);
		baseLayout.putConstraint(SpringLayout.NORTH, bookAuthorLabel, 4, SpringLayout.NORTH, phraseComboBox);
		baseLayout.putConstraint(SpringLayout.WEST, changeBookButton, 139, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeBookButton, -55, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, bookTitleLabel, 0, SpringLayout.NORTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookTitleLabel, 34, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookSubjectLabel, 0, SpringLayout.WEST, bookPriceLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookPriceLabel, 0, SpringLayout.NORTH, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookPriceLabel, 69, SpringLayout.EAST, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookAuthorLabel, 40, SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
				
			}
		});
		
		changeBookButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Book[] tempBooks = baseController.getFirstHipster().getHipsterBooks();
				if(startClick < maxClicks)
				{
					bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
					bookAuthorLabel.setText("Book author: " + tempBooks[startClick].getAuthor());
					bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
					bookPageCountLabel.setText("Book pages: " + tempBooks[startClick].getPageCount());
					bookPriceLabel.setText("Book price: " + tempBooks[startClick].getPrice());
					startClick++;
				}
				else
				{
					startClick = 0;
					bookSubjectLabel.setText("Book subject: ");
					bookAuthorLabel.setText("Book author: ");
					bookTitleLabel.setText("Book title: ");
					bookPageCountLabel.setText("Book pages: ");
					bookPriceLabel.setText("Book price; ");
				}
			}
		});
		
	}

}
