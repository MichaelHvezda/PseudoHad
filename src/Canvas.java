





import pseudoraster.PSPresenter;
import rasterdata.*;
import org.jetbrains.annotations.NotNull;
import transforms.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * trida pro kresleni na platno: zobrazeni pixelu
 *
 * @author PGRF FIM UHK
 * @version 2017
 */




public class Canvas implements  MouseListener,
		MouseMotionListener, KeyListener{

	private final JFrame frame;
	private final JPanel panel;
	private final BufferedImage img;
	private Point2D pohyb= DOLU;
	private PSPresenter psPresenter;


	private static final Point2D NAHORU = new Point2D(0,-1);
	private static final Point2D DOLU = new Point2D(0,1);
	private static final Point2D VLEVO = new Point2D(-1,0);
	private static final Point2D VPRAVO = new Point2D(1,0);
	private static final Point2D AUTOPLAY = new Point2D(0,0);




	public Canvas(final int width, final int height) {

		psPresenter = new PSPresenter(width,height);
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setTitle("Snake");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


		img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		psPresenter.inicializace();



		panel = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				psPresenter.present(g);
			}
		};


		panel.setPreferredSize(new Dimension(width, height));
		panel.addKeyListener(this);

		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		panel.requestFocus();
		panel.requestFocusInWindow();

		ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(2);
		exec.scheduleAtFixedRate(() -> {
				psPresenter.pohyb(pohyb);
				panel.repaint();
			},0, 500, TimeUnit.MILLISECONDS); // execute every 60 seconds






	}


	public void clear() {
		Graphics gr = img.getGraphics();
		gr.setColor(Color.BLACK);
		gr.fillRect(0, 0, img.getWidth(), img.getHeight());
	}



	public void draw() {
		clear();
		//raster = raster.withValue(10,10,bila);
		//raster = psRaster.orezRastr(raster);
		panel.repaint();
	}

	public void start() {
		draw();
		panel.repaint();

	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Canvas(920,920)::start);

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent o) {

		if (o.getKeyCode() == KeyEvent.VK_UP) {
			pohyb = NAHORU;

		}

		if (o.getKeyCode() == KeyEvent.VK_DOWN) {
			pohyb = DOLU;

		}

		if (o.getKeyCode() == KeyEvent.VK_LEFT) {
			pohyb = VLEVO;

		}

		if (o.getKeyCode() == KeyEvent.VK_RIGHT) {
			pohyb = VPRAVO;

		}

		if (o.getKeyCode() == KeyEvent.VK_SPACE) {
			pohyb= AUTOPLAY;

			System.out.println("AutoPlay");
		}


	}


	@Override
	public void keyReleased(KeyEvent e) {

	}


	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}
}//*/