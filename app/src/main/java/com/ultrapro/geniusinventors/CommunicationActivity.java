package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

/**
 * Detail screen for Communication category.
 * Uses layout: activity_communication.xml
 * Share button id: btnShareCommunication
 */
public class CommunicationActivity extends AppCompatActivity {

    private AppCompatButton btnShareCommunication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

        btnShareCommunication = findViewById(R.id.btnShareCommunication);
        if (btnShareCommunication != null) {
            btnShareCommunication.setOnClickListener(v -> shareCommunicationInfo());
        }
    }

    private void shareCommunicationInfo() {
        String shareText =
                "Communication 📡\n\n" +
                        "Definition:\n" +
                        "Encoding, transmitting, receiving & interpreting information across distance & time—" +
                        "from oral tradition & script → telegraph → telephone → radio → television → " +
                        "internet → fiber optics → satellites → real‑time global networks.\n\n" +
                        "Key Milestones:\n" +
                        "• Writing systems (knowledge persistence)\n" +
                        "• Postal routes (organized logistics)\n" +
                        "• Optical telegraph (semaphore relays)\n" +
                        "• Electric telegraph & Morse code\n" +
                        "• Telephone (real-time voice)\n" +
                        "• Radio broadcasting\n" +
                        "• Television (audio + moving images)\n" +
                        "• Internet (packet-switched data)\n" +
                        "• Mobile networks (ubiquitous access)\n" +
                        "• Fiber optics (light-speed bandwidth)\n" +
                        "• Satellites (global coverage & timing)\n" +
                        "• Social platforms (networked graphs)\n\n" +
                        "Core Technologies:\n" +
                        "Modulation, routing, multiplexing, compression, error correction, encryption, " +
                        "spectrum allocation, protocol stacks, synchronization, edge caching.\n\n" +
                        "Transformative Shifts:\n" +
                        "Analog → Digital | Point-to-point → Mesh | Broadcast → Interactive | " +
                        "Passive → Participatory | Physical media → Cloud | Manual switching → SDN | " +
                        "Static pages → Real-time streams | Human moderation → AI-assisted filtering.\n\n" +
                        "Why It Matters:\n" +
                        "Enables science collaboration, disaster response, trade efficiency, education, " +
                        "democracy, cultural diffusion, remote work, telemedicine & planetary coordination.\n\n" +
                        "Fun Facts:\n" +
                        "• Undersea fiber cables carry >95% of international data.\n" +
                        "• A single modern submarine cable can exceed 400 Tbps design capacity.\n" +
                        "• Low Earth orbit constellations can push intercontinental latency toward ~30–40 ms.\n\n" +
                        "Explore Global Networks!";
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(send, "Share Communication Insights"));
    }
}