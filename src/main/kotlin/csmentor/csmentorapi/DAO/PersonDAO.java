package csmentor.csmentorapi.DAO;

import com.sun.imageio.plugins.jpeg.JPEGImageReaderSpi;
import csmentor.csmentorapi.Model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonId(UUID id);

    int updatePersonById(UUID id, Person person);
}
