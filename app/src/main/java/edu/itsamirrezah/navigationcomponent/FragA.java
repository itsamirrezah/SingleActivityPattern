package edu.itsamirrezah.navigationcomponent;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragA extends Fragment {

    FloatingActionButton fabLogin;
    EditText etUsername, etPassword;

    public FragA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_a, container, false);
        fabLogin = view.findViewById(R.id.fabLogin);
        etUsername = view.findViewById(R.id.etUsername);
        etPassword = view.findViewById(R.id.etPassword);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fabLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragADirections.ActionNavigateToFragmentB action =
                        FragADirections.actionNavigateToFragmentB(
                                etUsername.getText().toString(),
                                etPassword.getText().toString()
                        );
                Navigation.findNavController(v).navigate(action);
            }
        });
    }
}
