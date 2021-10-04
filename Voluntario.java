import java.util.ArrayList;

public class Voluntario extends Usuario {
	//Atributos
	protected ArrayList<Evento> eventos;
	
	//Constructor
	public Voluntario(String nombre, String telefono, String correoElectronico) {
		super(nombre, telefono, correoElectronico);
		eventos = new ArrayList<Evento>();
	}
	
	//Metodos
	public void inscribirseEnEvento(String nombre, int monto ,String inicio, String fin) {
		Evento evento = new Evento(nombre, monto ,inicio, fin);
		this.eventos.add(evento);
	}
	
	public void inscribirseEnEvento(String nombre, int monto) {
		Evento evento = new Evento(nombre,monto);
		this.eventos.add(evento);
	}
	
	public void listarEventos() {
		if(this.eventos.isEmpty()) {
			System.out.println("No tiene eventos asociados");
		}
		else {
			System.out.println(">Eventos asociados:");
			for(int i = 0; i<this.eventos.size(); i++) {
				System.out.println(this.eventos.get(i).toString());
			}
		}
		System.out.println();
	}

}
