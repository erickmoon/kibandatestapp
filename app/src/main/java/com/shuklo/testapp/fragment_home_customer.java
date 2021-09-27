package com.shuklo.testapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_home_customer#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_home_customer extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_home_customer() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_home_customer.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_home_customer newInstance(String param1, String param2) {
        fragment_home_customer fragment = new fragment_home_customer();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ShimmerFrameLayout dummy_sponsored_products = view.findViewById(R.id.dummy_sponsored_products);
        ShimmerFrameLayout dummy_top_product = view.findViewById(R.id.dummy_top_product);
        ShimmerFrameLayout dummy_other_products = view.findViewById(R.id.dummy_other_products);

        dummy_sponsored_products.startShimmer();
        dummy_sponsored_products.showShimmer(true);

        dummy_other_products.startShimmer();
        dummy_other_products.showShimmer(true);

        dummy_top_product.showShimmer(true);
        dummy_top_product.startShimmer();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_customer, container, false);
    }
}