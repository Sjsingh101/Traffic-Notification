package com.sjsingh101.trafficnotification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;


    public class Notification extends Application {
        public static final String CHANNEL1_ID="channel1";

        @Override
        public void onCreate() {
            super.onCreate();

            createNotificationChannels();
        }

        private void createNotificationChannels() {
            if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
            {
                NotificationChannel channel1=new NotificationChannel(
                        CHANNEL1_ID,
                        "Channel1",
                        NotificationManager.IMPORTANCE_HIGH);


                channel1.setDescription("This is channel 1");//Here we put whatever description user can see
            }
        }
    }

