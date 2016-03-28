package futurebox.com.fbox;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by ye1.chen on 3/23/16.
 */
public class FbUtils {

    public static final String FUTURE_BOX_PREFS = "future_box_prefs";
    public static final String FUTURE_BOX_STATE_1 = "future_box_state_1";
    public static final String FUTURE_BOX_STATE_2 = "future_box_state_2";
    public static final String FUTURE_BOX_STATE_3 = "future_box_state_3";
    public static final String FUTURE_BOX_STATE_4 = "future_box_state_4";
    public static final String FUTURE_BOX_STATE_5 = "future_box_state_5";
    public static final String FUTURE_BOX_STATE_6 = "future_box_state_6";
    public static final String FUTURE_BOX_STATE_7 = "future_box_state_7";
    public static final String FUTURE_BOX_STATE_8 = "future_box_state_8";
    public static final String FUTURE_BOX_STATE_9 = "future_box_state_9";
    public static final String FUTURE_BOX_STATE_10 = "future_box_state_10";
    public static final String FUTURE_BOX_STATE_11 = "future_box_state_11";
    public static final String FUTURE_BOX_STATE_12 = "future_box_state_12";
    public static final String FUTURE_BOX_STATE_13 = "future_box_state_13";


    public static final String NEWS_SOURCES_1 = "news_sources_1";
    public static final String NEWS_SOURCES_2 = "news_sources_2";
    public static final String NEWS_SOURCES_3 = "news_sources_3";
    public static final String NEWS_SOURCES_4 = "news_sources_4";
    public static final String NEWS_SOURCES_5 = "news_sources_5";
    public static final String NEWS_SOURCES_6 = "news_sources_6";
    public static final String NEWS_SOURCES_7 = "news_sources_7";
    public static final String NEWS_SOURCES_8 = "news_sources_8";
    public static final String NEWS_SOURCES_9 = "news_sources_9";

    public static final String TOPICS_1 = "topics_1";
    public static final String TOPICS_2 = "topics_2";
    public static final String TOPICS_3 = "topics_3";
    public static final String TOPICS_4 = "topics_4";
    public static final String TOPICS_5 = "topics_5";
    public static final String TOPICS_6 = "topics_6";
    public static final String TOPICS_7 = "topics_7";
    public static final String TOPICS_8 = "topics_8";
    public static final String TOPICS_9 = "topics_9";
    public static final String TOPICS_10 = "topics_10";

    public static final String KEYWORD_1 = "keyword_1";
    public static final String KEYWORD_2 = "keyword_2";
    public static final String KEYWORD_3 = "keyword_3";
    public static final String KEYWORD_4 = "keyword_4";
    public static final String KEYWORD_5 = "keyword_5";
    public static final String KEYWORD_6 = "keyword_6";
    public static final String KEYWORD_7 = "keyword_7";
    public static final String KEYWORD_8 = "keyword_8";
    public static final String KEYWORD_9 = "keyword_9";
    public static final String KEYWORD_10 = "keyword_10";
    public static final String KEYWORD_11 = "keyword_11";
    public static final String KEYWORD_12 = "keyword_12";
    public static final String KEYWORD_13 = "keyword_13";
    public static final String KEYWORD_14 = "keyword_14";
    public static final String KEYWORD_15 = "keyword_15";
    public static final String KEYWORD_16 = "keyword_16";
    public static final String KEYWORD_17 = "keyword_17";

    public static String TAG = "Future_box";

