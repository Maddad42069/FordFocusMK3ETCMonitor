package com.maddad42069.fordfocusmk3.etcmonitor;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class ETCMonitorService extends Service {
    private static final String CHANNEL_ID = "ETCMonitorChannel";

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "ETC Monitor", NotificationManager.IMPORTANCE_LOW);
            getSystemService(NotificationManager.class).createNotificationChannel(channel);
            Notification notification = new Notification.Builder(this, CHANNEL_ID)
                .setContentTitle("ETC Monitor Running")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();
            startForeground(1, notification);
        }
        FordETCPIDManager.registerPIDs(this);
        // TODO: Start periodic PID polling, logging, and alerting
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO: Main loop for polling ETC PIDs, logging, notifications
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // TODO: Clean up
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}