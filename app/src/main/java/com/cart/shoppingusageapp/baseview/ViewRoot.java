package com.cart.shoppingusageapp.baseview;

import android.view.View;

public interface ViewRoot {
    /**
     * Get the root Android View which is used internally by this MVC View for presenting data
     * to the user.<br>
     * The returned Android View might be used by an MVC Controller in order to query or alter the
     * properties of either the root Android View itself, or any of its child Android View's.
     * @return root Android View of this MVC View
     */
    View getRootView();
}
