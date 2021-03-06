package com.modelo.cartas;

import com.exceptions.PardaInvalidaException;

public class CartaPardaTres extends Carta {

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
		return this;
	}

	@Override
	public Carta ganador(CartaTres tres) {
		return this;
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
		throw new PardaInvalidaException();
	}

	@Override
	public Carta ganador(CartaPardaAnchoFalso pardaFalso) {
		throw new PardaInvalidaException();
	}

	@Override
	public Carta ganador(CartaPardaDos pardaDos) {
		throw new PardaInvalidaException();
	}

	@Override
	public Carta ganador(CartaPardaTres pardaTres) {
		throw new PardaInvalidaException();
	}

}
