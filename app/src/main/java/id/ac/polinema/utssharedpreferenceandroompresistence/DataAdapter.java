package id.ac.polinema.utssharedpreferenceandroompresistence;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {
    List<KotaModel> kotas;

    public DataAdapter(List<KotaModel> kotas) {
        this.kotas = kotas;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        DataViewHolder viewHolder=new DataViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        KotaModel item = kotas.get(position);
        holder.textItem.setText((item.getNama()));
    }

    @Override
    public int getItemCount() {
        return kotas.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView textItem;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            textItem=itemView.findViewById(R.id.txtItem);
        }
    }
}
