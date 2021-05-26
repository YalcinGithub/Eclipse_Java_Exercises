package unclassified;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EnisTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String hedefstr = JOptionPane.showInputDialog(null, "Kaç soru çözmek istersin : ", "HOŞGELDİN",
				JOptionPane.WARNING_MESSAGE);
		
		int hedefSoruSayisi = Integer.parseInt(hedefstr);
		String maxstr = JOptionPane.showInputDialog(null, "En fazla hangi sayıya kadar soralım ?", "MATEMATİK TESTİ",
				JOptionPane.WARNING_MESSAGE);
		int maxint = Integer.parseInt(maxstr);
		int sayi1, sayi2, dogruSayisi = 0, yanlisSayisi = 0;

		while (dogruSayisi < hedefSoruSayisi) {

			sayi1 = (int) (Math.random() * maxint);
			sayi2 = (int) (Math.random() * maxint);
			if (sayi1 + sayi2 < 11 | sayi1 < 5 | sayi2 < 5)
				continue;

			String yanitstr = JOptionPane
					.showInputDialog(
							null, "\t" + dogruSayisi + " Doğru ve " + yanlisSayisi + " Yanlış" + "\n " + "\n "
									+ "    \t\t " + sayi1 + " + " + sayi2 + " ?",
							"MATEMATİK TESTİ", JOptionPane.WARNING_MESSAGE);
			int yanitint = Integer.parseInt(yanitstr);

			if (yanitint == sayi1 + sayi2) {
				dogruSayisi++;
				JOptionPane.showMessageDialog(null, yanitint + " doğru :) ", "DOĞRU CEVAP",
						JOptionPane.WARNING_MESSAGE);
			} else {
				yanlisSayisi++;
				JOptionPane.showMessageDialog(null, yanitint + " yanlış :( ", "YANLIŞ CEVAP",
						JOptionPane.WARNING_MESSAGE);
			}

		}
		
		JOptionPane.showMessageDialog(null, "TEBRİKLER \n " + dogruSayisi + " Doğru ve " + yanlisSayisi + " yanlış",
				"TEST BİTTİ", JOptionPane.WARNING_MESSAGE);

	}

}
