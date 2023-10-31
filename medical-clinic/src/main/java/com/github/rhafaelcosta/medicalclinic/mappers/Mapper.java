package com.github.rhafaelcosta.medicalclinic.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

public class Mapper {

	private static ModelMapper mapper = new ModelMapper();

	/**
	 * Garante que a classe não possa ser instanciada.
	 */
	private Mapper() {
	}

	/**
	 * Maps the source to destination class.
	 * 
	 * @param <D>
	 * @param <T>
	 * @param entity
	 * @param dtoClass
	 * @return
	 */
	public static <S, D> D map(S source, Class<D> dest) {
		return mapper.map(source, dest);
	}

	/**
	 * Converts the source list to a destination list mapping the source items to
	 * destination type items.
	 * 
	 * @param <S>
	 * @param <D>
	 * @param sources
	 * @param dest
	 * @return
	 */
	public static <S, D> List<D> mapList(List<S> sources, Class<D> dest) {
		return sources.stream().map(source -> map(source, dest)).collect(Collectors.toList());
	}

}
