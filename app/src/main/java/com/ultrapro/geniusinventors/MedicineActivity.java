package com.ultrapro.geniusinventors;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MedicineActivity extends AppCompatActivity {

    private AppCompatButton btnShareMedicine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        btnShareMedicine = findViewById(R.id.btnShareMedicine);
        if (btnShareMedicine != null) {
            btnShareMedicine.setOnClickListener(v -> shareMedicineInfo());
        }
    }

    private void shareMedicineInfo() {
        String share =
                "Medicine 🩺\n\n" +
                        "Definition:\n" +
                        "Science & practice preventing, diagnosing, and treating disease; merging biology, technology, and data.\n\n" +
                        "Milestones:\n" +
                        "Germ theory, vaccines, anesthesia, antibiotics, DNA, imaging, transplants, PCR, monoclonals, mRNA, CRISPR.\n\n" +
                        "Core Tech:\n" +
                        "Diagnostics, gene editing, bioinformatics, robotics, wearables, regenerative and precision medicine.\n\n" +
                        "Shifts:\n" +
                        "Symptom → Mechanism | Acute → Preventive | Population → Personalized | Invasive → Minimally invasive.\n\n" +
                        "Why It Matters:\n" +
                        "Extends healthy life & resilience; powers biotech innovation.\n\n" +
                        "Fun Fact: Lifespan has roughly doubled in ~150 years.\n\n" +
                        "Explore Health Innovation!";
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("text/plain");
        send.putExtra(Intent.EXTRA_TEXT, share);
        startActivity(Intent.createChooser(send, "Share Medicine Insights"));
    }
}