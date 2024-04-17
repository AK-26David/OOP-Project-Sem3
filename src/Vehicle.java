import java.util.*;
import java.io.*;

public class Vehicle<T, M> {
	protected T type;
	protected M model;
	protected double price;

	public Vehicle() {
		type = null;
		model = null;
		price = 0;
	}

	public void setVehicle(T type, M model, double price){
		this.type = type;
		this.model = model;
		this.price = price;
	}

	public T getType() {return type;}
	public M getModel() {return model;}
	public double getPrice() {return price;}
}

