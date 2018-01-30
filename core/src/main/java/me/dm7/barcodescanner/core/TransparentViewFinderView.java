package me.dm7.barcodescanner.core;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class TransparentViewFinderView extends View implements IViewFinder {
    private static final String TAG = "ViewFinderView";

    private Rect mFramingRect;

    public TransparentViewFinderView(Context context) {
        super(context);
    }

    public TransparentViewFinderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void setLaserColor(int laserColor) {

    }

    @Override
    public void setMaskColor(int maskColor) {

    }

    @Override
    public void setBorderColor(int borderColor) {

    }

    @Override
    public void setBorderStrokeWidth(int borderStrokeWidth) {

    }

    @Override
    public void setBorderLineLength(int borderLineLength) {

    }

    @Override
    public void setLaserEnabled(boolean isLaserEnabled) {

    }

    @Override
    public void setBorderCornerRounded(boolean isBorderCornersRounded) {

    }

    @Override
    public void setBorderAlpha(float alpha) {

    }

    @Override
    public void setBorderCornerRadius(int borderCornersRadius) {

    }

    @Override
    public void setViewFinderOffset(int offset) {

    }

    @Override
    public void setSquareViewFinder(boolean isSquareViewFinder) {

    }

    public void setupViewFinder() {
        updateFramingRect();
        invalidate();
    }

    public Rect getFramingRect() {
        return mFramingRect;
    }


    @Override
    protected void onSizeChanged(int xNew, int yNew, int xOld, int yOld) {
        updateFramingRect();
    }

    public synchronized void updateFramingRect() {
        mFramingRect = new Rect(0, 0, getWidth(), getHeight());
    }
}
