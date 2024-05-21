package micro.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceVehicleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceVehicleApplication.class, args);
	}

}
