package com.rts;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rts.evaluation.controller.SportsController;
import com.rts.evaluation.model.Sports;
import com.rts.evaluation.reopsitory.SportsDAO;

@SpringBootApplication
public class SbSports1Application {
	
	public static void main(String[] args) {
		 SpringApplication.run(SbSports1Application.class, args);
	 

	
//	static SportsDAO dao = new SportsDAO();
//	public Sports menu() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter all the Details to login" );
//		return new Sports(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
//		
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(SbSports1Application.class, args);
//		SbSports1Application obj = new SbSports1Application();
//		
//		Sports bean = obj.menu();
//		SportsController control = new SportsController();
//		control.performInsert(bean);
//		
//		
//		
//		
//	}

}
}
