package com.cart.shoppingusageapp.baseview;

public interface ObservableView<ListenerType> extends ViewRoot {

    /**
     * Register a listener that will be notified of any input events performed on this MVC view
     */
    void registerListener(ListenerType listener);

    /**
     * Unregister a previously registered listener. Does nothing if the listener wasn't registered.
     */
    void unregisterListener(ListenerType listener);

}
