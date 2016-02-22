package edu.csu.jobsky.adapter;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.common.Callback;
import org.xutils.common.util.LogUtil;
import org.xutils.image.ImageOptions;
import org.xutils.x;

import java.util.List;

import edu.csu.jobsky.R;
import edu.csu.jobsky.bean.ArticleToShowBean;
import edu.csu.jobsky.util.DateUtil;

/**
 * create by huangxinqi
 *   on 16/2/5.
 *   作用: 主页的文章列表适配器
*/
public class ArticleToShowAdapter extends BaseAdapter{

    private Context context;
    private List<ArticleToShowBean.ArticlesEntity> list;
    private ViewHolder viewHolder;
    public ArticleToShowAdapter(Context content,List<ArticleToShowBean.ArticlesEntity> list){
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

        viewHolder.tvArticleTitle.setText(list.get(position).getTitle());
        viewHolder.tvClickTime.setText(list.get(position).getClickTime()+"");

        viewHolder.tvTime.setText(DateUtil.dateFormat(list.get(position).getTime()));
        switch (list.get(position).getPlaceFirstID()){
            case 1:
                viewHolder.ivTip.setImageResource(R.drawable.icon_benbu);
                break;
            case 2:
                viewHolder.ivTip.setImageResource(R.drawable.icon_xiangya);
                break;
            case 3:
                viewHolder.ivTip.setImageResource(R.drawable.icon_tiedao);
                break;
        }
        ImageOptions options=new ImageOptions.Builder()
                // 是否忽略GIF格式的图片
                .setIgnoreGif(false)
                // 图片缩放模式
                .setImageScaleType(ImageView.ScaleType.FIT_XY)
                // 下载中显示的图片
                .setLoadingDrawableId(R.drawable.logo_default)
                // 下载失败显示的图片
                .setFailureDrawableId(R.drawable.logo_default)
                // 得到ImageOptions对象
                .build();


        x.image().bind(viewHolder.ivLogo, "http://7xpbgj.com1.z0.glb.clouddn.com/article%2Fimage%2Fdefault2.jpg", options, new Callback.CommonCallback<Drawable>() {
            @Override
            public void onSuccess(Drawable drawable) {
                LogUtil.e("下载成功");
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
        return convertView;
    }
    class ViewHolder{
        TextView tvClickTime,tvArticleTitle,tvTime;
        ImageView ivLogo;
        ImageView ivTip;
    }
}
