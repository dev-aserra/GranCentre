package com.example.grancentre.FragmentsHotel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.grancentre.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Hotel2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Hotel2 extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    OnHotel2FragmentListener mListener;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView resultat;
    public Hotel2() {
        // Required empty public constructor
    }



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment hotel2.
     */
    // TODO: Rename and change types and number of parameters
    public static Hotel2 newInstance(String param1, String param2) {
        Hotel2 fragment = new Hotel2();
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
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_hotel2, container, false);

        com.google.android.material.button.MaterialButton website1 = myView.findViewById(R.id.websiteHotel2Estrellas_1);
        com.google.android.material.button.MaterialButton telefon1 = myView.findViewById(R.id.telefonHotel2Estrellas_1);

        com.google.android.material.button.MaterialButton website2 = myView.findViewById(R.id.websiteHotel2Estrellas_2);
        com.google.android.material.button.MaterialButton telefon2 = myView.findViewById(R.id.telefonHotel2Estrellas_2);

        com.google.android.material.button.MaterialButton website3 = myView.findViewById(R.id.websiteHotel2Estrellas_3);
        com.google.android.material.button.MaterialButton telefon3 = myView.findViewById(R.id.telefonHotel2Estrellas_3);

        website1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onHotel2LayoutCreated(view);
            }
        });
        website2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onHotel2LayoutCreated(view);
            }
        });
        website3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onHotel2LayoutCreated(view);
            }
        });
        telefon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onHotel2LayoutCreated(view);
            }
        });
        telefon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onHotel2LayoutCreated(view);
            }
        });
        telefon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onHotel2LayoutCreated(view);
            }
        });
        return myView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    //Afegit mètode onAttach per inicialitzar el listener
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnHotel2FragmentListener){
            mListener= (OnHotel2FragmentListener) context;
        } else {
            throw new RuntimeException(context.toString() + "ha d'implementar OnHotel2FragmentListener");
        }

    }


    //TODO: Esborrar d'aquí el onClick



    public interface OnHotel2FragmentListener {
        void onHotel2LayoutCreated(View v);
    }

    public interface ViewInterface {
    }
}