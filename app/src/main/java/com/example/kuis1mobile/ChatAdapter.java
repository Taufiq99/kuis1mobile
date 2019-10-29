package com.example.kuis1mobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private ArrayList<Chat> dataList;

    public ChatAdapter(ArrayList<com.example.kuis1mobile.Chat> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ChatAdapter.ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_chat, parent, false);
        return new ChatViewHolder(view);
    }

    public void onBindViewHolder(ChatViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
        holder.txtAlamat.setText(dataList.get(position).getAlamat());
        holder.Vfoto.setImageResource(dataList.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ChatViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtStatus, txtAlamat;
        private ImageView Vfoto;

        public ChatViewHolder(View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_keluarga);
            txtStatus = (TextView) itemView.findViewById(R.id.txt_status_keluarga);
            txtAlamat= (TextView) itemView.findViewById(R.id.txt_alamat);
            Vfoto = (ImageView) itemView.findViewById(R.id.viewfoto);
        }
    }
}


