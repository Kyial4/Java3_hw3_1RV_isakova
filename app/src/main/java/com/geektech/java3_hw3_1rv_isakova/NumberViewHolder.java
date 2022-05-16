package com.geektech.java3_hw3_1rv_isakova;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class NumberViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNumber;

    public NumberViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNumber = itemView.findViewById(R.id.number);
    }

    public void bind(String number) {
        tvNumber.setText(number);
    }
}
