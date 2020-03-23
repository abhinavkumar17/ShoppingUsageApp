package com.cart.shoppingusageapp.di.application;

import com.cart.shoppingusageapp.di.presentation.PresentationComponent;
import com.cart.shoppingusageapp.di.presentation.PresentationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, NetworkingModule.class})
public interface ApplicationComponent {
    PresentationComponent newPresentationComponent(PresentationModule presentationModule);
}
