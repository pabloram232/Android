package mx.edu.utng.llave;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by PabloRam on 14/12/2016.
 */
public class LlaveAdapter extends ArrayAdapter<Llave>{
    public LlaveAdapter(Context context,
                      ArrayList<Llave> llaves){
        super(context, 0, llaves);
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {
        Llave llave = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.llave_layout, parent, false);
        }

        TextView txvLlave = (TextView)
                convertView.findViewById(R.id.txv_llave);
        txvLlave.setText(llave.getNumero()+" "+
                llave.getMarca()+" "+
                llave.getTamaño());

        return convertView;
    }
}
