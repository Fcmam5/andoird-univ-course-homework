package com.example.fcmam5.counter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    Button btn1;
    Button btn10;
    Button btn100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.onePlus);
        btn10 = (Button) findViewById(R.id.tenPlus);
        btn100 = (Button) findViewById(R.id.hunderdPlus);

        btn1.setOnLongClickListener(this);
        btn10.setOnLongClickListener(this);
        btn100.setOnLongClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.quitBtn:
                finish();
                break;

            case R.id.resetBtn:
                TextView txtF =(TextView)findViewById(R.id.result);
                txtF.setText("0");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void addOne(View view) {
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(String.valueOf(Integer.parseInt((String) textView.getText())+1));
    }

    public void addTen(View view) {
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(String.valueOf(Integer.parseInt((String) textView.getText())+10));
    }

    public void addHundred(View view) {
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(String.valueOf(Integer.parseInt((String) textView.getText())+100));
    }

    @Override
    public boolean onLongClick(View v) {
        this.openOptionsMenu();
        return false;
    }
}
