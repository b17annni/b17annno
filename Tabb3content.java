package com.example.b17annni.woff;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by b17annni on 2018-05-20.
 */

public class Tabb3content extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tabb3,
                container, false);
        TextView tv= (TextView) view.findViewById(R.id.mytextviewer);
        tv.setText("This has been created for thoose whom life without quotes is just not worth living.");
        return view;
    }
}
