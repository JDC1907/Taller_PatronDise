package decorator;

public class CorreoElectronicoNotificacion implements Notificacion {

	@Override
	public void enviarNotificacion() {
		System.out.println("Enviando notificación por correo electrónico...");
		
	}

}
