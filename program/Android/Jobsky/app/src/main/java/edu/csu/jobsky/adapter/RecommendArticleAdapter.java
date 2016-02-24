package edu.csu.jobsky.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by huangxinqi on 16/1/27.
 */
public class RecommendArticleAdapter extends BaseAdapter{
    private Context context;
    private ViewHolder viewHolder;

    public RecommendArticleAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    private class ViewHolder{
        TextView tvDescription;
        TextView tvArticleTitle;
        ImageView ivArticle;
        TextView tvTime;
        TextView tvAddress;
    }
}
