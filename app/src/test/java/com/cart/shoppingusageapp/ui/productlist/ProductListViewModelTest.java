package com.cart.shoppingusageapp.ui.productlist;

import com.cart.shoppingusageapp.model.prod.Object;
import com.cart.shoppingusageapp.networking.FetchProductListRepository;
import com.cart.shoppingusageapp.testdata.ProductTestData;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

import static org.mockito.Mockito.verify;

public class ProductListViewModelTest {
    // region constants ----------------------------------------------------------------------------
    private static final List<Object> PRODUCT_DETAILS = ProductTestData.getProduct();
    // endregion constants -------------------------------------------------------------------------

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    ProductListViewModel.Listener mListener1;
    @Mock
    ProductListViewModel.Listener mListener2;

    @Mock
    private FetchProductListRepository mFetchProductListRepository;

    ProductListViewModel SUT;


    @Before
    public void setUp() throws Exception {
        SUT = new ProductListViewModel(mFetchProductListRepository);
        SUT.registerListener(mListener1);
        SUT.registerListener(mListener2);
    }

    @Test
    public void fetchProductSecessAndNotify_success_listenersNotifiedWithCorrectData() throws Exception {
        // Arrange
        // Act
        SUT.onFetchProductSecessAndNotify(PRODUCT_DETAILS);
        // Assert
        verify(mListener1).onFetchProductSecessAndNotify(PRODUCT_DETAILS);
    }

    @Test
    public void fetchProductFailAndNotify_fail_listenersNotified() throws Exception {
        // Arrange
        // Act
        SUT.onFetchProductFailAndNotify();
        // Assert
        verify(mListener1).onFetchProductFailAndNotify();
    }

    @Test
    public void fetchProduct_sucess_add_to_compositable_true() throws Exception {
        // Arrange
        // Act
        SUT.fetchProductList();
        // Assert
        verify(mFetchProductListRepository).fetchProductList();
    }
}