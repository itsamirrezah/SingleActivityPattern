package edu.itsamirrezah.navigationcomponent;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragB extends Fragment {

    TextView tvUsername, tvPassword;

    public FragB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_b, container, false);
        tvUsername = view.findViewById(R.id.tvUsername);
        tvPassword = view.findViewById(R.id.tvPassword);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String username = FragBArgs.fromBundle(getArguments()).getUsername();
        String password = FragBArgs.fromBundle(getArguments()).getPassword();

        tvUsername.setText(username.length() > 0 ? username : "NO-USERNAME");
        tvPassword.setText(password.length() > 0 ? tvPassword.getText().toString() + password :
                tvPassword.getText().toString() + "NO-USERNAME");

    }
}
