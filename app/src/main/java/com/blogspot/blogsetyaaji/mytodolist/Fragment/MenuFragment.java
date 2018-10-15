package com.blogspot.blogsetyaaji.mytodolist.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.blogsetyaaji.mytodolist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    private RecyclerView lvmenu;
    private String[] menuApp = {"Todo", "Progress", "Done"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        lvmenu = (RecyclerView) view.findViewById(R.id.lvmenu);
        // pengaturan tampilan susunan data
        lvmenu.setLayoutManager(new LinearLayoutManager(getActivity()));
        // masukkan data ke adapter
        MyMenuAdapter myMenuAdapter = new MyMenuAdapter(getActivity(), menuApp);
        // pasang adapter dengan recyclerview
        lvmenu.setAdapter(myMenuAdapter);
        return view;
    }

}
