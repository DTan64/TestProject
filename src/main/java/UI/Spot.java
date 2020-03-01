package UI;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class Spot extends JButton {

	public Spot() {
		super();
		this.addActionListener(this::onClick);
	}

	// -------------------- Private --------------------

	private void onClick(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		ImageIcon icon = ImageProvider.resize(ImageProvider.getImage("o"));
		button.setIcon(icon);
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setDisabledIcon(icon);
		button.setEnabled(false);
	}

}