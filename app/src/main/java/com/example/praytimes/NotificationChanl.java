package com.example.praytimes;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.WallpaperInfo;
import android.content.Context;
import android.net.Uri;

public class NotificationChanl extends Application {
public static final String Channel_id=("channel");
Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        CreateNotificationChannel();
    }

    private void CreateNotificationChannel() {
        CharSequence name;
        NotificationChannel channel=new NotificationChannel(
                Channel_id,
                "channel",
                NotificationManager.IMPORTANCE_HIGH
        );
        channel.enableVibration(true);
        channel.setDescription("thisis my first notification channel");
NotificationManager manager=getSystemService(NotificationManager.class);
manager.createNotificationChannel(channel);
    channel.enableVibration(true);

    }


}
