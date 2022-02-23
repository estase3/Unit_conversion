package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicButtonUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;

public class Gui2 extends JFrame {

	private JPanel contentPane;
	private final JButton btnHome = new JButton("");
	private final JButton btnRes = new JButton("");
	private final JButton btnUnits = new JButton("");
	private final JButton btnExit = new JButton("");
	private final JButton btnNewButton = new JButton("New button");
	static ImageIcon img= new ImageIcon("Icons\\calculator1.png");
	private final JPanel panel = new JPanel();
	private final JPanel Res = new JPanel();
	private final JPanel Unit = new JPanel();
	private final JPanel Home = new JPanel();
	private final JPanel leftRes = new JPanel();
	private final JPanel rightRes = new JPanel();
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = new JPanel();
	private final JComboBox comboBoxTol = new JComboBox();
	private final JComboBox comboBoxMult = new JComboBox();
	private final JLabel lblMult = new JLabel("Multiplier");
	private final JLabel lblTol = new JLabel("Tolerance");
	private final JComboBox comboBoxCol3 = new JComboBox();
	private final JLabel lblCol1 = new JLabel("First color");
	private final JComboBox comboBoxCol1 = new JComboBox();
	private final JComboBox comboBoxCol2 = new JComboBox();
	private final JLabel lblCol3 = new JLabel("Third color ");
	private final JLabel lblCol2 = new JLabel("Second color");
	private final JButton calcRes = new JButton("");
	private final JPanel panelMain = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("Bartosz Olborski    ");
	private final JPanel panel_7 = new JPanel();
	private final JPanel panel_8 = new JPanel();
	private final JPanel panel_9 = new JPanel();
	private final JPanel panel_10 = new JPanel();
	private final JPanel panel_11 = new JPanel();
	private final JPanel panel_12 = new JPanel();
	private final JPanel panel_13 = new JPanel();
	private final JPanel panel_15 = new JPanel();
	private final JPanel panel_14 = new JPanel();
	private final JLabel lblCat = new JLabel("Select category");
	private final JComboBox categoryBox = new JComboBox();
	private final JLabel lblFrom = new JLabel("From");
	private final JComboBox fromBox = new JComboBox();
	private final JLabel lblTo = new JLabel("To");
	private final JComboBox toBox = new JComboBox();
	private final JButton btnCalcUnit = new JButton("");
	private final JLabel lblRes = new JLabel("Resistance:");
	private final JTextField fromTextField = new JTextField();
	private final JTextField toTextField = new JTextField();
	private UnitConversion Converter= new UnitConversion();
	private ResistanceCalculator resCalculator= new ResistanceCalculator();
	private final JLabel lblNewLabel_2 = new JLabel("");
	private final JLabel lblNewLabel_2_1 = new JLabel("");
	private final JLabel lblNewLabel_2_2 = new JLabel("");
	private final JLabel lblNewLabel_2_3 = new JLabel("");
	private final JLabel lblNewLabel_2_4 = new JLabel("");
	private final JLabel lblNewLabel_2_5 = new JLabel("");
	private final JLabel lblNewLabel_3 = new JLabel("");
	private final JPanel panel_3 = new JPanel();
	private final JLabel lblNewLabel_3_1 = new JLabel("");
	private final JLabel lblNewLabel_3_2 = new JLabel("");
	private final JLabel lblNewLabel_3_3 = new JLabel("");
	private final JLabel lblNewLabel_3_4 = new JLabel("");
	private final JLabel lblNewLabel_3_5 = new JLabel("");
	private final JLabel lblNewLabel_3_6 = new JLabel("");
	private final JLabel lblNewLabel_3_7 = new JLabel("");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui2 frame = new Gui2();
					frame.setVisible(true);
					frame.setIconImage(img.getImage());
					frame.setTitle("Pocket Calculator");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Gui2() {
		toTextField.setEditable(false);
		toTextField.setColumns(10);
		fromTextField.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSide = new JPanel();
		panelSide.setBackground(new Color(8, 7, 8));
		panelSide.setPreferredSize(new Dimension(100, 0));
		contentPane.add(panelSide, BorderLayout.WEST);
		panelSide.setLayout(new BorderLayout(0, 0));
		panelSide.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, new Color(57, 255, 60)));

		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMain.removeAll();
				panelMain.add(Home);
				panelMain.repaint();
				panelMain.revalidate();	
			}
		});
		panelSide.add(btnHome, BorderLayout.NORTH);
		panel.setBorder(null);
		panel.setBackground(new Color(8, 7, 8));
		
		

		
		panelSide.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		btnUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMain.removeAll();
				panelMain.add(Unit);
				panelMain.repaint();
				panelMain.revalidate();
			}
		});
		
		panel.add(btnUnits);
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMain.removeAll();
				panelMain.add(Res);
				panelMain.repaint();
				panelMain.revalidate();
			}
		});
		panel.add(btnRes);
		btnUnits.setIcon(new ImageIcon("Icons\\arrows1.png"));
		btnHome.setIcon(new ImageIcon("Icons\\home1.png"));
		btnRes.setIcon(new ImageIcon("Icons\\resistor1.png"));
		calcRes.setIcon(new ImageIcon("Icons\\play1.png"));
		btnCalcUnit.setIcon(new ImageIcon("Icons\\play2.png"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setIcon(new ImageIcon("Icons\\cancel1.png"));
		
		panelSide.add(btnExit, BorderLayout.SOUTH);
		
		JButton [] btns = {btnHome, btnRes, btnUnits,btnExit}; 
		for (JButton btn:btns) {
		btn.setBackground(new Color(8, 7, 8));
		btn.setUI(new BasicButtonUI());
		btn.setBorder(new LineBorder(new Color(8, 7, 8)));
		btn.setPreferredSize(new Dimension(90, 90));	
		btn.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(24, 22, 25)));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(57, 255, 60)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn.setBackground(new Color(8, 7, 8));
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn.setBackground(new Color(50, 50, 50));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		}
		JButton [] btns2 = {calcRes,btnCalcUnit}; 
		for (JButton btn:btns2) {
		btn.setBackground(new Color(24, 22, 25));
		btn.setUI(new BasicButtonUI());
		btn.setBorder(new LineBorder(new Color(24, 22, 25)));
		btn.setPreferredSize(new Dimension(90, 90));	
		btn.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(24, 22, 25)));
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				btn.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(57, 255, 60)));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn.setBackground(new Color(24, 22, 25));
	
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn.setBackground(new Color(8, 7, 8));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		}
		
		
		
		JPanel [] panels = {leftRes,rightRes,panel_1,panel_2,panel_3,Home,Unit,panel_7,panel_8,panel_9,panel_10,panel_11,panel_12,panel_13,panel_14,panel_15};
		for (JPanel pan:panels) {
		pan.setBackground(new Color(24, 22, 25));
		}
		JComboBox [] boxes = {comboBoxCol1,comboBoxCol3,comboBoxCol2,comboBoxMult,comboBoxTol,categoryBox,fromBox,toBox};
		for(JComboBox box:boxes)
		{
			
			box.setBackground(new Color(24, 22, 25));
			box.setForeground(new Color(199, 199, 199));
			box.setFocusable(false);
			box.setFont(new Font("Tahoma", Font.PLAIN, 20));
		}
		JLabel [] labels2 = {lblCat,lblFrom,lblTo,lblCol1,lblCol2,lblCol3,lblMult,lblTol,lblRes};
		for (JLabel lbl:labels2) {
			lbl.setForeground(new Color(57, 255, 60));
			lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbl.setHorizontalAlignment(SwingConstants.CENTER);
			lbl.setForeground(new Color(57, 255, 60));
		}
		
		panelMain.setBackground(new Color(24, 22, 25));
		contentPane.add(panelMain, BorderLayout.CENTER);
		panelMain.setLayout(new CardLayout(0, 0));
		panelMain.add(Home, "name_677143014513700");
		panelMain.add(Unit, "name_677098525700200");
		Unit.setLayout(new GridLayout(3, 1, 0, 0));
		
		Unit.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_8.add(panel_10);
		panel_10.setLayout(new GridLayout(3, 0, 0, 0));

		
		panel_10.add(lblCat);
		categoryBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch((String)categoryBox.getSelectedItem()) {
				case "Time":
					fromBox.removeAllItems();
					fromBox.addItem("Seconds");
					fromBox.addItem("Minutes");
					fromBox.addItem("Hours");	
					toBox.removeAllItems();
					toBox.addItem("Seconds");
					toBox.addItem("Minutes");
					toBox.addItem("Hours");
					break;
				case "Distance":
					fromBox.removeAllItems();
					fromBox.addItem("Millimeter");
					fromBox.addItem("Centimeter");
					fromBox.addItem("Decimetre");
					fromBox.addItem("Meter");
					fromBox.addItem("Kilometer");
					toBox.removeAllItems();
					toBox.addItem("Millimeter");
					toBox.addItem("Centimeter");
					toBox.addItem("Decimetre");
					toBox.addItem("Meter");
					toBox.addItem("Kilometer");
					break;
				case "Amplification":
					fromBox.removeAllItems();
					fromBox.addItem("V/V");
					fromBox.addItem("DB");	
					toBox.removeAllItems();
					toBox.addItem("V/V");
					toBox.addItem("DB");	
				break;
				}
			}
		});
		categoryBox.addItem("Time");
		categoryBox.addItem("Distance");
		categoryBox.addItem("Amplification");
		panel_10.add(categoryBox);
		
		panel_8.add(panel_11);
		
		panel_8.add(panel_12);
		
		Unit.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_7.add(panel_13);
		panel_13.setLayout(new GridLayout(3, 0, 0, 0));
		
		panel_13.add(lblFrom);
		
		panel_13.add(fromBox);
		
		panel_13.add(fromTextField);
		
		panel_7.add(panel_15);
		
		panel_7.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 0, 0, 0));
		
		panel_14.add(lblTo);

		panel_14.add(toBox);
		toTextField.setBackground(new Color(50, 50, 50));
		fromTextField.setBackground(new Color(50, 50, 50));
		fromTextField.setForeground(new Color(199, 199, 199));
		toTextField.setForeground(new Color(199, 199, 199));
		toTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fromTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_14.add(toTextField);
		
		Unit.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 3, 0, 0));
		
		panel_9.add(lblNewLabel_3);
		
		panel_9.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 3, 0, 0));
		
		panel_3.add(lblNewLabel_3_1);
		
		panel_3.add(lblNewLabel_3_2);
		
		panel_3.add(lblNewLabel_3_3);
		
		panel_3.add(lblNewLabel_3_4);
		panel_3.add(btnCalcUnit);
		btnCalcUnit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						double number=Double.parseDouble(fromTextField.getText());
						switch((String)categoryBox.getSelectedItem()) {
						case "Time":
							double fromMap1=Converter.timeMap.get((String)fromBox.getSelectedItem());
							double toMap1=Converter.timeMap.get((String)toBox.getSelectedItem());					
							toTextField.setText(Converter.calculateTime(fromMap1, toMap1, number));
							break;
						case "Distance":
							float fromMap=Converter.distanceMap.get((String)fromBox.getSelectedItem());
							float toMap=Converter.distanceMap.get((String)toBox.getSelectedItem());
							toTextField.setText(Converter.calculateDistance(fromMap, toMap, (float)number));
							break;
						case "Amplification":
							if((String)fromBox.getSelectedItem()=="V/V" && (String)toBox.getSelectedItem()=="DB")
								toTextField.setText(Converter.VvToDb(number));
							else if((String)fromBox.getSelectedItem()=="DB" && (String)toBox.getSelectedItem()=="V/V")
								toTextField.setText(Converter.dbToVv(number));
							else
								toTextField.setText(fromTextField.getText());
							break;	
						}
			}
		});
		
		panel_3.add(lblNewLabel_3_5);
		
		panel_3.add(lblNewLabel_3_6);
		
		panel_3.add(lblNewLabel_3_7);
		panelMain.add(Res, "name_677081889648900");
		Res.setLayout(new GridLayout(0, 1, 0, 0));
		
		Res.add(leftRes);
		leftRes.setLayout(new GridLayout(1, 2, 0, 0));
		
		leftRes.add(panel_1);
		panel_1.setLayout(new GridLayout(5, 2, 0, 0));
		lblCol1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCol1.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblCol1);
		comboBoxCol1.setModel(new DefaultComboBoxModel(new String[] {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"}));
		comboBoxCol2.setModel(new DefaultComboBoxModel(new String[] {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"}));
		comboBoxCol3.setModel(new DefaultComboBoxModel(new String[] {"None","Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"}));
		comboBoxMult.setModel(new DefaultComboBoxModel(new String[] {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White", "Gold", "Silver"}));
		comboBoxTol.setModel(new DefaultComboBoxModel(new String[] {"Brown", "Red", "Green", "Blue", "Violet", "Grey", "Gold", "Silver"}));
		panel_1.add(comboBoxCol1);
		lblCol2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCol2.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblCol2);
		
		panel_1.add(comboBoxCol2);
		lblCol3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCol3.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblCol3);
		
		panel_1.add(comboBoxCol3);
		lblMult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMult.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblMult);
		
		panel_1.add(comboBoxMult);
		lblTol.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTol.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1.add(lblTol);
		
		panel_1.add(comboBoxTol);
		
		leftRes.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));
		
		panel_2.add(lblNewLabel_2);
		
		panel_2.add(lblNewLabel_2_1);
		
		panel_2.add(lblNewLabel_2_2);
		
		panel_2.add(lblNewLabel_2_3);
		panel_2.add(calcRes);
		calcRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String col1=(String) comboBoxCol1.getSelectedItem();
				String col2=(String) comboBoxCol2.getSelectedItem();
				String col3=(String) comboBoxCol3.getSelectedItem();
				String mults=(String) comboBoxMult.getSelectedItem();
				String tol=(String) comboBoxTol.getSelectedItem();
				lblRes.setText(resCalculator.calc(col1, col2, col3, mults, tol));
			}
		});
		
		panel_2.add(lblNewLabel_2_4);
		
		panel_2.add(lblNewLabel_2_5);
		
		Res.add(rightRes);
		rightRes.setLayout(new BorderLayout(0, 0));
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setPreferredSize(new Dimension(40,40));
		
		rightRes.add(lblRes, BorderLayout.CENTER);
		
		
		
		
		Home.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Program for calculating resistor value  and unit conversion");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(57, 255, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(46, 100));
		Home.add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setPreferredSize(new Dimension(89, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		Home.add(lblNewLabel_1, BorderLayout.SOUTH);

	}
}
