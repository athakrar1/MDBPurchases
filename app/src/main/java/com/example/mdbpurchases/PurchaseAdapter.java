package com.example.mdbpurchases;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PurchaseAdapter extends RecyclerView.Adapter<PurchaseAdapter.CustomViewHolder> implements Filterable {
    Context context;
    private ArrayList<Purchase> allPurchase;
    private ArrayList<Purchase> filteredPurchase;

    public PurchaseAdapter(Context context, ArrayList<Purchase> purchaseList) {
        this.context = context;
        allPurchase = new ArrayList<>();
        allPurchase.addAll(purchaseList);
        filteredPurchase = new ArrayList<>();
        filteredPurchase.addAll(purchaseList);
    }

    @NonNull
    @Override
    public PurchaseAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PurchaseAdapter.CustomViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public Filter getFilter() {
        return null;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {


        public CustomViewHolder(View itemView) {
            super(itemView);

        }

        public void bind(Purchase purchase) {

        }
    }
}
