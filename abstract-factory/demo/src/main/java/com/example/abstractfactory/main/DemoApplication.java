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

		scorpioFactory factory1 = new scorpioFactory();
		defenderFactory factory2 = new defenderFactory();
		marutiFactory factory3 = new marutiFactory();

		
		Car car1 = new Car(factory1);
		Car car2 = new Car(factory2);
		Car car3 = new Car(factory3);

		Collection<Car> list = new ArrayList<>();
		list.add(car1);
		list.add(car2);
		list.add(car3);

		for (Car c : list) {
			c.drivecar();
		}

	}

}
