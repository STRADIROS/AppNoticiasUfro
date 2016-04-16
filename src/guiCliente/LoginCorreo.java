package guiCliente;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LoginCorreo extends JPanel {
	private JTextField txtCorreoUfro;

	public LoginCorreo() {
		setLayout(null);

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(81, 70, 89, 23);
		add(btnNewButton);

		txtCorreoUfro = new JTextField();
		txtCorreoUfro.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorreoUfro.setText("de la ufro");
		txtCorreoUfro.setBounds(55, 36, 142, 23);
		add(txtCorreoUfro);
		txtCorreoUfro.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(10, 11, 46, 14);
		add(lblCorreo);

	}
}
