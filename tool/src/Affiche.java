import java.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Affiche {

public static void main(String[] args){
	
	Toolkit aTK = Toolkit.getDefaultToolkit();
	Dimension dim = aTK.getScreenSize();
	int x = dim.width;
	int y = dim.height;
	System.out.println(x);
	System.out.println(y);
	
}
}
