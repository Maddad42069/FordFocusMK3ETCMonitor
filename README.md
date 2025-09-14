# Ford Focus MK3 ETC Health Monitor Torque Plugin

This plugin provides advanced monitoring, logging, and alerting for the Electronic Throttle Control (ETC) system on Ford Focus MK3 vehicles via the Torque app.

## Features

- **Live ETC sensor dashboard:** Throttle position, pedal position, Ford-specific ETC status and error codes.
- **Ford Focus MK3 extended PIDs:** No manual CSV import needed.
- **Automatic logging:** All ETC sensor and fault events saved to CSV.
- **Notifications:** Real-time alerts for ETC faults and abnormal readings.
- **Export logs:** Email or share log files directly from the plugin.
- **Fault explanations:** Ford ETC error codes mapped to readable descriptions.
- **User settings:** Configure thresholds, logging frequency, dark mode, and more.
- **Vehicle compatibility:** Warns if your vehicle does not support Ford Focus MK3 ETC PIDs.

## Setup

1. Open the project in Android Studio.
2. Build and install the APK.
3. Open Torque; the plugin auto-registers Ford Focus MK3 ETC PIDs.
4. Add ETC sensors to your dashboard or use the plugin dashboard.
5. Configure settings as desired.

## Ford Focus MK3 ETC PIDs

- Throttle Position (0111)
- Accelerator Pedal Position (0149)
- ETC Status (221337, 7E0)
- ETC Fault Code (221338, 7E0)
- ETC Motor Position (22133A, 7E0)
- ETC Sensor 1 (22133B, 7E0)
- ETC Sensor 2 (22133C, 7E0)
- ETC Error History (22133D, 7E0)
- ETC Control Signals (22133E, 7E0)

## Disclaimer

Use at your own risk. Incorrect PID queries can cause unintended ECU behavior. Confirm Ford-specific PIDs for your Focus MK3 using FORScan or service documentation.
