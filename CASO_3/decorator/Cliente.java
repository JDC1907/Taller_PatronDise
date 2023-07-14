package decorator;

public class Cliente {
	public static void main(String[] args) {
        Tienda tienda = new Tienda();

        // Configuración inicial de notificaciones por SMS y correo electrónico
        tienda.agregarMecanismoNotificacion(new SMSNotificacion());
        tienda.agregarMecanismoNotificacion(new CorreoElectronicoNotificacion());

        // Configuración adicional de notificaciones por WhatsApp y Signal
        tienda.agregarMecanismoNotificacion(new WhatsAppDecorator(new SMSNotificacion()));
        tienda.agregarMecanismoNotificacion(new SignalDecorator(new CorreoElectronicoNotificacion()));

        // Envío de notificaciones a los clientes
        tienda.enviarNotificaciones();
    }
}
