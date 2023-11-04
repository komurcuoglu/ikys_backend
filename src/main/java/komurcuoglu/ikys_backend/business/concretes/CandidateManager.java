package komurcuoglu.ikys_backend.business.concretes;

import komurcuoglu.ikys_backend.business.abstracts.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private ResumeService resumeService;
    private UserService userService;
    private UserCheckService userCheckService;
    private UserActivationService userActivationService;
    @Autowired
    public CandidateManager(CandidateDao candidateDao,ResumeService resumeService,UserService userService,UserCheckService userCheckService,UserActivateService userActivateService){
        this.candidateDao = candidateDao;
        this.resumeService = resumeService;
        this.userService = userService;
        this.userCheckService = userCheckService;
        this.userActivationService = userActivateService;
    }
    @Override
    public Result add(Candidate candidate){
        if(validateCandidate(candidate)!=null){
            return validateCandidate(candidate);
        }
        candidateDao.save(candidate);
        resumeService.add(new Resume(candidate));
        return userActivationService.add(new UserActivation(candidate));
    }

}
