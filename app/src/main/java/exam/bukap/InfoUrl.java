package exam.bukap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/11/24.
 */
public class InfoUrl {
    public static String url1 = "http://www.qubaobei.com/ios/cf/dish_list.php?stage_id=1&limit=10&page=1";
    public static String url2 = "http://litchiapi.jstv.com/api/GetFeeds?column=4&PageSize=20&pageIndex=1&val=100511D3BE5301280E0992C73A9DEC41";
    public static List<String> getUrl(){
        List<String> list = new ArrayList<>();
        list.add(url1);
        list.add(url2);
        return list;
    }



}
