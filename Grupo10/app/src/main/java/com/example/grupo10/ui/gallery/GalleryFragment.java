package com.example.grupo10.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.grupo10.R;
import com.example.grupo10.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private TextView tev_gallery;
    private Spinner spn_categorias;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery,container, false);

        tev_gallery = root.findViewById(R.id.text_gallery);
        spn_categorias = root.findViewById(R.id.spn_categorias);

        String[] ccategorias = new String[]{"Beisbol", "Atletismo", "Karate", "Salto triple"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item,ccategorias);

        spn_categorias.setAdapter(adapter);

        spn_categorias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String categoria = spn_categorias.getSelectedItem().toString();
                tev_gallery.setText(categoria);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return root;
    }

}