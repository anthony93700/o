package com.farida.m4104_2015_2016_tp2_calculatrice;

import com.example.m4104_2015_2016_tp2_calculatrice.R;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {



	private TextView afficheur;
	private boolean affAEffacer;

	
	/**
	 * Met en place les écouteurs
	 */
	public void initConnection(){

		Button button = null;

		button = (Button) this.findViewById(R.id.bt_abs);
		button.setTag(button.getText().toString());
		button.setOnClickListener(new EcouteurBouton());



	}


	/**
	 * Permet de détécter l'orientation de l'écran du terminal
	 * @return (int) : Configuration.ORIENTATION_PORTRAIT si position portrait
	 * 				   Configuration.ORIENTATION_LANDSCAPE si payasage
	 */
	public int getScreenOrientation()
	{
		Display getOrient = getWindowManager().getDefaultDisplay();
		int orientation = Configuration.ORIENTATION_UNDEFINED;
		if(getOrient.getWidth()==getOrient.getHeight()){
			orientation = Configuration.ORIENTATION_SQUARE;
		} else{ 
			if(getOrient.getWidth() < getOrient.getHeight()){
				orientation = Configuration.ORIENTATION_PORTRAIT;
			}else { 
				orientation = Configuration.ORIENTATION_LANDSCAPE;
			}
		}
		return orientation;
	}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		this.afficheur = (TextView) this.findViewById(R.id.textView1);
		this.affAEffacer = false;

		initConnection();

		/**
		 * Exemple d'utilisation du parseur
		 */



	}


	class EcouteurBouton implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			String saisie = v.getTag().toString();


		}
	}

}
