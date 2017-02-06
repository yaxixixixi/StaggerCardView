package com.yaxi.staggercardview.global;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by yaxi on 2016/12/20.
 */

public class Constant {

    public static ArrayList<String> list= new ArrayList<>();
    static {
        list.add("http://b.hiphotos.baidu.com/image/pic/item/d009b3de9c82d15825ffd75c840a19d8bd3e42da.jpg");
        list.add("http://c.hiphotos.baidu.com/image/pic/item/0eb30f2442a7d933e2dd6a9ea94bd11372f001e1.jpg");
        list.add("http://f.hiphotos.baidu.com/image/pic/item/b17eca8065380cd70c5150cba444ad345982814d.jpg");
        list.add("http://g.hiphotos.baidu.com/image/pic/item/f703738da97739125daca7e5fb198618377ae2a8.jpg");
        list.add("http://c.hiphotos.baidu.com/image/pic/item/f703738da977391279688a89fc198618377ae288.jpg");
        list.add("http://b.hiphotos.baidu.com/image/pic/item/d009b3de9c82d15825ffd75c840a19d8bd3e42da.jpg");
        list.add("http://c.hiphotos.baidu.com/image/pic/item/0eb30f2442a7d933e2dd6a9ea94bd11372f001e1.jpg");
        list.add("http://f.hiphotos.baidu.com/image/pic/item/b17eca8065380cd70c5150cba444ad345982814d.jpg");
        list.add("http://g.hiphotos.baidu.com/image/pic/item/f703738da97739125daca7e5fb198618377ae2a8.jpg");
        list.add("http://c.hiphotos.baidu.com/image/pic/item/f703738da977391279688a89fc198618377ae288.jpg");
        list.add("http://b.hiphotos.baidu.com/image/pic/item/d009b3de9c82d15825ffd75c840a19d8bd3e42da.jpg");
        list.add("http://c.hiphotos.baidu.com/image/pic/item/0eb30f2442a7d933e2dd6a9ea94bd11372f001e1.jpg");
        list.add("http://f.hiphotos.baidu.com/image/pic/item/b17eca8065380cd70c5150cba444ad345982814d.jpg");
        list.add("http://g.hiphotos.baidu.com/image/pic/item/f703738da97739125daca7e5fb198618377ae2a8.jpg");
        list.add("http://c.hiphotos.baidu.com/image/pic/item/f703738da977391279688a89fc198618377ae288.jpg");
    }



    public static int px2dip(Context context, int px){
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(px/scale+0.5f);
    }

}
