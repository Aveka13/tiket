 package com.example.cunema;

import static androidx.core.app.NotificationCompat.PRIORITY_HIGH;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

 public class MainActivity extends AppCompatActivity {
private ImageView ImageView_1;
private TextView TextView1;
private ImageView ImageView_2;
private TextView TextView2;
private ImageView ImageView_3;
private TextView TextView3;

private Button Button;

private static final int NOTIFY_ID=101;
private static final String CHANNEL_ID="push channel";
     private NotificationManager NotificationManager;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView_1 = (ImageView) findViewById(R.id.imageView1);
        TextView1 = (TextView) this.findViewById(R.id.textView);
        TextView1.setSelected(true);
        ImageView_2 = (ImageView) findViewById(R.id.imageView2);
        TextView2 = (TextView) this.findViewById(R.id.textView2);
        TextView2.setSelected(true);
        ImageView_3 = (ImageView) findViewById(R.id.imageView3);
        TextView3 = (TextView) this.findViewById(R.id.textView3);
        TextView3.setSelected(true);
        Button = (Button) this.findViewById(R.id.button);
        Button.setSelected(true);

        NotificationManager = (NotificationManager)getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                PendingIntent pendingIntent=PendingIntent.getActivity(getApplicationContext(), 0,intent,PendingIntent.FLAG_UPDATE_CURRENT);

                NotificationCompat.Builder builder =
                        new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
                        .setAutoCancel(false)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setWhen(System.currentTimeMillis())
                        .setContentIntent(pendingIntent)
                        .setContentTitle("Напоменания")
                        .setContentText("Пора смотреть фильм")
                        .setPriority(PRIORITY_HIGH);

                creidc(NotificationManager);
                NotificationManager.notify(NOTIFY_ID, builder.build());
            }
        });

        Picasso.with(this).load("https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/731c4031-7389-44f4-8c15-f9f4e3b0ed90/300x450").fit().centerCrop().into(ImageView_1);
        Picasso.with(this).load("https://avatars.mds.yandex.net/get-kinopoisk-image/6201401/e091e668-b8a3-416d-a6ea-25c1a17b781a/300x450").fit().centerCrop().into(ImageView_2);
        Picasso.with(this).load("https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/8ca41e88-2a7d-4775-94c8-608131508623/300x450").fit().centerCrop().into(ImageView_3);
    }

    public static void creidc(NotificationManager manager){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID,CHANNEL_ID, android.app.NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }
    }

    public void goweb1(View view){
        Intent intent = new Intent(this,MainActivity1.class);
        startActivity(intent);
    }


     public void goweb2(View view){
         Intent intent = new Intent(this,MainActivity2.class);
         startActivity(intent);
     }

     public void goweb3(View view){
         Intent intent = new Intent(this,MainActivity3.class);
         startActivity(intent);
     }
 }