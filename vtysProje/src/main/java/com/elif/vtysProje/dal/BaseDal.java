/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elif.vtysproje.dal;

import java.util.List;

/**
 *
 * @author ELİF
 */
public interface BaseDal<T> {
    List<T> getAll();
    T getById(int id);
    void save(T t);
    void update(T t);
    void delete(T t);
}
