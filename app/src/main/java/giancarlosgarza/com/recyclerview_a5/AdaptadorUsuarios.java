package giancarlosgarza.com.recyclerview_a5;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorUsuarios extends RecyclerView.Adapter<AdaptadorUsuarios.ViewHolderUsers>{

    ArrayList<Usuario> listaUsuarios;

    public AdaptadorUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public ViewHolderUsers onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null,false);
        return new ViewHolderUsers(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderUsers holder, int position) {
        holder.AUNombre.setText(listaUsuarios.get(position).getNombre());
        holder.AUApellido.setText(listaUsuarios.get(position).getApellido());
        holder.AUEdad.setText(listaUsuarios.get(position).getEdad());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class ViewHolderUsers extends RecyclerView.ViewHolder {

        TextView AUNombre, AUApellido, AUEdad;

        public ViewHolderUsers(View itemView) {
            super(itemView);
            AUNombre = (TextView) itemView.findViewById(R.id.idNombre);
            AUApellido = (TextView) itemView.findViewById(R.id.idApellido);
            AUEdad = (TextView) itemView.findViewById(R.id.idEdad);
        }
    }
}
