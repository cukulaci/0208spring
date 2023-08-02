package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;

public interface ProgrammingLanguageService {
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	ProgrammingLanguage add(ProgrammingLanguage language) throws Exception;
	ProgrammingLanguage delete(ProgrammingLanguage language) throws Exception;
	ProgrammingLanguage update(ProgrammingLanguage language) throws Exception;
}
