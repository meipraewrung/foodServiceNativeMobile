package com.praewrung.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class RestaurantHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_home);
    }

    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void ResListClick(View view) {
        Button reslis = (Button)findViewById(R.id.reslistbtn);
        reslis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("RestaurantHome", "RestaurantList");
                Intent resL = new Intent(RestaurantHome.this,RestaurantList.class);
                startActivity(resL);
            }
        });
    }
}
