package GOFO;

import java.util.Date;

public class PlayGround {
	private String name;
	private String location;
	private float size;
	private int availableHours;
	private float pricePerHour;
	private Date cancellationPeriod;
	
	
	
public void AddPlaygroundInfo(String name,String location , float size, int availableHours, float pricePerHour, Date cancellationPeriod) {
		this.name=name;
		this.location=location;
		this.size=size;
		this.availableHours =availableHours;
		this.pricePerHour=pricePerHour;
		this.cancellationPeriod=cancellationPeriod;
	}
public void display() {
	
}

}