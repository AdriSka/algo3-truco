package com.tests;

import org.junit.Before;
import org.junit.Test;

import com.modelo.Equipo;
import com.modelo.JugadorHumano;

import org.junit.Assert;

public class EquipoTest {
	
	private Equipo _equipo;
	
	@Before
	public void setup(){
		this._equipo = new Equipo();
	}
	
	@Test
	public void testSeCreaEquipoVacioYSinPuntos(){
		Assert.assertEquals(0, this._equipo.getCantidadJugadores());
		Assert.assertEquals(0, this._equipo.getPuntaje());
	}
	
	@Test
	public void testSeAgreganDosJugadoresAlEquipo(){
		this._equipo.agregarJugador(new JugadorHumano());		
		this._equipo.agregarJugador(new JugadorHumano());	

		Assert.assertEquals(2, this._equipo.getCantidadJugadores());
	}
	
	@Test
	public void testSeAgreganPuntosAlEquipo(){
		this._equipo.agregarPuntos(5);
		this._equipo.agregarPuntos(1);
		this._equipo.agregarPuntos(-5);
		
		Assert.assertEquals(11, this._equipo.getPuntaje());
	}
	
}
