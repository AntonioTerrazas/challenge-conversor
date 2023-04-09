import javax.swing.JOptionPane;

public class index {
	public static void main(String[] args) {
		
		function monedas = new function();
		functionLongitud longitud = new functionLongitud();
		
		boolean repetir = true;
		
		while(repetir) {
			String tipoConversor = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión","Menu",
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Conversor de Moneda","Conversor de Longitud"}, 
					"Selecciona")).toString();
			
			if(tipoConversor == "Conversor de Moneda") {
				String cantidad = JOptionPane.showInputDialog(null,"Introduce la cantidad de dinero que deseas convertir");
				if(ValidarNumero(cantidad) == true) {
                    double input = Double.parseDouble(cantidad);
                    monedas.ConvertirMonedas(input);
                    
                    int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta){
                    	System.out.println("Opcion Afirmativa");
                    }else{
                       	JOptionPane.showMessageDialog(null, "Programa terminado");
                       	repetir = false;
                    }
                    
				}else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");                
                }
				
			}else if(tipoConversor == "Conversor de Longitud"){
				String cantidad = JOptionPane.showInputDialog(null,"Introduce el valor de la longitud que deseas convertir");
				if(ValidarNumero(cantidad) == true) {
                    double input = Double.parseDouble(cantidad);
                    longitud.ConvertirLongitud(input);
                    
                    int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                    if (JOptionPane.OK_OPTION == respuesta){
                    	System.out.println("Opcion Afirmativa");
                    }else{
                       	JOptionPane.showMessageDialog(null, "Programa terminado");
                       	repetir = false;
                    }
                    
				}else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");                
                }
			}
		}
	}
		public static boolean ValidarNumero(String cantidad) {
	        try {
	            double n = Double.parseDouble(cantidad);
	            if(n >= 0 || n < 0);
	                return true;
	            } catch (NumberFormatException e) {
	                return false;
	            }
	}
}

