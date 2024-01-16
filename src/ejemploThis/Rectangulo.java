package ejemploThis;

public class Rectangulo {
  private int ancho;
  private int alto;
  
  Rectangulo (int ancho, int alto) {
	  this.ancho = ancho;
	  this.alto = alto;
  }

  public void imprimirInfo() {
	  System.out.println("Rectángulo de ancho " + ancho
			  + " y alto: " + alto);
  }
 
  public Rectangulo incrementarAncho(){
	  ancho ++;
	  return this;
  }
      

}
