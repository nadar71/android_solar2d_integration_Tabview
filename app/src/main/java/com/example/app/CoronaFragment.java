package com.example.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ansca.corona.CoronaView;

public class CoronaFragment extends Fragment {
    private CoronaView mCoronaView;

    /**
     * The Fragment's UI is just a simple text view showing its
     * instance number.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.corona, container, false);
        mCoronaView = (CoronaView)v.findViewById(R.id.corona_view);
        mCoronaView.init("RagDoll/");
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        mCoronaView.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mCoronaView.pause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mCoronaView.destroy();
    }
}