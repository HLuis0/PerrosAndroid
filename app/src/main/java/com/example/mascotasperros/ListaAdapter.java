package com.example.mascotasperros;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder>{
    private List<ListaElement> datos;
    private LayoutInflater mInflater;
    private Context context;

    public ListaAdapter(List<ListaElement> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.datos = itemList;

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public ListaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.lista_elementos, null);
        return new ListaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListaAdapter.ViewHolder holder, final int position) {
        holder.bindData(datos.get(position));
    }

    public void setItems(List<ListaElement> items) {
        datos = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;

        ViewHolder(View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imagen);
        }

        void bindData(final ListaElement item) {
            imagen = itemView.findViewById(R.id.imagen);
        }
    }
}

