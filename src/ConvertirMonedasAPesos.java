import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		double dolar = valor * 18.14;
		dolar = (double) Math.round(dolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolar + " Pesos Mexicanos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double euro = valor * 19.87;
		euro = (double) Math.round(euro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + euro + " Pesos Mexicanos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double libra = valor * 22.67;
		libra = (double) Math.round(libra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + libra + " Pesos Mexicanos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double yen = valor * 0.14;
		yen = (double) Math.round(yen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + yen + " Pesos Mexicanos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double won = valor * 0.014;
		won = (double) Math.round(won * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + won + " Pesos Mexicanos");
	}
}
