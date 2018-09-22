package giancarlosgarza.com.recyclerview_a5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Usuario> listaUsuarios;
    RecyclerView recyclerUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaUsuarios = new ArrayList<>();
        recyclerUsuarios = (RecyclerView) findViewById(R.id.recyclerID);
        recyclerUsuarios.setLayoutManager(new LinearLayoutManager(this));

        llenarUsuarios();
        AdaptadorUsuarios adapter = new AdaptadorUsuarios(listaUsuarios);
        recyclerUsuarios .setAdapter(adapter);
    }

    private void llenarUsuarios() {
        listaUsuarios.add(new Usuario("Giancarlos               ", "Garza", "20"));
        listaUsuarios.add(new Usuario("Andrea                   ", "Elizondo", "19"));
        listaUsuarios.add(new Usuario("Carlos                   ", "Lopez", "19"));
        listaUsuarios.add(new Usuario("Karen                    ", "Treviño", "18"));
        listaUsuarios.add(new Usuario("Orlando                  ", "Islas", "19"));
        listaUsuarios.add(new Usuario("Elberth                    ", "Gomez", "19"));
        listaUsuarios.add(new Usuario("Edgar                  ", "Gonzalez", "20"));
    }
}
