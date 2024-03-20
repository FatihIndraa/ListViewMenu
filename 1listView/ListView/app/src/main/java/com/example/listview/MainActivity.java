package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity { String[]
        listArray={"asus", "motorola", "apple", "toshiba"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.activity_listview, listArray);
        ListView listView = (ListView) findViewById(R.id.array_list);
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelection(MenuItem item) {
        if (item.getItemId()==R.id.about) {
            startActivity(new Intent(this,AboutActivity.class));
        }else if (item.getItemId()==R.id.setting) {
            startActivity(new Intent(this,SettingActivity.class));
        } else if (item.getItemId()==R.id.help) {
            startActivity(new Intent(this,HelpActivity.class));
        } return true;

    }
}