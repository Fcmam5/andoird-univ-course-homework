package com.example.fcmam5.fruitscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton pommeID;
    RadioButton poireID;
    RadioGroup radioGroup;
    TextView countPomme;
    TextView countPineapple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pommeID = (RadioButton) findViewById(R.id.radioButton);
        poireID = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        countPomme = (TextView) findViewById(R.id.applzCount);
        countPineapple = (TextView) findViewById(R.id.pineapplzCount);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.nbPoir:
                Toast.makeText(this,countPineapple.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.ngPommes:
                Toast.makeText(this,countPomme.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.quiting:
                finish();
                break;
        }
        return true;
    }

    public void countIt(View view) {
        if (poireID.isChecked()){
            countPineapple.setText((Integer.parseInt(countPineapple.getText().toString())+1)+"");
        }else {
            countPomme.setText((Integer.parseInt(countPomme.getText().toString())+1)+"");

        }
    }

}
