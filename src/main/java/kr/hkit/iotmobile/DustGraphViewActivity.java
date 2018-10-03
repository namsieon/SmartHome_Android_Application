package kr.hkit.iotmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.toolbox.NetworkImageView;

import kr.hkit.iotmobile.Volley.VolleySingleton;

public class DustGraphViewActivity extends AppCompatActivity {
    //String http_url="http://192.168.0.33:";
    String http_url="http://192.168.0.186:";
    String http_port="7000";
    String path="/graph/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphview);

        NetworkImageView graphNetworkImageView = findViewById(R.id.graphNetworkImageView);

        graphNetworkImageView.setImageUrl(http_url+http_port+path+"graph220180902.png", VolleySingleton.getInstance(this).getImageLoader());
    }
}