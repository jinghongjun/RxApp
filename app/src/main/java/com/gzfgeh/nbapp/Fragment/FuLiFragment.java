package com.gzfgeh.nbapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gzfgeh.adapter.BaseViewHolder;
import com.gzfgeh.adapter.RecyclerArrayAdapter;
import com.gzfgeh.nbapp.Bean.ResultBean;
import com.gzfgeh.nbapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FuLiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FuLiFragment extends BaseListFragment {
    public static FuLiFragment newInstance(String param1) {
        FuLiFragment fragment = new FuLiFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void initInject() {
        getActivityComponent().inject(this);
    }

    @Override
    public void initAdapter() {
        adapter = new RecyclerArrayAdapter<ResultBean>(getActivity(), R.layout.item_fu_li) {
            @Override
            protected void convert(BaseViewHolder baseViewHolder, ResultBean resultBean) {
                baseViewHolder.setImageUrl(R.id.image_id, resultBean.getUrl(), R.mipmap.ic_launcher);
            }
        };
    }
}
