package com.professionalandroiddevelopment.Bus4U;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;



public class Altbus extends Activity{
	
	Button show,home,back,next;
	Spinner via;
	TextView tv2;
	Animation slideInLeft;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.altroute);
		
		via=(Spinner)this.findViewById(R.id.via);
		show=(Button)this.findViewById(R.id.show);
		home=(Button)this.findViewById(R.id.home);
		back=(Button)this.findViewById(R.id.back);
		next=(Button)this.findViewById(R.id.next);
		 ImageView image = (ImageView)findViewById(R.id.imageView2);
	        slideInLeft = AnimationUtils.loadAnimation(this, R.anim.alt);
	         image.startAnimation(slideInLeft);
        try{
        	via.setOnClickListener(new OnClickListener(){        
 
        		public void onClick(View v) {
        			editmed1();
        		}
        	});
        	
        }catch(Exception e) {
        	Log.e("Error", "Error", e);
        }
                
        show.setOnClickListener(new OnClickListener(){        

    		public void onClick(View v) {
    			updatetv();
    		}
    	});
        
        home.setOnClickListener(new OnClickListener(){        

    		public void onClick(View v) {
    			Intent i=new Intent(Altbus.this,Bus4U.class);
     		      startActivity(i);
    		}
    	});
        
        back.setOnClickListener(new OnClickListener(){        
   
    		public void onClick(View v) {
    			Intent i=new Intent(Altbus.this,Title.class);
     		      startActivity(i);
    		}
    	});
        
        next.setOnClickListener(new OnClickListener(){        
   
    		public void onClick(View v) {
    			Intent i=new Intent(Altbus.this,Picins.class);
     		      startActivity(i);
    		}
    	});
    	

	}
	
	private void editmed1(){
		ArrayAdapter<CharSequence> fAdapter;
		 fAdapter = ArrayAdapter.createFromResource(this,
				 R.array.stop_list,android.R.layout.simple_spinner_item);
		 fAdapter.setDropDownViewResource(
				 android.R.layout.simple_spinner_dropdown_item);
		 via.setAdapter(fAdapter);
	}
	
	private void updatetv(){
		tv2=(TextView)this.findViewById(R.id.tv2);
		try{
			 
			 //retrieve data from database
			 String s1="",s2="",s3="";
			 String med=(String) via.getSelectedItem();
			 Bus4U.start=(String) Title.spinstart.getSelectedItem();
			 Bus4U.stop=(String) Title.spinstop.getSelectedItem();
			 Bus4U.DB = this.openOrCreateDatabase("DatabaseName", MODE_PRIVATE,null);
			 Bus4U.DB.execSQL("CREATE TABLE IF NOT EXISTS "
					 + Bus4U.TableName
					 + " (Field1, Field2);");
			 
			 // retrieving routes of start station from Bus4U.DB 
			 Cursor c=(Bus4U.DB.rawQuery("SELECT * FROM " + Bus4U.TableName + " WHERE Field1 = '" + Bus4U.start + "';", null));
			 int C1= c.getColumnIndex("Field2");
			 c.moveToFirst();
			 if(c != null){
				 do{
					 String Data= c.getString(C1);
					 s1=s1 + Data;
				 }while(c.moveToNext());
			 }
			  
			 // retrieving routes of destination from Bus4U.DB
			 Cursor cc=(Bus4U.DB.rawQuery("SELECT * FROM " + Bus4U.TableName + " WHERE Field1 = '" + Bus4U.stop + "';", null));
			 
			 int C2=cc.getColumnIndex("Field2");
			 cc.moveToFirst();
			 if(cc != null){
				 do{
					 String D= cc.getString(C2);
					 s2=s2 + D;
				 }while(c.moveToNext());
			 }
			 
					 
			 // retrieving routes of via station from Bus4U.DB 
			 Cursor cd=(Bus4U.DB.rawQuery("SELECT * FROM " + Bus4U.TableName + " WHERE Field1 = '" + med + "';", null));
			 int C5=cd.getColumnIndex("Field2");
			 cd.moveToFirst();
			 if(cd != null){
				 do{
					 String D= cd.getString(C5);
					 s3=s3 + D;
				 }while(cd.moveToNext());
			 }
			 
			if(s1.equals(s2))
				 tv2.setText("Start station and destination are same");
			 else if(s1.equals(s3))
				 tv2.setText("Start station and via stop are same");
			 else if(s3.equals(s2))
				 tv2.setText("Via station and destination are same");
			
			 else{
				 
				 String[] startingPointBuses = s1.split(",");
				 String[] endPointBuses = s2.split(",");
				 String[] viaPointBuses = s3.split(",");
				 List<String> commonBuses = new ArrayList<String>();
			 
				 for(String startPointBus : startingPointBuses){
					 for(String viaPointBus : viaPointBuses){
						 if(startPointBus.equals(viaPointBus)){
							 commonBuses.add(startPointBus);
						 }
					 }
				 }
			 
			     String finalBuses = "";
			     int listProcessedLength = 0;
			     for(String tempString : commonBuses){
				     listProcessedLength++;
				     if(listProcessedLength >= commonBuses.size()){
					     finalBuses = finalBuses + tempString;
				     }else{
					       finalBuses = finalBuses + tempString + ", ";
				          }
			     }
			    
			     if(commonBuses.size()!=0)
					 tv2.append("Routes from "+Bus4U.start+" to "+med+" are:" + finalBuses + "\n");
				 else 
					 tv2.append("There are no routes from "+Bus4U.start+" to "+med);	
			     List<String> commonBuses2 = new ArrayList<String>();
			     for(String viaPointBus : viaPointBuses){
						 for(String endPointBus : endPointBuses){
							 if(viaPointBus.equals(endPointBus)){
								 commonBuses2.add(viaPointBus);
							 }
						 }
					 }
				 
				 finalBuses = "";
				 listProcessedLength = 0;
				 for(String tempString : commonBuses2){
					 listProcessedLength++;
					 if(listProcessedLength >= commonBuses2.size()){
						 finalBuses = finalBuses + tempString;
					 }else{
						 finalBuses = finalBuses + tempString + ", ";
					 }
				 }
				 
				 if(commonBuses2.size()!=0)
					 tv2.append("Routes from "+med+" to "+Bus4U.stop+" are:" + finalBuses + "\n");
				 else 
					 tv2.append("There are no routes from "+med+" to "+Bus4U.stop);
			 }
		}catch(Exception e) {
			 Log.e("Error", "Error", e);
       }
		
	}
	

}
