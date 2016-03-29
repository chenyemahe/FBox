package futurebox.com.fbox.listnews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;

/**
 * Created by ye1.chen on 3/28/16.
 */
public class ListNewsAdapter extends BaseAdapter {

    private String[] stringList;
    private Context mContext;
    private static final int[] photoList = {R.mipmap.ap, R.mipmap.abc,R.mipmap.newyour_time,R.mipmap.reuters,
            R.mipmap.cnn, R.mipmap.ap, R.mipmap.cnn};
    public static final String [] news_title = {"7:21 AM September 16", "8:14 AM September 16" , "8:37 AM September 16",
            "9:05 AM September 16", "9:24 AM September 16", "2:34 PM September 15", "1:12 PM September 15"};
    public static final String[] news_sources = {"Possible diabetes cure being tested on small number of patients",
            "Scott Kelly, american astronaut, returns to Earth after 340 days in space",
            "Architecture review: Santiago Calatrava's transit hub is a Soaring Symbol of a Boondoggle",
            "Zika virus rumoors and theories that you should doubt",
            "Spain's socialist leader takes his shot at Forming a Government",
            "Intense Manhunt after Brussels Massacre",
            "Ryan issues a plea for a politics of 'Ideas, not insults'"};

    public ListNewsAdapter(Context context) {
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
            convertView = View.inflate(mContext,R.layout.list_item_news_list,null);
        }
        NewsListViewHolder viewHolder = new NewsListViewHolder(convertView, position);
        convertView.setTag(viewHolder);
        return convertView;
    }



    public void setData() {
        stringList = news_sources;
    }

    public class NewsListViewHolder{
        private TextView mTextView;
        private TextView mTextView2;
        private ImageView mImageView;
        private int mPosition;

        public NewsListViewHolder(View v, int position) {
            mPosition = position;
            mTextView = (TextView) v.findViewById(R.id.tv_list_title);
            SpannableString spanString = new SpannableString(news_title[position]);
            spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
            mTextView.setText(spanString);

            mTextView2 = (TextView) v.findViewById(R.id.tv_list_item_boday);
            SpannableString spanString2 = new SpannableString(news_sources[position]);
            spanString2.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
            mTextView2.setText(spanString2);

            mImageView = (ImageView) v.findViewById(R.id.im_news);
            mImageView.setImageResource(photoList[position]);
        }
    }
}
