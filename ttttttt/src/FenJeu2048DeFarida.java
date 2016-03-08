import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import com.farida.android_2048.modele.*;

public class FenJeu2048DeFarida extends JFrame {

	private MoteurJeu mj ; 
	private JTextArea tuile;
	private JTextArea score;
	private JTextArea nbcoup;
	private JButton[][] grilleJbutton = null;
	private ColorsInterface col;
	JPanel visu;
	JPanel img;

	public FenJeu2048DeFarida ( String titre, int u, int v, int w, int h  ){
		super(titre);
		mj = MoteurJeu.getInstance();
		mj.setup();

		this.initialisation();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(u, v, w, h);
		this.setVisible(true);

	}

	public void initialisation(){
		this.add(this.creePanelcentre(),BorderLayout.CENTER);
		this.add(this.creePanelgauche(),BorderLayout.WEST);
		this.add(this.creePaneldroit(),BorderLayout.EAST);
		this.add(this.creePanelhaut(),BorderLayout.NORTH);
		this.add(this.creePanelbas(),BorderLayout.SOUTH);
	
	}

	public JPanel creePanelhaut( ){

		JPanel phaut = new JPanel(new GridLayout(1,2));
		JPanel pscore = new JPanel(new GridLayout(2,1));
		JPanel pnbcop = new JPanel(new GridLayout(2,1));
		score  = new JTextArea();
		nbcoup  = new JTextArea();
		JLabel etiqscore = new JLabel("Score");
		JLabel etiqnbcoup = new JLabel("Nombre de déplacement");
		score.setEditable(false);
		nbcoup.setEditable(false);
		pscore.add(etiqscore);
		pnbcop.add(etiqnbcoup);
		pscore.add(score);
		phaut.setBorder(BorderFactory.createLineBorder(Color.black));
		pnbcop.add(nbcoup);
		phaut.add(pnbcop);
		phaut.add(pscore);

		return phaut;

	}
	public JPanel creePanelgauche(){

		JPanel pgauche = new JPanel(new GridLayout(3, 3,4,4));
		JButton haut = new JButton( "haut" );
		JButton gauche = new JButton( "gauche" );
		JButton bas = new JButton( "bas" );
		JButton droite = new JButton( "droite" );
		JButton nulla = new JButton( "" );
		nulla.setVisible(false);
		JButton nullb = new JButton( "" );
		nullb.setVisible(false);
		JButton nullc = new JButton( "" );
		nullc.setVisible(false);
		JButton nulld = new JButton( "" );
		nulld.setVisible(false);
		JButton nulle = new JButton( "" );
		nulle.setVisible(false);



		pgauche.add(nulla);
		pgauche.add(haut);
		pgauche.add(nullb);
		pgauche.add(gauche);
		pgauche.add(nullc);
		pgauche.add(droite);
		pgauche.add(nulld);
		pgauche.add(bas);
		pgauche.add(nulle);
		pgauche.setBorder(BorderFactory.createLineBorder(Color.black));

		BoutonListener list_h = new BoutonListener();
		haut.addActionListener(list_h);
		BoutonListener list_b = new BoutonListener();
		bas.addActionListener(list_b);
		BoutonListener list_d = new BoutonListener();
		droite.addActionListener(list_d);
		BoutonListener list_g = new BoutonListener();
		gauche.addActionListener(list_g);

		return pgauche;

	}
	public JPanel creePaneldroit( ){

		JPanel pdroit = new JPanel(new GridLayout(2,1));
		JTextField records  = new JTextField();
		JLabel etiqbest = new JLabel("Meilleur Score");
		records.setEditable(false);

		pdroit.add(etiqbest);
		pdroit.setBorder(BorderFactory.createLineBorder(Color.black));
		pdroit.add(records);

		return pdroit;

	}	

	class Graphique extends JPanel {

		private  Image im;
		private Graphique img;
		
		public Graphique(){
			im = Toolkit.getDefaultToolkit().getImage("jeu_2048_fond_ecran.png");
			this.setBackground(Color.white);
		}

		public void paintComponent(Graphics g)
		{
			int bord = 15;
			int taille = 4;
			Tuile t;
			super.paintComponent(g);
			g.drawImage(im, 0, 0, this.getWidth(),this.getHeight(), this);
			g.setFont(new Font("Serif",Font.BOLD,20));
			for (int i=0;i<taille;i++){
				for (int j=0;j<taille;j++){
					t = mj.getGrilleTuiles().getTuiles()[i][j];
					if(t != null){
						g.setColor(mj.getGrilleTuiles().getCouleurTuile(mj.getGrilleTuiles().getUneTuile(i, j)));		
					g.fillRect((this.getWidth()/taille*j)+bord, (this.getHeight()/taille*i)+bord,(this.getWidth()/taille)-bord*2, (this.getHeight()/taille)-bord*2);
					g.setColor(Color.black);
					g.drawString(""+t.getValue(),this.getWidth()/taille*j+bord+this.getWidth()/(taille*2)-bord, (this.getHeight()/taille*i)+bord+this.getHeight()/(taille*2)-bord);

				}
			}
			}
		}
	}
	
