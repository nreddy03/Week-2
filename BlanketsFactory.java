
public class BlanketsFactory {
	public Blankets manufacture(String name) {
		Blankets blankets=null;
		
		if(name.equalsIgnoreCase("Cotton")) {
			blankets=new CottonBlanket();
		}else if (name.equalsIgnoreCase("Sneakers")) {
	           blankets = new PolyesterBlanket();
	       }
	       else {
	           System.out.println(name + " blankets are not manufactured.");
	       }

		return blankets;
		
	}

}
