package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
	Button moviebutton,stockbutton,buildbutton,materialbutton,ubiquitiousbutton,capstonebutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		moviebutton= (Button) findViewById(R.id.movieapp_button);
		stockbutton=(Button)findViewById(R.id.stockhawk_button);
		buildbutton=(Button)findViewById(R.id.buildbigger_button);
		materialbutton=(Button)findViewById(R.id.materialdesign_button);
		ubiquitiousbutton=(Button)findViewById(R.id.ubiquitious_button);
		capstonebutton= (Button) findViewById(R.id.capstone_button);
		moviebutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,R.string.button_movie_app_message,Toast.LENGTH_SHORT).show();
			}
		});
		stockbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,R.string.button_stock_hawk_message,Toast.LENGTH_SHORT).show();
			}
		});
		buildbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,R.string.button_build_bigger_message,Toast.LENGTH_SHORT).show();

			}
		});
		materialbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,R.string.button_material_design_message,Toast.LENGTH_SHORT).show();
			}
		});
		ubiquitiousbutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,R.string.button_ubiquitious_message,Toast.LENGTH_SHORT).show();
			}
		});
		capstonebutton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Toast.makeText(MainActivity.this,R.string.button_capstone_message,Toast.LENGTH_SHORT).show();
			}
		});
	}
}
