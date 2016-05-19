package com.htt.popupmenu;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import java.util.List;

/**
 * Created by Administrator on 2016/5/19.
 */
public class PopupMenu extends FrameLayout{
    public final static int POPUP_DOWN=1;
    public final static int POPUP_UP=0;
    private Context context;
    /**弹出方向，向上或向下*/
    private int direction=POPUP_UP;
    /**菜单项*/
    private List<View> menuItems=null;
    /**菜单项的大小*/
    private int menuItemWidth;
    /**菜单项的高度*/
    private int menuItemHeight;
    /**菜单项间的间距*/
    private int itemPadding;
    /**动画时间*/
    private int duration = 800;
    /**延迟单位时间*/
    private int delay=100;
    /**动画是否正在执行*/
    private boolean animationPlaying=false;
    /**目标视图*/
    private View tagerView;


    public PopupMenu(Context context) {
        super(context);
    }

    public PopupMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PopupMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PopupMenu(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void initViews(Context context){
        this.context=context;
    }

    public void setTagerView(View view){
        this.tagerView=view;
    }

    /**
     * 显示动画
     * @param index 菜单项位置
     * @param menuItem
     * @param startLocation 动画开始位置
     * @param endLocation 动画结束位置
     */
    private void setShowAnimation(int index,View menuItem,Point startLocation,Point endLocation){
        menuItem.bringToFront();



    }

    private void setViewLocation(){

    }




}
