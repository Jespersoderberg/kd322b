import java.util.ArrayList;


public class Main {
	
	
	public static void main(String[] args){ 
	ArrayList<Bike>  bikelist = new ArrayList<Bike>();
	bikelist.add(new Bike( "r�d", 7, 1000 ));
	bikelist.add(new Bike( "bl�", 12, 2000 ));
	bikelist.add(new Bike( "r�d", 14, 3000 ));
	bikelist.add(new Bike( "gul", 17, 4000 ));
	bikelist.add(new Bike( "svart", 22, 5000 ));
	bikelist.add(new Bike( "gul",24, 6000 ));
	bikelist.add(new Bike( "vit", 21, 7000 ));
	bikelist.add(new Bike( "bl�", 15, 8000 ));
	bikelist.add(new Bike( "svart", 20, 9000 ));
	bikelist.add(new Bike( "bl�", 28, 10000 ));
	
	for(Bike b:bikelist){
			System.out.println(" Cykeln nummer " +bikelist.indexOf(b)+" f�rg "+b.getColor()+" tum "+b.getSize()+" pris "+b.getPrice());}
	
	}
	}

