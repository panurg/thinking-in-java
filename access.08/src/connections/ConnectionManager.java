package connections;

class Connection {
    Connection(int n) {
        System.out.println("Connection #" + n + " created");
    }
}

public class ConnectionManager {
    static int max = 10;
    static int count = 0;
    static Connection[] connections;
    static {
        connections = new Connection[max];
        for (int i = 0; i < max; i++)
            connections[i] = new Connection(i);
    }
    public static Connection getConnection() {
        return count >= max ? null : connections[count++];
    }
}
