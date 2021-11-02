package com.example.intentpractice;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class ClickListeners implements View.OnClickListener {

    AppCompatActivity activity;

    public ClickListeners(AppCompatActivity activity) {
        this.activity = activity;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAlarm) {
            Intent intent = new Intent(activity, AlarmActivity.class);
            activity.startActivity(intent);
        } else if (v.getId() == R.id.btnPicture) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            }
        } else if (v.getId() == R.id.btnCall) {
            Intent intent = new Intent(activity, AlarmActivity.class);
            activity.startActivity(intent);
        } else if (v.getId() == R.id.btnMessage) {
            Intent intent = new Intent(activity, AlarmActivity.class);
            activity.startActivity(intent);
        } else if (v.getId() == R.id.btnRepo) {
            Intent intent = new Intent(activity, AlarmActivity.class);
            activity.startActivity(intent);
        } else if(v.getId() == R.id.btnAddAlarm){
            int hours = ((AlarmActivity)activity).timePicker.getHour();
            int minutes = ((AlarmActivity)activity).timePicker.getMinute();
            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                    .putExtra(AlarmClock.EXTRA_HOUR, hours)
                    .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            }
        }
    }
}
