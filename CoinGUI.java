package lab15_enum;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;

public class CoinGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGUI frame = new CoinGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoinGUI() {
		makeWindow();
		JPanel pnlOutput = makePanel();
		JLabel lblOutput = makeLabelOutput(pnlOutput);
		JPanel panelCoins = makePanelCoins();
		JLabel lblPenny = labelPenny(panelCoins);
		JLabel lblNickel = labelNickel(panelCoins);
		JLabel lblDime = labelDime(panelCoins);
		JLabel lblQuarter = labelQuarter(panelCoins);
		pennyEvent(lblOutput, lblPenny);
		nickelEvent(lblOutput, lblNickel);
		dimeEvent(lblOutput, lblDime);
		quarterEvent(lblOutput, lblQuarter);
	}

	private void quarterEvent(JLabel lblOutput, JLabel lblQuarter) {
		lblQuarter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblOutput.setText(Coin.QUARTER.toString());
			}
		});
	}

	private void dimeEvent(JLabel lblOutput, JLabel lblDime) {
		lblDime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblOutput.setText(Coin.DIME.toString());
			}
		});
	}

	private void nickelEvent(JLabel lblOutput, JLabel lblNickel) {
		lblNickel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblOutput.setText(Coin.NICKEL.toString());
			}
		});
	}

	private void pennyEvent(JLabel lblOutput, JLabel lblPenny) {
		lblPenny.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblOutput.setText(Coin.PENNY.toString());
			}
		});
	}

	private JLabel labelQuarter(JPanel panelCoins) {
		JLabel lblQuarter = new JLabel("");
		lblQuarter.setIcon(new ImageIcon(CoinGUI.class.getResource("/lab15_enum/images/UsQuarter.png")));
		panelCoins.add(lblQuarter);
		return lblQuarter;
	}

	private JLabel labelDime(JPanel panelCoins) {
		JLabel lblDime = new JLabel("");
		lblDime.setIcon(new ImageIcon(CoinGUI.class.getResource("/lab15_enum/images/UsDime.png")));
		panelCoins.add(lblDime);
		return lblDime;
	}

	private JLabel labelNickel(JPanel panelCoins) {
		JLabel lblNickel = new JLabel("");
		lblNickel.setIcon(new ImageIcon(CoinGUI.class.getResource("/lab15_enum/images/UsNickel.png")));
		panelCoins.add(lblNickel);
		return lblNickel;
	}

	private JLabel labelPenny(JPanel panelCoins) {
		JLabel lblPenny = new JLabel("");

		lblPenny.setIcon(new ImageIcon(CoinGUI.class.getResource("/lab15_enum/images/UsCent.png")));
		panelCoins.add(lblPenny);
		return lblPenny;
	}

	private JPanel makePanelCoins() {
		JPanel panelCoins = new JPanel();
		contentPane.add(panelCoins, BorderLayout.NORTH);
		return panelCoins;
	}

	private JLabel makeLabelOutput(JPanel pnlOutput) {
		JLabel lblOutput = new JLabel("");
		lblOutput.setBorder(new EmptyBorder(40, 0, 0, 0));
		lblOutput.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblOutput.setHorizontalTextPosition(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Hiragino Maru Gothic ProN", Font.PLAIN, 34));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		pnlOutput.add(lblOutput);
		return lblOutput;
	}

	private JPanel makePanel() {
		JPanel pnlOutput = new JPanel();
		contentPane.add(pnlOutput, BorderLayout.CENTER);
		return pnlOutput;
	}

	private void makeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
