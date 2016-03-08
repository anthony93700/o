import java.io.*;
import java.net.*;
public class TestClient {
    public static void main(String[] args) { 
	    //verifie les arguments de la ligne de commande pour l'adresse hote
        if (args.length !=3) {
            System.out.println("usage : java TestClient <adresse> <port_dest> <mesg>");
            System.exit(0);
        }
        try {
            ClientServeurUDP client = new ClientServeurUDP(args[0],Integer.parseInt(args[1]));
	    client.delaiMax(1000); // attente 1s
            client.envoyerMessage(args[2]);
            System.out.println(client.recevoirMessage());
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
