package com.modelo.cartas;

public class CartaDos extends Carta {
	
	public CartaDos(Palo palo) {
		super(palo, 2);
	}

	@Override
	public Carta ganador(IPeleable peleable) {
		return peleable.ganador(this);
	}	
	
	@Override
	public Carta ganador(CartaInvalida invalida) {
		return this;
	}
	
	@Override
	public Carta ganador(CartaNormal normal) {
		return this;
	}

	@Override
	public Carta ganador(CartaAnchoFalso anchoFalso) {
		return this;
	}

	@Override
	public Carta ganador(CartaDos dos) {
		return new CartaPardaDos();
	}

	@Override
	public Carta ganador(CartaTres tres) {
		return tres;
	}

	@Override
	public Carta ganador(CartaSieteOro sieteOro) {
		return sieteOro;
	}

	@Override
	public Carta ganador(CartaSieteEspada sieteEspada) {
		return sieteEspada;
	}

	@Override
	public Carta ganador(CartaAnchoBasto anchoBasto) {
		return anchoBasto;
	}

	@Override
	public Carta ganador(CartaAnchoEspada anchoEspada) {
		return anchoEspada;
	}

	@Override
	public Carta ganador(CartaPardaNormal pardaNormal) {
		return this;
	}

	@Override
	public Carta ganador(CartaPardaAnchoFalso pardaFalso) {
		return this;
	}

	@Override
	public Carta ganador(CartaPardaDos pardaDos) {
		return pardaDos;
	}

	@Override
	public Carta ganador(CartaPardaTres pardaTres) {
		return pardaTres;
	}	
}
