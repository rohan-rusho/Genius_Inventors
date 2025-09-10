package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final String APP_NAME = "Genius Inventors";
    private TextView appNameText;
    private ImageView logoImage;
    private int textIndex = 0;
    private Handler handler = new Handler();
    private boolean typingStarted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        appNameText = findViewById(R.id.appNameText);
        logoImage = findViewById(R.id.logoImage);

        // Logo fade-in & scale-up animation
        AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(500);
        fadeIn.setFillAfter(true);

        ScaleAnimation scaleUp = new ScaleAnimation(
                0.7f, 1f, 0.7f, 1f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
        scaleUp.setDuration(500);
        scaleUp.setFillAfter(true);

        logoImage.startAnimation(fadeIn);
        logoImage.startAnimation(scaleUp);

        // Chain: Start typing animation after logo animation ends
        handler.postDelayed(() -> startTypingAnimation(), 500);

        // Proceed to MainActivity after typing + fade-in
        handler.postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 2000 + APP_NAME.length() * 80);
    }

    private void startTypingAnimation() {
        if (!typingStarted) {
            typingStarted = true;
            handler.postDelayed(typingRunnable, 120);
        }
    }

    private Runnable typingRunnable = new Runnable() {
        @Override
        public void run() {
            if (textIndex <= APP_NAME.length()) {
                appNameText.setText(APP_NAME.substring(0, textIndex));
                textIndex++;
                handler.postDelayed(this, 80);
            } else {
                // Fade in the full text at the end of typing
                AlphaAnimation fadeInText = new AlphaAnimation(0f, 1f);
                fadeInText.setDuration(400);
                fadeInText.setFillAfter(true);
                appNameText.startAnimation(fadeInText);
            }
        }
    };
}