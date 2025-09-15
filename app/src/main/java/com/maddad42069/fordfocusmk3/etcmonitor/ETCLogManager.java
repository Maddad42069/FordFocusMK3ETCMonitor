package com.maddad42069.fordfocusmk3.etcmonitor;

import android.content.Context;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ETCLogManager {
    private static String logFilePath = "/sdcard/ETCMonitorLog.csv";
    public static void logData(Date timestamp, float throttlePos, float pedalPos, int etcStatus, int etcFault) {
        try (FileWriter writer = new FileWriter(logFilePath, true)) {
            writer.write(String.format("%s,%f,%f,%d,%d\n", timestamp, throttlePos, pedalPos, etcStatus, etcFault));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getLogFilePath() {
        return logFilePath;
    }
}