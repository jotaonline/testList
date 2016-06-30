package estudio23.com.testclases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import estudio23.com.testclases.adaptadores.adaptadorProfes;
import estudio23.com.testclases.profesores.Profes;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView)findViewById(R.id.ListProfes);

        Profes[]args = new Profes[]
                {
                        new Profes("Clase1","ES","descrip clase","Profe1","L-V 10:00","23","foto",3),
                        new Profes("Clase2","ES","descrip clase2","Profe2","X-J 10:00","23","foto",5)
                };
        adaptadorProfes adap = new adaptadorProfes(this, args);
        lista.setAdapter(adap);



    }
}
