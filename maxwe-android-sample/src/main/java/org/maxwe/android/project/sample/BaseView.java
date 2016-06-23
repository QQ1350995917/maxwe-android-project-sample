package org.maxwe.android.project.sample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Pengwei Ding on 2016-06-23 17:15.
 * Email: www.dingpengwei@foxmail.com www.dingpegnwei@gmail.com
 * Description: TODO
 */
public abstract class BaseView extends TextView {
    public BaseView(Context context) {
        super(context);
        this.init();
    }

    public BaseView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init();
    }

    public BaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.init();
    }

    protected void init (){
        this.setText(this.getClass().getSimpleName());
        this.setTextAlignment(TEXT_ALIGNMENT_CENTER);
    }
}
