package com.compositeDesign.impl;

import java.util.ArrayList;
import java.util.List;

import com.compositeDesign.interfaces.IActor;
import com.compositeDesign.interfaces.IDirector;

import lombok.Getter;

public class BaseDirector<T> implements IDirector<T> {

	@Getter
	private final List<IActor<T>> actors = new ArrayList<>();

	public T action(T data) throws Exception {

		for (IActor<T> a : actors) {
			data = a.act(data);
		}

		return data;
	}

	@Override
	public void add(IActor<T> actor) {
		this.actors.add(actor);

	}
}
