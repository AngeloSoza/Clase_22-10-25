package services.interfaces;

import java.util.List;

public interface ICRUD {
    <T> List<T> getAll(String nameQuery, Class<T> clazz);
    <T> void insert(T entity);
    <T> void update(T entity);  // <-- Asegúrate de tener este
    <T> void delete(T entity);  // <-- Asegúrate de tener este
    <T> T findById(Integer id, Class<T> clazz); // <-- Asegúrate de tener este
}