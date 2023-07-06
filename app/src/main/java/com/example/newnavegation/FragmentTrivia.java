package com.example.newnavegation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.newnavegation.databinding.FragmentTriviaBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTrivia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTrivia extends Fragment {
    private FragmentTriviaBinding binding;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "nombre";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentTrivia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentTrivia.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentTrivia newInstance(String param1, String param2) {
        FragmentTrivia fragment = new FragmentTrivia();
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
            mParam2= getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentTriviaBinding.inflate(getLayoutInflater(),container,false);

        binding.hola.setText("Hola"+ mParam1);

        binding.enviarBoton.setOnClickListener(v -> {
            if(binding.radioGroup.getCheckedRadioButtonId() == binding.andy.getId()){
                Toast.makeText(getContext(),"Correctooo", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getContext(),"Nooooo", Toast.LENGTH_LONG).show();

            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}