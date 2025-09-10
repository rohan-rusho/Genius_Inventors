package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class EnergyActivity extends AppCompatActivity {

    private AppCompatButton btnShareEnergy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);

        btnShareEnergy = findViewById(R.id.btnShareEnergy);
        if (btnShareEnergy != null) {
            btnShareEnergy.setOnClickListener(v -> shareEnergyInfo());
        }
    }

    private void shareEnergyInfo() {
        String share =
                "Energy ⚡\n\n" +
                        "Definition:\n" +
                        "Capturing, converting, storing & distributing power to drive civilization.\n\n" +
                        "Milestones:\n" +
                        "Fire, mills, steam engines, grids, fission, photovoltaics, batteries, smart grids, fusion experiments.\n\n" +
                        "Core Tech:\n" +
                        "Turbines, photovoltaics, storage, power electronics, hydrogen, CCS, smart sensors.\n\n" +
                        "Shifts:\n" +
                        "Biomass → Fossil → Renewable mix | Central → Distributed | Carbon heavy → Low carbon.\n\n" +
                        "Why It Matters:\n" +
                        "Enables economic growth & climate transition.\n\n" +
                        "Fun Fact: Solar flux vastly exceeds global demand.\n\n" +
                        "Explore Power Systems!";
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_TEXT, share);
        startActivity(Intent.createChooser(send, "Share Energy Insights"));
    }
}