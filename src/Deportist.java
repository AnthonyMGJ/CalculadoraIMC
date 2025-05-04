/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melga
 */
public class Deportist { 
    //Atributos
    private String nombre;
    private double peso;
    private double altura;
    
   //metodos accesores
    public String getNombre() {return nombre;}
    
    public void setnombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    //Metodos principales 
    
    public double calcularIMC() 
    {
        if (altura >=1 ) {return peso/(altura*altura);}
        else {return 0;}
    }
    
    public String determinaNivelPeso() 
    {
        double imc = calcularIMC();
        if (imc > 0 && imc < 18.5) 
        {return "Bajo Peso";}
        else if (imc >= 18.5 && imc < 24.9) 
        {return "Peso Normal";}
        else if (imc >= 24.9 && imc < 29.9) 
        {return "Sobrepeso";}
        else  {return "Obesidad";}
        
    }
    
    public String mostrarInfo() 
    {
        return "Nombre: "+ nombre +
                "\nPeso: "+ peso +
                "\nAltura: "+ altura +
                "\nIndice de Masa Corporal: "+ calcularIMC() +
                "\nNivel de Peso: "+ determinaNivelPeso();
    
    }
    
}
