
public class FlippingForneymonCard extends ForneymonCard {
	
	private boolean faceStatus; 
	
	public FlippingForneymonCard(String n, String t, Boolean f) {
		super(n,t); 
		faceStatus = f; 
	}
	
	public FlippingForneymonCard() {
		super("MissingNu", "Burnymon"); 
		faceStatus = true;
	}
	
	public Boolean flip() {
		if (faceStatus == true) {
			faceStatus = false; 
			return false;
		}
		else {
			faceStatus = true;
			return true;
		}
	}
	
	public boolean checkFaceStatus() {
		return faceStatus; 
	}
	
	public int match( FlippingForneymonCard other) {
		
		if ( (other.checkFaceStatus() ) || (faceStatus) ) {
			return 2; 
		}
		else if ( (other.checkName().equals(checkName()) ) && (other.checkType().equals(checkType()) ) ) {
			return 1;
		}
		else {
			return 0; 
		}
	}

	@Override 	
	public String toString() {
		if ( faceStatus ) {
			return "?: ?";
		}
		else {
			return super.toString();
		}
	}
	
	public static void main (String[] args) {
        FlippingForneymonCard lmuMascot = new FlippingForneymonCard("iggy", "Dampymon", true);
        // "?: ?"
        System.out.println(lmuMascot);
        lmuMascot.flip();
        // "Dampymon: iggy" 
        System.out.println(lmuMascot);
        lmuMascot.flip();
        System.out.println(lmuMascot);
        
        FlippingForneymonCard leafMan = new FlippingForneymonCard("leafboy", "Leafymon", false); 
        //"Leafymon: leafboy"
        System.out.println(leafMan);
        leafMan.flip(); 
        System.out.println(leafMan.toString());
        
        FlippingForneymonCard flames = new FlippingForneymonCard("fireeee", "Burnymon", true); 
        //"?: ?"
        System.out.println(flames.toString());
        flames.flip(); 
        //"Burnymon: fireeee"
        System.out.println(flames.toString());;
		
        FlippingForneymonCard missingNu = new FlippingForneymonCard();
        // "?: ?"
        System.out.println(missingNu);
        missingNu.flip();
        // "Burnymon: MissingNu"
        System.out.println(missingNu);
		
		
        
        // 2
        System.out.println(lmuMascot.match(missingNu));
        lmuMascot.flip();
        // 0
        System.out.println(lmuMascot.match(missingNu));
    }
	
	
	
}
