package com.example.pattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

	public static void main(String[] args) {
		// scorpio sc = new scorpio();
		// scorpioclassic scc = new scorpioclassic();
		// sc.drivecar();
		// scc.bhagale();


		Scorpiofactory factory = new Scorpiofactory();
		scorpio car2 = factory.Createscorpio('s');
		car2.drivecar();
	}

}
