package com.if17upnjatim.tifatulas3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.gambar1, R.drawable.gambar2, R.drawable.gambar3, R.drawable.gambar4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        Button btnLihat = (Button) findViewById(R.id.prodi);
        btnLihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cara1
                //Intent 1 = view Intent (MainActivity.this, MainActivity.class);
                //startActivity(1);
                //Cara 2
                startActivity(new Intent(MainActivity.this,ProdiActivity.class));
            }
        });

        Button btnLihatDosen = (Button) findViewById(R.id.dosen);
        btnLihatDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cara1
                //Intent 1 = view Intent (MainActivity.this, MainActivity.class);
                //startActivity(1);
                //Cara 2
                startActivity(new Intent(MainActivity.this,DosenActivity.class));
            }
        });

        Button btnLihatMhs = (Button) findViewById(R.id.mhs);
        btnLihatMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cara1
                //Intent 1 = view Intent (MainActivity.this, MainActivity.class);
                //startActivity(1);
                //Cara 2
                startActivity(new Intent(MainActivity.this,MhsActivity.class));
            }
        });
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.openinbrowser,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.openBrowser:
                Intent browserIntent = new Intent(MainActivity.this,webview.class);

                startActivity(browserIntent);

                return true;

        }
        return false;
    }
}
