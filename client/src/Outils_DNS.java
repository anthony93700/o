public final class Outils_DNS 
  { 
    public static void afficherHexa(byte tab[])
     {   for (int i=0;i<tab.length;i++)
              System.out.print(Integer.toHexString(tab[i] & 0xff)+" ");
      System.out.println("");
     } 
  
    public static void decodeASCII(byte[] receiveBuf, int debut, int fin)
       { for (int j=debut; j<fin;j++)
	        {if (j%4==0) 
	           System.out.print(" ");
	         if (receiveBuf[j]>=32 && receiveBuf[j]<127) 
	             System.out.printf("%c", receiveBuf[j]);
	         else
               System.out.print(".");
	        }
	      System.out.println();
       }
	
    public static void afficherTrame(byte[] receiveBuf)
	{ for (int i=0;i<receiveBuf.length;i++)
		 { if ((i>0) && (i%16 ==0)) 
		     { // fin de ligne, on déclenche l'affichage en ASCII
			System.out.print(" ");
			Outils_DNS.decodeASCII(receiveBuf, i-16, i);
		      }
		   else
                      if ((i>0) && (i%4 ==0))
			   System.out.print(" ");
		   System.out.printf("%02X", receiveBuf[i]);
	         }
	    if (receiveBuf.length %16 !=0) { // le décodage en ASCII de la dernière ligne reste à faire
		    int i=receiveBuf.length;
		    // complete la ligne d'hexa avec des espaces
		    for (int j=i%16 ; j<16;j++) 
		    {
			    if (j%4==0)
				    System.out.print(" ");
			    System.out.print("  ");
		    }
		    System.out.print(" "); // separateur avec le code ASCII
	            Outils_DNS.decodeASCII(receiveBuf, i-(i%16), receiveBuf.length);
	    } else
		    System.out.println();
  }
}// end class
