package com.example.paymentpages;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.ViewHolder> {

    private List<Model> models;

    public PaymentAdapter(List<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.billing_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.profilePic.setImageResource(models.get(position).getImage());
        holder.Username.setText(models.get(position).getUsername());
        holder.Total.setText(models.get(position).getTotal());
        holder.Paid.setText(models.get(position).getPaid());
        holder.PaidDate.setText(models.get(position).getPaidDate());
        holder.Due.setText(models.get(position).getDue());
        holder.Edit.setText(models.get(position).getEdit());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView profilePic;
        TextView Username;
        TextView Total;
        TextView Paid;
        TextView PaidDate;
        TextView Due;
        TextView Edit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profilePic = itemView.findViewById(R.id.pic);
            Username = itemView.findViewById(R.id.username);
            Total = itemView.findViewById(R.id.total);
            Paid = itemView.findViewById(R.id.paid);
            PaidDate = itemView.findViewById(R.id.paidDate);
            Due = itemView.findViewById(R.id.due);
            Edit = itemView.findViewById(R.id.edit);
        }
    }
}
