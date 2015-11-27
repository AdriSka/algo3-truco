package com.modelo;

import com.exceptions.ReTrucoNoCantadoException;
import com.exceptions.TrucoNoCantadoException;
import com.modelo.acciones.envido.*;
import com.modelo.acciones.truco.*;

public class ManejadorDeRonda {

	public Accion cantarTruco(AccionTruco trucoCantado, Partido partido){
		Accion trucoAceptado = this.getJugadorQueDebeAceptar(partido).responderA(trucoCantado,this,partido);
		partido.volverJugadorQueCantoPreviamente();
		return trucoAceptado;
	}
	
	private Jugador getJugadorQueDebeAceptar(Partido partidoActual){
		
		Jugador jugadorAAceptarAccion;
		jugadorAAceptarAccion = partidoActual.getJugadorSiguienteAlActual();
		return jugadorAAceptarAccion;
	}
	
	public Accion cantarReTruco(ReTruco reTruco, Partido partido){
		Accion reTrucoAceptado = this.getJugadorQueDebeAceptar(partido).responderA(reTruco,this,partido);
		partido.volverJugadorQueCantoPreviamente();
		return reTrucoAceptado;
	}

	public Accion cantarValeCuatro(ValeCuatro valeCuatro, Partido partido) {
		Accion valeCuatroAceptado = this.getJugadorQueDebeAceptar(partido).responderA(valeCuatro);
		partido.volverJugadorQueCantoPreviamente();
		return valeCuatroAceptado;
	}
	
	public Accion cantarEnvido(Envido envidoCantado, Partido partido){
		Accion envidoAceptado = this.getJugadorQueDebeAceptar(partido).responderA(envidoCantado,this,partido);
		partido.volverJugadorQueCantoPreviamente();
		return envidoAceptado;
	}
	
	public Accion cantarRealEnvido(RealEnvido realEnvidoCantado, Partido partido){
		Accion realEnvidoAceptado = this.getJugadorQueDebeAceptar(partido).responderA(realEnvidoCantado,this,partido);
		partido.volverJugadorQueCantoPreviamente();
		return realEnvidoAceptado;
	}
	
//	private RealEnvido envidoCantadoPreviamente (boolean envidoCantadoPreviamente){
//		
//		if (envidoCantadoPreviamente){
//			return (new RealEnvido(new Envido(new Tanto())));
//		} else {
//			return (new RealEnvido(new Tanto()));
//		}
//	}
	
	public Accion cantarFaltaEnvido(Partido partido){
		
		FaltaEnvido faltaEnvidoCantado = new FaltaEnvido(new Tanto());
		Accion faltaEnvidoAceptado = this.getJugadorQueDebeAceptar(partido).responderA(faltaEnvidoCantado);
		partido.volverJugadorQueCantoPreviamente();
		return faltaEnvidoAceptado;
	}
}
