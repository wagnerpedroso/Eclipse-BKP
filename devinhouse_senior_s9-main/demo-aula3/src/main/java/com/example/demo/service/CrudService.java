package com.example.demo.service;

import java.util.List;

public interface CrudService <T>{
    List<T> get();
    T findById(int id);
    int save(T t);
    T update(int id, T t);
    T delete(int id);
}
