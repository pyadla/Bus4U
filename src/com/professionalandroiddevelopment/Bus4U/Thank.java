package com.professionalandroiddevelopment.Bus4U;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Thank extends Activity{
	
	Button hm,bk;
	TextView tex;
	Animation slideInLeft;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thank);
		
		hm=(Button)this.findViewById(R.id.hm);
		bk=(Button)this.findViewById(R.id.bk);
		
		tex=(TextView)this.findViewById(R.id.tex);
		tex.setText("BENEFITS OF PUBLIC TRANSPORTATION \n" +
				"\n> Ensures safety\n> Saves money\n> Eases traffic congestion\n" +
				"> Improves air quality\n> Reduces energy consumption\n> Stimulates " +
				"economic development\n> Fosters more livable communities\n\n" +
				"Thank you for using Bus4U!");
		
		ImageView imv = (ImageView)findViewById(R.id.imv);
        slideInLeft = AnimationUtils.loadAnimation(this, R.anim.alt);
         imv.startAnimation(slideInLeft);
		 hm.setOnClickListener(new OnClickListener(){        

        	   public void onClick(View v) {
        		   Intent i=new Intent(Thank.this,Bus4U.class);
     		         startActivity(i);
        	   }
           });
		 bk.setOnClickListener(new OnClickListener(){        

        	   public void onClick(View v) {
        		   Intent i=new Intent(Thank.this,Picins.class);
     		         startActivity(i);
        	   }
           });
		
	}

}
