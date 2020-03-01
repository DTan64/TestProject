package UI;

import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * @author D'Artagnan Wake
 */
public class ImageProvider {


	public static ImageIcon getImage(String move) {
		return new ImageIcon("src/resources/images/" + move + ".png");
	}

	public static ImageIcon resize(ImageIcon icon) {
		BufferedImage resized = new BufferedImage(20, 20, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resized.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(icon.getImage(), 0, 0, 20, 20, null);
		g2.dispose();
		return new ImageIcon(resized);

	}

}
