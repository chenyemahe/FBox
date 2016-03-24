package futurebox.com.fbox.languagelist;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import futurebox.com.fbox.FbUtils;
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
        LanguageListViewHolder viewHolder = new LanguageListViewHolder(convertView, position);
        viewHolder.setBackground(getBackgroundResourceId(position));
        viewHolder.setViewBackground();
        convertView.setTag(viewHolder);
        return convertView;
    }



    public void setData() {
        stringList = mContext.getResources().getStringArray(R.array.language);
    }

    private int getBackgroundResourceId(int position){
        return backgorundList[position%5];
    }

    public class LanguageListViewHolder implements CompoundButton.OnCheckedChangeListener{

        private int orBackground = 0;
        private CheckBox mCheckbox;
        private TextView mTextView;
        private LinearLayout mLayout;
        private int mPosition;

        public LanguageListViewHolder(View v, int position) {
            mPosition = position;
            mLayout = (LinearLayout) v.findViewById(R.id.ll_item);
            mCheckbox = (CheckBox) v.findViewById(R.id.checkBox);
            mCheckbox.setOnCheckedChangeListener(null);
            mCheckbox.setChecked(FbUtils.getLanguageCheckedState(mContext,position));
            mCheckbox.setOnCheckedChangeListener(LanguageListViewHolder.this);
            mTextView = (TextView) v.findViewById(R.id.tv_list_item_language);
            SpannableString spanString = new SpannableString((CharSequence) getItem(position));
            spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
            mTextView.setText(spanString);
        }
        public void setViewBackground() {
            int imageResource;
            if(FbUtils.getLanguageCheckedState(mContext,mPosition)) {
                imageResource = FbUtils.getCheckedBg(mContext);
                mLayout.setBackgroundResource(imageResource);
            } else {
                imageResource = getBackground();
                mLayout.setBackgroundResource(imageResource);
            }
        }

        public void setBackground(int bg) {
            orBackground = bg;
        }

        public int getBackground() {
            return orBackground;
        }
        public CheckBox getCheckbox() {
            return mCheckbox;
        }

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            FbUtils.saveLanguageCheckedState(mContext, isChecked, mPosition);
            setViewBackground();
        }
    }
}
