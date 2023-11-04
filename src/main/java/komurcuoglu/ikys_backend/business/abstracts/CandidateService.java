package komurcuoglu.ikys_backend.business.abstracts;

import komurcuoglu.ikys_backend.core.utilities.results.DataResult;
import komurcuoglu.ikys_backend.core.utilities.results.Result;
import komurcuoglu.ikys_backend.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService extends BaseEntityService<Candidate>{

    Result active(String code);
    DataResult<List<Candidate>> getAllByIsActivated(boolean isActived);
    DataResult<Candidate> getByIdentityNumber(String identityNumber);
}
