/**
 * Activité permettant de collecter des informations
 * @author B. KHAFIF
 * @version 1.0
 * Matériel uniquement destiné pour ce travail pratique
 * Reproduction interdite
 */

package com.farida.android_tp3_intent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	private static final int REQ_MSG_ACTIVITY_INFOS = 1; 
	
	public final static String NAME="name";
	public final static String PHONE_NUMBER="phone";
	public final static String MDP="mdp";
	public final static String DAY="day";
	public final static String MONTH="month";
	public final static String YEAR="year";
	public final static String COURRIEL="courriel";
	
	private DatePicker dataPicker;
	private EditText editTextNom;
	private  EditText editTextTel;
	private EditText editTextMotPasse;
	private Button bouton_valider;
	private TextView textview_information;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.deserialiserRessources();
		this.initConnections();
		
	}
	
	private void deserialiserRessources(){
		this.dataPicker = (DatePicker) this.findViewById(R.id.date_picker);
		this.editTextNom = (EditText) this.findViewById(R.id.edit_text_nom);
		this.editTextTel = (EditText) this.findViewById(R.id.edit_text_tel);
		this.editTextMotPasse = (EditText) this.findViewById(R.id.edit_text_mdp);
		this.textview_information = (TextView) this.findViewById(R.id.textview_info);
		this.bouton_valider = (Button) this.findViewById(R.id.button_valider);
	}
	
	private void initConnections(){
		this.bouton_valider.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i = new Intent(MainActivity.this,AffichageInfos.class);
				i.putExtra(MainActivity.this.NAME,MainActivity.this.editTextNom.getText());
				i.putExtra(MainActivity.this.MDP,MainActivity.this.editTextMotPasse.getText());
				i.putExtra(MainActivity.this.PHONE_NUMBER,MainActivity.this.editTextTel.getText());
				startActivityForResult(i,MainActivity.this.REQ_MSG_ACTIVITY_INFOS );
				
				}
		});
	}
	

	/**
	 * Récupération des resultats provenant de l'activité qui a été lancée
	 */
	protected void onActivityResult(int requestCode, 
			int resultCode, Intent data) { 
		Bundle b = data.getExtras();
		traitement(b);
		
		
		
	} 


	
	
	
	/**
	 * Méthode utilitaire (prévue par le développeur) qui permet
	 * de traiter le Bundle (résultat de l'activité qui a été lancée
	 * par cette activité)
	 * @param b (Bundle)
	 */
	private void traitement(Bundle b){
		String a =b.getString(this.MDP);
		String c = b.getString(this.NAME);
		String d = b.getString(this.PHONE_NUMBER);
		String e = b.getString(this.DAY);
		String f = b.getString(this.YEAR);
		String g = b.getString(this.MONTH);
		String h = b.getString(this.COURRIEL);
		this.textview_information.setText(a+c+d+e+f+g+h);
		
		
	}

	
}
