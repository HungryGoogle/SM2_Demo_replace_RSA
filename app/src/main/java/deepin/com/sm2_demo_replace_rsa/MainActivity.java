package deepin.com.sm2_demo_replace_rsa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import deepin.com.sm2_demo_replace_rsa.sm.SM2Utils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.id_sm2_encrpty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    SM2Utils.testSm2();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
