package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Nearby;
import fragment.Popular;
import fragment.ReviewDetail;


public class TabofHomepageAdapter extends FragmentStatePagerAdapter {
    int numoftabs;

    public TabofHomepageAdapter(FragmentManager fm, int  mnumoftabs ) {
        super(fm);
        this.numoftabs = mnumoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Nearby tab1 = new Nearby();
                return tab1;

            case 1:
                Popular tab2 = new Popular();
                return tab2;

            case 2:
                ReviewDetail tab3 = new ReviewDetail();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
            return numoftabs;
    }
}
