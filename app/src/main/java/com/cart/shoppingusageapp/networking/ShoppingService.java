package com.cart.shoppingusageapp.networking;

import com.cart.shoppingusageapp.model.Product;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShoppingService {

    @GET("popular/?{limit}&offset_id=")
    Call<Product> getProductList(@Query("limit") Integer limit);
    //https://api.garage.me/api/v1/products/popular/?limit=10&offset_id=

   // @GET("/questions/{questionId}?site=stackoverflow&filter=withbody")
    //Call<SingleQuestionResponseSchema> questionDetails(@Path("questionId") String questionId);

   // @POST("cloths/cart")
   // Call<Void> addCartItem(@Query("productId") int productId );
    //https://2klqdzs603.execute-api.eu-west-2.amazonaws.com/cloths/cart?productId=1

    //@GET("/questions?order=desc&sort=activity&site=stackoverflow&filter=withbody")
   // Call<Product> lastActiveQuestions(@Query("pagesize") Integer pageSize);
}
