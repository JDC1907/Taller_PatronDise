package decorator;

public class SignalDecorator extends NotificacionDecorator{
	 public SignalDecorator(Notificacion notificacion) {
	        super(notificacion);
	    }

	    @Override
	    public void enviarNotificacion() {
	        super.enviarNotificacion();
	        System.out.println("Enviando notificación por Signal...");
	    }
}
