package exam.bukap;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager vp;
    private List<String> title;
    private String url1 = "http://www.qubaobei.com/ios/cf/dish_list.php?stage_id=1&limit=10&page=1";
    private String url2 = "http://litchiapi.jstv.com/api/GetFeeds?column=4&PageSize=20&pageIndex=1&val=100511D3BE5301280E0992C73A9DEC41";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定控件
        tab = (TabLayout) findViewById(R.id.tbl);
        vp = (ViewPager) findViewById(R.id.vp);
        //调用方法
        init();
    }

    private void init() {
        //添加标题
        title = new ArrayList<>();
        title.add("菜谱");
        title.add("网页");
        title.add("新闻");
        //添加网址
        List<String> mlist = new ArrayList<>();
        mlist.add(url1);
        mlist.add(url2);
        List<Fragment> flist = new ArrayList<>();
        //循环创建fragment
        for (int i = 0; i < title.size() ; i++) {
            MyFragment myFragment = new MyFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url",mlist.get(i));
            myFragment.setArguments(bundle);
            flist.add(myFragment);
        }
        //绑定适配器
        ViewpagerApter apter = new ViewpagerApter(getSupportFragmentManager(), flist, title);
        vp.setAdapter(apter);
        tab.setupWithViewPager(vp);
    }
}
