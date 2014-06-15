package sample.bt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BroadcastTest extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button broadcastButton = (Button) findViewById(R.id.broadcastButton);
        broadcastButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("net.kuwalab.broadcast.test");
                intent.putExtra("broadcastTest", "ブロードキャスト！！");
                sendBroadcast(intent);
            }
        });
    }
}