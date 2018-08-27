package in.myinnos.customimagetab;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import in.myinnos.customimagetab.fragment.AFragment;
import in.myinnos.customimagetab.fragment.BFragment;
import in.myinnos.customimagetab.fragment.CFragment;
import in.myinnos.customimagetab.fragment.DFragment;
import in.myinnos.customimagetablayout.ChangeColorTab;

public class MainActivity extends AppCompatActivity {

    FragmentPagerAdapter adapterViewPager;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewpager);
        ChangeColorTab changeColorTab = (ChangeColorTab) findViewById(R.id.tabChangeColorTab);
        changeColorTab.setViewpager(mViewPager);
        // Attach page Adapter
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapterViewPager);

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 4;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        Fragment fragment;

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    fragment = new AFragment();
                    return fragment;
                case 1:
                    fragment = new BFragment();
                    return fragment;
                case 2:
                    fragment = new CFragment();
                    return fragment;
                case 3:
                    fragment = new DFragment();
                    return fragment;
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }
    }
    @Nullable
    public void onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.listview_layout,container,false);
        mListView = findViewById(R.id.listView);

        ArrayList<Card> list = new ArrayList<>();
        list.add(new Card("drawable://" + R.drawable.kajian1, "Kajian1"));
        list.add(new Card("drawable://" + R.drawable.kajian2, "Kajian2"));
        list.add(new Card("drawable://" + R.drawable.kajian3, "Kajian3"));
        list.add(new Card("drawable://" + R.drawable.kajian4, "Kajian4"));

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.fragment_a, list);
        mListView.setAdapter(adapter);

    }
}
