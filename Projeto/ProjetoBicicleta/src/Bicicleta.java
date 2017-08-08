/** Classe Bicicleta que irá representar uma bicicleta real
 *
 * @Autor: Henrique CJ
 *
 */

public class Bicicleta {

    /**
     * Atributo que ira representar a velocidade da bicicleta
     */
     private float velocidade = 0;

     /**
      * Atributo que ira representar a marcha da bicicleta
      */
     private int marcha = 1;

     /**
      * Atributo que ira representar a cadencia da bicicleta
      */
     private int cadencia = 0;



     /**
      * Construtor da Classe Bicicleta, sem receber parametros
      */
     public Bicicleta() {

         System.out.println("Bicicleta: Construtor()");
     }


     /**
      * Construtor da classe Bicicleta recebendo 3 parametros
      *
      * @param velocidade
      *                 - float valor inicial da velocidade
      * @param marcha
      *                 - int valor inicial da marcha
      * @param cadencia
      *                 - int valor inicial da cadencia
      */
     public Bicicleta( float velocidade, int marcha, int cadencia) {
         this.velocidade = velocidade;
         this.marcha = marcha;
         this.cadencia = cadencia;
         System.out.println("Bicicleta: Construtor(velocidade,marcha,cadencia)");
     }




   /**
    * método para retornar uma velocidade
    * @return velocidade tipo float - velocidade atual
    */
        public float getVelocidade() {

        return velocidade;
    }


    public void setVelocidade(float pVelocidade)
    {
        velocidade = pVelocidade;
    }

    /**
     * método para retornar marcha
     * @return marcha tipo int - marcha atual
     */
    public int getMarcha() {

        return marcha;
    }

    public void setMarcha(int pMarcha)
    {
        marcha = pMarcha;
    }


    /**
     * método para retornar uma cadencia
     * @return cadencia tipo int - cadencia atual
     */
    public int getCadencia() {
        return cadencia;
    }


    public void setCadencia(int pCadencia)
    {
        cadencia = pCadencia;
    }





}
