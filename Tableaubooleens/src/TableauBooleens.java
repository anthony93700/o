public class TableauBooleens {
    boolean[] tab;

    public TableauBooleens (boolean[] t) {
    this.tab = t;
    }
    public TableauBooleens (TableauBooleens tb) {
    tab = new boolean [tb.taille()];
    for(int i = 0;i<tab.length;i++)
    {
    	tab[i]= tb.get(i);
    }
    	
    	}
    
    public boolean get(int i) {
    	return this.tab[i];
    		
    }
    public void set(int i, boolean val) {
    	this.tab[i] = val;
    	
    }
    public int taille() {
    	return this.tab.length;
    	
    }
    
    public TableauBooleens et(TableauBooleens tb) {
    	boolean ty[]= new boolean [tb.taille()];
    	for(int i = 0; i<ty.length ; i++)
    	{
    		ty[i] = tb.get(i) && tab[i];  
    	}
    	return tb;
    }
    public boolean et() {
    boolean b = false;
    for(int i = 0; i<tab.length ; i++)
	{
		b = b && tab[i] ;  
	}
    return b;
    
    }
    
    public String toString() {
    	for(int i=0;i<this.tab.length;i++)
    	{
    		System.out.println("|"+ this.tab[i]);
    	}
  System.out.println("|");
  return "";
    }
    

    public static void main(String[] args) {
        boolean[] t1 = {false, false, false, false};
        TableauBooleens a=new TableauBooleens(t1);
        System.out.println("a avant : " + a);
        t1[0]=true;
        System.out.println("a après : " + a);   
        TableauBooleens b=new TableauBooleens(a);
        t1[1]=true;
        b.set(2, true);
        
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        
    }
}