package com.example.b17annni.woff;

/**
 * Created by b17annni on 2018-05-20.
 */

import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class Tabb1content extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabb1,
                container, false);
        TextView tv= (TextView) view .findViewById(R.id.mytextview);
        tv.setText("Welcome stranger to this world of wonder. Here you can browse quotes to your hearts content. We are sorry that Life has found you here but do not distress you are welcome anyway.");
        return view;
    }

}
