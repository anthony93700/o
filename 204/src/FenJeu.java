
import java.awt.*;
import java.awt.event.*;
import com.farida.android_2048.modele.*;

import javax.swing.*;

public class FenJeu extends JFrame  {

    private static final int TOP = 0, DOWN= 2, LEFT=3, RIGHT=4;
private JTextField score;
private JTextField nbd;
private JTextField mscore;
private JTextArea jeu;
private JButton haut;
private JButton bas;
private JButton gauche;
private JButton droite;
private MoteurJeu mj;



public FenJeu(String titre, int w, int h){
        super(titre);
        this.intialise();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.centreecran(w, h);
        //this.setSize(w,h);
        this.setVisible(true);
}

public void centreecran(int w, int h){
        Toolkit aTK = Toolkit.getDefaultToolkit();
        Dimension dim = aTK.getScreenSize();
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;
        this.setBounds(x, y, w, h);
}

public void intialise(){
        Container c = this.getContentPane();
        c.add(this.getPanelNord(),BorderLayout.NORTH);
        c.add(this.getPanelOuest(),BorderLayout.WEST);
        c.add(this.getPanelEst(),BorderLayout.CENTER);
        c.add(this.getPanelSud(),BorderLayout.SOUTH);
}

public JPanel getPanelNord(){
        JPanel pNord=new JPanel(new BorderLayout());
        pNord.setLayout(new GridLayout(2,2,5,5));
        JLabel sco_cou = new JLabel("Score courant");
        JLabel nb_d = new JLabel("Nombre de déplacements");
        pNord.add(sco_cou);
        pNord.add(nb_d);
        score = new JTextField("");
        score.setEditable(false);
       
        score.setVisible(true);
        nbd = new JTextField("");
        nbd.setEditable(false);
        nbd.setVisible(true);
        pNord.add(score);
        pNord.add(nbd);
        return pNord;
}

public JPanel getPanelOuest(){
        JPanel pOuest=new JPanel(new BorderLayout());
        pOuest.setLayout(new GridLayout(3,4,5,5));
        //JLabel deplacement = new JLabel("Déplacements");
        //JLabel deplacementbis = new JLabel("----------");
        //pOuest.add(deplacement);
        //pOuest.add(deplacementbis);
        JButton[] tab = new JButton[5];
        for(int i=0 ; i<5; i++){
                tab[i]=new JButton();
                tab[i].setVisible(false);
        }
        haut = new JButton("Haut");
        haut.setVisible(true);
        bas = new JButton("Bas");
        bas.setVisible(true);
        gauche = new JButton("Gauche");
        gauche.setVisible(true);
        droite = new JButton("Droite");
        droite.setVisible(true);
        haut.addActionListener(new BoutonList(TOP));
        bas.addActionListener(new BoutonList(DOWN));
        gauche.addActionListener(new BoutonList(LEFT));
        droite.addActionListener(new BoutonList(RIGHT));
        pOuest.add(tab[0]);
        pOuest.add(haut);
        pOuest.add(tab[1]);
        pOuest.add(gauche);
        pOuest.add(tab[2]);
        pOuest.add(droite);
        pOuest.add(tab[3]);
        pOuest.add(bas);
        pOuest.add(tab[4]);
        return pOuest;
}

public JPanel getPanelEst(){
        NPanel p = new NPanel("jeu_2048_fond_ecran.png",mj);
        return p;

}

public JPanel getPanelSud(){
        JPanel pSud = new JPanel(new BorderLayout());
        pSud.setLayout(new GridLayout(2,1,5,5));
        mscore=new JTextField(" ");
        mscore.setEditable(false);
        mscore.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        JLabel hscore = new JLabel("Meilleur score");
        pSud.add(hscore, BorderLayout.CENTER);
        pSud.add(mscore,BorderLayout.CENTER);
        return pSud;

}

public static void main(String [] args){

        FenJeu f = new FenJeu("Jeu 2048 de Farida",720,720);
}
class BoutonList implements ActionListener{
    private int val;
    public BoutonList(int i){
        val = i;
    }
    public void actionPerformed(ActionEvent e){
        switch(val){
        case TOP : mj.deplacer(MoteurJeu.HAUT);break;
        case DOWN : mj.deplacer(MoteurJeu.BAS);break;
        case LEFT : mj.deplacer(MoteurJeu.GAUCHE);break;
        case RIGHT : mj.deplacer(MoteurJeu.DROITE);break;
        }
        jeu.setText(mj.getGrilleTuiles ().toString());
       
    }
}
}
