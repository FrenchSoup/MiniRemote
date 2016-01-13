package controller.communication.events;
/**
 * Created by cyprien on 09/11/15.
 */
public class KeyboardEvent extends RemoteEvent {
    private int keycode;
    private KeyboardAction action;
    private SpecialKey specialKey;

    public KeyboardEvent(int keycode, KeyboardAction action, SpecialKey sp) {
        this.keycode = keycode;
        this.action = action;
        specialKey = sp;
    }

    public int getKeycode() {
        return keycode;
    }

    public KeyboardAction getAction() {
        return action;
    }

    public SpecialKey getSpecialKey() {
        return specialKey;
    }

    public enum KeyboardAction {
        KeyPress("REMOTE_EVENT_KEY_PRESS"),
        KeyRelease("REMOTE_EVENT_KEY_RELEASE"),
        KeyHit("REMOTE_EVENT_KEY_HIT");

        private String id;

        KeyboardAction(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public enum SpecialKey {
        Alt,
        Tab,
        Alt_Gr,
        Ctrl,
        Context,
        Del,
        Forward_Del,
        Shift,
        Caps_Lock,
        Enter;
    }
}
