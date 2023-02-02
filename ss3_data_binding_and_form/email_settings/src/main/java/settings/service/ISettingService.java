package settings.service;

import settings.model.Setting;

import java.util.List;

public interface ISettingService {
    Setting findById(int id);

    void updateSetting(Setting setting);

    List<Setting> findAll();
}
