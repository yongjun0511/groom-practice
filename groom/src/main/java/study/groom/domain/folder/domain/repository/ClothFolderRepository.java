package study.groom.domain.folder.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.cloth.domain.entity.Cloth;
import study.groom.domain.folder.domain.entity.ClothFolder;

public interface ClothFolderRepository extends JpaRepository<ClothFolder, Long> {

    void deleteAllByCloth(Cloth cloth);

}
