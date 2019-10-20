package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragment.ShopDetail_PhotoSlide1;
import fragment.ShopDetail_PhotoSlide2;


public class ShopDetailSlidePagerAdapter extends FragmentStatePagerAdapter  {



    public ShopDetailSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                ShopDetail_PhotoSlide1 tab1 = new ShopDetail_PhotoSlide1();
                return tab1;

            case 1:
                ShopDetail_PhotoSlide2 tab6 = new ShopDetail_PhotoSlide2();
                return tab6;

            case 2:
                ShopDetail_PhotoSlide1 tab2 = new ShopDetail_PhotoSlide1();
                return tab2;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}