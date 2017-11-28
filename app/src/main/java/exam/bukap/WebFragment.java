package exam.bukap;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {
    private WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_web, container, false);
        webView.loadUrl("https://baike.baidu.com/item/%E5%8C%97%E4%BA%AC%E5%85%AB%E7%BB%B4%E7%A0%94%E4%BF%AE%E5%AD%A6%E9%99%A2/8651018");
        return view;
    }

}
