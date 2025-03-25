package com.example.abstractfactory.main;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.abstractfactory.main.models.Car;
import com.example.abstractfactory.main.models.defenderFactory;
import com.example.abstractfactory.main.models.marutiFactory;
import com.example.abstractfactory.main.models.scorpioFactory;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		System.out.println("hii ...............ye program chal rha h ");

		IvehicleFactory factory1 = new scorpioFactory();
		IvehicleFactory factory2 = new defenderFactory();
		IvehicleFactory factory3 = new marutiFactory();

		Car car1 = new car(factory1);
		Car car2 = new car(factory2);
		Car car3 = new car(factory3);
		
		Collection<Car> list  = new ArrayList

	}

}
