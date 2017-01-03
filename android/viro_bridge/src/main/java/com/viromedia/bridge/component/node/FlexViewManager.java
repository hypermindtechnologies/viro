/*
 * Copyright © 2016 Viro Media. All rights reserved.
 */
package com.viromedia.bridge.component.node;


import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class FlexViewManager extends NodeManager<FlexView> {

    public FlexViewManager(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "VRTFlexView";
    }

    @Override
    protected FlexView createViewInstance(ThemedReactContext reactContext) {
        return new FlexView(reactContext);
    }

    @ReactProp(name = "width", defaultFloat = 1)
    public void setWidth(FlexView view, float width) {
        view.setWidth(width);
    }

    @ReactProp(name = "height", defaultFloat = 1)
    public void setHeight(FlexView view, float height) {
        view.setHeight(height);
    }

    @ReactProp(name = "backgroundColor")
    public void setBackgroundColor(FlexView view, int color) {
        view.setBackgroundColor(color);
    }
}