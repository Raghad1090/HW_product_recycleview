package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.products

class Datasource {

    fun loadProducts() : List<products> {

        return listOf<products> (
            products(R.string.product1,R.string.price1,true ,R.string.quantityNumber1,R.drawable.iphone),
            products(R.string.product2,R.string.price2,false,R.string.quantityNumber2,R.drawable.samsung_galaxy_uitra),
            products(R.string.product3,R.string.price3,true,R.string.quantityNumber3,R.drawable.xiaomi_pro),
            products(R.string.product4,R.string.price4,false,R.string.quantityNumber4,R.drawable.huawei_yp),
            products(R.string.product5,R.string.price5,true,R.string.quantityNumber5,R.drawable.samsung_galaxy_z_flip),
            products(R.string.product6,R.string.price6,true,R.string.quantityNumber6,R.drawable.iphone13)
        )
    }
}
