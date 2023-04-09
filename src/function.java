import javax.swing.JOptionPane;

public class function {
	
	ConvertirPesosAMonedas monedas = new ConvertirPesosAMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double input) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos MX a Dólar", "De Pesos MX a Euro", "De Pesos MX a Libras","De Pesos MX a Yen","De Pesos MX a Won Coreano",
    			 "De Dólar a Pesos MX", "De Euro a Pesos MX", "De Libras a Pesos MX","De Yen a Pesos MX","De Won Coreano a Pesos MX"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos MX a Dólar":
        	monedas.ConvertirPesosADolares(input);
        	break;
        case "De Pesos MX a Euro":
        	monedas.ConvertirPesosAEuros(input);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirPesosALibras(input);
        	break;
        case "De Pesos MX a Yen":
        	monedas.ConvertirPesosAYen(input);
        	break;
        case "De Pesos MX a Won Coreano":
        	monedas.ConvertirPesosAWon(input);
        	break;    	    	                          
        case "De Dólar a Pesos MX":
        	pesos.ConvertirDolaresAPesos(input);
        	break;
        case "De Euro a Pesos MX":
        	pesos.ConvertirEurosAPesos(input);
        	break;
        case "De Libras a Pesos MX":
        	pesos.ConvertirLibrasAPesos(input);
        	break;
        case "De Yen a Pesos MX":
        	pesos.ConvertirYenAPesos(input);
        	break;
        case "De Won Coreano a Pesos MX":
            pesos.ConvertirWonAPesos(input);
            break;
        }      
    }
        
}
