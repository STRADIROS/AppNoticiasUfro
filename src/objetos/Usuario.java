package objetos;

import java.io.Serializable;
import utils.TextoFijo;

public class Usuario implements Serializable{

	public String correo;
	public TextoFijo codigo = new TextoFijo(8);
	public boolean activo=true;
	public String ultimo_acceso;



}
