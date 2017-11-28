package exam.bukap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/11/24.
 */
public class ListApter extends BaseAdapter {
    //数据源
    private List<Map<String,String>> list;
    private Context context;

    public ListApter(List<Map<String, String>> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewitem viewitem;
        //优化
        if (convertView!=null){
            //布局
            convertView = LayoutInflater.from(context).inflate(R.layout.iteam,null);
            viewitem = new Viewitem();
            convertView.setTag(viewitem);
        }else {
            viewitem = (Viewitem) convertView.getTag();
        }
        //加个圆形在菜单
        ImageOptions imageOptions = new ImageOptions.Builder().setRadius(1000).build();
        x.image().bind(viewitem.image,list.get(position).get("image"),imageOptions);
        viewitem.text_tit.setText(list.get(position).get("title"));
        viewitem.text_for.setText(list.get(position).get("food"));
        viewitem.text_sum.setText(list.get(position).get("sum"));
        viewitem.text_num.setText(list.get(position).get("num"));
        return convertView;
    }
    class Viewitem{
        //自定义listview的布局
        TextView text_tit,text_for,text_sum,text_num;
        ImageView image;
        public void Viewitem(View view){
            text_tit = (TextView) view.findViewById(R.id.text_title);
            text_for = (TextView) view.findViewById(R.id.text_picea);
            text_sum = (TextView) view.findViewById(R.id.text_sum);
            text_num = (TextView) view.findViewById(R.id.text_num);
            image = (ImageView) view.findViewById(R.id.img);
        }
    }
}
