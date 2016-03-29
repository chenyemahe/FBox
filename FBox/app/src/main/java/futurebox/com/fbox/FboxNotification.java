package futurebox.com.fbox;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

/**
 * Created by ye1.chen on 3/28/16.
 */
public class FboxNotification {

    public void showNotification(Context mContext) {
        Notification notif = buildNotification(mContext);
        NotificationManager notifMgr = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
        notifMgr.notify(1, notif);
    }

    private Notification buildNotification(Context mContext) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(mContext).setSmallIcon(R.mipmap.tag);

        mBuilder.setContentTitle("FutureBox")
                .setContentText("Possible diabetes cure being tested on small number of patients\nFox News")
                .setOngoing(false)
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setWhen(0);
        return mBuilder.build();
    }
}
