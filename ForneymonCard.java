
public class ForneymonCard {
	
	private String name; 
	private String type; 
	
	ForneymonCard (String n, String t){
		
		if ( t == "Burnymon"  ) {
			type = "Burnymon"; 
		}
		else if (t == "Dampymon" ){
			type = "Dampymon"; 
		}
		else if (t == "Leafymon" ) {
			type = "Leafymon";  
		}
		else {
			throw new IllegalArgumentException(); 
		}
		name = n; 

	}
	
	ForneymonCard (String n){
		throw new IllegalArgumentException(); 
	}
	
	ForneymonCard (){
		name = "MissingNu"; 
		type = "Burnymon";
	}
	
	public String checkName() {
		return name;
	}
	
	public String checkType() {
		return type;
	}
	
	public String toString() {
		return type + ": " + name; 
	}
}
