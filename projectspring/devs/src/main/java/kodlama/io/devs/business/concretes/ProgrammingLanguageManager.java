package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	List<ProgrammingLanguage> languages;
	

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public ProgrammingLanguage add(ProgrammingLanguage language) throws Exception {

		if (language.getName() == null || language.getName().trim().isEmpty()) {

			throw new Exception("Name of the Programming Language field cannot be empty.");
			
		}
		if (languages.stream().anyMatch(l -> l.getName().equalsIgnoreCase(language.getName()))) {
			throw new Exception(language.getName() + " this programming language already exist.");
		}
			
		return language;
	}

	@Override
	public ProgrammingLanguage delete(ProgrammingLanguage language) throws Exception {
		
		ProgrammingLanguage existingLanguage = getById(language.getId());
		
		if(existingLanguage == null || language.getName().trim().isEmpty()) {
			throw new Exception("The data cannot be found.");
		}
		
		languages.remove(existingLanguage);
		return existingLanguage;
	}

	@Override
	public ProgrammingLanguage update(ProgrammingLanguage language) throws Exception {
		ProgrammingLanguage existingLanguage = getById(language.getId());
		
		if(existingLanguage == null) {
			throw new Exception("The input that is a Programming Language could not be found in directory.");
		}
		if(language.getName() == null || language.getName().trim().isEmpty()) {
			throw new Exception("Name of the Programming Language field cannot be empty.");
		}
		return existingLanguage;
	}

}
