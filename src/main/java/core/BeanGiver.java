package core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "core")

public class BeanGiver {
	@Bean
public Car getCar() {
	return new Car();
}
	public Bike getBike() {
		return new Bike();
	}
}
