package futurebox.com.fbox.listnews;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.NewsArtical;
import futurebox.com.fbox.R;
import futurebox.com.fbox.languagelist.LanguageListAdapter;
import futurebox.com.fbox.listnews.ListNewsAdapter;
import futurebox.com.fbox.menu.Menupage;
import futurebox.com.fbox.topic.ChooseTopics;

/**
 * Created by ye1.chen on 3/23/16.
 */
public class ListNewsPage extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private ListView mListView;
    private Button mNext;
    private Button mBack;
    private TextView mT1;
    private TextView mT2;
    ListNewsAdapter mAdapter;
    private TextView mSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_news);
        mListView = (ListView) findViewById(R.id.listView);
        mAdapter = new ListNewsAdapter(this);
        mAdapter.setData();
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
        mSettings = (TextView) findViewById(R.id.tv_setting);
        mSettings.setOnClickListener(this);
        //mNext = (Button) findViewById(R.id.bt_next);
        //mNext.setOnClickListener(this);
        //mBack = (Button) findViewById(R.id.bt_back);
        //mBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_next:
                startActivity(new Intent(this, ChooseTopics.class));
                break;
            case R.id.bt_back:
                this.finish();
                break;
            case R.id.tv_setting:
                startActivity(new Intent(this, Menupage.class));
                break;
            default:
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            startActivity(new Intent(this, NewsArtical.class));
        }
    }
}
