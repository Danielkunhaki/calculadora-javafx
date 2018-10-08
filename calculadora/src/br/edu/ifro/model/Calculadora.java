package br.edu.ifro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Num1;
    private String Num2;
    private String Resultado;
   
   @Override
   public String toString (){
       return id + " - " + id;
   }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum1() {
        return Num1;
    }

    public String getNum2() {
        return Num2;
    }

    public String getResultado() {
        return Resultado;
    }

    public void setNum1(String Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(String Num2) {
        this.Num2 = Num2;
    }

    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }
}
