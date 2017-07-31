package es.cic.taller.blackjack;


public class Carta {
		private Numero numero;
		private Palo palo;
		
		public Carta() {
			
		}
		
		public Carta(Numero numero, Palo palo) {
			this.numero = numero;
			this.palo = palo;
		}
		
		public Numero getNumero() {
			return numero;
		}
		public void setNumero(Numero numero) {
			this.numero = numero;
		}
		public Palo getPalo() {
			return palo;
		}
		public void setPalo(Palo palo) {
			this.palo = palo;
		}
		
		public String getNombreFichero() {
			String texto = palo.getNumero() + numero.getNumeroComoTexto() + ".svg";
			return texto;
		}
		
		public static Carta getDorso() {
			return new Carta(Numero.AS, Palo.ESPECIAL);
		}

}
