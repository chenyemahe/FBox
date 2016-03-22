package futurebox.com.fbox.languagelist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import futurebox.com.fbox.R;

/**
 * Created by ye1.chen on 3/22/16.
 */
public class LanguageListAdapter extends BaseAdapter {

    private String[] stringList;
    private Context mContext;
    private static int[] backgorundList = {R.mipmap.language_1, R.mipmap.language_2,R.mipmap.language_3,R.mipmap.language_4,
            R.mipmap.language_5};

    public LanguageListAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        if(stringList != null) {
            return stringList.length;
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(stringList != null) {
            return stringList[position];
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(mContext,R.layout.list_item_language,null);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.tv_list_item_language);
        SpannableString spanString = new SpannableString((CharSequence) getItem(position));
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
        textView.setText(spanString);
        textView.setBackgroundResource(getBackgroundResourceId(position));
        return convertView;
    }



    public void setData() {
        stringList = mContext.getResources().getStringArray(R.array.language);
    }

    private int getBackgroundResourceId(int position){
        return backgorundList[position%5];
    }
}
