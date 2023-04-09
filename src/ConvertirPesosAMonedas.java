import javax.swing.JOptionPane;

public class ConvertirPesosAMonedas {
	
	public void ConvertirPesosADolares(double valor) {
		double dolar = valor / 18.14;
		dolar = (double) Math.round(dolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolar + " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double euro = valor / 19.87;
		euro = (double) Math.round(euro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + euro + " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double libra = valor / 22.67;
		libra = (double) Math.round(libra * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + libra + " Libras");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double yen = valor / 0.14;
		yen = (double) Math.round(yen * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + yen + " Yenes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double won = valor / 0.014;
		won = (double) Math.round(won * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + won + " Wons");
	}
}
