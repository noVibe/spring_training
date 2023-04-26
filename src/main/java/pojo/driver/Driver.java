package pojo.driver;

import pojo.transport.Transport;
public class Driver {
    Transport transport;

    public Driver(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport.getClass().getSimpleName() +
                '}';
    }
}
