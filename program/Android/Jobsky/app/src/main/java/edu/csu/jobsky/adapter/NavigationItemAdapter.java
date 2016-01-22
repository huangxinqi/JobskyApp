package edu.csu.jobsky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import edu.csu.jobsky.R;

/**
 * Created by huangxinqi on 16/1/22.
 * 侧滑菜单拦的每一行的适配器
 */
public class NavigationItemAdapter extends BaseAdapter {
    private TextView textView;
    private Context context;
    private String[] titles=new String[]{"收藏","分享","照相机","画廊"};
    public NavigationItemAdapter(Context context){
        this.context=context;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return titles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_nav,null);
            textView= (TextView) convertView.findViewById(R.id.tv_nav_title);
            convertView.setTag(textView);
        }
        else{
            textView= (TextView) convertView.getTag();
        }
        textView.setText(titles[position]);
        return convertView;
    }
}
