
package com.nicaiya.canvaslayout.library;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.ViewGroup.LayoutParams;

public interface UIElement {
    public boolean swapHost(UIElementHost host);
    public boolean isAttachedToHost();

    public int getId();

    public int getMeasuredWidth();
    public int getMeasuredHeight();

    public int getPaddingLeft();
    public int getPaddingTop();
    public int getPaddingRight();
    public int getPaddingBottom();
    public void setPadding(int left, int top, int right, int bottom);

    public int getLeft();
    public int getTop();
    public int getRight();
    public int getBottom();

    public int getWidth();
    public int getHeight();

    public void setLayoutParams(LayoutParams lp);
    public LayoutParams getLayoutParams();

    public void onFinishInflate();

    public void measure(int widthMeasureSpec, int heightMeasureSpec);
    public void layout(int left, int top, int right, int bottom);
    public void draw(Canvas canvas);
    public void drawableStateChanged();

    public Context getContext();
    public Resources getResources();

    public void requestLayout();
    public void invalidate();

    public int getVisibility();
    public void setVisibility(int visibility);
}