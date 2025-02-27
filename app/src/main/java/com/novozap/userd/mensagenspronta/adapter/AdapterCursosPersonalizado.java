package com.novozap.userd.mensagenspronta.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.novozap.userd.mensagenspronta.R;
import com.novozap.userd.mensagenspronta.model.Categoria;
import com.novozap.userd.mensagenspronta.model.Curso;

import java.util.List;



/**
 * Created by alex on 02/07/17.
 */

public class AdapterCursosPersonalizado extends BaseAdapter {

    private final List<Curso> cursos;
    private final Activity act;

    public AdapterCursosPersonalizado(List<Curso> cursos, Activity act) {
        this.cursos = cursos;
        this.act = act;
    }

    @Override
    public int getCount() {
        return cursos.size();
    }

    @Override
    public Object getItem(int position) {
        return cursos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_curso_personalizada, parent, false);

        Curso curso = cursos.get(position);
        
        TextView nome = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_nome);
        TextView descricao = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_descricao);
        ImageView imagem = (ImageView)
                view.findViewById(R.id.lista_curso_personalizada_imagem);

        nome.setText(curso.getNome());
        descricao.setText(curso.getDescricao());

        Categoria categoria = curso.getCategoria();

        if (categoria.equals(Categoria.JAVA)) {
            imagem.setImageResource(R.drawable.foto5);
        } else if (categoria.equals(Categoria.ANDROID)) {
            imagem.setImageResource(R.drawable.foto4);
        } else if (categoria.equals(Categoria.HTML)) {
            imagem.setImageResource(R.drawable.foto2);
        }

        return view;
    }
}
