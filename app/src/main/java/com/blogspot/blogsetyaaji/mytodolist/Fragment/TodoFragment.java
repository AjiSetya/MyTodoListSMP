package com.blogspot.blogsetyaaji.mytodolist.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.blogspot.blogsetyaaji.mytodolist.R;
import com.blogspot.blogsetyaaji.mytodolist.db.MyDatabaseHelper;
import com.blogspot.blogsetyaaji.mytodolist.model.Todo;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TodoFragment extends Fragment {

    private RecyclerView lvTodo;
    private List<Todo> todoList = new ArrayList<>();
    private LinearLayout todoKosong;
    private TodoAdapter todoAdapter;

    private MyDatabaseHelper myDatabaseHelper;

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
        View view = inflater.inflate(R.layout.fragment_todo, container, false);

        lvTodo = view.findViewById(R.id.lvTodo);
        todoKosong = view.findViewById(R.id.todoKosong);

        myDatabaseHelper = new MyDatabaseHelper(getActivity());

        // meletakkan semua data ke dalam list
        todoList.addAll(myDatabaseHelper.ambilSemuaData());

        todoAdapter = new TodoAdapter(getActivity(), todoList);

        return view;
    }

}