    public static boolean saveLanguageCheckedState(Context context, boolean state, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "language save checked state: " + state + " at position " + position);
        switch (position) {
            case 0 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_1, state).commit();
            case 1 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_2, state).commit();
            case 2 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_3, state).commit();
            case 3 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_4, state).commit();
            case 4 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_5, state).commit();
            case 5 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_6, state).commit();
            case 6 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_7, state).commit();
            case 7 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_8, state).commit();
            case 8 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_9, state).commit();
            case 9 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_10, state).commit();
            case 10 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_11, state).commit();
            case 11 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_12, state).commit();
            case 12 :return prefs.edit().putBoolean(FUTURE_BOX_STATE_13, state).commit();
        }
        return false;
    }

    public static boolean getLanguageCheckedState(Context context, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "language get checked state at position " + position);
        switch (position) {
            case 0: return prefs.getBoolean(FUTURE_BOX_STATE_1, false);
            case 1: return prefs.getBoolean(FUTURE_BOX_STATE_2, false);
            case 2: return prefs.getBoolean(FUTURE_BOX_STATE_3, false);
            case 3: return prefs.getBoolean(FUTURE_BOX_STATE_4, false);
            case 4: return prefs.getBoolean(FUTURE_BOX_STATE_5, false);
            case 5: return prefs.getBoolean(FUTURE_BOX_STATE_6, false);
            case 6: return prefs.getBoolean(FUTURE_BOX_STATE_7, false);
            case 7: return prefs.getBoolean(FUTURE_BOX_STATE_8, false);
            case 8: return prefs.getBoolean(FUTURE_BOX_STATE_9, false);
            case 9: return prefs.getBoolean(FUTURE_BOX_STATE_10, false);
            case 10: return prefs.getBoolean(FUTURE_BOX_STATE_11, false);
            case 11: return prefs.getBoolean(FUTURE_BOX_STATE_12, false);
            case 12: return prefs.getBoolean(FUTURE_BOX_STATE_13, false);
        }
        return false;
    }

    public static boolean saveNewsCheckedState(Context context, boolean state, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "news save checked state: " + state + " at position " + position);
        switch (position) {
            case 0 :return prefs.edit().putBoolean(NEWS_SOURCES_1, state).commit();
            case 1 :return prefs.edit().putBoolean(NEWS_SOURCES_2, state).commit();
            case 2 :return prefs.edit().putBoolean(NEWS_SOURCES_3, state).commit();
            case 3 :return prefs.edit().putBoolean(NEWS_SOURCES_4, state).commit();
            case 4 :return prefs.edit().putBoolean(NEWS_SOURCES_5, state).commit();
            case 5 :return prefs.edit().putBoolean(NEWS_SOURCES_6, state).commit();
            case 6 :return prefs.edit().putBoolean(NEWS_SOURCES_7, state).commit();
            case 7 :return prefs.edit().putBoolean(NEWS_SOURCES_8, state).commit();
            case 8 :return prefs.edit().putBoolean(NEWS_SOURCES_9, state).commit();
        }
        return false;
    }

    public static boolean getNewsCheckedState(Context context, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "news language get checked state at position " + position);
        switch (position) {
            case 0: return prefs.getBoolean(NEWS_SOURCES_1, false);
            case 1: return prefs.getBoolean(NEWS_SOURCES_2, false);
            case 2: return prefs.getBoolean(NEWS_SOURCES_3, false);
            case 3: return prefs.getBoolean(NEWS_SOURCES_4, false);
            case 4: return prefs.getBoolean(NEWS_SOURCES_5, false);
            case 5: return prefs.getBoolean(NEWS_SOURCES_6, false);
            case 6: return prefs.getBoolean(NEWS_SOURCES_7, false);
            case 7: return prefs.getBoolean(NEWS_SOURCES_8, false);
            case 8: return prefs.getBoolean(NEWS_SOURCES_9, false);
        }
        return false;
    }

    public static boolean saveTopicsCheckedState(Context context, boolean state, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "topic save checked state: " + state + " at position " + position);
        switch (position) {
            case 0 :return prefs.edit().putBoolean(TOPICS_1, state).commit();
            case 1 :return prefs.edit().putBoolean(TOPICS_2, state).commit();
            case 2 :return prefs.edit().putBoolean(TOPICS_3, state).commit();
            case 3 :return prefs.edit().putBoolean(TOPICS_4, state).commit();
            case 4 :return prefs.edit().putBoolean(TOPICS_5, state).commit();
            case 5 :return prefs.edit().putBoolean(TOPICS_6, state).commit();
            case 6 :return prefs.edit().putBoolean(TOPICS_7, state).commit();
            case 7 :return prefs.edit().putBoolean(TOPICS_8, state).commit();
            case 8 :return prefs.edit().putBoolean(TOPICS_9, state).commit();
            case 9 :return prefs.edit().putBoolean(TOPICS_10, state).commit();
        }
        return false;
    }

    public static boolean getTopicsCheckedState(Context context, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "topic language get checked state at position " + position);
        switch (position) {
            case 0: return prefs.getBoolean(TOPICS_1, false);
            case 1: return prefs.getBoolean(TOPICS_2, false);
            case 2: return prefs.getBoolean(TOPICS_3, false);
            case 3: return prefs.getBoolean(TOPICS_4, false);
            case 4: return prefs.getBoolean(TOPICS_5, false);
            case 5: return prefs.getBoolean(TOPICS_6, false);
            case 6: return prefs.getBoolean(TOPICS_7, false);
            case 7: return prefs.getBoolean(TOPICS_8, false);
            case 8: return prefs.getBoolean(TOPICS_9, false);
            case 9: return prefs.getBoolean(TOPICS_10, false);
        }
        return false;
    }

    public static boolean saveKeywordCheckedState(Context context, boolean state, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "keyword save checked state: " + state + " at position " + position);
        switch (position) {
            case 0 :return prefs.edit().putBoolean(KEYWORD_1, state).commit();
            case 1 :return prefs.edit().putBoolean(KEYWORD_2, state).commit();
            case 2 :return prefs.edit().putBoolean(KEYWORD_3, state).commit();
            case 3 :return prefs.edit().putBoolean(KEYWORD_4, state).commit();
            case 4 :return prefs.edit().putBoolean(KEYWORD_5, state).commit();
            case 5 :return prefs.edit().putBoolean(KEYWORD_6, state).commit();
            case 6 :return prefs.edit().putBoolean(KEYWORD_7, state).commit();
            case 7 :return prefs.edit().putBoolean(KEYWORD_8, state).commit();
            case 8 :return prefs.edit().putBoolean(KEYWORD_9, state).commit();
            case 9 :return prefs.edit().putBoolean(KEYWORD_10, state).commit();
            case 10 :return prefs.edit().putBoolean(KEYWORD_11, state).commit();
            case 11 :return prefs.edit().putBoolean(KEYWORD_12, state).commit();
            case 12 :return prefs.edit().putBoolean(KEYWORD_13, state).commit();
            case 13 :return prefs.edit().putBoolean(KEYWORD_14, state).commit();
            case 14 :return prefs.edit().putBoolean(KEYWORD_15, state).commit();
            case 15 :return prefs.edit().putBoolean(KEYWORD_16, state).commit();
            case 16 :return prefs.edit().putBoolean(KEYWORD_17, state).commit();
        }
        return false;
    }

    public static boolean getKeywordCheckedState(Context context, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "keyword language get checked state at position " + position);
        switch (position) {
            case 0: return prefs.getBoolean(KEYWORD_1, false);
            case 1: return prefs.getBoolean(KEYWORD_2, false);
            case 2: return prefs.getBoolean(KEYWORD_3, false);
            case 3: return prefs.getBoolean(KEYWORD_4, false);
            case 4: return prefs.getBoolean(KEYWORD_5, false);
            case 5: return prefs.getBoolean(KEYWORD_6, false);
            case 6: return prefs.getBoolean(KEYWORD_7, false);
            case 7: return prefs.getBoolean(KEYWORD_8, false);
            case 8: return prefs.getBoolean(KEYWORD_9, false);
            case 9: return prefs.getBoolean(KEYWORD_10, false);
            case 10: return prefs.getBoolean(KEYWORD_11, false);
            case 11: return prefs.getBoolean(KEYWORD_12, false);
            case 12: return prefs.getBoolean(KEYWORD_13, false);
            case 13: return prefs.getBoolean(KEYWORD_14, false);
            case 14: return prefs.getBoolean(KEYWORD_15, false);
            case 15: return prefs.getBoolean(KEYWORD_16, false);
            case 16: return prefs.getBoolean(KEYWORD_17, false);
        }
        return false;
    }

    public static int getCheckedBg() {
        return R.color.language_select;
    }
}
