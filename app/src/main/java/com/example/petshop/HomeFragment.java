package com.example.petshop;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    public HomeFragment() {

    }

private RecyclerView categoryRecycleView;
    private CategoryAdapter categoryAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        categoryRecycleView=view.findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecycleView.setLayoutManager(layoutManager);

        List<CategoryModel> categoryModelList=new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link", "Bird"));
        categoryModelList.add(new CategoryModel("link", "Cat"));
        categoryModelList.add(new CategoryModel("link", "Dog"));
        categoryModelList.add(new CategoryModel("link", "Fish"));
        categoryModelList.add(new CategoryModel("link", "Cow"));
        categoryModelList.add(new CategoryModel("link", "Sheep"));
        categoryModelList.add(new CategoryModel("link", "Hamster"));
        categoryModelList.add(new CategoryModel("link", "Lizard"));
        categoryModelList.add(new CategoryModel("link", "Turtle"));
        categoryModelList.add(new CategoryModel("link", "Rabbit"));
        categoryModelList.add(new CategoryModel("link", "Snake"));
        categoryModelList.add(new CategoryModel("link", "Horse"));



        categoryAdapter=new CategoryAdapter(categoryModelList);
        categoryRecycleView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        return view;

    }

}
