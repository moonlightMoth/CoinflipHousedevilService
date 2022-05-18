package moonlightmoth.housedevil.coinflip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class CoinflipApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinflipApplication.class, args);
	}

}
