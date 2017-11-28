package exam.bukap;

import java.util.List;

/**
 * Created by lenovo on 2017/11/24.
 */
public class Info {

    /**
     * ret : 1
     * data : [{"id":"8289","title":"油焖大虾","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/9/8289.jpg","collect_num":"1646","food_str":"大虾 葱 生姜 植物油 料酒","num":1646},{"id":"2127","title":"四川回锅肉","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2127.jpg","collect_num":"1581","food_str":"猪肉 青蒜 青椒 红椒 姜片","num":1581},{"id":"30630","title":"超简单芒果布丁","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/31/30630.jpg","collect_num":"1514","food_str":"QQ糖 牛奶 芒果","num":1514},{"id":"9073","title":"家常红烧鱼","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/10/9073.jpg","collect_num":"1416","food_str":"鲜鱼 姜 葱 蒜 花椒","num":1416},{"id":"10097","title":"家常煎豆腐","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10097.jpg","collect_num":"1399","food_str":"豆腐 新鲜红椒 青椒 葱花 油","num":1399},{"id":"10509","title":"水煮肉片","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10509.jpg","collect_num":"1334","food_str":"瘦猪肉 生菜 豆瓣酱 干辣椒 花椒","num":1334},{"id":"46968","title":"红糖苹果银耳汤","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/47/46968.jpg","collect_num":"1240","food_str":"银耳 苹果 红糖","num":1240},{"id":"10191","title":"麻婆豆腐","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/11/10191.jpg","collect_num":"1208","food_str":"豆腐 肉末 生抽 白糖 芝麻油","num":1208},{"id":"2372","title":"皮蛋瘦肉粥","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2372.jpg","collect_num":"1138","food_str":"大米 皮蛋 猪肉 油条 香葱","num":1138},{"id":"2166","title":"蚂蚁上树","pic":"http://www.qubaobei.com/ios/cf/uploadfile/132/3/2166.jpg","collect_num":"1134","food_str":"红薯粉 肉 姜 蒜 花椒","num":1134}]
     */

    private int ret;
    private List<DataBean> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 8289
         * title : 油焖大虾
         * pic : http://www.qubaobei.com/ios/cf/uploadfile/132/9/8289.jpg
         * collect_num : 1646
         * food_str : 大虾 葱 生姜 植物油 料酒
         * num : 1646
         */

        private String id;
        private String title;
        private String pic;
        private String collect_num;
        private String food_str;
        private int num;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getCollect_num() {
            return collect_num;
        }

        public void setCollect_num(String collect_num) {
            this.collect_num = collect_num;
        }

        public String getFood_str() {
            return food_str;
        }

        public void setFood_str(String food_str) {
            this.food_str = food_str;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
