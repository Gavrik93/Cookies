package android.example.cookies;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView afterCookieView = findViewById(R.id.android_cookie_image_view);
        afterCookieView.setImageResource(R.drawable.after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView afterCookieTextView = findViewById(R.id.status_text_view);
        afterCookieTextView.setText("Im so full");
    }

    public  void resetCookie(View view) {
        //change to default ImageView in the layout before_cookie.jpg
        ImageView beforeCookieView = findViewById(R.id.android_cookie_image_view);
        beforeCookieView.setImageResource(R.drawable.before_cookie);

        //change to default TextView in the layout
        TextView beforeCookieTextView = findViewById(R.id.status_text_view);
        beforeCookieTextView.setText("I'm so hungry");
    }
}