package com.compositeDesign.interfaces;

public interface IActor<T> {

    T act(T data) throws Exception;
}
