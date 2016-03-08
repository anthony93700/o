/**
 * Activité permettant d'afficher les informations
 * <BR/> collectée par l'activité principale.
 * <BR/> Elle permet aussi de modifier certaines informations
 * @author B. KHAFIF
 * @version 1.0
 * Matériel uniquement destiné pour ce travail pratique
 * Reproduction interdite
 */
package com.farida.android_tp3_intent;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class AffichageInfos extends Activity {
	private String name;
	private String phone_number;
	private String mdp;
	private int day;
	private int month;
	private int year;


	private EditText et_name;
	private EditText et_phone_number;
	private EditText et_mdp;
	private EditText et_day;
	private EditText et_month;
	private EditText et_year;

	private EditText et_email;

	private Button bt_ok;




	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	 
		setContentView(R.layout.affichage_infos);

		this.deserialiserRessources();

		this.recupererExtrasInfos();



		this.initConnections();
		this.metAJourVue();


	}

	/**
	 * Méthode utilitaire (prévue par le développeur) qui permet
	 * de récupérer les informations provenant de l'Intent
	 * qui a lancé cette activité
	 * @param b (Bundle)
	 */
	private void recupererExtrasInfos(){
		Intent intent = this.getIntent();

		if (intent != null) {
			this.name = intent.getStringExtra(MainActivity.NAME).toString();
			this.phone_number = intent.getStringExtra(MainActivity.PHONE_NUMBER).toString();
			this.mdp = intent.getStringExtra(MainActivity.MDP).toString();
			this.day = intent.getIntExtra(MainActivity.DAY,1);
			this.month = intent.getIntExtra(MainActivity.MONTH,1);
			this.year = intent.getIntExtra(MainActivity.YEAR,1970);

		}


	}

	private void deserialiserRessources(){
		this.et_name = (EditText) this.findViewById(R.id.et_info_name);
		this.et_phone_number = (EditText) this.findViewById(R.id.et_info_phone_number);
		this.et_mdp = (EditText) this.findViewById(R.id.et_info_mdp);
		this.et_day = (EditText) this.findViewById(R.id.et_info_day);
		this.et_month = (EditText) this.findViewById(R.id.et_info_month);
		this.et_year = (EditText) this.findViewById(R.id.et_info_year);
		this.et_email = (EditText) this.findViewById(R.id.edit_text_email);


		this.bt_ok = (Button) this.findViewById(R.id.button_ok);
	}


	private void initConnections(){
		this.bt_ok.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

			


			}
		});
	}

	/**
	 * Rafraichie la vue
	 */
	private void metAJourVue(){
		this.et_day.setText(this.day);
		this.et_month.setText(this.month);
		this.et_year.setText(this.year);
		this.et_mdp.setText(this.mdp);
		;
	}


	




}
