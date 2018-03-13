package eu.ase.poly;

public class Vehicle /*extends Object*/ implements Movement {
	private int weight;
	public Vehicle() {
		
	}
	
	public Vehicle(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	@Override
	public void startEngine() {
		System.out.println("Vehicle - Start Engine");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Vehicle - Stop Engine");
	}
	
	public String display() {
		return new String("Vehicle - weight = " + this.weight);
	}
}