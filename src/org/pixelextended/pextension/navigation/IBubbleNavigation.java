package org.pixelextended.pextension.navigation;

import android.graphics.Typeface;
import org.pixelextended.pextension.navigation.BubbleNavigationChangeListener;

@SuppressWarnings("unused")
public interface IBubbleNavigation {
    void setNavigationChangeListener(BubbleNavigationChangeListener navigationChangeListener);

    void setTypeface(Typeface typeface);

    int getCurrentActiveItemPosition();

    void setCurrentActiveItem(int position);
}
