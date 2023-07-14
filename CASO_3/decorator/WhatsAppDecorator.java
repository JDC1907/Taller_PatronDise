package decorator;

public class WhatsAppDecorator extends NotificacionDecorator {
	public WhatsAppDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarNotificacion() {
        super.enviarNotificacion();
        System.out.println("Enviando notificación por WhatsApp...");
    }
}
