package futurebox.com.fbox.languagelist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;
import futurebox.com.fbox.news_sources.NewsSourcesPage;

/**
 * Created by ye1.chen on 3/22/16.
 */
public class LanguageSelectionPage extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private LanguageListAdapter mAdapter;
    private ListView mListView;
    private Button mNext;
    private Button mOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_page);
        boolean isSetting = getIntent().getBooleanExtra(FbUtils.INTENT_SETTINGS_EXTRA, false);
        mAdapter = new LanguageListAdapter(LanguageSelectionPage.this);
        mAdapter.setData();
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
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

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bt_next) {
            startActivity(new Intent(this, NewsSourcesPage.class));
        } else if (v.getId() == R.id.bt_ok) {
            this.finish();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        LanguageListAdapter.LanguageListViewHolder holder = (LanguageListAdapter.LanguageListViewHolder) view.getTag();
        CheckBox checkBox = holder.getCheckbox();
        if (FbUtils.getLanguageCheckedState(this,position)) {
            checkBox.setChecked(false);
            FbUtils.saveLanguageCheckedState(this, false, position);
        } else {
            checkBox.setChecked(true);
            FbUtils.saveLanguageCheckedState(this, true, position);
        }
        holder.setViewBackground();
    }
}
