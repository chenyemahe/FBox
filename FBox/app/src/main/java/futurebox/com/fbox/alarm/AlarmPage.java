package futurebox.com.fbox.alarm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

import futurebox.com.fbox.R;
import futurebox.com.fbox.notification_setting.NotificationSettingsPage;

/**
 * Created by zhengmeiling on 3/27/16.
 */
public class AlarmPage extends Activity implements View.OnClickListener {

    private TextView mAdd;
    private Button mBack;
    private Button mNext;
    private boolean[] state = {false, false};
    private TableLayout mTL2;
    private TableLayout mTL3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        mAdd = (TextView) findViewById(R.id.tv_l_1);
        mAdd.setOnClickListener(this);
        mBack = (Button) findViewById(R.id.bt_back);
        mBack.setOnClickListener(this);
        mNext = (Button) findViewById(R.id.bt_next);
        mNext.setOnClickListener(this);
        mTL2 = (TableLayout) findViewById(R.id.tl_2);
        mTL3 = (TableLayout) findViewById(R.id.tl_3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_next:
                startActivity(new Intent(this, NotificationSettingsPage.class));
                break;
            case R.id.bt_back:
                this.finish();
                break;
            case R.id.tv_l_1:
                if (!state[0]) {
                    state[0] = true;
                    mTL2.setVisibility(View.VISIBLE);
                } else if (!state[1]) {
                    state[1] = true;
                    mTL3.setVisibility(View.VISIBLE);
                }

        }
    }
}
