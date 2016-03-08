import java.net.*;
import java.io.*;
    
public class ClientServeurUDP
{ // Variables d'instance :
   private DatagramSocket  socket;
   private InetAddress  adresseIPCorrespondant;
   private int    port;
 
 // Constructeur pour le client :
   public ClientServeurUDP(String adresseDest,int portDest) throws IOException
   {... }
 
 // Constructeur pour le serveur :
   public ClientServeurUDP(int portEcoute) throws IOException
   {... }
 
 // Méthodes :
   public void envoyerMessage(String mesg)  throws IOException
   {...}
   public String recevoirMessage()   throws IOException
   {...}
   public String getAdresseIPCorrespondant()
   {...}
} 
