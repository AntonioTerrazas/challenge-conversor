import javax.swing.JOptionPane;

public class ConvertirLongitud {
	
	public void ConvertirKilometrosAMetros(double valor) {
		double metros = valor * 1000;
		metros = (double) Math.round(metros * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Kilometros son " + metros + " Metros");
	}
	
	public void ConvertirKilometrosACentimetros(double valor) {
		double centimetros = valor * 100000;
		centimetros = (double) Math.round(centimetros * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Kilometros son " + centimetros + " Centimetros");
	}
	
	public void ConvertirMetrosAYardas(double valor) {
		double yardas = valor * 1.09;
		yardas = (double) Math.round(yardas * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Metros son " + yardas + " Yardas");
	}
	
	public void ConvertirMetrosAPies(double valor) {
		double pies = valor * 3.28;
		pies = (double) Math.round(pies * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Metros son " + pies + " Pies");
	}
	
	public void ConvertirMetrosACentimetros(double valor) {
		double centimetros = valor * 100;
		centimetros = (double) Math.round(centimetros * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Metros son " + centimetros + " Centimetros");
	}
	
	public void ConvertirYardasACentimetros(double valor) {
		double centimetros = valor * 91.44;
		centimetros = (double) Math.round(centimetros * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Yardas son " + centimetros + " Centimetros");
	}
	
	public void ConvertirPiesACentimetros(double valor) {
		double centimetros = valor * 30.48;
		centimetros = (double) Math.round(centimetros * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Pies son " + centimetros + " Centimetros");
	}
	
	public void ConvertirPulgadasACentimetros(double valor) {
		double centimetros = valor * 2.54;
		centimetros = (double) Math.round(centimetros * 100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Pulgadas son " + centimetros + " Centimetros");
	}
}
