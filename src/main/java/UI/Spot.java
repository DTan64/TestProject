package UI;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class Spot extends JButton {

	// -------------------- Variables --------------------

	private final int row;
	private final int col;

	public Spot(int row, int col) {
		super();
		this.row = row;
		this.col = col;
		this.addActionListener(this::onClick);
	}

	// -------------------- Private --------------------

	private void onClick(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		System.err.printf("%s\n", row);
		System.err.printf("%s\n", col);



		ImageIcon icon = ImageProvider.resize(ImageProvider.getImage("o"));
		button.setIcon(icon);
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setDisabledIcon(icon);
		button.setEnabled(false);
	}

}