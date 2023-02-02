package settings.repository.iplm;

import org.springframework.stereotype.Repository;
import settings.model.Setting;
import settings.repository.ISettingRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SettingRepository implements ISettingRepository {
    static List<Setting> settingList = new ArrayList<>();

    static {
        settingList.add(new Setting(1, "Setting1", "Vietnamese", 25, true, "Tien"));
        settingList.add(new Setting(2, "Setting2", "English", 10, true, "Sy"));
        settingList.add(new Setting(3, "Setting3", "Vietnamese", 50, true, "Vu"));
    }

    @Override
    public Setting findById(int id) {
        Setting findSetting = null;
        for (Setting st : settingList) {
            if (st.getId() == id) {
                findSetting = st;
            }
        }
        return findSetting;
    }

    @Override
    public void updateSetting(Setting setting) {
        Setting updateSetting = findById(setting.getId());
        updateSetting.setLanguage(setting.getLanguage());
        updateSetting.setPageSize(setting.getPageSize());
        updateSetting.setSpamFilter(setting.isSpamFilter());
        updateSetting.setSignature(setting.getSignature());
    }

    @Override
    public List<Setting> findAll() {
        return settingList;
    }
}
