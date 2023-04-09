import javax.swing.JOptionPane;

public class functionLongitud {
	
	ConvertirLongitud longitud = new ConvertirLongitud();
	
	public void ConvertirLongitud(double input) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Longitud", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Kilometros a Metros","Kilometros a Centimetros","Metros a Yardas",
    					"Metros a Pies","Metros a Centimetros","Yardas a Centimetros","Pies a Centimetros",
    					"Pulgadas a Centimetros",}, "Seleccion")).toString();
        switch(opcion) {
        case "Kilometros a Metros":
        	longitud.ConvertirKilometrosAMetros(input);
        	break;
        case "Kilometros a Centimetros":
        	longitud.ConvertirKilometrosACentimetros(input);
            break;
        case "Metros a Yardas":
        	longitud.ConvertirMetrosAYardas(input);
           break;
        case "Metros a Pies":
        	longitud.ConvertirMetrosAPies(input);
           break;
        case "Metros a Centimetros":
        	longitud.ConvertirMetrosACentimetros(input);
        	break;
        case "Yardas a Centimetros":
        	longitud.ConvertirYardasACentimetros(input);
        	break;
        case "Pies a Centimetros":
        	longitud.ConvertirPiesACentimetros(input);
        	break;
        case "Pulgadas a Centimetros":
        	longitud.ConvertirPulgadasACentimetros(input);
        	break;
        }
	}
}
