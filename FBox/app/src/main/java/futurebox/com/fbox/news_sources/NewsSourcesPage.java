package futurebox.com.fbox.news_sources;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;
import futurebox.com.fbox.languagelist.LanguageListAdapter;
import futurebox.com.fbox.topic.ChooseTopics;

/**
 * Created by ye1.chen on 3/23/16.
 */
public class NewsSourcesPage extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private ListView mListView;
    private Button mNext;
    private Button mBack;
    private TextView mT1;
    private TextView mT2;
    private LinearLayout mLl;
    private boolean selectAllState;
    NewsListAdapter mAdapter;
    private Button mOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_sources);
        boolean isSetting = getIntent().getBooleanExtra(FbUtils.INTENT_SETTINGS_EXTRA, false);
        mListView = (ListView) findViewById(R.id.listView);
        mAdapter = new NewsListAdapter(this);
        mAdapter.setData();
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
        mNext = (Button) findViewById(R.id.bt_next);
        mNext.setOnClickListener(this);
        mBack = (Button) findViewById(R.id.bt_back);
        mBack.setOnClickListener(this);
        mT1 = (TextView) findViewById(R.id.tv_l_1);
        mT1.setOnClickListener(this);
        mT2 = (TextView) findViewById(R.id.tv_l_2);
        mT2.setOnClickListener(this);
        selectAllState = false;
        mLl = (LinearLayout) findViewById(R.id.ll_bot);
        mOk = (Button) findViewById(R.id.bt_ok);
        mOk.setOnClickListener(this);
        if (isSetting) {
            mOk.setVisibility(View.VISIBLE);
            mLl.setVisibility(View.GONE);
        } else {
            mOk.setVisibility(View.GONE);
            mLl.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_next:
                startActivity(new Intent(this, ChooseTopics.class));
                break;
            case R.id.bt_back:
            case R.id.bt_ok:
                this.finish();
                break;
            case R.id.tv_l_1:
            case R.id.tv_l_2:
                if (selectAllState) {
                    selectAllState = false;
                    mT1.setBackgroundResource(R.color.language_select);
                    mT2.setBackgroundResource(R.color.language_select);
                    mT1.setTextColor(Color.WHITE);
                    mT2.setTextColor(Color.WHITE);
                    setAllNewsState(false);
                } else {
                    selectAllState = true;
                    mT1.setBackgroundResource(android.R.color.white);
                    mT2.setBackgroundResource(android.R.color.white);
                    mT1.setTextColor(Color.BLACK);
                    mT2.setTextColor(Color.BLACK);
                    setAllNewsState(true);
                }
                mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        NewsListAdapter.NewsListViewHolder holder = (NewsListAdapter.NewsListViewHolder) view.getTag();
        CheckBox checkBox = holder.getCheckbox();
        if (FbUtils.getNewsCheckedState(this, position)) {
            checkBox.setChecked(false);
            FbUtils.saveNewsCheckedState(this, false, position);
        } else {
            checkBox.setChecked(true);
            FbUtils.saveNewsCheckedState(this, true, position);
        }
        holder.setViewBackground();
    }

    private void setAllNewsState(boolean state) {
        for (int i = 0; i < NewsListAdapter.news_sources.length; i++) {
            if (state) {
                FbUtils.saveNewsCheckedState(this, true, i);
            } else {
                FbUtils.saveNewsCheckedState(this, false, i);
            }
        }
    }
}
