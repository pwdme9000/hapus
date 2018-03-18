package com.pwdme9000.hapus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtLaunchActivity;
    private Button mBtLaunchActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtLaunchActivity = (Button) findViewById(R.id.bt_launch_activity);

        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity();
            }
        });
        //Ini adalah batas dari tombol pertama
        mBtLaunchActivity2 = (Button) findViewById(R.id.bt_launch_activity2);

        mBtLaunchActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                launchActivity2();
            }
        });
    }
    //Menjalankan untuk pindah ke activity lapor
    private void launchActivity() {

        Intent intent = new Intent(this, Lapor.class);
        startActivity(intent);
    }
    private void launchActivity2() {

        Intent intent = new Intent(this, Berita.class);
        startActivity(intent);
    }
}
