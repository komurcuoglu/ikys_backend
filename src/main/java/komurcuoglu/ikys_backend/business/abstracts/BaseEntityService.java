package komurcuoglu.ikys_backend.business.abstracts;

import komurcuoglu.ikys_backend.core.utilities.results.DataResult;
import komurcuoglu.ikys_backend.core.utilities.results.Result;

import java.util.List;

public interface BaseEntityService <T>{
    Result add(T entity);
    Result update(T entity);
    Result delete(int id);
    DataResult<List<T>> getAll();
    DataResult<T> getById(int id);
}
