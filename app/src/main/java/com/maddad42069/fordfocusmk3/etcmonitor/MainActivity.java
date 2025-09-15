package com.maddad42069.fordfocusmk3.etcmonitor;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start ETC monitoring service
        startService(new Intent(this, ETCMonitorService.class));

        Toast.makeText(this, "ETC Monitor started. Ford Focus MK3 PIDs loaded.", Toast.LENGTH_LONG).show();

        Button exportLog = findViewById(R.id.export_log);
        exportLog.setOnClickListener(v -> {
            // TODO: Implement log export (email/share)
            Toast.makeText(this, "Log export coming soon!", Toast.LENGTH_SHORT).show();
        });

        Button settings = findViewById(R.id.settings);
        settings.setOnClickListener(v -> {
            // TODO: Open settings activity
            Toast.makeText(this, "Settings coming soon!", Toast.LENGTH_SHORT).show();
        });
    }
}