package decorator;

import java.util.List;
import java.util.ArrayList;

public class Tienda {
	private List<Notificacion> notificaciones = new ArrayList<>();

    public void agregarMecanismoNotificacion(Notificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public void enviarNotificaciones() {
        for (Notificacion notificacion : notificaciones) {
            //notificacion.enviarNotificacion();
        }
    }
}
