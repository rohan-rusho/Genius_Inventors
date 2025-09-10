package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class ComputingActivity extends AppCompatActivity {

    private AppCompatButton btnShareComputing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computing);

        btnShareComputing = findViewById(R.id.btnShareComputing);
        if (btnShareComputing != null) {
            btnShareComputing.setOnClickListener(v -> shareComputingInfo());
        }
    }

    private void shareComputingInfo() {
        String share =
                "Computing 💻\n\n" +
                        "Definition:\n" +
                        "Programmable transformation of information from mechanical origins to AI & quantum prototypes.\n\n" +
                        "Milestones:\n" +
                        "Transistors, microprocessors, OS, Internet, mobile, cloud, GPUs, ML, quantum.\n\n" +
                        "Core Tech:\n" +
                        "Architectures, memory hierarchies, networks, virtualization, cryptography, accelerators.\n\n" +
                        "Shifts:\n" +
                        "Batch → Interactive → Cloud → Edge | Monolith → Microservices → Serverless | CPU → Heterogeneous.\n\n" +
                        "Why It Matters:\n" +
                        "Enables automation, research, global communication, AI progress.\n\n" +
                        "Fun Fact: Transistor counts reached tens of billions on a single die.\n\n" +
                        "Explore Digital Evolution!";
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_TEXT, share);
        startActivity(Intent.createChooser(send, "Share Computing Insights"));
    }
}