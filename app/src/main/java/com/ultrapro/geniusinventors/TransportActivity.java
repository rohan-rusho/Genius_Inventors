package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

/**
 * Detail screen for Transport category.
 * Uses layout: activity_transport.xml
 * Share button id: btnShareTransport
 */
public class TransportActivity extends AppCompatActivity {

    private AppCompatButton btnShareTransport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        btnShareTransport = findViewById(R.id.btnShareTransport);
        if (btnShareTransport != null) {
            btnShareTransport.setOnClickListener(v -> shareTransportInfo());
        }
    }

    private void shareTransportInfo() {
        String shareText =
                "Transport 🚀\n\n" +
                        "Definition:\n" +
                        "Innovation that moves people, goods, energy & supporting infrastructure across " +
                        "land, sea, air & emerging orbital / near‑vacuum corridors—reducing friction, time & cost.\n\n" +
                        "Key Milestones:\n" +
                        "• Wheel & Axle\n" +
                        "• Sailing ships & global navigation\n" +
                        "• Canals & engineered waterways\n" +
                        "• Steam locomotive (industrial logistics)\n" +
                        "• Internal combustion automobile\n" +
                        "• Pneumatic tires + paved roads\n" +
                        "• Fixed‑wing aviation\n" +
                        "• Jet propulsion (long-range efficiency)\n" +
                        "• Containerization (standardized freight)\n" +
                        "• High-speed rail corridors\n" +
                        "• Orbital rocketry\n" +
                        "• Electric vehicles & battery ecosystems\n\n" +
                        "Core Systems:\n" +
                        "Propulsion, energy storage, guidance & control (avionics, inertial nav, GPS), " +
                        "aero/hydrodynamics, advanced materials, logistics networks, scheduling algorithms, " +
                        "safety signaling, emissions mitigation.\n\n" +
                        "Transformative Shifts:\n" +
                        "Animal → Mechanical → Electric | Coal → Oil → Hybrid → Renewables | " +
                        "Manual control → Fly‑by‑wire → Autonomy | Paper manifests → Real‑time tracking | " +
                        "Single‑mode → Intermodal | Human pilots → Assisted & remote | High emissions → Low‑carbon.\n\n" +
                        "Why It Matters:\n" +
                        "Shapes supply chain resilience, food distribution, medical access, economic geography, " +
                        "tourism, evacuation capability & innovation velocity.\n\n" +
                        "Fun Facts:\n" +
                        "• Containerization cut shipping costs ~90%.\n" +
                        "• Wide-body jets cruise near 900 km/h at ~11 km altitude.\n" +
                        "• A single ultra-large container ship can carry >20,000 TEU.\n" +
                        "• Reusable rockets are redefining launch economics.\n\n" +
                        "Explore Mobility Systems!";
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(send, "Share Transport Innovations"));
    }
}