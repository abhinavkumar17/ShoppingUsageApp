package com.cart.shoppingusageapp.ui.productdetails;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cart.shoppingusageapp.Constants;
import com.cart.shoppingusageapp.ImageLoader;
import com.cart.shoppingusageapp.R;
import com.cart.shoppingusageapp.baseview.BaseView;
import com.cart.shoppingusageapp.model.prod.Object;

public class ProductDetailsFragmentImpl extends BaseView<ProductDetailsView.Listener> implements ProductDetailsView {

    private final ImageView mAvatar;

    private final ImageView mProductImage;

    private final TextView mUsetId;

    private final TextView mLocation;

    private final TextView mPrice;

    private final TextView mDescription;

    private ImageLoader mImageLoader;


    public ProductDetailsFragmentImpl(LayoutInflater inflater, ViewGroup container, ImageLoader imageLoader) {
        setRootView(inflater.inflate(R.layout.fragment_product_details, container, false));
        mAvatar = findViewById(R.id.img_user_avatar);
        mProductImage = findViewById(R.id.product_img);
        mUsetId = findViewById(R.id.user_id);
        mLocation = findViewById(R.id.location);
        mPrice = findViewById(R.id.price_currency);
        mDescription = findViewById(R.id.product_description);
        mImageLoader = imageLoader;
    }


    @Override
    public void setProductDetailData(Object product) {
        mImageLoader.loadImage(Constants.PLACEHOLDER_URL, mAvatar);
        mUsetId.setText(Integer.toString(product.getId()));
        mLocation.setText(product.getAddress());
        mPrice.setText(product.getPriceAmount().concat("").concat(product.getPriceCurrency()));
        mImageLoader.loadImage(product.getPicturesData().get(0).getFormats().getP0().getUrl(), mProductImage);
        mDescription.setText(product.getDescription());
    }
}
