import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Donacion {

	private int montoDonado;
	private LocalDateTime tiempoDeDonacion = LocalDateTime.now();
	private Voluntario donante;
	public Donacion(int montoDonado, LocalDateTime tiempoDeDonacion, Voluntario donante) {
		super();
		this.montoDonado = montoDonado;
		this.tiempoDeDonacion = tiempoDeDonacion;
		this.donante = donante;
	}
	
	
}
