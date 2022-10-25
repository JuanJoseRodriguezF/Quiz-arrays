package quiz25;

import javax.swing.JOptionPane;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validacion = "s", menu;
		double a, b;
	    while(validacion.equalsIgnoreCase("s")){
	      menu=JOptionPane.showInputDialog("1. Ver el numero mayor\n2. Ver el numero menor\n3. Calcular la raiz cuadrada\n4. Elevar a una potencia");
	      switch(menu){
	        case "1":
	        	a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
	    		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
	          JOptionPane.showMessageDialog(null, "El numero mayor es: " + Mayor(a,b));
	          break;
	        case "2":
	        	a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
	    		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
	          JOptionPane.showMessageDialog(null, "El numero menor es: " + Menor(a,b));
	          break;
	        case "3":
	        	a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
	          JOptionPane.showMessageDialog(null, "La raiz cuadrada es: " + Raiz(a));
	          break;
	        case "4":
	        	a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero base"));
	        	b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero exponente"));
	          JOptionPane.showMessageDialog(null, "La respuesta es: " + Potencia(a,b));
	          break;
	        default:
	          JOptionPane.showMessageDialog(null, "Opción no válida.");
	          break;
	      }
		    validacion=JOptionPane.showInputDialog("¿Desea repetir? (S/N)");
	    }
	}
	public static double Mayor(double numero1, double numero2){
		double Mayor=0;
		if(numero1<numero2) {
			Mayor = numero2;	
		}if(numero1>numero2) {
			Mayor = numero1;
		}
		    return Mayor;
	}
	public static double Menor(double numero1, double numero2){
		double Menor=0;
		if(numero1<numero2) {
			Menor = numero1;	
		}if(numero1>numero2) {
			Menor = numero2;
		}
	    return Menor;
	  }
	 public static double Raiz(double numero1){
		 double Raiz= Math.sqrt(numero1);
		    return Raiz;
		  }
	 public static double Potencia(double numero1, double numero2){
		 double Potencia= Math.pow(numero1, numero2);
		    return Potencia;
		  }
}
