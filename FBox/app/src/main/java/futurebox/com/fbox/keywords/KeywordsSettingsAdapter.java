package futurebox.com.fbox.keywords;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import futurebox.com.fbox.FbUtils;
import futurebox.com.fbox.R;

/**
 * Created by ye1.chen on 3/29/16.
 */
public class KeywordsSettingsAdapter extends BaseAdapter {

    private ArrayList<String> stringList;
    private String[] baseList = {"Public Healthy","Vaccine","Immunization","HIV","Epidemic","Zika","Diet","Nutrition","Heart disease",
            "Obesity","Cholesterol","Hyponatremia","Diseases","Diabetes","Hepatitis","Cancer","Disease Control"};
    private Context mContext;

    public KeywordsSettingsAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        if(stringList != null) {
            return stringList.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        if(stringList != null) {
            return stringList.get(position);
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
            convertView = View.inflate(mContext,R.layout.list_ite_keywords,null);
        }
        LanguageListViewHolder viewHolder = new LanguageListViewHolder(convertView, position);
        convertView.setTag(viewHolder);
        return convertView;
    }

    public void setData() {
        if (stringList == null)
            stringList = new ArrayList<String>();
        stringList.clear();
        for(int i = 0; i < baseList.length; i++) {
            if(FbUtils.getKeywordCheckedState(mContext,i)) {
                stringList.add(baseList[i]);
            }
        }
        String extraList = FbUtils.getCustomKeywordList(mContext);
        if (!TextUtils.isEmpty(extraList)) {
            String[] temp = extraList.split(",");
            for(int i = 0; i < temp.length; i++) {
                stringList.add(temp[i]);
            }
        }
    }

    public void refresh() {
        setData();
        notifyDataSetChanged();
    }

    public class LanguageListViewHolder implements View.OnClickListener{
        private TextView mTextView;
        private TextView mDelete;
        private int mPosition;

        public LanguageListViewHolder(View v, int position) {
            mPosition = position;
            mTextView = (TextView) v.findViewById(R.id.tv_keyword_body);
            SpannableString spanString = new SpannableString((CharSequence) getItem(position));
            spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
            mTextView.setText(spanString);
            mDelete = (TextView) v.findViewById(R.id.tv_delete);
            mDelete.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.tv_delete) {
                for(int i = 0; i < baseList.length; i++) {
                    if(TextUtils.equals(stringList.get(mPosition),baseList[i])){
                        FbUtils.saveKeywordCheckedState(mContext,false,i);
                        refresh();
                    }
                }
                FbUtils.removeCustomKeyword(mContext,stringList.get(mPosition));
                refresh();
            }
        }
    }
}
