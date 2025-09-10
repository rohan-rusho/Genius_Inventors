package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class EverydayToolsActivity extends AppCompatActivity {

    private AppCompatButton btnShareEverydayTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_everyday_tools);

        btnShareEverydayTools = findViewById(R.id.btnShareEverydayTools);
        if (btnShareEverydayTools != null) {
            btnShareEverydayTools.setOnClickListener(v -> shareEverydayToolsInfo());
        }
    }

    private void shareEverydayToolsInfo() {
        String share =
                "Everyday Tools 🧰\n\n" +
                        "Definition:\n" +
                        "Artifacts that enhance daily productivity, comfort, safety, and communication.\n\n" +
                        "Milestones:\n" +
                        "Levers, forged tools, sanitation, clocks, appliances, calculators, smartphones, wearables, smart homes.\n\n" +
                        "Categories:\n" +
                        "Utility, hygiene, information, illumination, safety, mobility, power.\n\n" +
                        "Shifts:\n" +
                        "Manual → Smart | Single-purpose → Multi-functional | Isolated → Connected ecosystems.\n\n" +
                        "Why They Matter:\n" +
                        "Scale cognition & reduce friction in daily life.\n\n" +
                        "Fun Fact: Modern smartphones consolidate dozens of legacy devices.\n\n" +
                        "Explore Daily Innovation!";
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_TEXT, share);
        startActivity(Intent.createChooser(send, "Share Everyday Tools Insights"));
    }
}