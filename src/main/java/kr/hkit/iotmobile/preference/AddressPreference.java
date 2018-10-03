package kr.hkit.iotmobile.preference;

import android.content.Context;
import android.content.SharedPreferences;
// 간단한 값 저장용 Preference
public class AddressPreference {
    private static final String KEY_ADDR= "address";
    private static final String KEY_IP  = "ip";
    private static final String KEY_PORT= "port";

    private SharedPreferences sp;

    public AddressPreference(Context context){
        sp = context.getSharedPreferences(KEY_ADDR,context.MODE_PRIVATE);
        //내가 저장할 데이터의 이름, 다른사람이 못 읽게 설정
    }
    public void putIp(String ip){//getter & setter 중 getter의 기능과 같음
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(KEY_IP,ip);
        editor.apply();
        //꺼낼 때 이름으로 찾게 설정(초기값은 ip)

        sp.edit().putString(KEY_IP,ip);
        sp.edit().apply();
    }
    public String getIp(){
        String ip = sp.getString(KEY_IP,null);
        return ip;
    }

    public void putPort(int port){
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(KEY_PORT,port);
        editor.apply();
    }
    public int getPort() {
        int port = sp.getInt(KEY_PORT, 0);
        return port;    // 권장하는 정석의 방법

    }
}