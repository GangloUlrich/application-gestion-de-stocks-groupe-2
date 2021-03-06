package com.example.gstocks.Fragments;

import android.os.Bundle;

import androidx.appcompat.widget.MenuPopupWindow;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.gstocks.R;



public class OperationFragment extends Fragment {

    private Spinner liste_categorie;
    private Spinner liste_produits;
    private Button newOperation;



    public OperationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View pageView =inflater.inflate(R.layout.fragment_operation, container, true);
        liste_categorie=(Spinner) pageView.findViewById(R.id.liste_categorie);
        liste_produits=(Spinner) pageView.findViewById(R.id.liste_produits);
        newOperation =(Button) pageView.findViewById(R.id.newOperation);

        String[] items = new String[]{"Biscuits", "Chocolats", "Vin" , "Jus" , "Yaourts", "Jouets"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, items);;
        liste_categorie.setAdapter(adapter);



        return pageView;
    }
}