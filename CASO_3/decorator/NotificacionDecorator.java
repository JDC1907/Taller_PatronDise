package decorator;

public abstract class NotificacionDecorator implements Notificacion {
	protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviarNotificacion() {
        notificacion.enviarNotificacion();
    }
}
