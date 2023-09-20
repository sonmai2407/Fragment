package com.example.test_fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuFrag extends Fragment {
    String[] menus = {"Flowers", "Animals", "Foods"};
    ListView list;
    IFragmentClickListener itemfragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_frag, container, false);
        list = view.findViewById(R.id.list);
        ArrayAdapter<String> listadapter = new ArrayAdapter<>(view.getContext(), R.layout.menu_layout, menus);
        list.setAdapter(listadapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Notify the parent activity or fragment about the item click
                if (itemfragment != null) {
                    itemfragment.onMenuItemClick(position);
                }
            }
        });
        return view;
    }

    public interface IFragmentClickListener {
        void onMenuItemClick(int position);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            itemfragment = (IFragmentClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement IFragmentClickListener");
        }
    }
}





