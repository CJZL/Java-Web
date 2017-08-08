
public class MainTeste{

    public static void main(String[] args){

        Bicicleta minhaBicicleta = new Bicicleta(34.6f,5,9);

        System.out.println("Velocidade:" + minhaBicicleta.getVelocidade());
        System.out.println("Marcha:" + minhaBicicleta.getMarcha());
        System.out.println("Cadencia:" + minhaBicicleta.getCadencia());

    }

}
