package kodlama.io.devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {

	private int id;
	private String name;

	public ProgrammingLanguage setName(String name) {
		this.name = name;
		return this;
	}

}
