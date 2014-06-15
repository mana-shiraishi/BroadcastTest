package sample.bt;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String testString = intent.getExtras().getString("broadcastTest");
        Toast.makeText(context, testString, Toast.LENGTH_SHORT).show();
    }
}