package com.example.grishma.viewpagermore;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[][] myDataset = new String[][]{
            {"Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha", "Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha"},
            {"Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha", "Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha"},
            {"Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha", "Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha"},
            {"Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha", "Grishma Shrestha", "Binod Shrestha", "Rajesh Khadka", "Surhid Amatya", "Shilu Shrestha", "Manas Shrestha"}
    };
    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerViewAdapter(myDataset[mPage]);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }
}