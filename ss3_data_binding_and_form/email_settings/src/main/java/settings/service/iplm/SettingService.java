package settings.service.iplm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import settings.model.Setting;
import settings.repository.ISettingRepository;
import settings.service.ISettingService;

import java.util.List;

@Service
public class SettingService implements ISettingService {
    @Autowired
    ISettingRepository settingRepository;

    @Override
    public Setting findById(int id) {
        return settingRepository.findById(id);
    }

    @Override
    public void updateSetting(Setting setting) {
        settingRepository.updateSetting(setting);
    }

    @Override
    public List<Setting> findAll() {
        return settingRepository.findAll();
    }
}
