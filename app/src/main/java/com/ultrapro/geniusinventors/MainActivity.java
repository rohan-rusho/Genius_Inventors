package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {

    private void setCardClick(int cardId, Class<?> target) {
        View card = findViewById(cardId);
        if (card != null) {
            card.setOnClickListener(v ->
                    startActivity(new Intent(MainActivity.this, target))
            );
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure your XML file is named activity_main.xml

        // Attach listeners to each card
        setCardClick(R.id.cardCommunication, CommunicationActivity.class);
        setCardClick(R.id.cardTransport, TransportActivity.class);
        setCardClick(R.id.cardMedicine, MedicineActivity.class);
        setCardClick(R.id.cardEnergy, EnergyActivity.class);
        setCardClick(R.id.cardComputing, ComputingActivity.class);
        setCardClick(R.id.cardTools, EverydayToolsActivity.class);
    }
}