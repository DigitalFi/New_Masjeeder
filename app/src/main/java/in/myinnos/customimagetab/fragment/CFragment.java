package in.myinnos.customimagetab.fragment;

/**
 * Created by 10 on 21-02-2017.
 */

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.myinnos.customimagetab.R;


public class CFragment extends Fragment {
    public static CFragment newInstance(){ return new CFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_c, container, false);

        return rootView;
    }
}