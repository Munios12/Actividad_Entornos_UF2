package practica1;
import java.util.Scanner;

/**
 * 
 * Creación de una clase para calcular las notas de los alumnos
 * 
 * @author Alejandro Muñoz Navarro
 * @since 29/03/2025
 * @version 1.0
 * 
 */


public class notas1 {
	/*
	 * Variables para guardar las notas de las distintas unidades formativas
	 * 
	 */
	double uf1, uf2, uf3;
	/*
	 * Variables para calcular el acumulado
	 */
	double acu1, acu2, acu3, def;
	
	/*
	 * Instancia de Scanner para poder introducir datos
	 * 
	 */
	Scanner entrada = new Scanner(System.in);
	
	
	/*
	 * Método que pide el ingreso de notas al usuario
	 * 
	 */
	
	public void IngresaNotas() {
		
		//Imprimimos las notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		/*
		 * Aqui se almacena la nota de la UF1
		 * 
		 * Mismo código abajo para el resto de UFs
		 */
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	/*
	 * Método que compara la nota para asegurarse que es un valor del 0 al 10
	 * 
	 * (aunque en el codigo solo compureba que sea menor que 10)
	 * 
	 */
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}

	/*
	 * Método que calcula la nota a partir del acumulado y las notas de las UFs
	 * 
	 */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
	}
	
	/*
	 * Método que muestra las notas por la terminal
	 */
	
	public void Mostrar() {
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
	
	/*
	 * Método que comprueba si el alumno esta aprobado o suspendido 
	 */

	public void aprobado() {
			
			/*
			 * Condicional para evaluar si la nota esta entre el 0 y 5 = suspendido 
			 * 
			 * o entre 5 y 10 = aprobado
			 */
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		/*
		 * Funcion principal del programa que ejecuta secuencialmente los diferentes metodos para:
		 * 
		 *  * @param args Argumentos de la línea de comandos (no utilizados en este programa).
		 * @see #IngresaNotas()
		 * @see #comprobarcion()
		 * @see #Calculonotas()
		 * @see #Mostrar()
		 * @see #aprobado()
		 * 
		 */
	public static void main(String[] args) {
		/*
		 * Instancia de la clase notas1
		 */
		notas1 fc= new notas1();
		
		/*
		 * - Pedir la nota
		 */
		fc.IngresaNotas();
		
		/*
		 * - Comprobar si las notas introducidas son correctas
		 */
		fc.comprobarcion();
		
		
		/*
		 * - Calculo de las notas
		 */
		fc.Calculonotas();
		
		/*
		 * - Mostrar notas por pantalla
		 */
		fc.Mostrar();
		
		/*
		 * - Evaluar si esta aprobado o suspendido
		 */
		fc.aprobado();
		
	}

}



