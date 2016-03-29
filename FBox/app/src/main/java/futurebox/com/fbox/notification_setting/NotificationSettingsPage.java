package futurebox.com.fbox.notification_setting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import futurebox.com.fbox.R;
import futurebox.com.fbox.listnews.ListNewsPage;

/**
 * Created by zhengmeiling on 3/27/16.
 */
public class NotificationSettingsPage extends Activity implements View.OnClickListener{

    private TextView mDay1;
    private TextView mDay2;
    private TextView mDay3;
    private TextView mDay4;
    private TextView mDay5;
    private TextView mDay6;
    private TextView mDay7;

    private TextView mNoti1;
    private TextView mNoti2;
    private TextView mNoti3;
    private TextView mNoti4;
    private TextView mNoti5;

    private Button mBack;
    private Button mNext;

    private boolean [] day = {false, false, false, false, false, false, false};
    private boolean [] notif = {false, false, false, false, false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_setting);
        mDay1 = (TextView) findViewById(R.id.tv_sun);
        mDay2 = (TextView) findViewById(R.id.tv_mon);
        mDay3 = (TextView) findViewById(R.id.tv_tue);
        mDay4 = (TextView) findViewById(R.id.tv_wed);
        mDay5 = (TextView) findViewById(R.id.tv_thur);
        mDay6 = (TextView) findViewById(R.id.tv_fri);
        mDay7 = (TextView) findViewById(R.id.tv_sat);

        mNoti1 = (TextView) findViewById(R.id.tv_1);
        mNoti2 = (TextView) findViewById(R.id.tv_2);
        mNoti3 = (TextView) findViewById(R.id.tv_3);
        mNoti4 = (TextView) findViewById(R.id.tv_4);
        mNoti5 = (TextView) findViewById(R.id.tv_5);

        mDay1.setOnClickListener(this);
        mDay2.setOnClickListener(this);
        mDay3.setOnClickListener(this);
        mDay4.setOnClickListener(this);
        mDay5.setOnClickListener(this);
        mDay6.setOnClickListener(this);
        mDay7.setOnClickListener(this);
        mNoti1.setOnClickListener(this);
        mNoti2.setOnClickListener(this);
        mNoti3.setOnClickListener(this);
        mNoti4.setOnClickListener(this);
        mNoti5.setOnClickListener(this);

        mBack = (Button) findViewById(R.id.bt_back);
        mNext = (Button) findViewById(R.id.bt_next);
        mBack.setOnClickListener(this);
        mNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_sun:
                if (!day[0]) {
                    day[0] = true;
                    mDay1.setBackgroundResource(R.mipmap.language_6);
                } else {
                    day[0] = false;
                    mDay1.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_mon:
                if (!day[1]) {
                    day[1] = true;
                    mDay2.setBackgroundResource(R.mipmap.language_6);
                } else {
                    day[1] = false;
                    mDay2.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_tue:
                if (!day[2]) {
                    day[2] = true;
                    mDay3.setBackgroundResource(R.mipmap.language_6);
                } else {
                    day[2] = false;
                    mDay3.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_wed:
                if (!day[3]) {
                    day[3] = true;
                    mDay4.setBackgroundResource(R.mipmap.language_6);
                } else {
                    day[3] = false;
                    mDay4.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_thur:
                if (!day[4]) {
                    day[4] = true;
                    mDay5.setBackgroundResource(R.mipmap.language_6);
                } else {
                    day[4] = false;
                    mDay5.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_fri:
                if (!day[5]) {
                    day[5] = true;
                    mDay6.setBackgroundResource(R.mipmap.language_6);
                } else {
                    day[5] = false;
                    mDay6.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_sat:
                if (!day[6]) {
                    day[6] = true;
                    mDay7.setBackgroundResource(R.mipmap.language_6);
                } else {
                    day[6] = false;
                    mDay7.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_1:
                if (!notif[0]) {
                    notif[0] = true;
                    mNoti1.setBackgroundResource(R.mipmap.language_6);
                } else {
                    notif[0] = false;
                    mNoti1.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_2:
                if (!notif[1]) {
                    notif[1] = true;
                    mNoti2.setBackgroundResource(R.mipmap.language_6);
                } else {
                    notif[1] = false;
                    mNoti2.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_3:
                if (!notif[2]) {
                    notif[2] = true;
                    mNoti3.setBackgroundResource(R.mipmap.language_6);
                } else {
                    notif[2] = false;
                    mNoti3.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_4:
                if (!notif[3]) {
                    notif[3] = true;
                    mNoti4.setBackgroundResource(R.mipmap.language_6);
                } else {
                    notif[3] = false;
                    mNoti4.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.tv_5:
                if (!notif[4]) {
                    notif[4] = true;
                    mNoti5.setBackgroundResource(R.mipmap.language_6);
                } else {
                    notif[4] = false;
                    mNoti5.setBackgroundResource(android.R.color.white);
                }
                break;
            case R.id.bt_next:
                startActivity(new Intent(this, ListNewsPage.class));
                break;
            case R.id.bt_back:
                this.finish();
                break;
            default:
                break;
        }
    }
}
