package futurebox.com.fbox.menu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;
import futurebox.com.fbox.keywords.KeywordsPage;
import futurebox.com.fbox.keywords.KeywordsSettingsPage;
import futurebox.com.fbox.languagelist.LanguageSelectionPage;
import futurebox.com.fbox.news_sources.NewsSourcesPage;
import futurebox.com.fbox.notification_setting.NotificationSettingsPage;
import futurebox.com.fbox.topic.ChooseTopics;

/**
 * Created by ye1.chen on 3/28/16.
 */
public class Menupage extends Activity implements View.OnClickListener{

    private ImageView mIv1;
    private ImageView mIv2;
    private ImageView mIv3;
    private ImageView mIv4;
    private ImageView mIv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mIv1 = (ImageView) findViewById(R.id.iv_1);
        mIv2 = (ImageView) findViewById(R.id.iv_2);
        mIv3 = (ImageView) findViewById(R.id.iv_3);
        mIv4 = (ImageView) findViewById(R.id.iv_4);
        mIv5 = (ImageView) findViewById(R.id.iv_5);
        mIv1.setOnClickListener(this);
        mIv2.setOnClickListener(this);
        mIv3.setOnClickListener(this);
        mIv4.setOnClickListener(this);
        mIv5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.iv_1:
                intent = new Intent(this, LanguageSelectionPage.class);
                intent.putExtra(FbUtils.INTENT_SETTINGS_EXTRA, true);
                startActivity(intent);
                break;
            case R.id.iv_2:
                intent = new Intent(this, NewsSourcesPage.class);
                intent.putExtra(FbUtils.INTENT_SETTINGS_EXTRA, true);
                startActivity(intent);
                break;
            case R.id.iv_3:
                intent = new Intent(this, ChooseTopics.class);
                intent.putExtra(FbUtils.INTENT_SETTINGS_EXTRA, true);
                startActivity(intent);
                break;
            case R.id.iv_4:
                intent = new Intent(this, KeywordsSettingsPage.class);
                intent.putExtra(FbUtils.INTENT_SETTINGS_EXTRA, true);
                startActivity(intent);
                break;
            case R.id.iv_5:
                intent = new Intent(this, NotificationSettingsPage.class);
                intent.putExtra(FbUtils.INTENT_SETTINGS_EXTRA, true);
                startActivity(intent);
                break;
        }
    }
}
