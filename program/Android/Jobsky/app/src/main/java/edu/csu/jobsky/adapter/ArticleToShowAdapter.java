package edu.csu.jobsky.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import edu.csu.jobsky.R;

/**
 * create by huangxinqi
 *   on 16/2/5.
 *   作用: 主页的文章列表适配器
*/
public class ArticleToShowAdapter extends BaseAdapter{

    private Context context;
    private List<String> list;
    private ViewHolder viewHolder;
    public ArticleToShowAdapter(Context content,List<String> list){
        this.context=content;
        this.list=list;
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
        if (convertView==null){
            convertView=LayoutInflater.from(context).inflate(R.layout.item_article,null);
            viewHolder=new ViewHolder();
            viewHolder.tvArticleTitle= (TextView) convertView.findViewById(R.id.tv_article_title);
            viewHolder.tvClickTime= (TextView) convertView.findViewById(R.id.tv_click_times);
            viewHolder.tvTime= (TextView) convertView.findViewById(R.id.tv_time);
            viewHolder.ivLogo= (ImageView) convertView.findViewById(R.id.iv_logo);
            viewHolder.ivTip= (ImageView) convertView.findViewById(R.id.iv_tip);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) convertView.getTag();
        }


        return LayoutInflater.from(context).inflate(R.layout.item_article,null);
    }
    class ViewHolder{
        TextView tvClickTime,tvArticleTitle,tvTime;
        ImageView ivLogo;
        ImageView ivTip;
    }
}
