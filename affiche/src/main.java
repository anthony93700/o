import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class main {
public static void main(String[] zero) throws IOException {
InetAddress LocaleAdresse ;
InetAddress ServeurAdresse;
Scanner in = new Scanner(System.in);
String g = in.nextLine();
try {
	LocaleAdresse = InetAddress.getByName(g);
	/*LocaleAdresse = InetAddress.getByAddress(g,new byte[]{110,110,110,110});*/
	System.out.println(LocaleAdresse );
} catch (UnknownHostException e) {
e.printStackTrace();
}
}
} 