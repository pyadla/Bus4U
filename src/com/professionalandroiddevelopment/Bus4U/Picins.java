package com.professionalandroiddevelopment.Bus4U;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Picins extends Activity{

	ImageView acbus,metro,genrl,bstop,que,hng,gdwn;
	Button bck,nxt,hme;
	TextView txt;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inspage);
	
		acbus=(ImageView)this.findViewById(R.id.acbus);
		metro=(ImageView)this.findViewById(R.id.metro);
		genrl=(ImageView)this.findViewById(R.id.genrl);
		bstop=(ImageView)this.findViewById(R.id.bstop);
		que=(ImageView)this.findViewById(R.id.que);
		hng=(ImageView)this.findViewById(R.id.hng);
		gdwn=(ImageView)this.findViewById(R.id.gdwn);
		
		bck=(Button)this.findViewById(R.id.bck);
		hme=(Button)this.findViewById(R.id.hme);
		nxt=(Button)this.findViewById(R.id.nxt);
		
		txt=(TextView)this.findViewById(R.id.txt);
		
		try{
			acbus.setOnClickListener(new OnClickListener(){        

	    		public void onClick(View v) {
	    			 txt.setText("A/C BUS \n As mercury levels are shooting up in the city, " +
	    			 		"APSRTC-HYD's A/C buses appear to be a perfect alternative for many who are " +
	    			 		"looking up for stress free and comfortable rides. \n Frequency- every 1hr" +
	    			 		"\nMaximum fare - Rs.51.00");
	    		}
	    	});
			metro.setOnClickListener(new OnClickListener(){        

	    		public void onClick(View v) {
	    			txt.setText("METRO BUS \n Metro is a semi-luxury service and few stops between any" +
	    		    "two points in the city. This enables you to commute between any two places, whereas " +
	    		    "an ordinary service will stop on every bus stop. \n Frequency- every 1/2hr" +
	    		    "\nMaximum fare - Rs.22.00"); 
	   		      
	    		}
	    	});
			genrl.setOnClickListener(new OnClickListener(){        

	    		public void onClick(View v) {
	    			 txt.setText("ORDINARY BUS \n The ordinary bus operates as a point to point service which connects" +
	    			 		"all places within the Hyderabad city with a very good frequency and minimum travel fare" +
	    			 		"\n Frequency- every 10minutes \nMaximum fare - Rs.19.00 ");
	    		}
	    	});
			bstop.setOnClickListener(new OnClickListener(){        
	
	    		public void onClick(View v) {
                     txt.setText("If you want to board the bus stand up. Wait until the bus comes to a complete stop" +
                     		"before boarding. If you are still unsure that you are boarding the correct bus verify it with " +
                     		"your Bus4U app.");	    			 
	    		}
	    	});
			que.setOnClickListener(new OnClickListener(){        
	
	    		public void onClick(View v) {
	    			 txt.setText("Always stand in a queue to board the bus. Mostly entry and exit for ladies is " +
	    			 		"from front door and for gents, rear door.");
	    		}
	    	});
			hng.setOnClickListener(new OnClickListener(){        

	    		public void onClick(View v) {
	    			 txt.setText("Avoid foot-boarding. Instead wait for the next bus. It is better to be " +
	    			 		"late than never. Otherwise check for " +
	    			 		"an alternate route to your destination in Bus4U.");
	    		}
	    	});
			gdwn.setOnClickListener(new OnClickListener(){        
	
	    		public void onClick(View v) {
	    			 txt.setText("Never board a running bus. Never get down until the bus halts.");
	    		}
	    	});
		}
		catch(Exception e){
			Log.e("Error", "Error", e);
		}
		bck.setOnClickListener(new OnClickListener(){        

    		public void onClick(View v) {
    			 Intent i=new Intent(Picins.this,Altbus.class);
   		      startActivity(i);
    		}
    	});
		hme.setOnClickListener(new OnClickListener(){        

    		public void onClick(View v) {
    			 Intent i=new Intent(Picins.this,Bus4U.class);
   		      startActivity(i);
    		}
    	});
		nxt.setOnClickListener(new OnClickListener(){        

    		public void onClick(View v) {
    			 Intent i=new Intent(Picins.this,Thank.class);
   		      startActivity(i);
    		}
    	});
	}
}
