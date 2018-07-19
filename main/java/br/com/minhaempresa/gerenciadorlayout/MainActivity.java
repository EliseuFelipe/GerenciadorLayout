package br.com.minhaempresa.gerenciadorlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txMainActivity;
    private Button btnClickTeste;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.enviarButton);
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editText = findViewById(R.id.textoEditText);
        Context contexto = getApplicationContext();
        String texto = editText.getText().toString();
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();

        setContentView(R.layout.activity_home);
    }
}
