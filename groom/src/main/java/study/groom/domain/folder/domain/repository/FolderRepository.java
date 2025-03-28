package study.groom.domain.folder.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.groom.domain.folder.domain.entity.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
