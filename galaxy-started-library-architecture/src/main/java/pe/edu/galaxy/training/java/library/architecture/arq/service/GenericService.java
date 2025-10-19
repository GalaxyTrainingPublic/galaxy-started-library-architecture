package pe.edu.galaxy.training.java.library.architecture.arq.service;

import java.util.List;
import java.util.Optional;

public interface GenericService<T,R,ID> {

    List<R> findLikeObject(T t) throws ServiceException;

    Optional<R> findById(ID id) throws ServiceException;

    Long save(T t) throws ServiceException;

    Boolean update(ID id, T t) throws ServiceException;

    Boolean delete(ID id) throws ServiceException;
}
