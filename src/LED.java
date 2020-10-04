import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JTextArea;

public class LED extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LED frame = new LED();
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
	public LED() {
		setType(Type.POPUP);
		setResizable(false);
		setTitle("8x10 Matrix LED");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel leftpane = new JPanel();
		contentPane.add(leftpane, BorderLayout.WEST);
		leftpane.setPreferredSize(new Dimension(250, 10));
		leftpane.setLayout(new GridLayout(10,8));
		
		Button btn0 = new Button("0");
		btn0.setBackground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn0.getLabel()=="0")
				{
					btn0.setLabel("1");
					btn0.setBackground(Color.RED);
				}
				else
				{
					btn0.setLabel("0");
					btn0.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn0);
		
		Button btn1 = new Button("0");
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn1.getLabel()=="0")
				{
					btn1.setLabel("1");
					btn1.setBackground(Color.RED);
				}
				else
				{
					btn1.setLabel("0");
					btn1.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn1);
		
		Button btn2 = new Button("0");
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn2.getLabel()=="0")
				{
					btn2.setLabel("1");
					btn2.setBackground(Color.RED);
				}
				else
				{
					btn2.setLabel("0");
					btn2.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn2);
		
		Button btn3 = new Button("0");
		btn3.setBackground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn3.getLabel()=="0")
				{
					btn3.setLabel("1");
					btn3.setBackground(Color.RED);
				}
				else
				{
					btn3.setLabel("0");
					btn3.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn3);
		
		Button btn4 = new Button("0");
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn4.getLabel()=="0")
				{
					btn4.setLabel("1");
					btn4.setBackground(Color.RED);
				}
				else
				{
					btn4.setLabel("0");
					btn4.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn4);
		
		Button btn5 = new Button("0");
		btn5.setBackground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn5.getLabel()=="0")
				{
					btn5.setLabel("1");
					btn5.setBackground(Color.RED);
				}
				else
				{
					btn5.setLabel("0");
					btn5.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn5);
		
		Button btn6 = new Button("0");
		btn6.setBackground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn6.getLabel()=="0")
				{
					btn6.setLabel("1");
					btn6.setBackground(Color.RED);
				}
				else
				{
					btn6.setLabel("0");
					btn6.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn6);
		
		Button btn7 = new Button("0");
		btn7.setBackground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn7.getLabel()=="0")
				{
					btn7.setLabel("1");
					btn7.setBackground(Color.RED);
				}
				else
				{
					btn7.setLabel("0");
					btn7.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn7);
		
		Button btn8 = new Button("0");
		btn8.setBackground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn8.getLabel()=="0")
				{
					btn8.setLabel("1");
					btn8.setBackground(Color.RED);
				}
				else
				{
					btn8.setLabel("0");
					btn8.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn8);
		
		Button btn9 = new Button("0");
		btn9.setBackground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn9.getLabel()=="0")
				{
					btn9.setLabel("1");
					btn9.setBackground(Color.RED);
				}
				else
				{
					btn9.setLabel("0");
					btn9.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn9);
		
		Button btn10 = new Button("0");
		btn10.setBackground(Color.WHITE);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn10.getLabel()=="0")
				{
					btn10.setLabel("1");
					btn10.setBackground(Color.RED);
				}
				else
				{
					btn10.setLabel("0");
					btn10.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn10);
		
		Button btn11 = new Button("0");
		btn11.setBackground(Color.WHITE);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn11.getLabel()=="0")
				{
					btn11.setLabel("1");
					btn11.setBackground(Color.RED);
				}
				else
				{
					btn11.setLabel("0");
					btn11.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn11);
		
		Button btn12 = new Button("0");
		btn12.setBackground(Color.WHITE);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn12.getLabel()=="0")
				{
					btn12.setLabel("1");
					btn12.setBackground(Color.RED);
				}
				else
				{
					btn12.setLabel("0");
					btn12.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn12);
		
		Button btn13 = new Button("0");
		btn13.setBackground(Color.WHITE);
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn13.getLabel()=="0")
				{
					btn13.setLabel("1");
					btn13.setBackground(Color.RED);
				}
				else
				{
					btn13.setLabel("0");
					btn13.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn13);
		
		Button btn14 = new Button("0");
		btn14.setBackground(Color.WHITE);
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn14.getLabel()=="0")
				{
					btn14.setLabel("1");
					btn14.setBackground(Color.RED);
				}
				else
				{
					btn14.setLabel("0");
					btn14.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn14);
		
		Button btn15 = new Button("0");
		btn15.setBackground(Color.WHITE);
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn15.getLabel()=="0")
				{
					btn15.setLabel("1");
					btn15.setBackground(Color.RED);
				}
				else
				{
					btn15.setLabel("0");
					btn15.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn15);
		
		Button btn16 = new Button("0");
		btn16.setBackground(Color.WHITE);
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn16.getLabel()=="0")
				{
					btn16.setLabel("1");
					btn16.setBackground(Color.RED);
				}
				else
				{
					btn16.setLabel("0");
					btn16.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn16);
		
		Button btn17 = new Button("0");
		btn17.setBackground(Color.WHITE);
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn17.getLabel()=="0")
				{
					btn17.setLabel("1");
					btn17.setBackground(Color.RED);
				}
				else
				{
					btn17.setLabel("0");
					btn17.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn17);
		
		Button btn18 = new Button("0");
		btn18.setBackground(Color.WHITE);
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn18.getLabel()=="0")
				{
					btn18.setLabel("1");
					btn18.setBackground(Color.RED);
				}
				else
				{
					btn18.setLabel("0");
					btn18.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn18);
		
		Button btn19 = new Button("0");
		btn19.setBackground(Color.WHITE);
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn19.getLabel()=="0")
				{
					btn19.setLabel("1");
					btn19.setBackground(Color.RED);
				}
				else
				{
					btn19.setLabel("0");
					btn19.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn19);
		
		Button btn20 = new Button("0");
		btn20.setBackground(Color.WHITE);
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn20.getLabel()=="0")
				{
					btn20.setLabel("1");
					btn20.setBackground(Color.RED);
				}
				else
				{
					btn20.setLabel("0");
					btn20.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn20);
		
		Button btn21 = new Button("0");
		btn21.setBackground(Color.WHITE);
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn21.getLabel()=="0")
				{
					btn21.setLabel("1");
					btn21.setBackground(Color.RED);
				}
				else
				{
					btn21.setLabel("0");
					btn21.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn21);
		
		Button btn22 = new Button("0");
		btn22.setBackground(Color.WHITE);
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn22.getLabel()=="0")
				{
					btn22.setLabel("1");
					btn22.setBackground(Color.RED);
				}
				else
				{
					btn22.setLabel("0");
					btn22.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn22);
		
		Button btn23 = new Button("0");
		btn23.setBackground(Color.WHITE);
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn23.getLabel()=="0")
				{
					btn23.setLabel("1");
					btn23.setBackground(Color.RED);
				}
				else
				{
					btn23.setLabel("0");
					btn23.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn23);
		
		Button btn24 = new Button("0");
		btn24.setBackground(Color.WHITE);
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn24.getLabel()=="0")
				{
					btn24.setLabel("1");
					btn24.setBackground(Color.RED);
				}
				else
				{
					btn24.setLabel("0");
					btn24.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn24);
		
		Button btn25 = new Button("0");
		btn25.setBackground(Color.WHITE);
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn25.getLabel()=="0")
				{
					btn25.setLabel("1");
					btn25.setBackground(Color.RED);
				}
				else
				{
					btn25.setLabel("0");
					btn25.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn25);
		
		Button btn26 = new Button("0");
		btn26.setBackground(Color.WHITE);
		btn26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn26.getLabel()=="0")
				{
					btn26.setLabel("1");
					btn26.setBackground(Color.RED);
				}
				else
				{
					btn26.setLabel("0");
					btn26.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn26);
		
		Button btn27 = new Button("0");
		btn27.setBackground(Color.WHITE);
		btn27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn27.getLabel()=="0")
				{
					btn27.setLabel("1");
					btn27.setBackground(Color.RED);
				}
				else
				{
					btn27.setLabel("0");
					btn27.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn27);
		
		Button btn28 = new Button("0");
		btn28.setBackground(Color.WHITE);
		btn28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn28.getLabel()=="0")
				{
					btn28.setLabel("1");
					btn28.setBackground(Color.RED);
				}
				else
				{
					btn28.setLabel("0");
					btn28.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn28);
		
		Button btn29 = new Button("0");
		btn29.setBackground(Color.WHITE);
		btn29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn29.getLabel()=="0")
				{
					btn29.setLabel("1");
					btn29.setBackground(Color.RED);
				}
				else
				{
					btn29.setLabel("0");
					btn29.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn29);
			
		Button btn30 = new Button("0");
		btn30.setBackground(Color.WHITE);
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn30.getLabel()=="0")
				{
					btn30.setLabel("1");
					btn30.setBackground(Color.RED);
				}
				else
				{
					btn30.setLabel("0");
					btn30.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn30);
		
		Button btn31 = new Button("0");
		btn31.setBackground(Color.WHITE);
		btn31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn31.getLabel()=="0")
				{
					btn31.setLabel("1");
					btn31.setBackground(Color.RED);
				}
				else
				{
					btn31.setLabel("0");
					btn31.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn31);
		
		Button btn32 = new Button("0");
		btn32.setBackground(Color.WHITE);
		btn32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn32.getLabel()=="0")
				{
					btn32.setLabel("1");
					btn32.setBackground(Color.RED);
				}
				else
				{
					btn32.setLabel("0");
					btn32.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn32);
		
		Button btn33 = new Button("0");
		btn33.setBackground(Color.WHITE);
		btn33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn33.getLabel()=="0")
				{
					btn33.setLabel("1");
					btn33.setBackground(Color.RED);
				}
				else
				{
					btn33.setLabel("0");
					btn33.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn33);
		
		Button btn34 = new Button("0");
		btn34.setBackground(Color.WHITE);
		btn34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn34.getLabel()=="0")
				{
					btn34.setLabel("1");
					btn34.setBackground(Color.RED);
				}
				else
				{
					btn34.setLabel("0");
					btn34.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn34);
		
		Button btn35 = new Button("0");
		btn35.setBackground(Color.WHITE);
		btn35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn35.getLabel()=="0")
				{
					btn35.setLabel("1");
					btn35.setBackground(Color.RED);
				}
				else
				{
					btn35.setLabel("0");
					btn35.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn35);
		
		Button btn36 = new Button("0");
		btn36.setBackground(Color.WHITE);
		btn36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn36.getLabel()=="0")
				{
					btn36.setLabel("1");
					btn36.setBackground(Color.RED);
				}
				else
				{
					btn36.setLabel("0");
					btn36.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn36);
		
		Button btn37 = new Button("0");
		btn37.setBackground(Color.WHITE);
		btn37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn37.getLabel()=="0")
				{
					btn37.setLabel("1");
					btn37.setBackground(Color.RED);
				}
				else
				{
					btn37.setLabel("0");
					btn37.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn37);
		
		Button btn38 = new Button("0");
		btn38.setBackground(Color.WHITE);
		btn38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn38.getLabel()=="0")
				{
					btn38.setLabel("1");
					btn38.setBackground(Color.RED);
				}
				else
				{
					btn38.setLabel("0");
					btn38.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn38);
		
		Button btn39 = new Button("0");
		btn39.setBackground(Color.WHITE);
		btn39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn39.getLabel()=="0")
				{
					btn39.setLabel("1");
					btn39.setBackground(Color.RED);
				}
				else
				{
					btn39.setLabel("0");
					btn39.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn39);
		
		Button btn40 = new Button("0");
		btn40.setBackground(Color.WHITE);
		btn40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn40.getLabel()=="0")
				{
					btn40.setLabel("1");
					btn40.setBackground(Color.RED);
				}
				else
				{
					btn40.setLabel("0");
					btn40.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn40);
		
		Button btn41 = new Button("0");
		btn41.setBackground(Color.WHITE);
		btn41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn41.getLabel()=="0")
				{
					btn41.setLabel("1");
					btn41.setBackground(Color.RED);
				}
				else
				{
					btn41.setLabel("0");
					btn41.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn41);
		
		Button btn42 = new Button("0");
		btn42.setBackground(Color.WHITE);
		btn42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn42.getLabel()=="0")
				{
					btn42.setLabel("1");
					btn42.setBackground(Color.RED);
				}
				else
				{
					btn42.setLabel("0");
					btn42.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn42);
		
		Button btn43 = new Button("0");
		btn43.setBackground(Color.WHITE);
		btn43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn43.getLabel()=="0")
				{
					btn43.setLabel("1");
					btn43.setBackground(Color.RED);
				}
				else
				{
					btn43.setLabel("0");
					btn43.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn43);
		
		Button btn44 = new Button("0");
		btn44.setBackground(Color.WHITE);
		btn44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn44.getLabel()=="0")
				{
					btn44.setLabel("1");
					btn44.setBackground(Color.RED);
				}
				else
				{
					btn44.setLabel("0");
					btn44.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn44);
		
		Button btn45 = new Button("0");
		btn45.setBackground(Color.WHITE);
		btn45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn45.getLabel()=="0")
				{
					btn45.setLabel("1");
					btn45.setBackground(Color.RED);
				}
				else
				{
					btn45.setLabel("0");
					btn45.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn45);
		
		Button btn46 = new Button("0");
		btn46.setBackground(Color.WHITE);
		btn46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn46.getLabel()=="0")
				{
					btn46.setLabel("1");
					btn46.setBackground(Color.RED);
				}
				else
				{
					btn46.setLabel("0");
					btn46.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn46);
		
		Button btn47 = new Button("0");
		btn47.setBackground(Color.WHITE);
		btn47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn47.getLabel()=="0")
				{
					btn47.setLabel("1");
					btn47.setBackground(Color.RED);
				}
				else
				{
					btn47.setLabel("0");
					btn47.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn47);
		
		Button btn48 = new Button("0");
		btn48.setBackground(Color.WHITE);
		btn48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn48.getLabel()=="0")
				{
					btn48.setLabel("1");
					btn48.setBackground(Color.RED);
				}
				else
				{
					btn48.setLabel("0");
					btn48.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn48);
		
		Button btn49 = new Button("0");
		btn49.setBackground(Color.WHITE);
		btn49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn49.getLabel()=="0")
				{
					btn49.setLabel("1");
					btn49.setBackground(Color.RED);
				}
				else
				{
					btn49.setLabel("0");
					btn49.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn49);
		
		Button btn50 = new Button("0");
		btn50.setBackground(Color.WHITE);
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn50.getLabel()=="0")
				{
					btn50.setLabel("1");
					btn50.setBackground(Color.RED);
				}
				else
				{
					btn50.setLabel("0");
					btn50.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn50);
		
		Button btn51 = new Button("0");
		btn51.setBackground(Color.WHITE);
		btn51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn51.getLabel()=="0")
				{
					btn51.setLabel("1");
					btn51.setBackground(Color.RED);
				}
				else
				{
					btn51.setLabel("0");
					btn51.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn51);
		
		Button btn52 = new Button("0");
		btn52.setBackground(Color.WHITE);
		btn52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn52.getLabel()=="0")
				{
					btn52.setLabel("1");
					btn52.setBackground(Color.RED);
				}
				else
				{
					btn52.setLabel("0");
					btn52.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn52);
		
		Button btn53 = new Button("0");
		btn53.setBackground(Color.WHITE);
		btn53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn53.getLabel()=="0")
				{
					btn53.setLabel("1");
					btn53.setBackground(Color.RED);
				}
				else
				{
					btn53.setLabel("0");
					btn53.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn53);
		
		Button btn54 = new Button("0");
		btn54.setBackground(Color.WHITE);
		btn54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn54.getLabel()=="0")
				{
					btn54.setLabel("1");
					btn54.setBackground(Color.RED);
				}
				else
				{
					btn54.setLabel("0");
					btn54.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn54);
		
		Button btn55 = new Button("0");
		btn55.setBackground(Color.WHITE);
		btn55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn55.getLabel()=="0")
				{
					btn55.setLabel("1");
					btn55.setBackground(Color.RED);
				}
				else
				{
					btn55.setLabel("0");
					btn55.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn55);
		
		Button btn56 = new Button("0");
		btn56.setBackground(Color.WHITE);
		btn56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn56.getLabel()=="0")
				{
					btn56.setLabel("1");
					btn56.setBackground(Color.RED);
				}
				else
				{
					btn56.setLabel("0");
					btn56.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn56);
		
		Button btn57 = new Button("0");
		btn57.setBackground(Color.WHITE);
		btn57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn57.getLabel()=="0")
				{
					btn57.setLabel("1");
					btn57.setBackground(Color.RED);
				}
				else
				{
					btn57.setLabel("0");
					btn57.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn57);
		
		Button btn58 = new Button("0");
		btn58.setBackground(Color.WHITE);
		btn58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn58.getLabel()=="0")
				{
					btn58.setLabel("1");
					btn58.setBackground(Color.RED);
				}
				else
				{
					btn58.setLabel("0");
					btn58.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn58);
		
		Button btn59 = new Button("0");
		btn59.setBackground(Color.WHITE);
		btn59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn59.getLabel()=="0")
				{
					btn59.setLabel("1");
					btn59.setBackground(Color.RED);
				}
				else
				{
					btn59.setLabel("0");
					btn59.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn59);
		
		Button btn60 = new Button("0");
		btn60.setBackground(Color.WHITE);
		btn60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn60.getLabel()=="0")
				{
					btn60.setLabel("1");
					btn60.setBackground(Color.RED);
				}
				else
				{
					btn60.setLabel("0");
					btn60.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn60);
		
		Button btn61 = new Button("0");
		btn61.setBackground(Color.WHITE);
		btn61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn61.getLabel()=="0")
				{
					btn61.setLabel("1");
					btn61.setBackground(Color.RED);
				}
				else
				{
					btn61.setLabel("0");
					btn61.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn61);
		
		Button btn62 = new Button("0");
		btn62.setBackground(Color.WHITE);
		btn62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn62.getLabel()=="0")
				{
					btn62.setLabel("1");
					btn62.setBackground(Color.RED);
				}
				else
				{
					btn62.setLabel("0");
					btn62.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn62);
		
		Button btn63 = new Button("0");
		btn63.setBackground(Color.WHITE);
		btn63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn63.getLabel()=="0")
				{
					btn63.setLabel("1");
					btn63.setBackground(Color.RED);
				}
				else
				{
					btn63.setLabel("0");
					btn63.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn63);
		
		Button btn64 = new Button("0");
		btn64.setBackground(Color.WHITE);
		btn64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn64.getLabel()=="0")
				{
					btn64.setLabel("1");
					btn64.setBackground(Color.RED);
				}
				else
				{
					btn64.setLabel("0");
					btn64.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn64);
		
		Button btn65 = new Button("0");
		btn65.setBackground(Color.WHITE);
		btn65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn65.getLabel()=="0")
				{
					btn65.setLabel("1");
					btn65.setBackground(Color.RED);
				}
				else
				{
					btn65.setLabel("0");
					btn65.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn65);
		
		Button btn66 = new Button("0");
		btn66.setBackground(Color.WHITE);
		btn66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn66.getLabel()=="0")
				{
					btn66.setLabel("1");
					btn66.setBackground(Color.RED);
				}
				else
				{
					btn66.setLabel("0");
					btn66.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn66);
		
		Button btn67 = new Button("0");
		btn67.setBackground(Color.WHITE);
		btn67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn67.getLabel()=="0")
				{
					btn67.setLabel("1");
					btn67.setBackground(Color.RED);
				}
				else
				{
					btn67.setLabel("0");
					btn67.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn67);
		
		Button btn68 = new Button("0");
		btn68.setBackground(Color.WHITE);
		btn68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn68.getLabel()=="0")
				{
					btn68.setLabel("1");
					btn68.setBackground(Color.RED);
				}
				else
				{
					btn68.setLabel("0");
					btn68.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn68);
		
		Button btn69 = new Button("0");
		btn69.setBackground(Color.WHITE);
		btn69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn69.getLabel()=="0")
				{
					btn69.setLabel("1");
					btn69.setBackground(Color.RED);
				}
				else
				{
					btn69.setLabel("0");
					btn69.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn69);
		
		Button btn70 = new Button("0");
		btn70.setBackground(Color.WHITE);
		btn70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn70.getLabel()=="0")
				{
					btn70.setLabel("1");
					btn70.setBackground(Color.RED);
				}
				else
				{
					btn70.setLabel("0");
					btn70.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn70);
		
		Button btn71 = new Button("0");
		btn71.setBackground(Color.WHITE);
		btn71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn71.getLabel()=="0")
				{
					btn71.setLabel("1");
					btn71.setBackground(Color.RED);
				}
				else
				{
					btn71.setLabel("0");
					btn71.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn71);
		
		Button btn72 = new Button("0");
		btn72.setBackground(Color.WHITE);
		btn72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn72.getLabel()=="0")
				{
					btn72.setLabel("1");
					btn72.setBackground(Color.RED);
				}
				else
				{
					btn72.setLabel("0");
					btn72.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn72);
		
		Button btn73 = new Button("0");
		btn73.setBackground(Color.WHITE);
		btn73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn73.getLabel()=="0")
				{
					btn73.setLabel("1");
					btn73.setBackground(Color.RED);
				}
				else
				{
					btn73.setLabel("0");
					btn73.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn73);
		
		Button btn74 = new Button("0");
		btn74.setBackground(Color.WHITE);
		btn74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn74.getLabel()=="0")
				{
					btn74.setLabel("1");
					btn74.setBackground(Color.RED);
				}
				else
				{
					btn74.setLabel("0");
					btn74.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn74);
		
		Button btn75 = new Button("0");
		btn75.setBackground(Color.WHITE);
		btn75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn75.getLabel()=="0")
				{
					btn75.setLabel("1");
					btn75.setBackground(Color.RED);
				}
				else
				{
					btn75.setLabel("0");
					btn75.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn75);
		
		Button btn76 = new Button("0");
		btn76.setBackground(Color.WHITE);
		btn76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn76.getLabel()=="0")
				{
					btn76.setLabel("1");
					btn76.setBackground(Color.RED);
				}
				else
				{
					btn76.setLabel("0");
					btn76.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn76);
		
		Button btn77 = new Button("0");
		btn77.setBackground(Color.WHITE);
		btn77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn77.getLabel()=="0")
				{
					btn77.setLabel("1");
					btn77.setBackground(Color.RED);
				}
				else
				{
					btn77.setLabel("0");
					btn77.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn77);
		
		Button btn78 = new Button("0");
		btn78.setBackground(Color.WHITE);
		btn78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn78.getLabel()=="0")
				{
					btn78.setLabel("1");
					btn78.setBackground(Color.RED);
				}
				else
				{
					btn78.setLabel("0");
					btn78.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn78);
		
		Button btn79 = new Button("0");
		btn79.setBackground(Color.WHITE);
		btn79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btn79.getLabel()=="0")
				{
					btn79.setLabel("1");
					btn79.setBackground(Color.RED);
				}
				else
				{
					btn79.setLabel("0");
					btn79.setBackground(Color.WHITE);
				}
			}
		});
		leftpane.add(btn79);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setPreferredSize(new Dimension(250, 10));
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(10, 22, 230, 150);
		panel.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
				btn0.setLabel("0");
				btn0.setBackground(Color.WHITE);
				btn1.setLabel("0");
				btn1.setBackground(Color.WHITE);
				btn2.setLabel("0");
				btn2.setBackground(Color.WHITE);
				btn3.setLabel("0");
				btn3.setBackground(Color.WHITE);
				btn4.setLabel("0");
				btn4.setBackground(Color.WHITE);
				btn5.setLabel("0");
				btn5.setBackground(Color.WHITE);
				btn6.setLabel("0");
				btn6.setBackground(Color.WHITE);
				btn7.setLabel("0");
				btn7.setBackground(Color.WHITE);
				btn8.setLabel("0");
				btn8.setBackground(Color.WHITE);
				btn9.setLabel("0");
				btn9.setBackground(Color.WHITE);
				btn10.setLabel("0");
				btn10.setBackground(Color.WHITE);
				btn11.setLabel("0");
				btn11.setBackground(Color.WHITE);
				btn12.setLabel("0");
				btn12.setBackground(Color.WHITE);
				btn13.setLabel("0");
				btn13.setBackground(Color.WHITE);
				btn14.setLabel("0");
				btn14.setBackground(Color.WHITE);
				btn15.setLabel("0");
				btn15.setBackground(Color.WHITE);
				btn16.setLabel("0");
				btn16.setBackground(Color.WHITE);
				btn17.setLabel("0");
				btn17.setBackground(Color.WHITE);
				btn18.setLabel("0");
				btn18.setBackground(Color.WHITE);
				btn19.setLabel("0");
				btn19.setBackground(Color.WHITE);
				btn20.setLabel("0");
				btn20.setBackground(Color.WHITE);
				btn21.setLabel("0");
				btn21.setBackground(Color.WHITE);
				btn22.setLabel("0");
				btn22.setBackground(Color.WHITE);
				btn23.setLabel("0");
				btn23.setBackground(Color.WHITE);
				btn24.setLabel("0");
				btn24.setBackground(Color.WHITE);
				btn25.setLabel("0");
				btn25.setBackground(Color.WHITE);
				btn26.setLabel("0");
				btn26.setBackground(Color.WHITE);
				btn27.setLabel("0");
				btn27.setBackground(Color.WHITE);
				btn28.setLabel("0");
				btn28.setBackground(Color.WHITE);
				btn29.setLabel("0");
				btn29.setBackground(Color.WHITE);
				btn30.setLabel("0");
				btn30.setBackground(Color.WHITE);
				btn31.setLabel("0");
				btn31.setBackground(Color.WHITE);
				btn32.setLabel("0");
				btn32.setBackground(Color.WHITE);
				btn33.setLabel("0");
				btn33.setBackground(Color.WHITE);
				btn34.setLabel("0");
				btn34.setBackground(Color.WHITE);
				btn35.setLabel("0");
				btn35.setBackground(Color.WHITE);
				btn36.setLabel("0");
				btn36.setBackground(Color.WHITE);
				btn37.setLabel("0");
				btn37.setBackground(Color.WHITE);
				btn38.setLabel("0");
				btn38.setBackground(Color.WHITE);
				btn39.setLabel("0");
				btn39.setBackground(Color.WHITE);
				btn40.setLabel("0");
				btn40.setBackground(Color.WHITE);
				btn41.setLabel("0");
				btn41.setBackground(Color.WHITE);
				btn42.setLabel("0");
				btn42.setBackground(Color.WHITE);
				btn43.setLabel("0");
				btn43.setBackground(Color.WHITE);
				btn44.setLabel("0");
				btn44.setBackground(Color.WHITE);
				btn45.setLabel("0");
				btn45.setBackground(Color.WHITE);
				btn46.setLabel("0");
				btn46.setBackground(Color.WHITE);
				btn47.setLabel("0");
				btn47.setBackground(Color.WHITE);
				btn48.setLabel("0");
				btn48.setBackground(Color.WHITE);
				btn49.setLabel("0");
				btn49.setBackground(Color.WHITE);
				btn50.setLabel("0");
				btn50.setBackground(Color.WHITE);
				btn51.setLabel("0");
				btn51.setBackground(Color.WHITE);
				btn52.setLabel("0");
				btn52.setBackground(Color.WHITE);
				btn53.setLabel("0");
				btn53.setBackground(Color.WHITE);
				btn54.setLabel("0");
				btn54.setBackground(Color.WHITE);
				btn55.setLabel("0");
				btn55.setBackground(Color.WHITE);
				btn56.setLabel("0");
				btn56.setBackground(Color.WHITE);
				btn57.setLabel("0");
				btn57.setBackground(Color.WHITE);
				btn58.setLabel("0");
				btn58.setBackground(Color.WHITE);
				btn59.setLabel("0");
				btn59.setBackground(Color.WHITE);
				btn60.setLabel("0");
				btn60.setBackground(Color.WHITE);
				btn61.setLabel("0");
				btn61.setBackground(Color.WHITE);
				btn62.setLabel("0");
				btn62.setBackground(Color.WHITE);
				btn63.setLabel("0");
				btn63.setBackground(Color.WHITE);
				btn64.setLabel("0");
				btn64.setBackground(Color.WHITE);
				btn65.setLabel("0");
				btn65.setBackground(Color.WHITE);
				btn66.setLabel("0");
				btn66.setBackground(Color.WHITE);
				btn67.setLabel("0");
				btn67.setBackground(Color.WHITE);
				btn68.setLabel("0");
				btn68.setBackground(Color.WHITE);
				btn69.setLabel("0");
				btn69.setBackground(Color.WHITE);
				btn70.setLabel("0");
				btn70.setBackground(Color.WHITE);
				btn71.setLabel("0");
				btn71.setBackground(Color.WHITE);
				btn72.setLabel("0");
				btn72.setBackground(Color.WHITE);
				btn73.setLabel("0");
				btn73.setBackground(Color.WHITE);
				btn74.setLabel("0");
				btn74.setBackground(Color.WHITE);
				btn75.setLabel("0");
				btn75.setBackground(Color.WHITE);
				btn76.setLabel("0");
				btn76.setBackground(Color.WHITE);
				btn77.setLabel("0");
				btn77.setBackground(Color.WHITE);
				btn78.setLabel("0");
				btn78.setBackground(Color.WHITE);
				btn79.setLabel("0");
				btn79.setBackground(Color.WHITE);
			}
		});
		btnClear.setBounds(10, 204, 89, 23);
		panel.add(btnClear);
		
		JButton btnCopy = new JButton("Copy");
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.copy();
				}
		});
		btnCopy.setBounds(151, 204, 89, 23);
		panel.add(btnCopy);
		
		JButton btnConvert = new JButton("=>");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s;
				s="B"+btn0.getLabel()+
						btn1.getLabel()+
						btn2.getLabel()+
						btn3.getLabel()+
						btn4.getLabel()+
						btn5.getLabel()+
						btn6.getLabel()+
						btn7.getLabel();
				s+=" ,B"+btn8.getLabel()+
						btn9.getLabel()+
						btn10.getLabel()+
						btn11.getLabel()+
						btn12.getLabel()+
						btn13.getLabel()+
						btn14.getLabel()+
						btn15.getLabel();
				s+=" ,B"+btn16.getLabel()+
						btn17.getLabel()+
						btn18.getLabel()+
						btn19.getLabel()+
						btn20.getLabel()+
						btn21.getLabel()+
						btn22.getLabel()+
						btn23.getLabel();
				s+=" ,B"+btn24.getLabel()+
						btn25.getLabel()+
						btn26.getLabel()+
						btn27.getLabel()+
						btn28.getLabel()+
						btn29.getLabel()+
						btn30.getLabel()+
						btn31.getLabel();
				s+=" ,B"+btn32.getLabel()+
						btn33.getLabel()+
						btn34.getLabel()+
						btn35.getLabel()+
						btn36.getLabel()+
						btn37.getLabel()+
						btn38.getLabel()+
						btn39.getLabel();
				s+=" ,B"+btn40.getLabel()+
						btn41.getLabel()+
						btn42.getLabel()+
						btn43.getLabel()+
						btn44.getLabel()+
						btn45.getLabel()+
						btn46.getLabel()+
						btn47.getLabel();
				s+=" ,B"+btn48.getLabel()+
						btn49.getLabel()+
						btn50.getLabel()+
						btn51.getLabel()+
						btn52.getLabel()+
						btn53.getLabel()+
						btn54.getLabel()+
						btn55.getLabel();
				s+=" ,B"+btn56.getLabel()+
						btn57.getLabel()+
						btn58.getLabel()+
						btn59.getLabel()+
						btn60.getLabel()+
						btn61.getLabel()+
						btn62.getLabel()+
						btn63.getLabel();
				s+=" ,B"+btn64.getLabel()+
						btn65.getLabel()+
						btn66.getLabel()+
						btn67.getLabel()+
						btn68.getLabel()+
						btn69.getLabel()+
						btn70.getLabel()+
						btn71.getLabel();
				s+=" ,B"+btn72.getLabel()+
						btn73.getLabel()+
						btn74.getLabel()+
						btn75.getLabel()+
						btn76.getLabel()+
						btn77.getLabel()+
						btn78.getLabel()+
						btn79.getLabel();
				textArea.setText(s);
				s="";
			}
		});
		contentPane.add(btnConvert, BorderLayout.CENTER);
	}
}
