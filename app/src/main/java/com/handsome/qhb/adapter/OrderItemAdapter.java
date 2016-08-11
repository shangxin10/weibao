package com.handsome.qhb.adapter;

import android.content.Context;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.handsome.qhb.bean.Order;
import com.handsome.qhb.bean.Products;
import com.handsome.qhb.utils.ViewHolder;

import java.text.DecimalFormat;
import java.util.List;

import tab.com.handsome.handsome.R;

/**
 * Created by zhang on 2016/3/17.
 */
public class OrderItemAdapter extends  CommonAdapter<Products> {
    DecimalFormat df = new DecimalFormat("#0.00");
    public OrderItemAdapter(Context context,List<Products> datas, int layoutId, RequestQueue mQueue){
        super(context,datas,layoutId,mQueue);
    }
    @Override
    public void convert(int position, ViewHolder holder,ListView listView, Products products) {
        holder.setText(R.id.tv_pname,products.getProduct().getPname());
        holder.setText(R.id.tv_num,"X "+String.valueOf(products.getNum()));
        holder.setText(R.id.tv_price,String.valueOf(df.format(products.getProduct().getPrice()*products.getNum())));
    }
}
