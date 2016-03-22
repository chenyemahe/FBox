package futurebox.com.fbox.languagelist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import futurebox.com.fbox.R;

/**
 * Created by ye1.chen on 3/22/16.
 */
public class LanguageSelectionPage extends Activity implements View.OnClickListener{

    private LanguageListAdapter mAdapter;
    private ListView mListView;
    private Button mNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_page);
        mAdapter = new LanguageListAdapter(LanguageSelectionPage.this);
        mAdapter.setData();
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setAdapter(mAdapter);
        mNext = (Button) findViewById(R.id.bt_next);
        mNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
