package UI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author D'Artagnan Wake
 */
public class Client {

	private Client() {}

	// -------------------- Main --------------------

	public static final void main(String[] args) throws Exception {

		JFrame mainFrame = new JFrame("TicTacToe");


		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		});

		JPanel board = new JPanel();
		board.setLayout(new GridLayout(3, 1));
		for (int i = 0; i < 9; i++) {
			board.add(new Spot());
		}

		mainFrame.add(board);
		mainFrame.setSize(500, 500);
		mainFrame.setVisible(true);


	}

}
