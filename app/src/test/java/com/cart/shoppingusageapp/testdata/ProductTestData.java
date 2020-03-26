package com.cart.shoppingusageapp.testdata;

        import com.cart.shoppingusageapp.model.prod.Object;
        import com.cart.shoppingusageapp.model.prod.PicturesDatum;
        import com.cart.shoppingusageapp.model.prod.UserData;
        import com.cart.shoppingusageapp.model.prod.Variants;

        import java.util.ArrayList;
        import java.util.List;

public class ProductTestData {

    private static List<PicturesDatum> picturesData = null;
    private static List<Integer> categories = null;
    private static UserData data= new UserData();
    private static Variants variants= new Variants();

    public static List<Object> getProduct() {
        List<Object> list = new ArrayList<Object>();
        list.add(new Object(
                "3",
        2,
                picturesData,
        "20",
        "20-03-20",
        "This is description",
        "20",
        "active",
        "UK",
        "",
       "",
        "15",
        1,
        11,
        false,
        "12",
       "",
        true,
                categories,
        "Manchester",
        "",
                data,
                variants,
       "40"
        ));


        return list;
    }
}
