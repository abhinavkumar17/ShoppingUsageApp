package com.cart.shoppingusageapp.baseview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.cart.shoppingusageapp.ImageLoader;
import com.cart.shoppingusageapp.ui.ProductListView;
import com.cart.shoppingusageapp.ui.ProductListViewImpl;

import javax.inject.Inject;

public class ViewFactory {

    private final LayoutInflater mLayoutInflater;
    private ImageLoader mImageLoader;

    @Inject
    public ViewFactory(LayoutInflater layoutInflater, ImageLoader imageLoader) {
        mLayoutInflater = layoutInflater;
        mImageLoader = imageLoader;
    }

    /**
     * Instantiate a new implementation of MVC view. The returned instance will be casted to MVC view
     * type inferred by java's automatic type inference.
     * @param mvcViewClass the class of the required MVC view
     * @param container this container will be used as MVC view's parent. See {@link LayoutInflater#inflate(int, ViewGroup)}
     * @param <T> the type of the required MVC view
     * @return new instance of MVC view
     */
    public <T extends ViewRoot> T newInstance(Class<T> mvcViewClass, @Nullable ViewGroup container) {

        ViewRoot viewMvc;

        if (mvcViewClass == ProductListView.class) {
            viewMvc = new ProductListViewImpl(mLayoutInflater, container);
        }
        else {
            throw new IllegalArgumentException("unsupported MVC view class " + mvcViewClass);
        }

        //noinspection unchecked
        return (T) viewMvc;
    }
}
