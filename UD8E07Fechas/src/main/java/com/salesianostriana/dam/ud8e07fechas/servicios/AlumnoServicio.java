package com.salesianostriana.dam.ud8e07fechas.servicios;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ud8e07fechas.model.Alumno;
import com.salesianostriana.dam.ud8e07fechas.repositorios.AlumnoRepository;
import com.salesianostriana.dam.ud8e07fechas.servicios.base.BaseService;


/** 
 * La idea de un servicio base es que como los servicios CRUD 
 * siempre suelen ser lo mismo, es buena práctica crear 
 * un servicio base que haga esto, y dejar nuestro servicio "concreto" 
 * en otro sitio. 
 * Esta sería nuestra clase de servicio concreta (para las cosas 
 * propias de nuestra aplicación y cn Alumnos), que en este caso, 
 * al no tener una lógica de negocio más allá de los CRUD está vacía, 
 * solo extiende al servicio base*/

@Service
public class AlumnoServicio extends BaseService<Alumno, Long, AlumnoRepository>{

}