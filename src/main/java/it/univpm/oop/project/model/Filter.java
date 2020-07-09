package it.univpm.oop.project.model;

import java.util.Collection;

public interface Filter<E,T> {
	abstract Collection<E> filterField(String alias, String type, T value);
}
