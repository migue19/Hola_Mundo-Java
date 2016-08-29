public class Hola{
  private String name;


     public Hola(String nombre){
     name= nombre;

     }



 public void Mensaje()
 {
   System.out.println("¡Hola "+name+" como estas!");

 }    




public static void main(String[] args) {
	System.out.println("Hola Mundo");

	Hola objeto = new Hola("Miguel");

	objeto.Mensaje();
}

}
