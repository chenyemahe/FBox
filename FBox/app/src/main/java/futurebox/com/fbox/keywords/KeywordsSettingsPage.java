package futurebox.com.fbox.keywords;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;

/**
 * Created by ye1.chen on 3/29/16.
 */
public class KeywordsSettingsPage extends Activity implements View.OnClickListener{

    private Button mOk;
    private TextView mAdd;
    private ListView mListView;
    private KeywordsSettingsAdapter mAdapter;
    private EditText mEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keywords_settings);
        mOk = (Button) findViewById(R.id.bt_ok);
        mOk.setOnClickListener(this);
        mAdd = (TextView) findViewById(R.id.tv_keywords_add);
        mAdd.setOnClickListener(this);
        mEt = (EditText) findViewById(R.id.ed_keywords_add);
        mAdapter = new KeywordsSettingsAdapter(this);
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(mAdapter);
        mAdapter.setData();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.tv_keywords_add) {
            String key = mEt.getText().toString();
            if(!TextUtils.isEmpty(key)) {
                FbUtils.saveCustomKeyword(this, key);
                mAdapter.refresh();
            }
        } else if (v.getId() == R.id.bt_ok) {
            this.finish();
        }
    }
}
