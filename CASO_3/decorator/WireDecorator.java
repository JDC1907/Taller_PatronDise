package decorator;

public class WireDecorator extends NotificacionDecorator {
	public WireDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarNotificacion() {
        super.enviarNotificacion();
        System.out.println("Enviando notificación por Wire...");
    }
}
