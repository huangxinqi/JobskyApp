package edu.csu.jobsky.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.csu.jobsky.R;

/**
 * Created by huangxinqi on 16/3/9.
 */

/* create by huangxinqi 
    on 2016-03-09
    作用:
*/
public class UserFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_user,null);
        return view;
    }
}
