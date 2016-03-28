package futurebox.com.fbox.keywords;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Button;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;
import futurebox.com.fbox.alarm.AlarmPage;

/**
 * Created by zhengmeiling on 3/26/16.
 */
public class KeywordsPage extends Activity implements View.OnClickListener{

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView tv7;
    private TextView tv8;
    private TextView tv9;
    private TextView tv10;
    private TextView tv11;
    private TextView tv12;
    private TextView tv13;
    private TextView tv14;
    private TextView tv15;
    private TextView tv16;
    private TextView tv17;

    private Button mOK;

    private int plus;
    private int minus;

    public KeywordsPage() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_keywords);
        plus = R.mipmap.plus_sign;
        minus = R.mipmap.minus_red;
        setViewItem();
    }

    private void setViewItem() {
        tv1 = (TextView) findViewById(R.id.tv_1_1);
        tv1.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,0)) {
            tv1.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv1.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv2 = (TextView) findViewById(R.id.tv_1_2);
        tv2.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,1)) {
            tv2.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv2.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv3 = (TextView) findViewById(R.id.tv_2_1);
        tv3.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,2)) {
            tv3.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv3.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv4 = (TextView) findViewById(R.id.tv_2_2);
        tv4.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,3)) {
            tv4.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv4.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv5 = (TextView) findViewById(R.id.tv_3_1);
        tv5.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,4)) {
            tv5.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv5.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv6 = (TextView) findViewById(R.id.tv_3_2);
        tv6.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,5)) {
            tv6.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv6.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv7 = (TextView) findViewById(R.id.tv_3_3);
        tv7.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,6)) {
            tv7.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv7.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv8 = (TextView) findViewById(R.id.tv_4_1);
        tv8.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,7)) {
            tv8.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv8.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv9 = (TextView) findViewById(R.id.tv_4_2);
        tv9.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,8)) {
            tv9.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv9.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv10 = (TextView) findViewById(R.id.tv_5_1);
        tv10.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,9)) {
            tv10.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv10.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }
        tv11 = (TextView) findViewById(R.id.tv_5_2);
        tv11.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,10)) {
            tv11.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv11.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv12 = (TextView) findViewById(R.id.tv_6_1);
        tv12.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,11)) {
            tv12.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv12.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv13 = (TextView) findViewById(R.id.tv_6_2);
        tv13.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,12)) {
            tv13.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv13.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv14 = (TextView) findViewById(R.id.tv_7_1);
        tv14.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,13)) {
            tv14.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv14.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv15 = (TextView) findViewById(R.id.tv_7_2);
        tv15.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,14)) {
            tv15.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv15.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv16 = (TextView) findViewById(R.id.tv_8_1);
        tv16.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,15)) {
            tv16.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv16.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        tv17 = (TextView) findViewById(R.id.tv_8_2);
        tv17.setOnClickListener(this);
        if(FbUtils.getKeywordCheckedState(this,16)) {
            tv17.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
        } else {
            tv17.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
        }

        mOK = (Button) findViewById(R.id.bt_ok);
        mOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_1_1:
                if (FbUtils.getKeywordCheckedState(this, 0)) {
                    FbUtils.saveKeywordCheckedState(this,false,0);
                    tv1.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,0);
                    tv1.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_1_2:
                if (FbUtils.getKeywordCheckedState(this, 1)) {
                    FbUtils.saveKeywordCheckedState(this,false,1);
                    tv2.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,1);
                    tv2.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_2_1:
                if (FbUtils.getKeywordCheckedState(this, 2)) {
                    FbUtils.saveKeywordCheckedState(this,false,2);
                    tv3.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,2);
                    tv3.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_2_2:
                if (FbUtils.getKeywordCheckedState(this, 3)) {
                    FbUtils.saveKeywordCheckedState(this,false,3);
                    tv4.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,3);
                    tv4.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_3_1:
                if (FbUtils.getKeywordCheckedState(this,4)) {
                    FbUtils.saveKeywordCheckedState(this,false,4);
                    tv5.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,4);
                    tv5.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_3_2:
                if (FbUtils.getKeywordCheckedState(this, 5)) {
                    FbUtils.saveKeywordCheckedState(this,false,5);
                    tv6.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,5);
                    tv6.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_3_3:
                if (FbUtils.getKeywordCheckedState(this, 6)) {
                    FbUtils.saveKeywordCheckedState(this,false,6);
                    tv7.setCompoundDrawablesWithIntrinsicBounds(0,0,plus,0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,6);
                    tv7.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_4_1:
                if (FbUtils.getKeywordCheckedState(this, 7)) {
                    FbUtils.saveKeywordCheckedState(this,false,7);
                    tv8.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,7);
                    tv8.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_4_2:
                if (FbUtils.getKeywordCheckedState(this, 8)) {
                    FbUtils.saveKeywordCheckedState(this,false,8);
                    tv9.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,8);
                    tv9.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_5_1:
                if (FbUtils.getKeywordCheckedState(this, 9)) {
                    FbUtils.saveKeywordCheckedState(this,false,9);
                    tv10.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,9);
                    tv10.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_5_2:
                if (FbUtils.getKeywordCheckedState(this, 10)) {
                    FbUtils.saveKeywordCheckedState(this,false,10);
                    tv11.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,10);
                    tv11.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_6_1:
                if (FbUtils.getKeywordCheckedState(this, 11)) {
                    FbUtils.saveKeywordCheckedState(this,false,11);
                    tv12.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,11);
                    tv12.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_6_2:
                if (FbUtils.getKeywordCheckedState(this, 12)) {
                    FbUtils.saveKeywordCheckedState(this,false,12);
                    tv13.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,12);
                    tv13.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_7_1:
                if (FbUtils.getKeywordCheckedState(this, 13)) {
                    FbUtils.saveKeywordCheckedState(this,false,13);
                    tv14.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,13);
                    tv14.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_7_2:
                if (FbUtils.getKeywordCheckedState(this, 14)) {
                    FbUtils.saveKeywordCheckedState(this,false,14);
                    tv15.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,14);
                    tv15.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_8_1:
                if (FbUtils.getKeywordCheckedState(this, 15)) {
                    FbUtils.saveKeywordCheckedState(this,false,15);
                    tv16.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,15);
                    tv16.setCompoundDrawablesWithIntrinsicBounds(0, 0, minus, 0);
                }
                break;
            case R.id.tv_8_2:
                if (FbUtils.getKeywordCheckedState(this, 16)) {
                    FbUtils.saveKeywordCheckedState(this,false,16);
                    tv17.setCompoundDrawablesWithIntrinsicBounds(0, 0, plus, 0);
                } else {
                    FbUtils.saveKeywordCheckedState(this,true,16);
                    tv17.setCompoundDrawablesWithIntrinsicBounds(0,0,minus,0);
                }
                break;
            case R.id.bt_ok:
                startActivity(new Intent(this, AlarmPage.class));
                KeywordsPage.this.finish();
                break;
            default:
                break;
        }
    }
}
