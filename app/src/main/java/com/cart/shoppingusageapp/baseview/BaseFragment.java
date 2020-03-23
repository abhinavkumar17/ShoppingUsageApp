package com.cart.shoppingusageapp.baseview;

import androidx.annotation.UiThread;
import androidx.fragment.app.Fragment;

import com.cart.shoppingusageapp.MyApplication;
import com.cart.shoppingusageapp.di.application.ApplicationComponent;
import com.cart.shoppingusageapp.di.presentation.PresentationComponent;
import com.cart.shoppingusageapp.di.presentation.PresentationModule;

import java.util.Objects;

public abstract class BaseFragment extends Fragment {

    private boolean mIsInjectorUsed;

    @UiThread
    protected PresentationComponent getPresentationComponent() {
        if (mIsInjectorUsed) {
            throw new RuntimeException("there is no need to use injector more than once");
        }
        mIsInjectorUsed = true;
        return getApplicationComponent()
                .newPresentationComponent(new PresentationModule(getActivity()));

    }

    private ApplicationComponent getApplicationComponent() {
        return ((MyApplication) Objects.requireNonNull(getActivity()).getApplication()).getApplicationComponent();
    }
}
