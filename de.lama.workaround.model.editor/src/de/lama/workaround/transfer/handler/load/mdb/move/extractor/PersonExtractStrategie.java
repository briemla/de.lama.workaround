package de.lama.workaround.transfer.handler.load.mdb.move.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import workaround.Person;
import workaround.WorkaroundFactory;

public class PersonExtractStrategie extends AbstractExtractStrategie {

	@Override
	public List<Person> extractFrom(ResultSet tableResult) throws SQLException {
		List<Person> persons = new ArrayList<Person>();
		while (tableResult.next()) {
			Person nextPerson = WorkaroundFactory.eINSTANCE.createPerson();
			String tableColumn = DBKonstanten.nachname;
			String nachname = extractStringFrom(tableResult, tableColumn);
			nextPerson.setLastName(nachname);
			tableColumn = DBKonstanten.vorname;
			String vorname = extractStringFrom(tableResult, tableColumn);
			nextPerson.setFirstName(vorname);
			persons.add(nextPerson);
		}
		return persons;
	}

}
