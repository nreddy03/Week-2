
public class TestBlanketFactory {
	public static void main(String []args) {
		BlanketsFactory blanketsFactory=new BlanketsFactory();
		Blankets cotton = blanketsFactory.manufacture("Cotton");
	       if (cotton != null)
	           cotton.getBlankets();
	
	Blankets polyester=blanketsFactory.manufacture("Cotton");
	if(polyester!=null)
		polyester.getBlankets();
    Blankets duvet = blanketsFactory.manufacture("Duvet");
    if (duvet != null)
        duvet.getBlankets();
}


}
