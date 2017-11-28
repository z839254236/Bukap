package exam.bukap;

import android.app.Application;

import org.xutils.x;

/**
 * Created by lenovo on 2017/11/24.
 */
public class Mapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
