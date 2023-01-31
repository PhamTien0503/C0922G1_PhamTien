package dictionary.repository.impl;

import dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    static Map<String,String> mapWord=new LinkedHashMap<>();
    static {
        mapWord.put("chicken","Con gà");
        mapWord.put("house","Ngôi nhà");
        mapWord.put("bike","Xe độp");
    }
    @Override
    public String search(String english) {
        String vietnamese=mapWord.get(english);
        if (vietnamese==null){
            vietnamese="Not found";
        }
        return vietnamese;
    }
}
