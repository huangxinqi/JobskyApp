package edu.csu.jobsky.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import edu.csu.jobsky.R;

/**
 * Created by huangxinqi on 16/1/24.
 */
public class SectionAdapter extends BaseAdapter {
    private int[] colors=new int[]{
            R.color.section_red
            ,R.color.section_yellow
            ,R.color.section_green
            ,R.color.section_purple
    };
    private String[] titles=new String[]{
            "热门招聘","实时动态","校招日历","我的足迹"
    };
    private int[] pictures=new int[]{
            R.drawable.icon_hot
            ,R.drawable.icon_hot
            ,R.drawable.icon_calendar
            ,R.drawable.icon_history
    };
    private Context context;
    private ViewHolder viewHolder;

    public SectionAdapter(Context context){
        this.context=context;
    }
    public SectionAdapter(Context context,int[] colors,int[] pictures,String[] titles){
        this.colors=colors;
        this.pictures=pictures;
        this.titles=titles;
        this.context=context;
    }
    @Override
    public int getCount() {
        return colors.length;
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
            convertView= LayoutInflater.from(context).inflate(R.layout.item_section,null);
            viewHolder.ivSection= (ImageView) convertView.findViewById(R.id.iv_section);
            viewHolder.tvSection= (TextView) convertView.findViewById(R.id.tv_section);
            viewHolder.rlSection= (RelativeLayout) convertView.findViewById(R.id.rl_section_bg);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.tvSection.setText(titles[position]);
        viewHolder.ivSection.setImageResource(pictures[position]);
        viewHolder.rlSection.setBackground(context.getResources().getDrawable(colors[position]));
        return convertView;
    }
    private class ViewHolder {
        RelativeLayout rlSection;
        TextView tvSection;
        ImageView ivSection;
    }
}
