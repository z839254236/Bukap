package exam.bukap;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    private List<Map<String,String>> maps;
    private List<String> list;
    private ListView lv;
    private ListApter apter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_my, container, false);
        lv = (ListView) view.findViewById(R.id.list_item);
        //获取url
        Bundle bundle = getArguments();
        String url = bundle.getString("url");
        Gsonabc(url);
        //绑定适配器

        return view;
    }
    public void Gsonabc(String url){
        //使用xutils框架实现网路下载
        RequestParams params = new RequestParams(url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                //gson解析
                Gson gson = new Gson();
                Info info = gson.fromJson(s, Info.class);
                //数据源
                ArrayList<Map<String, String>> arr = new ArrayList<>();
                for (int i = 0; i < info.getData().size(); i++) {
                    //添加一些列的东西
                    Map<String,String> map = new HashMap<String, String>();
                    map.put("title",info.getData().get(i).getTitle());
                    map.put("image",info.getData().get(i).getPic());
                    map.put("id",info.getData().get(i).getId());
                    map.put("sum",String.valueOf(info.getData().get(i).getNum()));
                    map.put("food",info.getData().get(i).getFood_str());
                    map.put("num",String.valueOf(info.getData().get(i).getCollect_num()));
                    arr.add(map);
                }
                //全部添加
                maps.addAll(arr);
                //通知适配器
                apter.notifyDataSetChanged();
            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }

            @Override
            public void onCancelled(CancelledException e) {

            }

            @Override
            public void onFinished() {

            }
        });
        lv.setAdapter(apter);
    }
}
