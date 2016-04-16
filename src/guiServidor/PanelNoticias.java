package guiServidor;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class PanelNoticias extends JPanel {
	private JTextField txtTitulo;
	private JTextArea txtContenido;
	private JTextField txtFechaEvento;
	private JTextField txtHoraEvento;
	private JTextField txtHoraPubli;
	private JTextField txtFechaPubli;
	private JTextField txtDuracion;
	private JLabel lblDuracion;
	private JLabel lblFechahoraEbento;
	private JLabel lblFechahoraPublicacion;

	public PanelNoticias() {
		setLayout(null);
		
		JLabel lblNoticia = new JLabel("Noticia");
		lblNoticia.setForeground(new Color(0, 0, 0));
		lblNoticia.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNoticia.setBounds(25, 24, 46, 14);
		add(lblNoticia);
		
		txtTitulo = new JTextField();
		txtTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitulo.setText("Titulo");
		txtTitulo.setBounds(10, 59, 443, 20);
		add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 443, 159);
		add(scrollPane);
		
		txtContenido = new JTextArea();
		txtContenido.setText("escribir noticia..");
		scrollPane.setViewportView(txtContenido);
		
		txtFechaEvento = new JTextField();
		txtFechaEvento.setText("fecha");
		txtFechaEvento.setBounds(153, 260, 86, 20);
		add(txtFechaEvento);
		txtFechaEvento.setColumns(10);
		
		txtHoraEvento = new JTextField();
		txtHoraEvento.setText("hora");
		txtHoraEvento.setBounds(260, 260, 86, 20);
		add(txtHoraEvento);
		txtHoraEvento.setColumns(10);
		
		txtHoraPubli = new JTextField();
		txtHoraPubli.setText("hora");
		txtHoraPubli.setBounds(260, 291, 86, 20);
		add(txtHoraPubli);
		txtHoraPubli.setColumns(10);
		
		txtFechaPubli = new JTextField();
		txtFechaPubli.setText("fecha");
		txtFechaPubli.setBounds(153, 291, 86, 20);
		add(txtFechaPubli);
		txtFechaPubli.setColumns(10);
		
		txtDuracion = new JTextField();
		txtDuracion.setText("tiempo");
		txtDuracion.setBounds(371, 285, 67, 20);
		add(txtDuracion);
		txtDuracion.setColumns(10);
		
		lblDuracion = new JLabel("Duracion");
		lblDuracion.setBounds(371, 260, 46, 14);
		add(lblDuracion);
		
		lblFechahoraEbento = new JLabel("Fecha/hora Evento");
		lblFechahoraEbento.setBounds(25, 264, 118, 14);
		add(lblFechahoraEbento);
		
		lblFechahoraPublicacion = new JLabel("Fecha/hora Publicacion");
		lblFechahoraPublicacion.setBounds(25, 294, 118, 14);
		add(lblFechahoraPublicacion);

	}
}
