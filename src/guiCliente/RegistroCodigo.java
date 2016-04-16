package guiCliente;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class RegistroCodigo extends JPanel {
	private JTextField txtDigitos;


	public RegistroCodigo() {
		setLayout(null);
		
		txtDigitos = new JTextField();
		txtDigitos.setHorizontalAlignment(SwingConstants.CENTER);
		txtDigitos.setText("Ingrese 8 digitos");
		txtDigitos.setBounds(43, 51, 130, 20);
		add(txtDigitos);
		txtDigitos.setColumns(10);
		
		JLabel lblCodigoVerficacion = new JLabel("Codigo Verficacion");
		lblCodigoVerficacion.setBounds(57, 26, 104, 14);
		add(lblCodigoVerficacion);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(71, 81, 77, 23);
		add(btnRegistrar);

	}

}
