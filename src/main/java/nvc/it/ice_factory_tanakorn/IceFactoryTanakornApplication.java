package nvc.it.ice_factory_tanakorn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IceFactoryTanakornApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactoryTanakornApplication.class, args);
	}

}
