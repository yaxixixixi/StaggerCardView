package com.yaxi.staggercardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yaxi.staggercardview.global.Constant;

import java.util.List;

/**
 * Created by yaxi on 2016/12/20.
 */

public class SimpleRecycleCardAdapter extends RecyclerView.Adapter<SimpleRecycleCardAdapter.ViewHolder> {

    private Context mContext;
    private List<String> mData;
    private OnItemActionListener mOnItemActionListener;

    public SimpleRecycleCardAdapter(Context context,List<String> data) {
        this.mContext = context;
        this.mData = data;
    }

    @Override
    public SimpleRecycleCardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_recycler,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        viewHolder.setIsRecyclable(true);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final SimpleRecycleCardAdapter.ViewHolder holder, int position) {
        holder.itemTitle.setText(mData.get(position));
        Glide.with(mContext)
                .load(Constant.list.get(position))
                .into(holder.itemImg);

        if (mOnItemActionListener == null)
            throw new NullPointerException("onItemClickListener refer to a null position");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //注意这里必须使用viewHolder.getPosition()而不能用i，因为为了保证动画，没有使用NotifyDatasetChanged更新位置数据
                mOnItemActionListener.onItemClickListener(v,holder.getPosition());
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return mOnItemActionListener.onItemLongClickListener(v,holder.getPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return Constant.list.size();
    }

    public interface OnItemActionListener{
        void onItemClickListener(View view,int position);
        boolean onItemLongClickListener(View view,int position);
    }

    public void setOnItemActionListener(OnItemActionListener onItemActionListener){
        this.mOnItemActionListener = onItemActionListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView itemTitle;
        private ImageView itemImg;
        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemImg = (ImageView) itemView.findViewById(R.id.item_img);
        }
    }
}
