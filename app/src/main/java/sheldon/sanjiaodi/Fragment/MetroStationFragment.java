package sheldon.sanjiaodi.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import sheldon.sanjiaodi.BaseFragment;
import sheldon.sanjiaodi.R;

/**
 * Created by Sheldon on 2016/3/18.
 */
public class MetroStationFragment extends BaseFragment{
    @Override
    protected View initView(LayoutInflater inflater) {
        View view = inflater.inflate(R.layout.fragment_metro_station, null);
        return view;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void setListener() {

    }
}