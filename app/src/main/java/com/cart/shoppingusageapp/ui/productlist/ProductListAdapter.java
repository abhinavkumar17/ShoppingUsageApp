package com.cart.shoppingusageapp.ui.productlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cart.shoppingusageapp.ImageLoader;
import com.cart.shoppingusageapp.R;
import com.cart.shoppingusageapp.model.prod.Object;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.cart.shoppingusageapp.Constants.PLACEHOLDER_URL;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder> {

    public interface ProductSelectionListener {
        void onProductClick(Object product);
    }

    private List<Object> data = new ArrayList<>();
    private ProductSelectionListener mProductSelectionListener;
    private final ImageLoader mImageLoader;

    public ProductListAdapter(ProductSelectionListener mProductSelectionListener, ImageLoader imageLoader) {
        this.mProductSelectionListener = mProductSelectionListener;
        mImageLoader = imageLoader;
    }

    public void setProductData(List<Object> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_product_list_adapter, parent, false);
        return new ProductViewHolder(view, mProductSelectionListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int position) {
        productViewHolder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    final class ProductViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.img_user_avatar)
        ImageView avatar;

        @BindView(R.id.product_img)
        ImageView product_img;

        @BindView(R.id.user_id)
        TextView user_id;

        @BindView(R.id.location)
        TextView location;

        @BindView(R.id.price_currency)
        TextView price;

        private Object product;

        ProductViewHolder(@NonNull View itemView, final ProductSelectionListener productSelectionListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(v -> {
                if (this.product != null && productSelectionListener != null) {
                    productSelectionListener.onProductClick(product);
                }
            });

        }

        void bind(Object product) {
            this.product = product;
            mImageLoader.loadImage(PLACEHOLDER_URL, avatar);
            user_id.setText(Integer.toString(product.getId()));
            location.setText(product.getAddress());
            price.setText(product.getPriceCurrency().concat(" ").concat( product.getPriceAmount()));
            mImageLoader.loadImage(product.getPicturesData().get(0).getFormats().getP0().getUrl(), product_img);
        }
    }
}
