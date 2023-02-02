package settings.repository;

import org.springframework.stereotype.Repository;
import settings.model.Setting;

import java.util.List;
import java.util.Set;

public interface ISettingRepository {
    Setting findById(int id);

    void updateSetting(Setting setting);

    List<Setting> findAll();
}
