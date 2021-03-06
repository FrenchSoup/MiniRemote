package controller.communication.events;


import java.io.Serializable;

/**
 * Created by cyprien on 09/11/15.
 */
public class EventWrapper implements Serializable{
    private static final long serialVersionUID=1234567890;
    private controller.communication.events.RemoteEvent event;
    private Class<? extends controller.communication.events.RemoteEvent> type;

    public EventWrapper(RemoteEvent event) {
        this.event = event;
        this.type = event.getClass();
    }

    public controller.communication.events.RemoteEvent getRemoteEvent() {
        return event;
    }

    public Class<? extends RemoteEvent> getTypeOfEvent() {
        return type;
    }

}
