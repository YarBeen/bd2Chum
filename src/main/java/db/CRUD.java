/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author yarman
 */
public interface CRUD<T, ID extends Serializable> {
    List<T> findAll();
    Optional<T> findById (int entityID);
    int save (T entity);
    void delete(ID entityID);
    T update(T entity);
}
