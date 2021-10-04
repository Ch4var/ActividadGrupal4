import java.time.LocalDateTime;
import java.util.ArrayList;

public class Organizacion {
	protected static int dineroDisponible = 200000;
	protected static int dineroComprometido = 0;
	private static int dineroTotal = dineroDisponible + dineroComprometido;
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Evento> eventos;
	private ArrayList<Donacion> donaciones;
	
	public Organizacion(String nombre) {
		this.nombre = nombre;
		this.usuarios = new ArrayList<Usuario>();
		this.eventos = new ArrayList<Evento>();
		this.donaciones = new ArrayList<Donacion>();
	}
	
	public void agregarVoluntario(String nombreCompleto, String telefono, String correoElectronico) {
		Voluntario v1 = new Voluntario(nombreCompleto, telefono, correoElectronico);
		usuarios.add(v1);
	}
	
	public Organizador agregarOrganizador(String nombreCompleto, String telefono, String correoElectronico) {
		Organizador o1 = new Organizador(nombreCompleto, telefono, correoElectronico);
		usuarios.add(o1);
		return o1;
	}
	
	public Usuario getUsuario(int indice) {
		return this.usuarios.get(indice);
	}
	
	public void hacerDonacion(int montoDonado, Voluntario donante) {
		Donacion donacion = new Donacion(montoDonado, LocalDateTime.now(), donante);
		dineroDisponible+=montoDonado;
		this.donaciones.add(donacion);
	}
}