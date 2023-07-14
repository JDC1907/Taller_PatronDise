package decorator;

public class TelegramDecorator extends NotificacionDecorator{
	public TelegramDecorator(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviarNotificacion() {
        super.enviarNotificacion();
        System.out.println("Enviando notificación por Telegram...");
    }
}
