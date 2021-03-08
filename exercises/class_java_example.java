public class PesoAltura{
    int peso;
    int altura;
}

public class EstruturaSimples{
    
    public static final int alturaMaxima = 225;
    public static void main(String [] args){
        PesoAltura pessoal = new PesoAltura();
        pessoal.peso = 80;
        pessoal.altura = 185;
        System.out.print ("Peso: " + pessoal.peso + ", Altura " + pessoal.altura + " . ");
        if (pessoal.altura>alturaMaxima) System.out.printn ("Altura acima da máxima");
        else System.out.printn ("Altura abaixo da máxima");
    }
}