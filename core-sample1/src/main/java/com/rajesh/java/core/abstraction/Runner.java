package com.rajesh.java.core.abstraction;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------");
		System.out.println("Running Petrol car");
		Cars petrolCar = new PertolCar();
		petrolCar.doWalking();
		petrolCar.takeFuel();
		
		System.out.println("-------------------------------------------");
		System.out.println("Running Diesel");
		Cars diesalCar = new DieselCar();
		diesalCar.doWalking();
		diesalCar.takeFuel();
	}

}
