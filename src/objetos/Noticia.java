package objetos;

import java.io.Serializable;
import java.util.Date;

import utils.TextoFijo;

public class Noticia implements Serializable{
	
	
	public TextoFijo titulo = new TextoFijo(50);
	public TextoFijo contenido = new TextoFijo(300);
	public Date fecha_hora_evento;
	public Date fecha_publicacion;
	public Date duracion;
	
	

}
