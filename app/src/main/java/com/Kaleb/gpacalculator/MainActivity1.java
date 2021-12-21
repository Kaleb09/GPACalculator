package com.Kaleb.gpacalculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.material.navigation.NavigationView;

public class MainActivity1 extends AppCompatActivity  implements
        AdapterView.OnItemSelectedListener{
    private RewardedAd mRewardedAd;
    private final String TAG = "MainActivity1";
    String[] grade = {"","A+", "A", "A-", "B+", "B", "B-","C+","C","C-","D","F","fx"};
    String[] ects={"0","1","2","3","4","5","6","7","8","9","10","11"};
    Spinner spinere,spinerg,spinere1,spinerg1,spinere2,spinerg2,spinere3,spinerg3,spinere4,spinerg4,spinere5,spinerg5,spinere6,spinerg6,spinere7,spinerg7;
    EditText ectss,gpa;
    TextView re0,re1,re2,re3,re4,re5,re6,re7,totg,totect,totgpa,comgpa;
    Calculater cal;
    String s0="",s1="",s2="",s3="",s4="",s5="",s6="",s7="",sg0="",sg1="",sg2="",sg3="",sg4="",sg5="",sg6="",sg7="";
    double rr0=1,rr1=1,rr2=1,rr3=1,rr4=1,rr5=1,rr6=1,rr7=1,totgr=1,totects=1,tottgp=1,totcom=1;
    Button butt;
    private AdView mAdView;
    AdRequest adRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adview);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                mAdView.loadAd(adRequest);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });
      /*  butt=findViewById(R.id.button4);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
     /*   FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Kaleb", Snackbar.LENGTH_LONG)
                        .setAction("Kaleb", null).show();
            }
        });*/
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,grade);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter bb = new ArrayAdapter(this,android.R.layout.simple_spinner_item, ects);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinere = findViewById(R.id.spinnere);
        spinere.setOnItemSelectedListener(this);
        spinere.setAdapter(bb);
        spinerg= findViewById(R.id.spinnerg);
        spinerg.setOnItemSelectedListener(this);
        spinerg.setAdapter(aa);
        spinere1= findViewById(R.id.spinnere1);
        spinere1.setOnItemSelectedListener(this);
        spinere1.setAdapter(bb);
        spinerg1= findViewById(R.id.spinnerg1);
        spinerg1.setOnItemSelectedListener(this);
        spinerg1.setAdapter(aa);
        spinere2= findViewById(R.id.spinnere2);
        spinere2.setOnItemSelectedListener(this);
        spinere2.setAdapter(bb);
        spinerg2= findViewById(R.id.spinnerg2);
        spinerg2.setOnItemSelectedListener(this);
        spinerg2.setAdapter(aa);
        spinere3= findViewById(R.id.spinnere3);
        spinere3.setOnItemSelectedListener(this);
        spinere3.setAdapter(bb);
        spinerg3= findViewById(R.id.spinnerg3);
        spinerg3.setOnItemSelectedListener(this);
        spinerg3.setAdapter(aa);
        spinere4= findViewById(R.id.spinnere4);
        spinere4.setOnItemSelectedListener(this);
        spinere4.setAdapter(bb);
        spinerg4= findViewById(R.id.spinnerg4);
        spinerg4.setOnItemSelectedListener(this);
        spinerg4.setAdapter(aa);
        spinere5= findViewById(R.id.spinnere5);
        spinere5.setOnItemSelectedListener(this);
        spinere5.setAdapter(bb);
        spinerg5= findViewById(R.id.spinnerg5);
        spinerg5.setOnItemSelectedListener(this);
        spinerg5.setAdapter(aa);
        spinere6= findViewById(R.id.spinnere6);
        spinere6.setOnItemSelectedListener(this);
        spinere6.setAdapter(bb);
        spinerg6= findViewById(R.id.spinnerg6);
        spinerg6.setOnItemSelectedListener(this);
        spinerg6.setAdapter(aa);
        spinere7= findViewById(R.id.spinnere7);
        spinere7.setOnItemSelectedListener(this);
        spinere7.setAdapter(bb);
        spinerg7= findViewById(R.id.spinnerg7);
        spinerg7.setOnItemSelectedListener(this);
        spinerg7.setAdapter(aa);
        s0=spinere.getSelectedItem().toString();
        sg0=spinerg.getSelectedItem().toString();
        s1=spinere1.getSelectedItem().toString();
        sg1=spinerg1.getSelectedItem().toString();
        s2=spinere2.getSelectedItem().toString();
        sg2=spinerg2.getSelectedItem().toString();
        s3=spinere3.getSelectedItem().toString();
        sg3=spinerg3.getSelectedItem().toString();
        s4=spinere4.getSelectedItem().toString();
        sg4=spinerg4.getSelectedItem().toString();
        s5=spinere5.getSelectedItem().toString();
        sg5=spinerg5.getSelectedItem().toString();
        s6=spinere6.getSelectedItem().toString();
        sg6=spinerg6.getSelectedItem().toString();
        s7=spinere7.getSelectedItem().toString();
        sg7=spinerg7.getSelectedItem().toString();
        ectss=findViewById(R.id.editTextects);
        gpa=findViewById(R.id.editTextgpa);
        re0=findViewById(R.id.textViewr0);
        re1=findViewById(R.id.textViewr1);
        re2=findViewById(R.id.textViewr2);
        re3=findViewById(R.id.textViewr3);
        re4=findViewById(R.id.textViewr4);
        re5=findViewById(R.id.textViewr5);
        re6=findViewById(R.id.textViewr6);
        re7=findViewById(R.id.textViewr7);
        totg=findViewById(R.id.textViewgrade);
        totect=findViewById(R.id.textViewects);
        totgpa=findViewById(R.id.textViewgpa);
        comgpa=findViewById(R.id.textViewcommu);
        cal=new Calculater();
    }
    public void Gpa(View view){

        s0=spinere.getSelectedItem().toString();
        sg0=spinerg.getSelectedItem().toString();
        s1=spinere1.getSelectedItem().toString();
        sg1=spinerg1.getSelectedItem().toString();
        s2=spinere2.getSelectedItem().toString();
        sg2=spinerg2.getSelectedItem().toString();
        s3=spinere3.getSelectedItem().toString();
        sg3=spinerg3.getSelectedItem().toString();
        s4=spinere4.getSelectedItem().toString();
        sg4=spinerg4.getSelectedItem().toString();
        s5=spinere5.getSelectedItem().toString();
        sg5=spinerg5.getSelectedItem().toString();
        s6=spinere6.getSelectedItem().toString();
        sg6=spinerg6.getSelectedItem().toString();
        s7=spinere7.getSelectedItem().toString();
        sg7=spinerg7.getSelectedItem().toString();
        rr0=cal.result(cal.Change(sg0),cal.ToDo(s0));rr1=cal.result(cal.Change(sg1),cal.ToDo(s1));
        rr2=cal.result(cal.Change(sg2),cal.ToDo(s2));rr3=cal.result(cal.Change(sg3),cal.ToDo(s3));
        rr4=cal.result(cal.Change(sg4),cal.ToDo(s4));  rr5=cal.result(cal.Change(sg5),cal.ToDo(s5));
        rr6=cal.result(cal.Change(sg6),cal.ToDo(s6)); rr7=cal.result(cal.Change(sg7),cal.ToDo(s7));
        totgr=cal.totgrade(rr0,rr1,rr2,rr3,rr4,rr5,rr6,rr7);
        totects=cal.totgrade(cal.ToDo(s0),cal.ToDo(s1),cal.ToDo(s2),cal.ToDo(s3),cal.ToDo(s4),cal.ToDo(s5),cal.ToDo(s6),cal.ToDo(s7));
        tottgp=cal.gpa(totgr,totects);
        re0.setText(cal.Tostr(rr0));re1.setText(cal.Tostr(rr1));re2.setText(cal.Tostr(rr2));
        re3.setText(cal.Tostr(rr3));re4.setText(cal.Tostr(rr4));re5.setText(cal.Tostr(rr5));
        re6.setText(cal.Tostr(rr6));re7.setText(cal.Tostr(rr7));
        totg.setText(cal.Tostr(totgr));totect.setText(cal.Tostr(totects));totgpa.setText(cal.Tostr(tottgp));
        Toast.makeText(MainActivity1.this, "you have "+cal.Tostr(tottgp)+" gpa", Toast.LENGTH_SHORT).show();
    }
    public void button (View view){
        mAdView.loadAd(adRequest);
    }
    public void ComGpa(View view){if(TextUtils.isEmpty(gpa.getText().toString())||TextUtils.isEmpty(ectss.getText().toString())){
        Toast.makeText(MainActivity1.this, "enter the previous ects and gpa", Toast.LENGTH_SHORT).show();
    }else{
        totcom=cal.Comgpa(cal.ToDo(gpa.getText().toString()),cal.ToDo(ectss.getText().toString()),totgr,totects);
        comgpa.setText(cal.Tostr(totcom));}
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}