package org.alie.propertycustom.propertyabout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import org.alie.propertycustom.R;

/**
 * Created by Alie on 2019/6/2.
 * 类描述
 * 版本
 */
public class PropertyCustomView extends View {

    private static final String TAG = "PropertyCustomView";
    public int propertyDuration; // 自定义属性

    public String propertyGender; // 自定义属性

    public void setPropertyDuration(int propertyDuration) {
        this.propertyDuration = propertyDuration;
    }

    public void setPropertyGender(String propertyGender) {
        this.propertyGender = propertyGender;
    }

    public PropertyCustomView(Context context) {
        super(context);
    }

    public PropertyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.PropertyCustomView);
        propertyDuration = typedArray.getInteger(R.styleable.PropertyCustomView_propertyDuration, 0);
        propertyGender = typedArray.getString(R.styleable.PropertyCustomView_propertyGender);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(TAG,"========onDraw");
    }
}
