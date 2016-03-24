package futurebox.com.fbox.news_sources;

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
 * Created by ye1.chen on 3/24/16.
 */
public class NewsListAdapter extends BaseAdapter {

    private String[] stringList;
    private Context mContext;
    private static final int[] photoList = {R.mipmap.ap, R.mipmap.abc,R.mipmap.time,R.mipmap.reuters,
            R.mipmap.cnn, R.mipmap.bbc, R.mipmap.fox, R.mipmap.guardian, R.mipmap.chicago};
    public static final String[] news_sources = {"ASSOCIATED PRESS", "ABC NEWS", "NEW YORK TIMES", "REUTERS", "CNN", "BBC NEWS",
            "FOX NEWS", "THE GUARDIAN", "CHICAGO TRIBUNE"};

    public NewsListAdapter(Context context) {
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
            convertView = View.inflate(mContext,R.layout.list_item_news,null);
        }
        NewsListViewHolder viewHolder = new NewsListViewHolder(convertView, position);
        viewHolder.setViewBackground();
        convertView.setTag(viewHolder);
        return convertView;
    }



    public void setData() {
        stringList = news_sources;
    }

    public class NewsListViewHolder implements CompoundButton.OnCheckedChangeListener{

        private int orBackground = 0;
        private CheckBox mCheckbox;
        private TextView mTextView;
        private LinearLayout mLayout;
        private ImageView mImageView;
        private int mPosition;

        public NewsListViewHolder(View v, int position) {
            mPosition = position;
            mLayout = (LinearLayout) v.findViewById(R.id.ll_item);
            mCheckbox = (CheckBox) v.findViewById(R.id.checkBox);
            mCheckbox.setOnCheckedChangeListener(null);
            mCheckbox.setChecked(FbUtils.getNewsCheckedState(mContext, position));
            mCheckbox.setOnCheckedChangeListener(NewsListViewHolder.this);
            mTextView = (TextView) v.findViewById(R.id.tv_list_item_language);
            SpannableString spanString = new SpannableString((CharSequence) getItem(position));
            spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
            mTextView.setText(spanString);
            mImageView = (ImageView) v.findViewById(R.id.im_news);
            mImageView.setImageResource(photoList[position]);
        }
        public void setViewBackground() {
            if(FbUtils.getNewsCheckedState(mContext, mPosition)) {
                mLayout.setBackgroundResource(android.R.color.white);
                mTextView.setTextColor(Color.BLACK);
            } else {
                mLayout.setBackgroundResource(R.color.language_select);
                mTextView.setTextColor(Color.WHITE);
            }
        }

        public CheckBox getCheckbox() {
            return mCheckbox;
        }

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            FbUtils.saveNewsCheckedState(mContext, isChecked, mPosition);
            setViewBackground();
        }
    }
}
