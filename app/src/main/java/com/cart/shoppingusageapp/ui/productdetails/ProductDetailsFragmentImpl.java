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
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class ProductDetailsFragmentImpl extends BaseView<ProductDetailsView.Listener> implements ProductDetailsView {

    private int MAX_COROSEL = 4;
    private final ImageView mAvatar;
    private final ImageView mProductImage;
    private final TextView mUsetId;
    private final TextView mLocation;
    private final TextView mPrice;
    private final TextView mDescription;
    private ImageLoader mImageLoader;
    private CarouselView carouselView;
    private Object mProduct;


    public ProductDetailsFragmentImpl(LayoutInflater inflater, ViewGroup container, ImageLoader imageLoader) {
        setRootView(inflater.inflate(R.layout.fragment_product_details, container, false));
        mAvatar = findViewById(R.id.img_user_avatar);
        mProductImage = findViewById(R.id.product_img);
        mUsetId = findViewById(R.id.user_id);
        mLocation = findViewById(R.id.location);
        mPrice = findViewById(R.id.price_currency);
        mDescription = findViewById(R.id.product_description);
        mImageLoader = imageLoader;
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(MAX_COROSEL);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            switch (position) {
                case 1:
                    mImageLoader.loadImage(mProduct.getPicturesData().get(0).getFormats().getP0().getUrl(), imageView);
                    break;

                case 2:
                    mImageLoader.loadImage(mProduct.getPicturesData().get(0).getFormats().getP1().getUrl(), imageView);
                    break;

                case 3:
                    mImageLoader.loadImage(mProduct.getPicturesData().get(0).getFormats().getP2().getUrl(), imageView);
                    break;

                case 4:
                    mImageLoader.loadImage(mProduct.getPicturesData().get(0).getFormats().getP4().getUrl(), imageView);
                    break;

                case 5:
                    mImageLoader.loadImage(mProduct.getPicturesData().get(0).getFormats().getP5().getUrl(), imageView);
                    break;

                default:
                    mImageLoader.loadImage(mProduct.getPicturesData().get(0).getFormats().getP0().getUrl(), imageView);
                    break;
            }
        }
    };

    @Override
    public void setProductDetailData(Object product) {
        mProduct = product;
        mImageLoader.loadImage(Constants.PLACEHOLDER_URL, mAvatar);//No Avatar URL in response - Using default
        mUsetId.setText(Integer.toString(product.getId()));
        mLocation.setText(product.getAddress());
        mPrice.setText(product.getPriceAmount().concat("").concat(product.getPriceCurrency()));
        mDescription.setText(product.getDescription());
    }
}
