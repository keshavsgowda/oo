public class BridgeClientMain {

	public static void main(String[] args) {
		
    double mrptotal = 8000.50; 
		
        RegCust oRC = new RegCust("Sindhu", 24); 
        DiscountType2 odtype2 = new DiscountType2(); 
        oRC.display(); 		
		oRC.setDiscountType(odtype2);
		oRC.calculateDiscount(mrptotal);	
		
		SeniorCitizenCust oSCC = new SeniorCitizenCust("Vijay Amrithraj",62); 
		DiscountType1 odtype1 = new DiscountType1(); 
		oSCC.display(); 
		oSCC.setDiscountType(odtype1);
		oSCC.calculateDiscount(mrptotal);
		
		
		
		
		 
	}

}