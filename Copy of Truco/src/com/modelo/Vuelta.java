package com.modelo;

import java.util.List;
import java.util.Stack;

import com.modelo.acciones.truco.AccionTruco;
import com.modelo.cartas.Carta;
import com.modelo.cartas.CartaInvalida;

public class Vuelta implements IRecibible {
	
	private Stack<Carta> _cartas = null;
	private Carta _cartaGanadora = null;
	private List<AccionTruco> _acciones = null;
	private Ronda _ronda;
	
	public Vuelta(Ronda ronda, List<AccionTruco> acciones) {
		this._cartas = new Stack<Carta>();
		this._acciones = acciones;
		this._cartaGanadora = new CartaInvalida();
		this._ronda = ronda;
	}

	private Stack<Carta> getCartas(){
		return this._cartas;
	}
	
	public Carta getCartaGanadora(){
		return this._cartaGanadora;
	}
	
	private void setCartaGanadora(Carta carta){
		this._cartaGanadora = carta;
	}
	
	private Ronda getRonda(){
		return this._ronda;
	}
	
	private boolean esFinDeVuelta(){
		return this.getRonda().getCantidadDeJugadoresTotales() == this.getCantidadDeCartasEnVuelta();
	}
	
	public int getCantidadDeCartasEnVuelta(){
		return this.getCartas().size();
	}
	
	@Override
	public void recibirCarta(Carta carta) {
		this.setCartaGanadora(carta.ganador(this.getCartaGanadora()));
		this.getCartas().push(carta);
	}
}
