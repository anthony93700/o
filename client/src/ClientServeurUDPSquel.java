import java.net.*;
import java.io.*;
    
public class ClientServeurUDPSquel
{ // Variables d'instance :
   private DatagramSocket  socket;
   private InetAddress  adresseIPCorrespondant;
   private int    port;
 
 // Constructeur pour le client :
   public ClientServeurUDPSquel(String adresseDest,int portDest) throws IOException
   {
	   this.adresseIPCorrespondant = InetAddress.getByName(adresseDest);
	   this.port = portDest;
	   this.socket = new DatagramSocket();
	   
   }
 
 // Constructeur pour le serveur :
   public ClientServeurUDPSquel(int portEcoute) throws IOException
   {
	   this.socket = new DatagramSocket(portEcoute);
	   this.port = portEcoute;
	  
   }
 public void delaimax(int n) throws SocketException{
	 this.socket.setSoTimeout(n);
 }
 // Méthodes :
   public void envoyerMessage(String mesg)  throws IOException
   {
	   byte[] b = mesg.getBytes();
	  DatagramPacket p = new DatagramPacket(b,b.length,this.adresseIPCorrespondant,this.port);
	   this.socket.send(p);
   }
   public String recevoirMessage()   throws IOException
   {
	   byte[] b = new byte[1024];
	   
	   DatagramPacket p = new DatagramPacket(b,b.length);
	   this.socket.receive(p);
	   this.port=p.getPort();
	   this.adresseIPCorrespondant = p.getAddress();
	   return (new String(p.getData()));
	   
   }
   public String getAdresseIPCorrespondant()
   {
	   return this.adresseIPCorrespondant.toString();
   }
   public int getPort()
   {
	   return this.port;
   }
} 
