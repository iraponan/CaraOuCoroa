package br.eti.inovare.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imagemResultado;
    private ImageButton buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.imageButtonVoltar);

        Bundle bundle = getIntent().getExtras();

        int caraOuCoroa = bundle.getInt("caraoucoroa");

        if (caraOuCoroa == 0) {
            imagemResultado.setImageResource(R.drawable.moeda_cara);
        } else {
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}