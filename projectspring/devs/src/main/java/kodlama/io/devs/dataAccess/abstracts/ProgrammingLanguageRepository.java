package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	ProgrammingLanguage add(ProgrammingLanguage language) throws Exception;
	ProgrammingLanguage delete(ProgrammingLanguage language);
	ProgrammingLanguage update(ProgrammingLanguage language) throws Exception;
}
