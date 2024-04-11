package View;
import Modelo.Numero;
import Negocio.Arvore;

import javax.swing.JOptionPane;






public class ArvorePre {

	
		
	  public static void main(String[] args) {
	        Arvore a = new Arvore();

	        Numero n1 = new Numero();
	        Numero n2 = new Numero();
	        Numero n3 = new Numero();
	        Numero n4 = new Numero();
	        Numero n5 = new Numero();
	        Numero n6 = new Numero();
	        Numero n7 = new Numero();
	        Numero n8 = new Numero();
	        Numero n9 = new Numero();
	        Numero n10 = new Numero();
	        Numero n11 = new Numero();

	        n1.setDado(42);
	        n2.setDado(41);
	        n3.setDado(43);
	        n4.setDado(40);
	        n5.setDado(44);
	        n6.setDado(45);
	        n7.setDado(46);
	        n8.setDado(38);
	        n9.setDado(47);
	        n10.setDado(39);
	        n11.setDado(48);

	        a.AdicionarPre(n1);
	        a.AdicionarPre(n2);
	        a.AdicionarPre(n3);
	        a.AdicionarPre(n4);
	        a.AdicionarPre(n5);
	        a.AdicionarPre(n6);
	        a.AdicionarPre(n7);
	        a.AdicionarPre(n8);
	        a.AdicionarPre(n9);
	        a.AdicionarPre(n10);
	        a.AdicionarPre(n11);

	        JOptionPane.showMessageDialog(null, "Exibindo elementos da árvore em PreFixada:");
	        a.exibirPreFixada(a);
	    }
	}