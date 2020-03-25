package com.cart.shoppingusageapp.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cart.shoppingusageapp.R;
import com.cart.shoppingusageapp.model.prod.Product;
import com.cart.shoppingusageapp.model.prod.Object;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>{

    public interface ProductSelectionListener{
        void onProductClick(Product product);
    }

    private List<Object> data = new ArrayList<>();
    private ProductSelectionListener mProductSelectionListener;

    public ProductListAdapter(ProductSelectionListener mProductSelectionListener) {
        this.mProductSelectionListener = mProductSelectionListener;
    }

    public void setProductData(List<Object> data){
        this.data= data;
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


    static final class ProductViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.wishlist_category)
        TextView categoryTextView;

        @BindView(R.id.wishlist_product_price)
        TextView productPrice;

        @BindView(R.id.wishlist_product_name)
        TextView productName;

        @BindView(R.id.wishlist_product_old_price)
        TextView producOldPrice;

        @BindView(R.id.wishlist_product_discounted_price)
        TextView producDiscountedPrice;

        @BindView(R.id.wishlist_product_stock)
        TextView producStock;

        private Object product;

        ProductViewHolder(@NonNull View itemView, final ProductSelectionListener productSelectionListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(v -> {
                if (this.product != null && productSelectionListener != null) {
                    //productSelectionListener.onProductClick(this.product);
                }
            });

        }

        void bind(Object product) {
            this.product = product;
            productName.setText(product.getUserId());
            categoryTextView.setText(product.getAddress());
            productPrice.setText(product.getCountry());
            producOldPrice.setText(product.getPriceAmount());
            //producStock.setText(Integer.toString(product.getStock()));
        }
    }
}
