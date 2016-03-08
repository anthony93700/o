package fr.coursiut.coursandroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
public class MainActivity extends Activity {
	private TextView text1;
	private TextView text2;
	private EditText t;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button bouton = (Button) this.findViewById(R.id.button1);
		text1 = (TextView) this.findViewById(R.id.textView3);
		text2 = (TextView) this.findViewById(R.id.textView4);
		t =(EditText) this.findViewById(R.id.editText1);
		bouton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String a = t.getText().toString();
				String []b = a.split(" ");
				text1.setText(b[0]);
				text2.setText(b[1]);
			}
		});
			
	
		
	}	
}
