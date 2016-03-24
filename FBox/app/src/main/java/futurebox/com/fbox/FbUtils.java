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

    public static String TAG = "Future_box";

    public static boolean saveLanguageCheckedState(Context context, boolean state, int position) {
        SharedPreferences prefs = context.getSharedPreferences(FUTURE_BOX_PREFS, 0);
        Log.d(TAG, "save checked state: " + state + " at position " + position);
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
        Log.d(TAG, "get checked state at position " + position);
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

    public static int getCheckedBg(Context context) {
        return R.color.language_select;
    }
}
