/*
 * (3) Following the example in Transmogrify.java, create a Starship class
 * containing an AlertStatus reference that can indicate three different states.
 * Include methods to change the states.
 */

class AlertStatus {
    public void alert() {}
}

class NormalStatus extends AlertStatus {
    @Override
    public void alert() { System.out.println("Normal"); }
}

class AlarmStatus extends AlertStatus {
    @Override
    public void alert() { System.out.println("Alarm"); }
}

class DangerStatus extends AlertStatus {
    @Override
    public void alert() { System.out.println("Danger"); }
}

class Starship {
    private AlertStatus alertStatus = new NormalStatus();
    public void changeStatus(AlertStatus status) { alertStatus = status; }
    public void performAlert() { alertStatus.alert(); }
}

public class App {
    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.performAlert();
        ship.changeStatus(new AlarmStatus());
        ship.performAlert();
        ship.changeStatus(new DangerStatus());
        ship.performAlert();
    }
}
