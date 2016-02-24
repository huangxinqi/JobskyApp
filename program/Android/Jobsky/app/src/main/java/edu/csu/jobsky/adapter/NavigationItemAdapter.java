package edu.csu.jobsky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import edu.csu.jobsky.R;

/**
 * Created by huangxinqi on 16/1/22.
 * 侧滑菜单拦的每一行的适配器
 */
public class NavigationItemAdapter extends BaseAdapter {
    private Context context;
    private String[] titles=new String[]{"我的消息","我的收藏","系统消息","关于我们","设置"};
    private int[] icons=new int[]{R.drawable.chat,R.drawable.star,R.drawable.megaphone2,R.drawable.brightness,R.drawable.gear};
    public NavigationItemAdapter(Context context){
        this.context=context;
    }
    private ViewHolder viewHolder;
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
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item_nav,null);
            viewHolder.textView= (TextView) convertView.findViewById(R.id.tv_nav_title);
            viewHolder.ivIcon= (ImageView) convertView.findViewById(R.id.iv_icon);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(titles[position]);
        viewHolder.ivIcon.setImageResource(icons[position]);
        return convertView;
    }
    class ViewHolder{
        TextView textView;
        ImageView ivIcon;
    }
}
