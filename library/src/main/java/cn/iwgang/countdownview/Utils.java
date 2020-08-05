package cn.iwgang.countdownview;

import android.content.Context;

/**
 * Utils
 * Created by iWgang on 16/6/19.
 * https://github.com/iwgang/CountdownView
 */
final class Utils {

    public static int dp2px(Context context, float dpValue) {
        if (dpValue <= 0) return 0;
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static float sp2px(Context context, float spValue) {
        if (spValue <= 0) return 0;
        final float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return spValue * scale;
    }

    public static String formatNum(int time) {
        return time < 10 ? "0" + time : String.valueOf(time);
    }

    public static String formatMillisecond(int millisecond, int digits) {
        String retMillisecondStr;

        if (digits == BaseCountdown.MILLISECOND_DIGITS_TWO) {
            if (millisecond > 99) {
                retMillisecondStr = String.valueOf(millisecond / 10);
            } else if (millisecond <= 9) {
                retMillisecondStr = "0" + millisecond;
            } else {
                retMillisecondStr = String.valueOf(millisecond);
            }
        } else {
            if (millisecond > 99) {
                retMillisecondStr = String.valueOf(millisecond / 100);
            } else {
                retMillisecondStr = "0";
            }
        }

        return retMillisecondStr;
    }

}
