package com.professionalandroiddevelopment.Bus4U;


import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Bus4U extends Activity {
	
	public static String start, stop;
	public static SQLiteDatabase DB= null;
    public static String TableName = "Routes";
    
    public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title);
		
		Button proceed=(Button)this.findViewById(R.id.proceed);
		createDB();

		proceed.setOnClickListener(new OnClickListener(){        
  
    		public void onClick(View v) {
    			 Intent i=new Intent(Bus4U.this,Title.class);
   		      startActivity(i);
    		}
    	});
	}
    
    private void createDB(){
		try
        {
           DB = this.openOrCreateDatabase("DatabaseName", MODE_PRIVATE, null);
           DB.execSQL("DROP TABLE " +TableName+";");
           
           /* Create a Table in the Database. */
           DB.execSQL("CREATE TABLE IF NOT EXISTS "
        		   + TableName
        		   + " (Field1 VARCHAR, Field2 VARCHAR);");
           
           /* Insert data to a Table*/
           
          
           DB.execSQL("INSERT INTO " + TableName + " (Field1, Field2)"
      		     + " VALUES ('ABIDS', '7,7B,7C,7I,7M,7D,7U,9,9A,9B,9J,9Y/H," +
      		     "11N,11M,16T,40,40E,41,41C,57S,63K,65,65G,93A,93B,94S,95S," +
      		     "98,100A,100H,100J,100K,100L,100N,100R,100H/N,100M/R,100T,158," +
      		     "9K,185C,185,8A,8B,156/299M,18B,100A/S,101B,101K,101R,102J,108," +
      		     "108S,102R,102F,118N/T,118M,118I,118T,118,120M,122L,127,127D," +
      		     "127F,127K,127P,127S,127T,127Z,127J/B,105S,137,141,141G,141N." +
      		     "141R,141B,152,152G,153,153M,156,156B,156G,156T,158R,158V,158Y/P," +
      		     "9K/B,9M,147,158J,217D,187J/A,189E/M,7S,185D,187D/B,127J,105," +
      		     "158F,158K/L,115N,176,176S,116H,183,186L,187J,187L,203,216U," +
      		     "217,225,225C,225A/D,102,225M,229X,236,283I,283M,287N,288H,222');");
         
      	DB.execSQL("INSERT INTO " + TableName + " (Field1, Field2)"
      		     + " VALUES ('AFZALGUNJ', '1,1B,1V,1E,1H,1P,1/94R,2,2J,2U,2V,2Z," +
      		     "2/95A,3,3B,3C,3C/L,3E,3G,3H,3H/95A,3K,3D,3M,3Y,3Z,4,5K,2C,2D,7," +
      		     "7C,72,8A,8C/229,8D/B,8M,8R,8R/221,8R/Z,8V,9F,9K/B,9,9K,9X,9Y," +
      		     "9D,9E,9M,9M/L,9N,9I,9Y/G,9G,11M,11N,16/86,38,49/86,57S,63B,63M," +
      		     "63S/B,65,65C,65/85,65M,65S,65T,65V,65Z,71A,71B,72J,72J/Y,73,78S," +
      		     "80I,80K,80R,80,86C,86D,86K,86H,94K,94R,94S,94A,95,95A,95C,95H,95K," +
      		     "95M,95P,95R,95S,101S,104M,104T,127J,152A,114,114D,185,185D," +
      		     "225C,225C/A,225H/P,225M,229/7,250A,250K,251J,251K,251N,251L,252H," +
      		     "252M,252N,272C,283A,283B,288P');");
      	
      	DB.execSQL("INSERT INTO "
   		     + TableName
   		     + " (Field1, Field2)"
   		     + " VALUES ('FILMNAGAR','102K/127J,127J,161T/47L,47,47L,118M/T,127F,127K," 
   	             + "127P,127S,127J/B,47Y/90D,90D/47Y,47C,47Y,16H/47L');");
      	
      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('ASSEMBLY','8R,8R/Z,9F,9/10,49P,63M,118,118I,118L,118M,118T,136L," +
      		     "9C');");

      	
      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('ALWAL','2D,2R,8R,1P/25I,8R/21,8R/25,1K/25,2D,5T,7V,8R,8R/Z,22," 
     	             + "22/1P,22C,22D,22L,22M,22T,22/102,22S,25,25A,25B,25J,25M,31P,211,211A,211B,"              
     	             + "211C,211D,211J,211K');");
      	
      	DB.execSQL("INSERT INTO "
   		     + TableName
   		     + " (Field1, Field2)"
   		     + "VALUES('AMBERPET','71A,71B,71,107V,113K,113M,115,204S,207,71D,71Z,107J," +
   	             "107V/L,107V,113E,113V,113X,113Y,113B/M,113B/N,115,115B,115C,115R,115R/S,115V," +
   	             "115/118,141,141R,204,204K,204),204S,204U,205A,205B,205K,205M,209,205,280E," +
   	             "280T,283K,283R,283T,283P,290K');");
      	
      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('AMEERPET','187D/V,9Y,10K,104M,113C,187D,190S,225C/A,9," 
      	             + "9k/227,9M/L,9D,107A7S,10J/K,10Y/F,4SY,104M,187L,187J,189L,230N/C,247Y," 
      	             + "251A,283,225V,230X,9A,10L,171K,211J,224H,230N,283A,113E,113K,83V,83B," +
      	             "83P,83S,9B,9E,9F,9F/E,9K,9M,9N,9D,9Q,9R,9X,9Y,9Y/F,9Z,10,10B,10F,18/10L," +
      	             "26M,41,41C,41K,41N,45,45A,45K,45G/Y,45F,45R/F,47G,47K,47Y/G,84S,94/1F," +
      	             "9G/A,18V,100D,113A,113F,113S,113V,113Y,156V,158A,158L,158,158N,158V,105," +
      	             "158/84,171C,171M,183,183A,185,185C,185D,185G,185M,185S,186B,186M,186L," +
      	             "187,187D,187E,187J,7H,187N,187L,187Z,189C,225C,225D,225C/A,102,225A/D," +
      	             "225H/P,225M,225X,226E,283N,289M,290A,10R,10Y/H,92E/N,92E/R,127Y,158B," +
      	             "86B,189F,280R');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('ATHAPUR','92,95,94U,115B,251,251B,284P,284S');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('BASHEERBAGH','7,7B,7D,7S,7U,8A,8B,7V,83P,83S,84H,94S,136," +
      		     "136U,229/7,236,7M,137,16T,38,36K,95S,113B,136L,137A');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('BAGHLINGAMPALLY','86C,6S,6T,86J,113A,113E,113S,113Y,16/86," +
      		     "86K,86,86H,86I,86N,86S');");

      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('BALANAGAR','9K,9X,1890,9D,9E,9U,189C,171C,9K/B,226C,159M,224S," 
     	             + "226,230X,83B,83G,83S,9,9K/102,9K/227,9M/L,9Z,10A7S,29B,31L,41,41K,41C,41N," 
     	             + "107/31,107B,171C,171K,171S,183,183H,187L,226A,226L,226J/L,231K/N,272G,283A," 
     	             + "283N,283T');");
      	
      	DB.execSQL("INSERT INTO "
   		     + TableName
   		     + " (Field1, Field2)"
   		     + " VALUES ('BANJARA HILLS','9J/84S,49E,92ER,92K,189L,289M,16N/49M,49J,49L," 
   	             + "86/49M,127W,222,127N,127,12,66,63,65,127K,127J,127P,127A/100V');");

      	
      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('BEGUMPET','10FY,83P,10F,10L,10U,18/10L,45J,45R/F,45G,45R/F,47," 
     	             + "47C,47F,47G,47H,47L,49,49A,49J,49K,49L,49W,49P,49V,49/86,86/49M,226E,49E," 
     	             + "47Y/G,47S,47C/LE,47Y,47K,22S,10Z,10Y/F,10P/F,10K/L,10K,10J/K,10H,10B/K," 
     	             + "10A/S,10');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('BHEL','225M,217C216,225D,226C,217D,225S,225V,26,217,217A,217C," 
      	             + "217M,217V,217X,223G,223S,225,225C,102,225L,225M,225X,226,226A,226E,226M,228A');");

      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('BORABANDA','9F,10F,10FG,158F,158J,9F/E,10P/F,10Y/F,19Y/F,45G/Y," 
     	             + "45F,45R/F,92F,94/1F,102F,113F,183F,189F');");

      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('BKP','2,2J,2P,2R,3,3H,3K,3T,2B,2C,2D,2G,2U,2V,3C,113K,113M," 
     	             + "280C,2Z,3P,3R,3S,3Z,6,6H,6J,6M,16S,16T,45G,134D,136H,136N,136U,137,137A," 
     	             + "141G,141V,156H,189E,250A,250K,252H');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('BOWENPALLY','1K/229,1V/229,17H,107/229,107B,131S/29,226A,226L," 
      	             + "24E/31,26M/V,29,29B,29C,29H,29Q,29R,29S,30A,30S,31,31A,31H,31M,31P,31V," 
      	             + "33S,224S,226,226J/L,229B,229G,229X,230D,230K,230P,231,231K/N,232M,233,234M,"
      	              + "235G,271,272,272S,283C');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('CHARMINAR','2,20,2U,2V,2R,9,9K,185D,189O,185O,2C,2Z,225S,230X,253M," +
      		     "299C,1B,2D,3C,67,67B,67K,70,70A,70B,70M,70N,71N,71B,72,72A,72B,72J,72M,72N,72V," +
      		     "75A,75R,77,78,78B,78S,81,81H,81R,82,8A,8C,8D/B,8R,8U,9,9B,9E,9K,9K/227,9M,9M/L," +
      		     "9N,9D,9/10,9Q,9R,9X,9Y/F,102,57S,63B,63K,63M,63S,65,65A,65/85,65G,65G/P,65M,65P," +
      		     "65S,65T,65V,66G,66P,85,85B,85H,85J,85M,85V,86K,87,87S,94C,94/1F,127J,143A,143C," +
      		     "171C,171M,178,178R,178V,185C,189C,217C,225C,251A,251K,251M,251P,,251S,252,252J,252L," +
      		     "252S,253H,253K,253T,254,254R,299C,283D,278,272C,254K,225C/A,208C,6C,65S,65M,65C," +
      		     "63S/B,26M,82/77,78V,75U,72UC,253M/8A,225,225C/A,9X,9Y,9M,9K/B,9F,8R/25,8R,8A,8C/229,8M');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('CHANDANAGAR','225M,225X,226,226M');");
      	
      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('CHIKKADPALLY','1P,16,113C,16K/N,1B,1E,11,1K,1L,45K,91L,107K,107M,107S," +
     		     "22L,91E,91M,102M,131,1J,1V,1,107');");


      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('CHAITANYAPURI','100L,86S,100M,100T,158L,201Q,202M,205,206" +
      		     "299C,72J/Y,72L,72M,107M,158N,158M,299');");

      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('DSNR','70B,72,72B,72J,72L,72M,72V,85B,187D/V,225D,16K,107V," +
      		     "127J/100V,156J,158F,158J,204S,207,217D,299C,156/299M,1L," +
      		     "1V,1V/229,70B,70N,71D,72,72A,72B,72J/Y," +
      		     "72J,72L,72UC,72M,72N,72V,78H,84,8V,9J/84S,16D,16K,16K/L,40D,84S,86N,86S," +
      		     "90A,90A/107V,90D/107V,90D/203D,90M/S,90U,90M,90R,91D,94,94D,94L,95K/L,95L/K," +
      		     "95L,9GA,96L,96N,97A,99V,99,99K,99M,100,100A,100C,100G,100H,100J,100K,100L," +
      		     "100M,100L/R,100H/7N,100M/R,100S,100T,100V,158,100,100Y,100A/S,101R,105S/D," +
      		     "105D/S,107,107G,107J,107S/K,107K,107M,107S,107T,107V/S,107P,107V/L,107V,107/31," +
      		     "107G,107KV,100D,127,127Y,152,152B,152R,152Y,156,156B,156G,100G,156K,156L,156P," +
      		     "156V,150H,156T,158,158A,158B,158L,158F,72J,8V,158R,158M,158N,158V,158Y/L,158/84," +
      		     "158K/L,187L,201,201G,201M,202M,202T,204,204K,204/W,204N,204P,204S,204V,205,205A," +
      		     "205B,205K,206,208,208C,208R,209,205,216D,225D,225A/D,225L,252D,277D,298,299,299A," +
      		     "299H,299M,299P,299S,217D');");

      	
      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('ERRAGADDA','9X,9F,10,10F,10/16,187D,9A,9K/227,105,7H,187L,223A," +
      		     "225,225L,287N,158F,158J,83G,83K,83S,9,9F/E,9K/10L,9D,9Q,10A/7S,10B,10B/K," +
      		     "10J/K,10K/L,10Y/F,18/10L,19K/S,41C,41K,41N,45K,45F,84S,92K,94/1F,9G/A,8V," +
      		     "102F,158S,113S,158A,158M,158N,171C,171M,183A,183F,185C,185D,135M,185M,185N," +
      		     "185S,186L,187,187D,187E,187J,187N,187P,187S,189M,223S,224H,224K,225C,225H,225M," +
      		     "225V,225X,226E,230N,289M');");


      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('ESI','9,9K,180,185D,186M,9D,9E,9M,9Q,9U,189C,187C,10,10B,10F,9K/B," +
      		     "113C,113E,113S,113Y,159M,225S,83B,83G,83K,9A,9F/E,9M/L,9R," +
      		     "9X,9Z,10A/7S,10J/K,10K,10L,18/10L,19K/S,19Y/F,19M,19V,19V/M,22S,41C,41K,41N,45," +
      		     "45A,45K,92E/N,92E/R,92K,94/1F,9G/A,113A');");



      	DB.execSQL("INSERT INTO "
      		     + TableName
      		     + " (Field1, Field2)"
      		     + " VALUES ('ECIL','3H,3K,15A,10H/16H,3K/S,5S,10/16,16,17H,147,250,250/40M," 
      		     + "3E,3H/95A,15,16A,16A/5N,16B,16C,16H/47L,16/86,16R,17,24E,24E/71,31,37," +
      		     "37A/L,37E,37H,37N,37R/K,38L/C,51,102/3K,102/17H,117,136H,241T,250,250P,250/49M," +
      		     "16A/49M,16D,16N,17H/10H,38A,38X');");
      	
      	DB.execSQL("INSERT INTO "
    		     + TableName
    		     + " (Field1, Field2)"
    		     + " VALUES ('GACHIBOWLI','6C,49E,118G,141G,216A,216D,216K,216L,216U," +
    		     "217,217A,217C,217M,217R,217V,217X,223G,216,218,218L,218U,218W,118W');");
      	
      	
      	DB.execSQL("INSERT INTO "
    		     + TableName
    		     + " (Field1, Field2)"
    		     + " VALUES ('GHATKESAR','280C,280S,211B,211C,211D,211K,245,280," +
    		     "280B,280E,280G,280N,280R,280S,281P,284G');");
     	
      	DB.execSQL("INSERT INTO "
    		     + TableName
    		     + " (Field1, Field2)"
    		     + " VALUES ('GOLCONDA','65G,801,5G,2G,1,2,78H,80R,80,5S/K,45,65G,65G/P," +
    		     "66G,66P,115,119,142K,142N');");
     	
      	
      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('HCU','217D,49E,49B,216U,217,217A,217C,217D,217M,217R,217V,217X,223G,247Y');");
      	
      	DB.execSQL("INSERT INTO "
    		     + TableName
    		     + " (Field1, Field2)"
    		     + " VALUES ('HAYATHNAGAR','201,201G,201K,202T,204,204K,205A,204S,205F,207,290,299," +
    		     "201,201G,201Q,202,202M,204S,204K,204U,205,205A,205B,205K,205M,206,208,225L,290A," +
    		     "290,290K,290K/A,290T,299,299C,299M,156/299M');");
     	
      	DB.execSQL("INSERT INTO "
    		     + TableName
    		     + " (Field1, Field2)"
    		     + " VALUES ('HUBSIGUDA','18,3B,3E,3R,6K,10U,16U,18A,18B,18C,18M,18K,18R,18T,508,90D/203D," +
    		     "105S/D,136B,136N,202,236,245A,245J,245K,250,250A,250K,250P,252H,280,290,290A,290B,290K," +
    		     "290T,508,51,90A,90J,90L,90M/S,90M,90R,18M,18V,90A/107V,90K,90M/S');");
     	
      	DB.execSQL("INSERT INTO "
     		     + TableName
     		     + " (Field1, Field2)"
     		     + " VALUES ('IBS','1,1E,1P,3B,3H,3K,7,7B,7C,7D,9,9K,185C,185D,1H,1Y,1/94R," 
     	             + "2,2C,2D,2J,2U,2V,2Z,3,3C,3Z,67L,71A,71Z,72J,72UC,801,7C,72,8V,9X,9B," 
     	             + "102,38,65,65Z,86H,86L,94R,94S,95A,95K,95K/L,95S,99H,100,185C,185D,189C," 
     	             + "22C,225HP,225M,242,250A,250K,252H,283A');");
     	
     	DB.execSQL("INSERT INTO "
     	         + TableName
     	         + " (Field1, Field2)"
     	         + " VALUES ('JBS','2R, 2D, 7D, 1J,22J,107J,107J/K,"
     	         + "21,22,23,24,25,28,211,1V,1P/25I,5R,8R,8R/21,1B,"
     	         + "1K/25,5T,7V,8R/Z,15H,20D,21W,21B,22/1P,22C,22D"
     	         + "22L,22K,22M,22R,22T,22S,22/102,23B,23G,23M/Q,"
     	         + "24B,24C,24E,24C/D,24K,25A,25B,25M,25J,28,38L/C"
     	         + "43,86J,90D/203D,211,211A,211B211C,211D,211D/Y,"
     	         + "211E,211K,211P,211M,211R,211S,211T,211U,290,290,A');");

     	DB.execSQL("INSERT INTO "
     	         + TableName
     	         + " (Field1, Field2)"
     	         + " VALUES ('JEEDIMETLA','9K,189E/M,9D,183,230J," +
     	           "9,9K,9X,189C,29,29H,20R,29S,30A,230D,"
     	         + "230B,1S9M,230X,83S,9,25J,29B,29R,45J,183A,183F,183H,"
     	         + "189M,223J,229B,229G,229V,229,229/5,229/7,230A,230G,"
     	         + "230K,230N,230P,230V,272,272M,272S,283A,283C,289M"
     	         + "230N/C,245A,245J,280,280B,280E,280N,280T,283D,"
     	         + "283I,283T');");

     	DB.execSQL("INSERT INTO "
     	         + TableName
     	         + " (Field1, Field2)"
     	         + " VALUES ('JAMIA OSMANIA','2V,86,86K,86H,86I,86/49M,"
     	         + "90A/107V,90D/1D7V,107D,107Z/K,107KV,139S');");
     	
     	DB.execSQL("INSERT INTO "
    	         + TableName
    	         + " (Field1, Field2)"
    	         + " VALUES ('JUBILEEHILLS CHECKPOST','127K,127J,127Y,127,127Z,127S,127A/N," +
    	         "127P,10H,10H/17H,10H/16H,17H/10H,16H/10H,16H/47L,47,47C,47L,47K,47Y,47P,47C/L," +
    	         "222,147,147W,147L,11,11T,90D/47Y,47Y/90D,12,38S/10H,127J/100V');");
     	
     	DB.execSQL("INSERT INTO "
   	         + TableName
   	         + " (Field1, Field2)"
   	         + " VALUES ('JNTU','225S,6,10J,19V,31V,31M,118I,119,120M,"
   	         + "156B,187J,223G,223A,224,224H,231,231B,231K/N');");


     	DB.execSQL("INSERT INTO "
   	         + TableName
   	         + " (Field1, Field2)"
   	         + " VALUES('KHAIRATHABAD','113A,185A,9M/L,158Y/L,105,158K/L');");
   	
      	
      	DB.execSQL("INSERT INTO "
      	         + TableName
      	         + " (Field1, Field2)"
      	         + " VALUES ('KPHB','187D/V,10K,226C,187D,190S,225S,225d,"
      	         + " 10A7S,10B/K,10K/L,10L,19M,19V,24E/31,31,31H,31M,"
      	         + "31V,186L,187,187E,187J,7H,187N,187L,187S,187Z,223A,"
      	         + "224,224B,224K,224S,225,225A,225C,225C/A,225A/D,225DH/P,"
      	         + "225M,225X,226,226A,226L,226E,226M,228A,231,231K/N');");

      	
      	DB.execSQL("INSERT INTO "
   	         + TableName
   	         + " (Field1, Field2)"
   	         + " VALUES('KACHIGUDA','2,2J,2C,3Z,17B,42,141G,20,2D,2R,21,3,3H,2U," +
   	         "2Z,3E,3S,83B,83G,83K,83P,83S,48,49K,99,99K,141,141M,141R,141V,250K');");

   
      	DB.execSQL("INSERT INTO "
   	         + TableName
   	         + " (Field1, Field2)"
   	         + " VALUES('KOTHAPET','78H,80I,80K,80R,80,78V,107G,107KV,107B,277P,"
   	         + "227R,227T,293S,107H,72J/Y,16K/L,85V,80S,90A,90D/203D,90V,91L,94L,"
   	         + "95L/K,95K/L,96L,99H,99K,100,100A,100G,100M,100N,158,100A/S,105D/S,"
   	         + "105S/D,107V/S,107P,107/31,107Z/K,152B,156B,299,156L,156P,158M,158K/L,"
   	         + "187L,201G,201M,201Q,202M,204S,205,299A,299C');");
   	

      	DB.execSQL("INSERT INTO "
     	         + TableName
     	         + " (Field1, Field2)"
     	         + " VALUES('KOTI','1,1E,1P,3B,3H,3K,7,7B,7C,7D,19,9K,185D,185,"
     	         + "7E,7V,9,9X,189C,100A,100G,100K,100L,100M,100R,1K,1C,1M,2,107,"
     	         + "107M,107H,86,86K,86M,127J/K,1J,1P/25I,1V,3,3D,3H,3K,9K/B,"
     	         + "16K,115,188T,127J,158F,158J,187D,187/JA,205F,280C,1B,11,1K/229,"
     	         + "1L,1H,1V/229,1Y,1/94R,1K/25,3A,3B,3C/L,3E,3G,3H/95A,31`,3JJ,3M,"
     	         + "3N,3P,3R,3SS,3Y,67L,71B,75R,84,7M,7I,72,9A,9B,9J,9J/84S,9Y/H,"
     	         + "11M,11N,16D,102,16K,16S,19Y,22/1P,22L,38,36K,40,40D,40E,40I,40T,"
     	         + "40V,41,41C,45A,45K,4SY,45F,49K,57S,63K,65,65A,65G,65T,65V,65Z,84H,84S"
     	         + "86H,86N,91I,91E,91L,91M,93A,93P,93B,94A,94H,94K,94R,94S,94U,95,95A,"
     	         + "95C,95H,95K,95M,95P,95R,95S,96N,99M,102,104S,107G,107K,107/229,115,"
     	         + "115B,115C,115N,115R,115R/S,115V,115/118,116,116H,116N,116T,118,118M,"
     	         + "118T,118M/T,120M,122,122L,127D,127F,127K,127WI,127N,127P,127S,127T,"
     	         + "127V,127Y,127Z,135,135A,141,141G,141M,142K,142NI,152,152B,152R,156,"
     	         + "156V,156T,158,158B,158L,158F,158R,158N,158V,158Y/P,176B,183,185C,"
     	         + "185,S,186L,187,187D,187E,187J,7H,187L,187S,187Z,189C,204N,206,209,216,"
     	         + "216V,217,223A,223R,224H,224K,225,225A,225C,225D,225M,229X,229/7,250A,"
     	         + "252H,272K,250E,280R,280T,283,283K,283I,283N,283P,283T,284P,287N,288H');");

     	
     	DB.execSQL("INSERT INTO "
 	         + TableName
 	         + " (Field1, Field2)"
 	         + " VALUES('LAKDIKAPOOL','9K,9X,1S,5C,185D,185M,9E,9M,9Q,9U,187C,"
 	         + "9B,9C,9D,9F,118T,156J,158F,158J,171/W,187J/A,205F,225V,230X,5BL,5M/D,6H,9A,63K,"
 	         + "63S,65,65G/P,86/118J,113B/M,113I/N,127J,141G,217V,217X,225,225D,225L,225M,9,185,"
 	         + "185C,189,187E,187S,189C,63S/B,9M/L,6,9Y/H,18V,156B,156,187L,288H');");
 	
     	DB.execSQL("INSERT INTO "
	         + TableName
	         + " (Field1, Field2)"
	         + " VALUES('L.B.NAGAR','72L,72V,78N,99V,100C,100L,100S,100V,201,202T,204,156J,204S,299C," +
	         "94L,99K,152P,156B,204P,208,209,290J,185C');");
     	
     	DB.execSQL("INSERT INTO "
   	         + TableName
   	         + " (Field1, Field2)"
   	         + " VALUES('LINGAMPALLY','216L,217C,217M,217R,220K,220P,223G,223A,223S,224P,225A," +
   	         "225D,225C/A,225A/D,225L,225M,225V,225X,226,226E,226J/N,228A');");

   	DB.execSQL("INSERT INTO "
   	         + TableName
   	         + " (Field1, Field2)"
   	         + " VALUES('LANGARHOUZ','65G,65M,66G,66P,92H,92S,92M,120,220J,288H,288P"
   	         + "288R,288S,288X,288Z,6,6C');");
   	
   
   	DB.execSQL("INSERT INTO "
   	         + TableName
   	         + " (Field1, Field2)"
   	         + " VALUES('MIYAPUR','226C,224S,225V,226,223A,223J,"
   	         + "224,224B,224K,224P,224S,224X,225,225A,225C,225D,"
   	         + "22DC/A,225A/D,225H/P,225L,225M,225X,226A,226L,226M,"
   	         + "226J/L,228A,231K/N');");

         DB.execSQL("INSERT INTO "
       	         + TableName
       	         + " (Field1, Field2)"
       	         + " VALUES('MGBS','11,7I,7M,11M,11N,187J,22/1P,118I,9C,7,7B,"
       	         + "7D,7U,9,9K,185C,185,1,2,2J,3,7,86D,94S,94A,95,185D,3B,3K,"
       	         + " 3M,71A,71B,9X,189,20,2U,7U,2P,2R,3H,3T,2D,225M,1P,16,"
       	         + " 2V,72J,8V,15A,186M,65G,80I,189C,21,185M,1E,3B,7C');");

         DB.execSQL("INSERT INTO "
      	         + TableName
      	         + " (Field1, Field2)"
      	         + " VALUES('HITECH-CITY-SHILPARAMAM','102K/127J,127,127S,127K,10H,47H," +
      	         "247Y,127J,118M/T,47K,47S,11,12,127K/V,10H/17H,17H/10H,16H/10H,10H/16H," +
      	         "147,147L,147W,222');");
    	
         
         DB.execSQL("INSERT INTO "
    	         + TableName
    	         + " (Field1, Field2)"
    	         + " VALUES('MALAKPET','72J,8V,70B,72,72B,7,2L,72M,72V,85B,"
    	         + "99V,100A,100C,100Q,100K,100L,100G,100R,100M,"
    	         + "127K,72VC,9K/102,22/102,40D,95L/K,96,96L,97A,"
    	         + "98,99H,99K,99M,100,1Q0H7N,100M/R,188,100H');");
    	
         DB.execSQL("INSERT INTO "
    	         + TableName
    	         + " (Field1, Field2)"
    	         + " VALUES('MEHDIPATNAM','5K,65/85,251,65V,65G,250/40M,"
    	         + "156/229,288B,288D,288Y,5R,5S,6B,118T,1S9M,189R,5B,6,"
    	         + "6K,18M,49WI,57ST,63B,63M,65P,65T,65V,66G,92E/N,92K,"
    	         + "92M,98,142NI,142S,156T,288H,288X,288Z,289M,299M,5L,113M,118W," +
    	         "216,216A,216D,216R,216L,216U,217A,217C,217M,217R,217V,217X," +
    	         "218L,218U,218W,118W,118G,141G,49E,223G');");

    	DB.execSQL("INSERT INTO "
    	         + TableName
    	         + " (Field1, Field2)"
    	         + " VALUES('MIYAPUR','226C,224S,225V,226,223A,223J,"
    	         + "224,224B,224K,224P,224S,224X,225,225A,225C,225D,"
    	         + "22DC/A,225A/D,225H/P,225L,225M,225X,226A,226L,226M,"
    	         + "226J/L,228A,231K/N');");
       	
          	
           	DB.execSQL("INSERT INTO "
             	         + TableName
             	         + " (Field1, Field2)"
             	         + " VALUES('MJ MARKET','230X,75R,8M,85M/251,8R,9R,9Y/F,9Y/H,49/86,63S,65G/P," +
             	         "65M,65P,65S,85V,100D,143A,143C,152A,158V,171M,9F,9Y,171/W,8R/Z,8V,9G,9D,63M," +
             	         "63B,66J,66P,158A,171C,135M,9E,114D');");
           	
          
           	
            	DB.execSQL("INSERT INTO "
              	         + TableName
              	         + " (Field1, Field2)"
              	         + " VALUES('NARAYANAGUDA','6B,113E,1,11,1K/2291H,1V/229,1/94R,1K,229,1V,1K/25,6C," +
              	         "6K,6J,6M,22/102,45F,86,91L,102/17H,102/1,107P,98M,107/31,107G,113A,113B,113I/N," +
              	         "113K,131S/29,131S,131G,136,136B,136H,136N,136S,136U,136V,137,139S,102,217X,107,22/1P," +
              	         "6,6H,6T,107B,113M,13S,136L,137A,139,189,225X,236,293S');");
            	
            	
            	DB.execSQL("INSERT INTO "
            	         + TableName
            	         + " (Field1, Field2)"
            	         + " VALUES('PATNY','1P/25I,10/16,10FY,10H,224S,226,5,5C,5B,5BL,7C,7V,8A"
            	         + "8V,10A7S,10,10J/K,10L,10U,10Y/H,16K/L,17H,22S,29B,29C,29H,29Q,29R,29S,"
            	         + "30,30A,30M,31,31A,31H,31V,33S,31S,37N,38T,43,45A,45K,49/86,87S,91J,91L,"
            	         + "107J,107/31,107B,131S/29,171,224S,226,226A,226L,226M,226J/L,229B,229V,"
            	         + "230D,230G,23DK,230J,230P,231,231B,231K/N,271,272,272M,272S,283C');");

            	        	
            	
          	DB.execSQL("INSERT INTO "
         	         + TableName
         	         + " (Field1, Field2)"
         	         + " VALUES('OSMANSAGAR','120M,288Z,288Y');");
            	 DB.execSQL("INSERT INTO "
                		+ TableName	
                		+ " (Field1, Field2)"
                		+ " VALUES ('PUNJAGUTTA','9,9K,9X,185C,185D,185M," +
                		"9D,9E,9WI,9Q,9U,189C,110D,127,158,158A,158M,225L," +
                        "47,47C,47F,49A,49E,49L,49M,49P,9A,9F,9G,9J,9K/227," +
                        "9M/L,9N,9/10,9R,9V,9M,113E,156J,189M,189R,225C," +
                        "250/40M,83G,83B,83K,41,9Y,9Y/G,9Y/H,PZ,10N,10Z," +
                        "16H/47L,26M,41,41C,41K,41N,41G,45G/Y,45G,47H,47L," +
                        "47K,47G,47Y,47C/LE,47S,47Y/G,49J,49L,49WI,49N,49P" +
                        "49V,86/49M,92E/N,92ER,92F,92K,18V,102F,158S,105SI," +
                        "113S,113V,113X,158B,158L,158F,158R,158V,158Y/P,158/84," +
                        "171C,171K,171M,183,185,185G,185N,185S,86B,186B,186M," +
                        "186M,186L,187,187D,187E,187J,187L,7H,187N,187S,187Z,189F," +
                        "189L,189M,225,225A,225C,225D,225A/D,225HP,225L,225M," +
                        "225V,225X,289M');");
            	 
            	 
            	DB.execSQL("INSERT INTO "
            	         + TableName
            	         + " (Field1, Field2)"
            	         + " VALUES('QUTHB SHAHI TOMBS','9Q,23M,23M/Q,29Q,201Q,290Q');");

                 
                DB.execSQL("INSERT INTO "
                		 + TableName
                		 + " (Field1, Field2)"
                		 + " VALUES ('RTC X ROAD','1V,2C,2J,2V,2Z,16K,104M," +                                                                                                                                                                                                                                                                                                         
                          "1,1B,1E,11,1L,1P,1Y,1K,125,2,2/95A,16D,102," +
                          "16K,16K/L,22/1P,22L,22/102,45J,45K,45Y,45G/Y," +
                          "45F,48,91I,91E,91M,102K,102M,107,107G,107K," +
                          "107M,107S,107P,98M,107/31,107B,131K,131S/29," +
                          "131S,137S,102,217X,2,2B,2C,2D,2G,2P,2R,2U');");
                
                DB.execSQL("INSERT INTO "
                		+ TableName
                		+ " (Field1, Field2)"
                		+ " VALUES ('RNG','7,7B,7C,7D,94S,7C,7S,7U,8,8B,8C,8D," +                                                                                                                                                                                                                                                                                                         
                          "8P, 5M,5P,5P/K,5S,5SD,38,71,7M,7V,8D/B,45J,45Y,57ST," +
                          "94S,95S,101S,228,228A,229G');");

                
                
                 
                 DB.execSQL("INSERT INTO "
                		 + TableName
                		 + " (Field1, Field2)"
                		 + " VALUES ('SANATHNAGAR','10,10/16,113S,113Y," +                                                                                                                                                                                                                                                                                                         
                          "171/W,189E/M,230X.83S,84,9,9B,9E,9M,9D,9Q," +
                          "10BK,10J,102,22S,41,41K,41N,45K,48,92K,9GA," +
                          "158A,158L,158M,158N,158S,158/84,105,171C," +
                          "171K,171S,183H,183S,189M,223S,283T,283S," +
                          "189C,84S,9U,9X');");
                    
                  DB.execSQL("INSERT INTO "
                		  + TableName
                		  + " (Field1, Field2)"
                		  + " VALUES ('SECRETARIAT','6H,5R,5M,20P,113K,113M," +
                          "225V,5,5B,5GP,5K,5B/K,5BL,5L,5R,5S,5SD,72R/8A," +
                          "83B,83G,83K,83P,83S,5T,6,6C,6J,6S,6T,8C,8D/B,8R," +
                          "8S,8R/Z,8U,8V,20D,20M,20P,20V,37N,38T,87S,92S," +
                          "101S,113M,113V,113S,113X,113Y,139,139S,156H," +
                          "187Z,189E,217X,229/5,234M,228S,187S');");      	
     	 
                    DB.execSQL("INSERT INTO "
                  		 + TableName
                  		 + " (Field1, Field2)"
                  		 + " VALUES ('SECUNDERABAD','226,15,1P/25I,1V,2C,2J,2U,2Z," +                                                                                                                                                                                                                                                                                                         
                             "5M,5S,8A,8M,10,10F,10H,10K,16,16/49M,17H," +
                             "226C,18,20P,102C,104M,107H,107V,31,224S,250," +
                             "250/40M,253M/8A,280S,290,1,1B,11,1K,1K/229,1L,1H" +
                             "1P,1V/229,1Y,1/94R,1K/25,2,2V,2/95A,3SS,3S,5,36," +
                             "5C,5GP,5K,5B/K,5BL,5L,5M/D,5P,5P/K," +
                             "5M/D,67L,72R/8A,5S/K,6S,7C,38,7I,7M,7V,72," +
                             "8C,8D/B,8M/251,8S,8U,10B,42,10J/K,10K,10J," +
                             "10L,10N,10P/F,10R,10Y,10Y/F,10Y/H,10Z,14,14P," +
                             "1S,15D,15H,16A,16A/5N,16C,16B,42,16E,102,16H," +
                             "16H/47L,16K/L,16L,16M,45,16P,16M/P,16N/49M," +
                             "16R,16R/K,17,17B,17D,18B,18C,18K,18R,18T," +
                             "18V,18/10L,20D,20M,20V,21,21B,21W,22,22C," +
                             "22L,22K,22M,22R,22T,22/102,23,23B,23G,23M," +
                             "23M/Q,24,24B,24C,24K,24E,24C/D,25,25A25B," +
                             "25J,25M,26,26A,26M,26M/V,26N,28,29,29B,29C," +
                             "29H,29,29B,29C,29H,29Q,29R,29S,30,30A,30C,30M," +
                             "30S,31H,31M,31P,31V,31L,33S,35,37,37A/L,37B," +
                             "37D,37D/L,37E,37H,37S,38,38A,38E,38EX,38H," +
                             "38L/C,38X,38T,40,40D,40E,40N,40I,40T,40V,43," +
                             "44,44X,46,46P,47,47C,47F,47G,47H,47K,47L," +
                             "47Y,47C/LE,47S,47Y/G,49E,49,49A,49E,49J," +
                             "49K,49L,49WI,49N,49P,49V,49/86,508,51," +
                             "57S,57ST,60,85B,86,86C,86H,86I,84J,86S," +
                             "86/118J,87S,90A,90A/107V,90D/107V,90D/203D," +
                             "90J,90K,90L,90M/S,90M,90R,91D,92S,93P,94S,95S," +
                             "101S,102,102K,102M,102/1,104S,107,107G,107J," +
                             "107J/K,107K,107M,107S,107V/S,107V/L," +
                             "107/229,98M,107/31,107Z/K,107G,107KV,107T," +
                             "107B,131,131K,131S/29,131S,131G,139,139S," +
                             "171,211,211A,211B,211C,211D,211D/Y,211E," +
                             "211J,211K,211M,211D,211R,211S,211T,211U," +
                             "226E,226L,226M,226J/L,227,227B,229P," +
                             "229R,230J,230K/J,230P,230V,231B,231K/N,235G," +
                             "241T,242,242A,242B,242G,245,245A,245J,245K," +
                             "247Y,250C,250H,250N/229,250P,271,272," +
                             "272G,272S,280,280B,280N,281,281P,283C," +
                             "283N,284G,284S,290A,290S,290K,290Q,290T," +
                             "290X');");

                  DB.execSQL("INSERT INTO "
                  		+ TableName
                  		+ " (Field1, Field2)"
                  		+ " VALUES ('TANK BUND','5M,5R,5S,8A,8M,5,5C,36," +                                                                                                                                                                                                                                                                                                         
                            "5GP,5K,5B/K,5BL,5P,5P/K,5R,5S,5SD,72R/8A,5S/K,5T," +
                            "7C,38,7I,7M,8D/B,8M/251,8R,8S,8R/Z,8U,16A/5N," +
                            "18M,37N,38,36K,38T,94S,95S,7B,7D,7U,7V,7S,7U,8,8B," +
                            "80,8P,8T');");
                  
                  DB.execSQL("INSERT INTO "
                  		+ TableName
                  		+ " (Field1, Field2)"
                  		+ " VALUES ('TARNAKA','3,3B,3C,3H,3K,3T,90D,90M," +                                                                                                                                                                                                                                                                                                         
                           "107T,136,136B,136L,3D,3KJ,280C,280S,290,34,3A," +
                           "3C/L,3E,3G,3H/95A,31,35,3M,3N,3P,3R,4,10V,16U," +
                           "17B,17D,17H,18,18B,18C,18K,18R,18T,18V18/10L," +
                           "508,90A,90A/1D,7V,90L,90M,90D/203D,90M/S," +
                           "90R,107T,136B,136H,136N,136U,137S202,290," +
                           "241T,242A,242B,242,242G,245,245A,245J,245K," +
                           "250,250A,250C,250H,250K,250P,250S,250/49M," +
                           "90,280B,280N,280S,280T,281,281P,284S,290,290K," +
                           "290S,290T,290X');");
                  
                  DB.execSQL("INSERT INTO "
                		  + TableName
                		  + " (Field1, Field2)"
                		  + " VALUES ('VIDYANAGAR','3,3B,3C,3H,3K,3T,2V,3D," +                                                                                                                                                                                                                                                                                                         
                            "107V,208C,34,3C/L,3E,31,3JJ,3M,3N,3Y,3Z,6H,6M,16K," +
                            "16T,107J/K,107P,107V/L,107V,107Z/K,113A,136,136S," +
                            "139,236');");	
                          
                  DB.execSQL("INSERT INTO "
                		  + TableName
                		  + " (Field1, Field2)"
                		  + " VALUES('YUSUFGUDA','158V,158Y/P.10R,10Y," +
                            "127Y,158Y,113Y,9C,9Y/G,10H,10U,45G/Y,47C,47F," +
                            "47F,47G,47Y,47C/LE,47S,47Y/G,158,113Y,127Y');");

                  DB.execSQL("INSERT INTO "
                  		+ TableName
                  		+ " (Field1, Field2)"
                  		+ " VALUES ('UPPAL','71A,71B,71,71O,96J,136U,141,18," +                                                                                                                                                                                                                                                                                                         
                            "113E,113C,113K,113M,113S,113Y,115,71D,71Z,10U,18C," +
                            "18B,18M,18T,90R,18/10L,508,90M,90A/107V,90U,90L," +
                            "90D/107V,90M/S,90D/203D,90J,90V,113K,113M,113S," +
                            "113Y,113B/M,115,115B,115N,115Z,115/118,136U,141," +
                            "141G,290,245,245A,245J,245K,90,280,280B,280E,280G," +
                            "280N,280R,283,283K,283P,283T,284G,284P,290,290B," +
                            "290K,290S,290Q,290T');");

                                                
                                                              
                      DB.execSQL("INSERT INTO "
                      		+ TableName
                      		+ " (Field1, Field2)"
                      		+ " VALUES ('SR.NAGAR','78N,78D,9K/227,9M/L," +
                                "102/17H,158F,183,190S,9B,9D,9Z,9R,10F,113A," +
                                "113E,113F,183S,187N,17H/10H,47H,83B,83G,83K,10," +
                                "10Y/F,19K/S,94/1F,113V,187L,225D,225L," +
                                "158B,189C,158/84');");

                     DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('PATANCHERVU','217C,225S,217,217V," +
                              "217X,223S,225V,226,226E,226A,223J,225V/A," +
                              "225,102,225A/D,226A');");
              
                    DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('PARADISE','226,5M,10,10F,10FY,5,5C," +
                              "5K,5L,5P,5P/K,5SD,83P,7C,7I,7M,7V,8D/B,10B/K," +
                              "10F,10H,10K,10K/L,10J,10R,10U,10Y,10Y/F," +
                              "10Y/H,16A/5N,16H/47L,16K/L,16N/49M,22S,37R/K," +
                              "36K,45,45A,45G,45K,45G/Y,45F,45R/F,46,46P," +
                              "47,47C,47F,47G,47H,47K,47L,47Y,47C/LE,47S," +
                              "47Y/G,48,49,49A,49E,49J,49K,49L,49WI,49N,49P," +
                              "49V,49/86,57ST,86/49M,94S,95S,101S,226E," +
                              "227,228A,223,247Y');");
             
                     DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('VANASTALIPURAM','100V,99V,299,299A," +
                              "299H,21W,99H,202T,206,277M,277U,107V,99,201Q," +
                              "202M,204,204K,204N,204S,204P,204V,205,205A,205B" +
                              "205K,205M,208,208C,208R,225L,209,277B,277,277P," +
                              "277W,277Y,290,298,299C,299M,99K,100L');");
                   
                  
                    DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('ZOOPARK','5K,2Z,3H/95A,72,94,95,251A," +
                              "252J,252L,2/95A,73,74,8R/Z,187Z,188,252N,3Z," +
                              "72,95K,95L,95K/L,95L/K,95L.95M,95P,95S,252D');");
                     
                    DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('SANGEETH','5K,10K,8C,18/10L,38A1E,5B/K," +
                              "5BL,5SD,5S/K,7M,8C,47M,49E,49,49P,91E,8D/B,8U," +
                              "10F,10K/L,10U,14P,15,15H,17,17D,29R,37A/L,37S," +
                              "38,38E,38H,36K,36L/C,38T,44L,47K');");
                     
                    DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('SAINIKPURI','5S,3E,3P,16A,16R/K,16T,24E," +
                            "35,24E/31,37,37A/L,37S');");
                    DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('SAROORNAGAR','9J/84S,107H,102D,105S/D," +
                              "107G,108S,131K,176,176S,278,78,84,84S,101B,101K," +
                              "101S,107,107J,107I,107V/S,156P,176B');");
                    
                    
                    DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('RAMOJI FILM CITY-SANGHI','205F,207,209,202,204S,204U,290S');");	

                    DB.execSQL("INSERT INTO "	
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('S.MUSUEM','72M,71Z,72,299C');");	

                    DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('W.COLLEGE','102C,102K/127J,104M," +
                              "107H,253K,16K/L,16/86,22/102,86C,86J,93V,96L," +
                              "99V,100C,100G,100K,100L,100M,102N,00S,100T," +
                              "100V,101B,101K,102A,102B,102H,102R,102C/J," +
                              "102W,102/1,103,104A,104G,104M,104R,105M," +
                              "105S,105G,105S/D,107,107M,107S,107P,107/31," +
                              "107G,108S,109,127N,131K,131S/29,131G,152G," +
                              "156G,100G,299G156K,156L,158Y/L,201G,156B," +
                              "201Q,202T,203,203A,203K,203N,102,204,204K," +
                              "204P,204S,204IW,204U,205,205A,205B,205K,205M," +
                              "208R,217A,225L,227L,251B,253M,254M,277K," +
                              "277M,277N,277U,277W,277Y,293S,298,299,299A," +
                              "158/84,100R,102/17H,107B,131S,207,156/299M," +
                              "16K/N,97B,100A,102K,102M,102P,105SI,171K,201," +
                              "201K,201M,208,216D,299H,299P,299S');");
                    
                        DB.execSQL("INSERT INTO "
                  		  + TableName
                  		  + " (Field1, Field2)"
                  		  + " VALUES('MASABTANK','65G,65T,65V,5K,102K/127J,127J/100V,189E/M,156/299M," +
                  		  "19Y/F,19M,19V/M,49WI,63K,63B,250/49M,65M,65S,65D,66G,6H,122L,153,156,156B,156G," +
                  		  "156P,216U,5K,5L,5G,5M,6S,49M,5R,1S,9M,5G/P,5M/D,5P,5P/K,5S,5S/K,6,6C,6H," +
                  		  "6A,6S,6M,6T,18M,19K/S,49E,49A,63M,63s,65C,65/85,65P,65Z,86/118J,95,97B,98," +
                  		  "100A,113M,113X,113B/M,113I/N,118I,118G,118M,118M/T,119,120M,122,127,127F,127J," +
                  		  "127N,127P,127S,127T,127V,127Z,127J/B,141G,156K,156L,156H,189F,189L,216,217,217A," +
                  		  "229/5,288H,289M,299M');");
                    
                   
                    DB.execSQL("INSERT INTO "
                 	         + TableName
                 	         + " (Field1, Field2)"
                 	         + " VALUES('NANAL NAGAR','92H,118T,120M,123,142K,156T,251,288H,292," +
                 	         "92ER,251B,288B,288D,288N,288V');");               	
                    
                  
                         DB.execSQL("INSERT INTO "
                    		+ TableName
                    		+ " (Field1, Field2)"
                    		+ " VALUES('NAMPALLY','57S,7,7B,7C,7D,9,9K,185C,8C/229,8M,8R,8R/21," +
                    		"8R/25,9F,9M,9X,9Y,127J/100V,253M/8A,156/299M,9M/L,9Y/G,26M,65C,65/85," +
                    		"65G/P,65S,100,100G,100H/7N,100M/R,100A/S,101R,102N,158S,105S,108S,114D," +
                    		"115N,127K,127N,127P,127S,127J/B,141G,153,153M,156,158Y/P,105,176S,183," +
                    		"187L,7H,102,230N/C,272C,9D,9E,9G,9N,9Q,9U,8,8A,8B,8C,8D,8N,8U,8V,20,20P,20N," +
                    		"20V,40N,8C,67L,70/65,8D/B,8S,8U,8V,9C,9V,9J,9Z,11M,11N,20M,20D,38,41K," +
                    		"41N,49P,63M,65M,65G,65T,65V,65Z,84H,87S,94S,96A,100A,98,100K,100L,100M," +
                    		"100R,158,18V,101V,102H,102J,102R,104A,108,108S,100D,114,116D,118H,119," +
                    		"120M,122,127,127F,127J,127W,127Y,135,136,136B,136S,136U,136V,137,137A," +
                    		"137M,139,141,141R,142S,143,143A,143S,152A,152R,156G,156P,156V,156T,158A," +
                    		"158B,158L,158F,158M,158N,158V,158S,158K/L,171C,171K,171M,176,185G,185S," +
                    		"186M,186B,187N,208,217C,225,225A,225C/A,225A/D,225L,225V,229X,228H,293');");

                
                          DB.execSQL("INSERT INTO "
                      		  + TableName
                      		  + " (Field1, Field2)"
                      		  + " VALUES('SAIFABAD','253K,78,78S,78B,250S,293T," +
                      		  "176B,176S,102,217A,225,9K/102,16K/N,22L,22/102," +
                      		  "90M/S,102C/B,102D,102N,102F,102,102C/J,102/3K," +
                      		  "104R,102/17H,102W,104G,104C/J,105M,105S,105G," +
                      		  "105S/D,105D/S,107T,127,131K,131S/29,131S,131G,153," +
                      		  "153M,158,176');");
                      
                     
                        DB.execSQL("INSERT INTO "
                      		  + TableName
                      		  + " (Field1, Field2)"
                      		  + " VALUES('TOLICHOWKI','5GP,16N/49M,65,65M,65S," +
                      		  "216K,261U,1R,5C,5GP,16N/49M,65M" +
                      		  "84/49M,116,116N,123,141G,142NI,142S,156K,21K," +
                      		  "216L,216U,217,217A,217C,118G,142K,216,6');");
                        
                        DB.execSQL("INSERT INTO "
                      		  + TableName
                      		  + " (Field1, Field2)"
                      		  + " VALUES('HIMAYATH NAGAR','113M,225V,250,6,9K/227,40,40E,40N,40I,92H" +
                      		  "94D,94H,94A,95H,113A,113B,113E,113X,113B/M,113I/N,156H,188H,217X');");
                        
                        DB.execSQL("INSERT INTO "
                        		  + TableName
                        		  + " (Field1, Field2)"
                        		  + " VALUES('KONDAPUR','10H/16H,16H/10H,127K,127J,127J/K,10H,147,9J,10H/17H," +
                        		  "17H/10H,47K,47H,127,10,10A/S,30A,33S,185S,11T');");
                        
                        
                  
        } catch(Exception e) {
        	Log.e("Error", "Error", e);
        }
    }
   
    
}