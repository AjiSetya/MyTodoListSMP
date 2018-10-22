package com.blogspot.blogsetyaaji.mytodolist.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.blogsetyaaji.mytodolist.R;
import com.blogspot.blogsetyaaji.mytodolist.model.Todo;

/**
 * A simple {@link Fragment} subclass.
 */
public class TodoFragment extends Fragment {


    public TodoFragment() {
        // Required empty public constructor
    }

    String nama;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //toodo toodo = new Toodo(1, "makan malam", "makan malam bersama teman", "besok", "todo");
        // tampikan nama
        //Log.d("NAMA", todoo.getNama());
        // ubah nama
        //toodo.setNama("bermain bola");
        // tampilkan nama
        //Log.d("NAMA", todoo.getNama());
        return inflater.inflate(R.layout.fragment_todo, container, false);
    }

}
