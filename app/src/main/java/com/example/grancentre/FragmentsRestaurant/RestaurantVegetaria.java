package com.example.grancentre.FragmentsRestaurant;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grancentre.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestaurantVegetaria#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantVegetaria extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    OnRestaurantVegetariaFragmentListener mListener;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RestaurantVegetaria() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestaurantVegetaria.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantVegetaria newInstance(String param1, String param2) {
        RestaurantVegetaria fragment = new RestaurantVegetaria();
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
        View myView = inflater.inflate(R.layout.fragment_restaurant_vegetaria, container, false);

        com.google.android.material.button.MaterialButton website1 = myView.findViewById(R.id.websiteRestaurantVegetaria_1);
        com.google.android.material.button.MaterialButton telefon1 = myView.findViewById(R.id.telefonRestaurantVegetaria_1);

        com.google.android.material.button.MaterialButton website2 = myView.findViewById(R.id.websiteRestaurantVegetaria_2);
        com.google.android.material.button.MaterialButton telefon2 = myView.findViewById(R.id.telefonRestaurantVegetaria_2);

        com.google.android.material.button.MaterialButton website3 = myView.findViewById(R.id.websiteRestaurantVegetaria_3);
        com.google.android.material.button.MaterialButton telefon3 = myView.findViewById(R.id.telefonRestaurantVegetaria_3);

        website1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onRestaurantVegetariaLayoutCreated(view);
            }
        });
        website2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onRestaurantVegetariaLayoutCreated(view);
            }
        });
        website3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onRestaurantVegetariaLayoutCreated(view);
            }
        });
        telefon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onRestaurantVegetariaLayoutCreated(view);
            }
        });
        telefon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onRestaurantVegetariaLayoutCreated(view);
            }
        });
        telefon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: aquí cridem al mètode de l'activitat, és com si fos un onClick,
                //li passem la view on s'ha clicat
                mListener.onRestaurantVegetariaLayoutCreated(view);
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
        if (context instanceof RestaurantVegetaria.OnRestaurantVegetariaFragmentListener){
            mListener= (RestaurantVegetaria.OnRestaurantVegetariaFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString() + "ha d'implementar OnRestaurantVegetariaFragmentListener");
        }
    }
    public interface OnRestaurantVegetariaFragmentListener {
        void onRestaurantVegetariaLayoutCreated(View v);
    }

    public interface ViewInterface {
    }
}