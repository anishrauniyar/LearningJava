package com.project.main;

import com.project.MobileType.FourWheelerVehicle;
import com.project.MobileType.IphoneMobile;
import com.project.MobileType.SamsungMobile;
import com.project.MobileType.TwoWheelerVehicle;
import com.project.mobile.VehicleAbstract;

public class MainActivity {

	public static void main(String[] args) {
		
		SamsungMobile sm = new SamsungMobile("Samsung", "Android OS", "S7", 70000);
		System.out.println("The Manufacturer is: " + sm.getManufacturer());
		System.out.println("The OS is: " + sm.getOperating_system());
		System.out.println("The Model is: " + sm.getModel());
		System.out.println("The cost is: " + sm.getCost());
		//MainActivity a = new MainActivity();
		SamsungMobile sm2 = new SamsungMobile("Samsung", "AndroidL", "Note 4", 4000);
		System.out.println("The manufacturee is: " + sm2.getManufacturer());
		System.out.println("The OS is: " + sm2.getOperating_system());
		System.out.println("The Model is: " + sm2.getModel());
		System.out.println("The cost is: " + sm2.getCost());
		String test1 = functionName("Puspa");
		System.out.println(test1);
		int test2 = functionName(3,2);
		System.out.println(test2);
		
		IphoneMobile ip = new IphoneMobile("Iphone", "IOS", "i7", 100000);
		System.out.println("The manufacturer is : " + ip.getManufacturer());
		System.out.println("The OS is: " + ip.getOperating_system());
		System.out.println("The Model is :" + ip.getModel());
		System.out.println("The cost is :" + ip.getCost());
		String  a = calculation ("Iphone");
		System.out.println (a);
		int c = calculation (2, 4,5);
		System.out.println(c);
		
		VehicleAbstract va1 = new TwoWheelerVehicle();
		va1.start();
		va1.stop();
		VehicleAbstract va2 = new FourWheelerVehicle();
		va2.start();
		va2.stop();
		
	}
	
	private static String calculation(String var) {
		// TODO Auto-generated method stub
		String  a = "New Model " + var;
		
		return a;
	}

	public static int calculation ( int a, int b, int c)
	{
		int d = 10 + a+b-c;
		return d;
	}
	
	
	
	public static String functionName(String p) {
		String bista = p + " Bista";
		return bista;
	}
	public static int functionName(int a, int b) {
		int c = a + b;
		return c;
	}
}
