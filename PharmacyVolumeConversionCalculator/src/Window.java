import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Window extends JFrame {
	private JTextField txtStartValue;
	public Window() {
		String unitOfMeasurement[] = {"CCs", "MLs", "Teaspoons", "Tablespoons", "Ounces", "Pints", "Liters", "Gallons"};
		
		getContentPane().setLayout(null);
		
		txtStartValue = new JTextField();
		txtStartValue.setBounds(10, 37, 86, 20);
		getContentPane().add(txtStartValue);
		txtStartValue.setColumns(10);

		JComboBox cmboUnitsOfMeasurement = new JComboBox(unitOfMeasurement);
		cmboUnitsOfMeasurement.setBounds(106, 37, 139, 20);
		getContentPane().add(cmboUnitsOfMeasurement);
		
		JLabel lblIsEqualTo = new JLabel("is equal to:");
		lblIsEqualTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIsEqualTo.setBounds(43, 67, 76, 14);
		getContentPane().add(lblIsEqualTo);
		
		JLabel lblCCs = new JLabel("ccs");
		lblCCs.setBounds(10, 92, 109, 14);
		getContentPane().add(lblCCs);
		
		JLabel lblMLs = new JLabel("mls");
		lblMLs.setBounds(129, 92, 109, 14);
		getContentPane().add(lblMLs);
		
		JLabel lblTblspn = new JLabel("tblspns");
		lblTblspn.setBounds(129, 117, 109, 14);
		getContentPane().add(lblTblspn);
		
		JLabel lblTspn = new JLabel("tspns");
		lblTspn.setBounds(10, 117, 109, 14);
		getContentPane().add(lblTspn);
		
		JLabel lblGal = new JLabel("gals");
		lblGal.setBounds(129, 167, 109, 14);
		getContentPane().add(lblGal);
		
		JLabel lblPt = new JLabel("pts");
		lblPt.setBounds(129, 142, 109, 14);
		getContentPane().add(lblPt);
		
		JLabel lblOz = new JLabel("ozs");
		lblOz.setBounds(10, 142, 109, 14);
		getContentPane().add(lblOz);
		
		JLabel lblTitle = new JLabel("Pharmacy Volume Conversion Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(10, 11, 287, 14);
		getContentPane().add(lblTitle);
		
		JLabel lblLtrs = new JLabel("ltrs");
		lblLtrs.setBounds(10, 167, 109, 14);
		getContentPane().add(lblLtrs);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final String value = txtStartValue.getText();
				final double valueD = Double.valueOf(value);
				final int units = cmboUnitsOfMeasurement.getSelectedIndex();
				Calculator.calculations(valueD, units);
				lblCCs.setText(Calculator.strCCs);
				lblMLs.setText(Calculator.strMLs);
				lblTspn.setText(Calculator.strTspn);
				lblTblspn.setText(Calculator.strTblspn);
				lblOz.setText(Calculator.strOz);
				lblPt.setText(Calculator.strPints);
				lblLtrs.setText(Calculator.strLtrs);
				lblGal.setText(Calculator.strGals);
			}
		});
		btnConvert.setForeground(new Color(47, 79, 79));
		btnConvert.setBounds(255, 36, 71, 23);
		getContentPane().add(btnConvert);
	}
	
	public static void main(String args[]) {
		Window window = new Window();
		window.setSize(new Dimension(450, 300));
		window.setVisible(true);
	}
}
