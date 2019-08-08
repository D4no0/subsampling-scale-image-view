package com.davemorrissey.labs.subscaleview;

import android.graphics.PointF;
import androidx.annotation.NonNull;

import java.io.Serializable;

/**
 * Wraps the scale, center and orientation of a displayed image for easy restoration on screen rotate.
 * IMPORTANT: For each child class implement parameterless constructor and don't delete this one
 */
@SuppressWarnings("WeakerAccess")
public class ImageViewState implements Serializable {

    private float scale;
    private PointF center;
    private int orientation;

    public ImageViewState() {
        this.scale = 0f;
        this.center = new PointF(0f, 0f);
        this.orientation = 0;
    }

    public ImageViewState(float scale, @NonNull PointF center, int orientation) {
        this.scale = scale;
        this.center = center;
        this.orientation = orientation;
    }

    public float getScale() {
        return scale;
    }
    public void setScale(float scale) { this.scale = scale; }

    @NonNull public PointF getCenter() {
        return center;
    }
    public void setCenter(PointF center) { this.center = center; }

    public int getOrientation() {
        return orientation;
    }
    public void setOrientation(int orientation) { this.orientation = orientation; }

}
