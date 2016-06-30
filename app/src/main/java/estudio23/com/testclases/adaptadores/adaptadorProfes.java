package estudio23.com.testclases.adaptadores;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;


import estudio23.com.testclases.R;
import estudio23.com.testclases.profesores.Profes;

/**
 * Created by jose on 29/6/16.
 */
public class adaptadorProfes extends ArrayAdapter
{
    Activity context;
    Profes[] datos;

    public adaptadorProfes(Activity context, Profes[] datos)
    {
        super(context, R.layout.adaptador_profes,datos);
        this.datos=datos;
        this.context=context;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.adaptador_profes, null);
        /*
        ImageView imgProfe = (ImageView)item.findViewById(R.id.ImgProfe);

        imgProfe.setImageResource(datos[position].getFoto());
        */
        TextView Anombre = (TextView)item.findViewById(R.id.TxtNombreLst);
        Anombre.setText(datos[position].getNombre());

        TextView Aidioma = (TextView)item.findViewById(R.id.TxtIdiomaLst);
        Aidioma.setText(datos[position].getIdioma());

        TextView Adescrip = (TextView)item.findViewById((R.id.TxtDescripLst));
        Adescrip.setText(datos[position].getDescripcion());

        TextView AnombreProfe = (TextView)item.findViewById(R.id.TxtNomProfeLst);
        AnombreProfe.setText(datos[position].getNombreProfe());

        TextView Ahorario = (TextView)item.findViewById(R.id.TxtHorarioLst);
        Ahorario.setText(datos[position].getHorario());

        RatingBar Arating=(RatingBar)item.findViewById(R.id.RatingLst);
        Arating.setRating(datos[position].getRatingP());

        TextView Anumero = (TextView)item.findViewById(R.id.TxtNumAlumLst);
        Anumero.setText(datos[position].getAlumnos());

        return item;
    }
}
