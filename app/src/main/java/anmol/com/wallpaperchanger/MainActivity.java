package anmol.com.wallpaperchanger;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private WallpaperManager wallpaperManager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wallpaperManager = WallpaperManager.getInstance(this);

    }
    public void changeWallpaper(View view){
        try{

            switch (view.getId()){
                case R.id.Blue:
                    Bitmap blueImage = BitmapFactory.decodeResource(getResources(),R.drawable.blue);
                    wallpaperManager.setBitmap(blueImage);
                    Toast.makeText(this,"Blue Set" ,Toast.LENGTH_LONG).show();
                    break;

                case R.id.Green:
                    Bitmap greenImage = BitmapFactory.decodeResource(getResources(),R.drawable.green);
                    Bitmap scaledgreen  = Bitmap.createScaledBitmap(greenImage,greenImage.getWidth()/2,greenImage.getHeight()/2,true);
                    wallpaperManager.setBitmap(scaledgreen);
                    Toast.makeText(this,"Green Set", Toast.LENGTH_LONG).show();
                    break;

                case R.id.Orange:
                    Bitmap orangeImage = BitmapFactory.decodeResource(getResources(),R.drawable.orange);
                    Bitmap scaledOrange  = Bitmap.createScaledBitmap(orangeImage,orangeImage.getWidth()/3,orangeImage.getHeight()/3,true);

                    wallpaperManager.setBitmap(orangeImage);
                    Toast.makeText(this,"Orange Set", Toast.LENGTH_LONG).show();
                    break;

                case R.id.Clear:
                    //Bitmap blueImage = BitmapFactory.decodeResource(getResources(),R.drawable.blue);
                    wallpaperManager.clear();
                    Toast.makeText(this,"Clear Set", Toast.LENGTH_LONG).show();
                    break;
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
