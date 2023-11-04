package komurcuoglu.ikys_backend.business.abstracts;
import komurcuoglu.ikys_backend.core.utilities.results.Result;
import komurcuoglu.ikys_backend.entities.concretes.Candidate;
import komurcuoglu.ikys_backend.entities.concretes.CompanyStaff;
import komurcuoglu.ikys_backend.entities.concretes.Employer;
public interface AuthService {
    Result registerCompanyStaff(CompanyStaff companyStaff, String confirmPassword);
    Result registerCandidate(Candidate candidate, String confirmPassword);
    Result registerEmployer(Employer employer, String confirmPassword);
}
