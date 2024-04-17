import java.util.*;
import java.io.*;

/////////////////////////////////////////////Car class/////////////////////////////////////


public class Car extends Vehicle<String, String>{
	public Car() {
		super();
	}

	public void setCar(String type,String model, double price){
		super.setVehicle(type, model, price);
	}

	public String getType() {
		return super.getType();
	}

	public String getCar() {
		return super.getType() + "-" + super.getModel();
	}

	public String getModel() {
		return super.getModel();
	}

	public double getCarPrice() {
		return super.getPrice();
	}
}
//	public void saveToFile() throws IOException {
		
//		PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Cars_Inventory.txt"), true));
//			outFile.println(getCar() + " " + getCarPrice());
//			outFile.close();
//  }
