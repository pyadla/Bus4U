package com.professionalandroiddevelopment.Bus4U;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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



public class Title extends Activity {
    /** Called when the activity is first created. */
	
	public static Spinner spinstart,spinstop;
	private Button button1,alter,bhome,gallery;	
	Animation slideInLeft;
	
	@Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
           
        spinstart=(Spinner)this.findViewById(R.id.spinstart);
        spinstop=(Spinner)this.findViewById(R.id.spinstop);
        button1=(Button)this.findViewById(R.id.button1);
        alter=(Button)this.findViewById(R.id.alter);
        bhome=(Button)this.findViewById(R.id.bhome);
        gallery=(Button)this.findViewById(R.id.gallery);
        ImageView image = (ImageView)findViewById(R.id.imageView1);
        slideInLeft = AnimationUtils.loadAnimation(this, R.anim.alt);
         image.startAnimation(slideInLeft);
       
        try{
        	
        	spinstart.setOnClickListener(new OnClickListener(){        
        		public void onClick(View v) {
        			editstart();
        		}
        	});
           spinstop.setOnClickListener(new OnClickListener(){        
        	   public void onClick(View v) {
        		   editstop();
        	   }
           });
        }
        catch(Exception e) {
        	Log.e("Error", "Error", e);
        }
           
      
    	  button1.setOnClickListener(new OnClickListener(){        

    	   public void onClick(View v) {
    		   displayroutes();
    	   }
       });
    	  alter.setOnClickListener(new OnClickListener(){        

       	   public void onClick(View v) {
       		   Intent i=new Intent(Title.this,Altbus.class);
    		         startActivity(i);
       	   }
          });
    	  bhome.setOnClickListener(new OnClickListener(){        
   
          	   public void onClick(View v) {
          		   Intent i=new Intent(Title.this,Bus4U.class);
       		         startActivity(i);
          	   }
             });
    	  gallery.setOnClickListener(new OnClickListener(){        
    	      
 
         	   public void onClick(View v) {
         		   Intent i=new Intent(Title.this,Picins.class);
      		         startActivity(i);
         	   }
            });
      }
	
	private void displayroutes(){
		 TextView textView3=(TextView)this.findViewById(R.id.textView3);
		 try{
			 Bus4U.start=(String) spinstart.getSelectedItem();
			 Bus4U.stop=(String) spinstop.getSelectedItem();
			 /*retrieve data from database */
			 SQLiteDatabase DB= null;
			 String TableName = "Routes";
			 String s1="",s2="";
			 DB = this.openOrCreateDatabase("DatabaseName", MODE_PRIVATE,null);
			 DB.execSQL("CREATE TABLE IF NOT EXISTS "
					 + TableName
					 + " (Field1, Field2);");
			 
			 // retrieving routes of start station from DB 
			 Cursor c=(DB.rawQuery("SELECT * FROM " + TableName + " WHERE Field1 = '" + Bus4U.start + "';", null));
			 int C1= c.getColumnIndex("Field2");
			 c.moveToFirst();
			 if(c != null){
				 do{
					 String Data= c.getString(C1);
					 s1=s1 + Data;
				 }while(c.moveToNext());
			 }
			  
			 // retrieving routes of destination from DB
			 Cursor cc=(DB.rawQuery("SELECT * FROM " + TableName + " WHERE Field1 = '" + Bus4U.stop + "';", null));
			 
			 int C2=cc.getColumnIndex("Field2");
			 cc.moveToFirst();
			 if(cc != null){
				 do{
					 String D= cc.getString(C2);
					 s2=s2 + D;
				 }while(c.moveToNext());
			 }
			 
			 if(s1.equals(s2))
				 textView3.setText("Start station and destination are same");
			
			 else{
				 
				 String[] startingPointBuses = s1.split(",");
				 String[] endPointBuses = s2.split(",");
				 List<String> commonBuses = new ArrayList<String>();
			 
					 for(String startPointBus : startingPointBuses){
						 for(String endPointBus : endPointBuses){
							 if(startPointBus.equals(endPointBus)){
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
					 textView3.setText("Routes from "+Bus4U.start+" to "+Bus4U.stop+" are:" + finalBuses + "\n");
				 else 
					 textView3.setText("There are no routes from "+Bus4U.start+" to "+Bus4U.stop);
			 }
		}catch(Exception e) {
			 Log.e("Error", "Error", e);
      }
	 }

	
	private void editstart(){
		 ArrayAdapter<CharSequence> fAdapter;
		 fAdapter = ArrayAdapter.createFromResource(this,
				 R.array.stop_list,android.R.layout.simple_spinner_item);
		 fAdapter.setDropDownViewResource(
				 android.R.layout.simple_spinner_dropdown_item);
		 spinstart.setAdapter(fAdapter);
		 
	 }
	 
	 private void editstop(){
		 ArrayAdapter<CharSequence> fAdapter;
		 fAdapter = ArrayAdapter.createFromResource(this,
				 R.array.stop_list,android.R.layout.simple_spinner_item);
		 fAdapter.setDropDownViewResource(
				 android.R.layout.simple_spinner_dropdown_item);
		 spinstop.setAdapter(fAdapter);
	 }
	 
}
