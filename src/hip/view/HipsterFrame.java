package hip.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hip.controller.HipsterController;
import hip.model.Hipster;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel mainPanel;
	
	private HipsterFrame(){}
	
	public HipsterFrame(HipsterController baseContoller)
	{
		this.baseController = baseController;
		mainPanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(mainPanel);
		this.setSize(600, 600);
		this.setTitle("Hipster");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	public HipsterController getMainController()
	{
		return baseController;
	}
}
