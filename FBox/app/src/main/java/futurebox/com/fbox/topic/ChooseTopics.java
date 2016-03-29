package futurebox.com.fbox.topic;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;
import futurebox.com.fbox.keywords.KeywordsPage;

/**
 * Created by ye1.chen on 3/24/16.
 */
public class ChooseTopics extends Activity implements View.OnClickListener {

    private ImageView mImageView1;
    private ImageView mImageView2;
    private ImageView mImageView3;
    private ImageView mImageView4;
    private ImageView mImageView5;
    private ImageView mImageView6;
    private ImageView mImageView7;
    private ImageView mImageView8;
    private ImageView mImageView9;
    private ImageView mImageView10;

    private Button mBack;
    private Button mNext;
    private Button mOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean isSetting = getIntent().getBooleanExtra(FbUtils.INTENT_SETTINGS_EXTRA, false);
        setContentView(R.layout.activity_topics);
        setImageView();
        mBack = (Button) findViewById(R.id.bt_back);
        mBack.setOnClickListener(this);
        mNext = (Button) findViewById(R.id.bt_next);
        mNext.setOnClickListener(this);
        mOk = (Button) findViewById(R.id.bt_ok);
        mOk.setOnClickListener(this);
        if (isSetting) {
            mOk.setVisibility(View.VISIBLE);
            mNext.setVisibility(View.GONE);
        } else {
            mOk.setVisibility(View.GONE);
            mNext.setVisibility(View.VISIBLE);
        }
    }

    private void setImageView() {
        mImageView1 = (ImageView) findViewById(R.id.iv_1_1);
        //mImageView1.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,0)) {
            mImageView1.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView1.setImageResource(R.mipmap.topic_1);
        }
        mImageView2 = (ImageView) findViewById(R.id.iv_1_2);
        //mImageView2.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,1)) {
            mImageView2.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView2.setImageResource(R.mipmap.topic_2);
        }
        mImageView3 = (ImageView) findViewById(R.id.iv_2_1);
        //mImageView3.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,2)) {
            mImageView3.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView3.setImageResource(R.mipmap.topic_3);
        }
        mImageView4 = (ImageView) findViewById(R.id.iv_2_2);
        mImageView4.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,3)) {
            mImageView4.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView4.setImageResource(R.mipmap.topic_4);
        }
        mImageView5 = (ImageView) findViewById(R.id.iv_3_1);
        //mImageView5.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,4)) {
            mImageView5.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView5.setImageResource(R.mipmap.topic_5);
        }
        mImageView6 = (ImageView) findViewById(R.id.iv_3_2);
        //mImageView6.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,5)) {
            mImageView6.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView6.setImageResource(R.mipmap.topic_6);
        }
        mImageView7 = (ImageView) findViewById(R.id.iv_4_1);
        //mImageView7.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,6)) {
            mImageView7.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView7.setImageResource(R.mipmap.topic_7);
        }
        mImageView8 = (ImageView) findViewById(R.id.iv_4_2);
        //mImageView8.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,7)) {
            mImageView8.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView8.setImageResource(R.mipmap.topic_8);
        }
        mImageView9 = (ImageView) findViewById(R.id.iv_5_1);
        //mImageView9.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,8)) {
            mImageView9.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView9.setImageResource(R.mipmap.topic_9);
        }
        mImageView10 = (ImageView) findViewById(R.id.iv_5_2);
        //mImageView10.setOnClickListener(this);
        if(FbUtils.getTopicsCheckedState(this,9)) {
            mImageView10.setImageResource(R.mipmap.topic_checked_4);
        } else {
            mImageView10.setImageResource(R.mipmap.topic_10);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_next:
                startActivity (new Intent(ChooseTopics.this, KeywordsPage.class));
                break;
            case R.id.bt_back:
            case R.id.bt_ok:
                this.finish();
                break;
            case R.id.iv_1_1:
                if(FbUtils.getTopicsCheckedState(this,0)) {
                    FbUtils.saveTopicsCheckedState(this, false, 0);
                    mImageView1.setImageResource(R.mipmap.topic_1);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 0);
                    mImageView1.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_1_2:
                if(FbUtils.getTopicsCheckedState(this,1)) {
                    FbUtils.saveTopicsCheckedState(this, false, 1);
                    mImageView2.setImageResource(R.mipmap.topic_2);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 1);
                    mImageView2.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_2_1:
                if(FbUtils.getTopicsCheckedState(this,2)) {
                    FbUtils.saveTopicsCheckedState(this, false, 2);
                    mImageView3.setImageResource(R.mipmap.topic_3);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 2);
                    mImageView3.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_2_2:
                if(FbUtils.getTopicsCheckedState(this,3)) {
                    FbUtils.saveTopicsCheckedState(this, false, 3);
                    mImageView4.setImageResource(R.mipmap.topic_4);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 3);
                    mImageView4.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_3_1:
                if(FbUtils.getTopicsCheckedState(this,4)) {
                    FbUtils.saveTopicsCheckedState(this, false, 4);
                    mImageView5.setImageResource(R.mipmap.topic_5);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 4);
                    mImageView5.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_3_2:
                if(FbUtils.getTopicsCheckedState(this,5)) {
                    FbUtils.saveTopicsCheckedState(this, false, 5);
                    mImageView6.setImageResource(R.mipmap.topic_6);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 5);
                    mImageView6.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_4_1:
                if(FbUtils.getTopicsCheckedState(this,6)) {
                    FbUtils.saveTopicsCheckedState(this, false, 6);
                    mImageView7.setImageResource(R.mipmap.topic_7);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 6);
                    mImageView7.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_4_2:
                if(FbUtils.getTopicsCheckedState(this,7)) {
                    FbUtils.saveTopicsCheckedState(this, false, 7);
                    mImageView8.setImageResource(R.mipmap.topic_8);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 7);
                    mImageView8.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_5_1:
                if(FbUtils.getTopicsCheckedState(this,8)) {
                    FbUtils.saveTopicsCheckedState(this, false, 8);
                    mImageView9.setImageResource(R.mipmap.topic_9);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 8);
                    mImageView9.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            case R.id.iv_5_2:
                if(FbUtils.getTopicsCheckedState(this,9)) {
                    FbUtils.saveTopicsCheckedState(this, false, 9);
                    mImageView10.setImageResource(R.mipmap.topic_10);
                } else {
                    FbUtils.saveTopicsCheckedState(this, true, 9);
                    mImageView10.setImageResource(R.mipmap.topic_checked_4);
                }
                break;
            default:
                break;
        }
    }
}
