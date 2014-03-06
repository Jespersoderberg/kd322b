
public class Bike {
	private String color;
	private int price;
	private int size;
	private static int nbrOfBikes;
	
	public Bike(String color, int size){
		this.color = color;
		this.size = size;
		

		
	}
	/** Skapar en cykel med variabler som anges i Constants.java**/
	public Bike(String color, int size, int price){
		nbrOfBikes = nbrOfBikes+1;
		
		if(size <= Constants.MAX_SIZE && size >= Constants.MIN_SIZE){
			this.size = size;
		}else{
			if (size > Constants.MAX_SIZE){
				this.size = Constants.MAX_SIZE;
			}else{
				if(size < Constants.MIN_SIZE){
					this.size = Constants.MIN_SIZE;
				}
				
			}
		}
		for( int i=0;i<Constants.acceptedColors.length;i++){
			if(color.equals(Constants.acceptedColors[i]) == false){
				this.color = "okänd färg";
			}
		}
		
		if(price <= Constants.MAX_PRICE && size >= Constants.MIN_PRICE){
		 this.price = price;
	}else{
		if(price > Constants.MAX_PRICE){
				this.price = Constants.MAX_PRICE;
	}else{
		if(price < Constants.MIN_PRICE){
			this.price = Constants.MIN_PRICE;
		}
	}
	}

}
		/** Returnerar färgen på cykeln**/
	public String getColor(){
		return color;

	}
    /** Returnerar storkleken på cykeln**/
	public int getSize(){
		return size;
	}
	/** Returnerar priset på cykeln**/
	public int getPrice(){
		return price;
	}
	
	public int setPrice(int price){
		return price;
	}
	/** Returnerar hur många cyklar**/
	public static int getNumberOfBikes(){
		return nbrOfBikes;
		
	}
}