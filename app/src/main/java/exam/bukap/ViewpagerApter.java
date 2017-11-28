package exam.bukap;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by lenovo on 2017/11/24.
 */
public class ViewpagerApter extends FragmentPagerAdapter {

    private List<Fragment> list;
   private List<String> title;
    public ViewpagerApter(FragmentManager fm, List<Fragment> list, List<String> title) {
        super(fm);
        this.list = list;

        this.title = title;
    }



    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
