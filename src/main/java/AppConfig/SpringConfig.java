package AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.transport.Bus;
import pojo.transport.Car;
import pojo.transport.Pickup;
import pojo.driver.Driver;

@Configuration
public class SpringConfig {
    @Bean
    public Bus getBusBean() {
        return new Bus();
    }

    @Bean
    public Car getCarBean() {
        return new Car();
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup();
    }

    @Bean("busDriver")
    public Driver getBusDriverBean() {
        return new Driver(getBusBean());
    }

    @Bean("carDriver")
    public Driver getCarDriverBean() {
        return new Driver(getCarBean());
    }
    @Bean("pickupDriver")
    public Driver getPickupDriverBean() {
        return new Driver(getPickupBean());
    }
}
