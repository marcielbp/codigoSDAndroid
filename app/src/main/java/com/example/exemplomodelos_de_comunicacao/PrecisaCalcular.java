package com.example.exemplomodelos_de_comunicacao;

import android.widget.TextView;

public class PrecisaCalcular {
    TextView tv;
    public PrecisaCalcular(TextView tv){
        this.tv=tv;
    }
    public void calculoLocal(Double oper1, Double oper2, Integer operacao){
        Calculadora calc = new Calculadora();
        String result = "";
        switch(operacao){
            case 1: // soma
                result= result + calc.soma(oper1,oper2);
                break;
            case 2: // subtracao
                result= ""+calc.subtracao(oper1,oper2);
                break;
            case 3: // multiplicacao
                result= ""+calc.multiplicacao(oper1,oper2);
                break;
            case 4: // divisao
                result= ""+calc.divisao(oper1,oper2);
                break;
            default:
                result= "operacao inexistente";
        }
        this.tv.setText(result);
    }

    public void calculoRemoto(Double oper1, Double oper2, Integer operacao){
        CalculadoraSocket shs = new CalculadoraSocket(this, Double.toString(oper1), Double.toString(oper2), operacao);
        shs.execute();

    }
    public void calculoRemotoHTTP( Double oper1, Double oper2, Integer operacao){
        CalculadoraHttpPOST shs = new CalculadoraHttpPOST(this, Double.toString(oper1), Double.toString(oper2), operacao);
        shs.execute();

    }
    public void result_calculoRemoto(String result){
        tv.setText(result);
    }

}
