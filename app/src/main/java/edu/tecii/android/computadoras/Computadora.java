package edu.tecii.android.computadoras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Computadora extends AppCompatActivity {

    EditText mar,mo,ser,pro,cos,nuc,memoriaram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computadora);

        mar = (EditText)findViewById(R.id.txtMarca);
        mar.setText(marca);
        mo = (EditText)findViewById(R.id.txtModelo);
        mo.setText(modelo);
        ser = (EditText)findViewById(R.id.txtSerie);
        ser.setText(serie);
        pro = (EditText)findViewById(R.id.txtProcesador);
        pro.setText(procesador);
        cos = (EditText)findViewById(R.id.txtCosto);
        cos.setText(costo);
        nuc = (EditText)findViewById(R.id.txtNucleos);
        nuc.setText(nucleos);
        memoriaram = (EditText)findViewById(R.id.txtRam);
        memoriaram.setText(ram);

        Button btn = (Button) findViewById(R.id.button);
        final Computadora [] obj = new Computadora[3];
        obj[0]=new Computadora();
        obj[1]=new Computadora(costo);
        obj[2]=new Computadora(marca, modelo, serie, procesador, costo, nucleos, ram);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView)findViewById(R.id.tVresultado);
                tv.setText((CharSequence) obj[0]);
            }
        });


    }

    String marca,modelo,serie,procesador;
    int costo,nucleos,ram;

    public Computadora() {
        marca="Default";
        modelo = "Default";
        serie = "Default";
        procesador = "Default";
        costo = 0;
        nucleos = 0;
        ram = 0;

    }

    public Computadora(int costo) {
        marca="Acer";
        modelo = "Aspire";
        serie = "XF453267U2";
        procesador = "intel";
        this.costo = costo;
        nucleos = 4;
        ram = 8;
    }

    public Computadora(String marca, String modelo, String serie, String procesador, int costo, int nucleos, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.procesador = procesador;
        this.costo = costo;
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