	public JTabbedPane creePanelcentre( ){

		JTabbedPane pcentre = new JTabbedPane();

		JPanel panTxt = new JPanel();
		tuile  = new JTextArea(""+mj.getGrilleTuiles());
		tuile.setFont(new Font("Serif",Font.BOLD,24));
		tuile.setEditable(false);
		panTxt.add(tuile);
		pcentre.add("Text",panTxt);

		Graphique t=new Graphique();
		visu = new JPanel(new GridLayout(4,4));
		img = new Graphique();

		this.grilleJbutton = new JButton[this.mj.getTaille()][this.mj.getTaille()];
		for (int i = 0 ; i < this.mj.getTaille() ; i++){
			for (int j = 0 ; j < this.mj.getTaille() ; j++){
				if (mj.getGrilleTuiles().getUneTuile(i, j) ==null ){
					this.grilleJbutton[i][j]= new JButton("");
					this.grilleJbutton[i][j].setBackground(Color.white);
				}
				else {
					this.grilleJbutton[i][j]= new JButton(""+mj.getGrilleTuiles().getUneTuile(i, j).getValue());
				}	
				this.grilleJbutton[i][j].setEnabled(false);
				visu.add(this.grilleJbutton[i][j]);
				this.grilleJbutton[i][j].setFont((new Font("Serif",Font.BOLD,24)));
			}
		}
		pcentre.add("Graphique",visu);
		pcentre.add("Panel Graphique",img);
		return pcentre;

	}

	public void Refresh(){
		for (int i = 0 ; i < this.mj.getTaille() ; i++){
			for (int j = 0 ; j < this.mj.getTaille() ; j++){
				if (mj.getGrilleTuiles().getUneTuile(i, j) ==null ){
					grilleJbutton[i][j].setText("");
					grilleJbutton[i][j].setBackground(Color.white);
				}
				else {
					grilleJbutton[i][j].setText(""+mj.getGrilleTuiles().getUneTuile(i, j).getValue());
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==2)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_2);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==4)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_4);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==8)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_8);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==16)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_16);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==32)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_32);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==64)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_64);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==128)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_128);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==256)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_256);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==512)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_512);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==1024)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_1024);
					if (mj.getGrilleTuiles().getUneTuile(i, j).getValue() ==2048)grilleJbutton[i][j].setBackground(col.TUILE_COLOR_2048);

				}
				this.grilleJbutton[i][j].setEnabled(false);
				visu.add(this.grilleJbutton[i][j]);
				this.grilleJbutton[i][j].setFont((new Font("Serif",Font.BOLD,24)));
			}
		}
	}
	
	public JPanel creePanelbas( ){

		JPanel pbas = new JPanel(new GridLayout());

		JButton reset = new JButton( "Reset" );
		pbas.add(reset);

		BoutonListener list = new BoutonListener();
		reset.addActionListener(list);



		return pbas;
	}

	class BoutonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String s = e.getActionCommand();

			if (s.equals("Reset")) {mj.recommencerPartie();
			Refresh();
			}
			if (s.equals("haut")){ mj.deplacer(mj.HAUT);
			tuile.setText(""+mj.getGrilleTuiles());
			Refresh();
			img.repaint();
			}
			if (s.equals("bas")){ mj.deplacer(mj.BAS);
			tuile.setText(""+mj.getGrilleTuiles());
			Refresh();
			img.repaint();
			}
			if (s.equals("droite")){ mj.deplacer(mj.DROITE);
			tuile.setText(""+mj.getGrilleTuiles());
			Refresh();
			img.repaint();
			}
			if (s.equals("gauche")){ mj.deplacer(mj.GAUCHE);
			tuile.setText(""+mj.getGrilleTuiles());
			Refresh();
			img.repaint();
			}
			score.setText(""+mj.getScore());
			nbcoup.setText(""+mj.getNombreDeplacements());
			tuile.setText(""+mj.getGrilleTuiles());
		}
	}

	public static void main(String[] args) {

		FenJeu2048DeFarida fen=new FenJeu2048DeFarida("2048 de Farida",50,50,1000,800);
	}
}