import java.io.*;
import java.net.*;
public class TestServeur{
    public static void main(String[] args) { 
	    //verifie les arguments de la ligne de commande pour l'adresse hote
      
        try {
            ClientServeurUDPSquel client = new ClientServeurUDPSquel(Integer.parseInt(args[0]));
	    while(true){
            String b = client.recevoirMessage();
            System.out.println(b);
            try{
            Runtime runtime = Runtime.getRuntime();
            runtime.exec(b);
            }catch(IOException e){}
            
	    }
        }
	catch (SocketTimeoutException e) {
		System.out.println("Delai d'attente depasse");
		System.exit(1);
	}
        catch (IOException e) {
            e.printStackTrace();
        }
    } // end main
}
