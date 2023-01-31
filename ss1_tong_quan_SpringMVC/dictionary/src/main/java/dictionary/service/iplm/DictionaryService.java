package dictionary.service.iplm;

import dictionary.repository.IDictionaryRepository;
import dictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    IDictionaryRepository dictionaryRepository;

    @Override
    public String search(String english) {
        return dictionaryRepository.search(english);
    }
}
