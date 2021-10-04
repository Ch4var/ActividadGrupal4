public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Voluntario v0 = AdministradorDeConsola.crearVoluntario();
		Voluntario vol1 = new Voluntario("Ana Mora", "88752650", "anamoraar@gmail.com");
		Voluntario vol2 = new Voluntario("Mateo Mena", "70723457", "mateo05@hotmail.com");
		Voluntario vol3 = new Voluntario("Sofía Salazar", "89279812", "sofs4@gmail.com");
		
		AdministradorDeConsola.inscribirVoluntarioAEvento(vol1);
		
		vol1.listarEventos();
		
		vol1.inscribirseEnEvento("Campaña recolección de basura");
		vol1.inscribirseEnEvento("Repartimiento de almuerzos");
		vol1.inscribirseEnEvento("Campaña limpieza de río");
		
		
		vol2.inscribirseEnEvento("Repartimiento de desayunos", "18/09/2021 06:00", "18/09/2021 10:30");
		
		System.out.println(vol1.toString());
		vol1.listarEventos();
		System.out.println(vol2.toString());
		vol2.listarEventos();
		System.out.println(vol3.toString());
		vol3.listarEventos();*/
		Organizacion org = new Organizacion("Accion Union");
		Organizador organizador = org.agregarOrganizador("Sofía Salazar", "89279812", "sofs4@gmail.com");
		organizador.inscribirseEnEvento("Campaña vacunación",90000);
		organizador.agregarEvento("Limpieza de calles",50000);
		
		System.out.println(organizador.toString());
		
	}
}
