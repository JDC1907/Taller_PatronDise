package decorator;

public class SMSNotificacion implements Notificacion{

	@Override
	public void enviarNotificacion() {
		System.out.println("Enviando notificación por SMS...");
		
	}

}
