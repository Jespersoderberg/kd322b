import java.util.ArrayList;


public class Main {
	
	
	public static void main(String[] args){ 
	ArrayList<Bike>  bikelist = new ArrayList<Bike>();
	bikelist.add(new Bike( "röd", 7, 1000 ));
	bikelist.add(new Bike( "blå", 12, 2000 ));
	bikelist.add(new Bike( "röd", 14, 3000 ));
	bikelist.add(new Bike( "gul", 17, 4000 ));
	bikelist.add(new Bike( "svart", 22, 5000 ));
	bikelist.add(new Bike( "gul",24, 6000 ));
	bikelist.add(new Bike( "vit", 21, 7000 ));
	bikelist.add(new Bike( "blå", 15, 8000 ));
	bikelist.add(new Bike( "svart", 20, 9000 ));
	bikelist.add(new Bike( "blå", 28, 10000 ));
	
	for(Bike b:bikelist){
			System.out.println(" Cykeln nummer " +bikelist.indexOf(b)+" färg "+b.getColor()+" tum "+b.getSize()+" pris "+b.getPrice());}
	
	}
	}

