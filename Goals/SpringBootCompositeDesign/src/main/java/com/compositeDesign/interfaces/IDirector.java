package com.compositeDesign.interfaces;

public interface IDirector<T> {

	void add(IActor<T> actor);

    T action(T data) throws Exception;
}
